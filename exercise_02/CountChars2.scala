var str: String = io.StdIn.readLine("What is the input string? ")
while (str.length < 1) {
	str = io.StdIn.readLine("You must enter something. What is the input string? ")
}
println(str + " has " + str.length + " characters.")