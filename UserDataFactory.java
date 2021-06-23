package apk;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;


public class UserDataFactory {
  public static Map<String, UserData> getData() {
	Map<String, UserData> data = new LinkedHashMap<>();    

    data.put(UUID.randomUUID().toString(), createUserData("Pero", "Perić","FER" , prolaz.DajeSve, true, "nogomet", true, 8 , 6));
    

    return data;
  }

  private static UserData createUserData(
		  String firstName, String lastName,
		  String faks , prolaz pro, boolean imaZ,
		  String imeZ, Boolean jb, Integer intl , Integer sng
		  ) {
    UserData userData = new UserData();

    userData.setIme(firstName);
    userData.setPrezime(lastName);
    userData.setFaks(faks);
    userData.setPro(pro);
    userData.setImaZ(imaZ);
    if (imaZ) {
      userData.setImeZ(imeZ);
    }
    userData.setJb(jb);
    userData.setIntl(intl);
    userData.setSng(sng);

    return userData;
  }
}