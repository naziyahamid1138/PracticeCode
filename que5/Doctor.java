class Doctor extends Staff 
{
    String specialization;

Doctor(String p, double q, String r)
{
    super(p,q);
    specialization=r;
}
void displayInfo()
{
    System.out.println( name + salary + specialization);
}
}