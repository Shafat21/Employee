public class SalariedEmployee extends Employee 
{
   private double weeklySalary;

   public SalariedEmployee( String firstname, String lastname, String socialSecurityNumber, 
      double salary )
   {
      super( firstname, lastname, socialSecurityNumber );

      if (weeklySalary <0.0)
        throw new IllegalArgumentException("Weekly Salary must be >= 0.0");
   }

   public void setWeeklySalary( double weeklySalary )
   {
      if (weeklySalary <0.0)
        throw new IllegalArgumentException("Weekly Salary must be >= 0.0");

    this.weeklySalary = weeklySalary;
   }

   public double getWeeklySalary()
   {
      return weeklySalary;
   }


   @Override
   public String toString()
   {
      return String.format( "salaried employee: %s\n%s: $%,.2f", 
         super.toString(), "weekly salary", getWeeklySalary() );
   }

@Override
public double earning() {
    // TODO Auto-generated method stub
    return 0;
}

}