
wordList = []

input = open("input.txt").read()

# creating a string array that holds every line fo the input as an element
wordList = input.splitlines()


# copied from the internet, all thats important to me was that it returns the character that both strings have in common
def find_common_characters(msg1, msg2):
    result = []
    if len(msg1) > len(msg2):

        result = my_func(msg1, msg2)
    else:

        result = my_func(msg2, msg1)

    if len(result) == 0:
        return -1

    else:

        result = "".join(result)

        return result.replace(" ", "")


def my_func(bigger, smaller):  # see previous comment
    length = len(smaller)
    bigger = list(bigger)
    smaller = list(smaller)

    i = 0
    result = []
    while i < length:
        ans = smaller[i] in bigger
        if ans == True:
            result.append(smaller[i])
            bigger.remove(smaller[i])
        i = i + 1
    return result


endList = []  # this is our next string array that holds just the character each rucksack contains
for element in wordList:
    firstpart, secondpart = element[:len(
        element)//2], element[len(element)//2:]  # splits each element of the string array down the middle

    msg1 = firstpart
    msg2 = secondpart
    common_characters = find_common_characters(msg1, msg2)

    final_output = common_characters
    endList.append(final_output)

for element in endList:
    if (len(element) > 1):
        element = element[0:0]


finalTotal = 0


# takes the unicode value of the first character of the string passed in,
def stringPointCalculator(endString):
    # then returns the assigned priority value(see instructions.txt)
    finalString = ord(endString[0])
    if (finalString < 97):
        return finalString - 38
    else:
        return finalString - 96


finalTotal = 0
for element in endList:  # we add the priority value of each element to the finalTotal integer, then print it
    finalTotal += stringPointCalculator(element)

print(finalTotal)
