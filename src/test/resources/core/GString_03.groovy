def a = """hello${a}
world
"""

a = """
hello
${a}
world
"""

a =~ $/(${123}hello) \/
            ${a}world\1
 \u9fa5 \r
/$
