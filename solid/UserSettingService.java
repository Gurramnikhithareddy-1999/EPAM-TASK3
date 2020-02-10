public class UserSettingService
{
&nbsp; &nbsp;public void changeEmail(User user)
&nbsp; {
&nbsp; &nbsp; if(SecurityService.checkAccess(user))
&nbsp; &nbsp;{
//Grant option to change
&nbsp; &nbsp;}
&nbsp;}
 
}
 
public class SecurityService
{
public static boolean checkAccess(User user)
{
//check the access.
}
}
