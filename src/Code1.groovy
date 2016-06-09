List marks = [10,20,30,40,50]
List n =[]
List b =[]

def j=0
marks.each {item->
    if(item>10)
    {n[j]=item;
    j++;}
}
n.each ({ hello ->
    println hello
})

println marks.find { xyz ->
    return xyz>20
}

b = marks.findAll {
    it>20
}
println b

println marks.findAll {
    return it>20
}