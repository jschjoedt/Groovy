class SayIt {

    void sayHello() {
        println 'Hello World!'
    }

    // is it leap year using calendar function
    boolean isLeapYear(int year) {
        Calendar cal = Calendar.getInstance()
        cal.set(Calendar.YEAR, year)
        return cal.getActualMaximum(Calendar.DAY_OF_YEAR) > 365
    }

}
SayIt si = new SayIt()
si.sayHello()
println 'Is it leap year: ' + si.isLeapYear(2023)
