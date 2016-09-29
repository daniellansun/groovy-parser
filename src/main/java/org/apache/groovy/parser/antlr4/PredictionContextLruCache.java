package org.apache.groovy.parser.antlr4;

import org.antlr.v4.runtime.atn.PredictionContext;
import org.antlr.v4.runtime.atn.PredictionContextCache;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * prediction context cache with the LRU cache eviction policy
 *
 * @author <a href="mailto:realbluesun@hotmail.com">Daniel.Sun</a>
 * @date 2016/09/27
 */
public class PredictionContextLruCache extends PredictionContextCache {
    private final Map<PredictionContext, PredictionContext> cache;

    public PredictionContextLruCache(final int capacity) {
        // TODO the implementation of cache will be change to ConcurrentLinkedHashMap or the newer one
        this.cache =
                Collections.synchronizedMap(
                        new LinkedHashMap<PredictionContext, PredictionContext>(16, 0.75f, true) {
                            @Override
                            protected boolean removeEldestEntry(Map.Entry eldest) {
                                return this.size() > capacity;
                            }
                        });
    }

    @Override
    public PredictionContext add(PredictionContext ctx) {
        if (ctx == PredictionContext.EMPTY) {
            return PredictionContext.EMPTY;
        } else {
            synchronized (this.cache) {
                PredictionContext existing = this.get(ctx);
                if (existing != null) {
                    return existing;
                } else {
                    this.cache.put(ctx, ctx);
                    return ctx;
                }
            }
        }
    }

    @Override
    public PredictionContext get(PredictionContext ctx) {
        return this.cache.get(ctx);
    }

    @Override
    public int size() {
        return this.cache.size();
    }
}
