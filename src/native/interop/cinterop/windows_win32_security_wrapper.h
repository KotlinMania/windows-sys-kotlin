#ifndef WINDOWSSYS_WINDOWS_WIN32_SECURITY_WINDOWS_WIN32_SECURITY_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SECURITY_WINDOWS_WIN32_SECURITY_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_security_accessCheck(void* psecuritydescriptor, void* clienttoken, uint32_t desiredaccess, void* genericmapping, void* privilegeset, void* privilegesetlength, void* grantedaccess, void* accessstatus);
int32_t windowssys_windows_win32_security_accessCheckAndAuditAlarmA(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* securitydescriptor, uint32_t desiredaccess, void* genericmapping, int32_t objectcreation, void* grantedaccess, void* accessstatus, void* pfgenerateonclose);
int32_t windowssys_windows_win32_security_accessCheckAndAuditAlarmW(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* securitydescriptor, uint32_t desiredaccess, void* genericmapping, int32_t objectcreation, void* grantedaccess, void* accessstatus, void* pfgenerateonclose);
int32_t windowssys_windows_win32_security_accessCheckByType(void* psecuritydescriptor, void* principalselfsid, void* clienttoken, uint32_t desiredaccess, void* objecttypelist, uint32_t objecttypelistlength, void* genericmapping, void* privilegeset, void* privilegesetlength, void* grantedaccess, void* accessstatus);
int32_t windowssys_windows_win32_security_accessCheckByTypeAndAuditAlarmA(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* securitydescriptor, void* principalselfsid, uint32_t desiredaccess, int32_t audittype, uint32_t flags, void* objecttypelist, uint32_t objecttypelistlength, void* genericmapping, int32_t objectcreation, void* grantedaccess, void* accessstatus, void* pfgenerateonclose);
int32_t windowssys_windows_win32_security_accessCheckByTypeAndAuditAlarmW(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* securitydescriptor, void* principalselfsid, uint32_t desiredaccess, int32_t audittype, uint32_t flags, void* objecttypelist, uint32_t objecttypelistlength, void* genericmapping, int32_t objectcreation, void* grantedaccess, void* accessstatus, void* pfgenerateonclose);
int32_t windowssys_windows_win32_security_accessCheckByTypeResultList(void* psecuritydescriptor, void* principalselfsid, void* clienttoken, uint32_t desiredaccess, void* objecttypelist, uint32_t objecttypelistlength, void* genericmapping, void* privilegeset, void* privilegesetlength, void* grantedaccesslist, void* accessstatuslist);
int32_t windowssys_windows_win32_security_accessCheckByTypeResultListAndAuditAlarmA(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* securitydescriptor, void* principalselfsid, uint32_t desiredaccess, int32_t audittype, uint32_t flags, void* objecttypelist, uint32_t objecttypelistlength, void* genericmapping, int32_t objectcreation, void* grantedaccess, void* accessstatuslist, void* pfgenerateonclose);
int32_t windowssys_windows_win32_security_accessCheckByTypeResultListAndAuditAlarmByHandleA(void* subsystemname, void* handleid, void* clienttoken, void* objecttypename, void* objectname, void* securitydescriptor, void* principalselfsid, uint32_t desiredaccess, int32_t audittype, uint32_t flags, void* objecttypelist, uint32_t objecttypelistlength, void* genericmapping, int32_t objectcreation, void* grantedaccess, void* accessstatuslist, void* pfgenerateonclose);
int32_t windowssys_windows_win32_security_accessCheckByTypeResultListAndAuditAlarmByHandleW(void* subsystemname, void* handleid, void* clienttoken, void* objecttypename, void* objectname, void* securitydescriptor, void* principalselfsid, uint32_t desiredaccess, int32_t audittype, uint32_t flags, void* objecttypelist, uint32_t objecttypelistlength, void* genericmapping, int32_t objectcreation, void* grantedaccesslist, void* accessstatuslist, void* pfgenerateonclose);
int32_t windowssys_windows_win32_security_accessCheckByTypeResultListAndAuditAlarmW(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* securitydescriptor, void* principalselfsid, uint32_t desiredaccess, int32_t audittype, uint32_t flags, void* objecttypelist, uint32_t objecttypelistlength, void* genericmapping, int32_t objectcreation, void* grantedaccesslist, void* accessstatuslist, void* pfgenerateonclose);
int32_t windowssys_windows_win32_security_addAccessAllowedAce(void* pacl, uint32_t dwacerevision, uint32_t accessmask, void* psid);
int32_t windowssys_windows_win32_security_addAccessAllowedAceEx(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint32_t accessmask, void* psid);
int32_t windowssys_windows_win32_security_addAccessAllowedObjectAce(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint32_t accessmask, void* objecttypeguid, void* inheritedobjecttypeguid, void* psid);
int32_t windowssys_windows_win32_security_addAccessDeniedAce(void* pacl, uint32_t dwacerevision, uint32_t accessmask, void* psid);
int32_t windowssys_windows_win32_security_addAccessDeniedAceEx(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint32_t accessmask, void* psid);
int32_t windowssys_windows_win32_security_addAccessDeniedObjectAce(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint32_t accessmask, void* objecttypeguid, void* inheritedobjecttypeguid, void* psid);
int32_t windowssys_windows_win32_security_addAce(void* pacl, uint32_t dwacerevision, uint32_t dwstartingaceindex, void* pacelist, uint32_t nacelistlength);
int32_t windowssys_windows_win32_security_addAuditAccessAce(void* pacl, uint32_t dwacerevision, uint32_t dwaccessmask, void* psid, int32_t bauditsuccess, int32_t bauditfailure);
int32_t windowssys_windows_win32_security_addAuditAccessAceEx(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint32_t dwaccessmask, void* psid, int32_t bauditsuccess, int32_t bauditfailure);
int32_t windowssys_windows_win32_security_addAuditAccessObjectAce(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint32_t accessmask, void* objecttypeguid, void* inheritedobjecttypeguid, void* psid, int32_t bauditsuccess, int32_t bauditfailure);
int32_t windowssys_windows_win32_security_addConditionalAce(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint8_t acetype, uint32_t accessmask, void* psid, void* conditionstr, void* returnlength);
int32_t windowssys_windows_win32_security_addMandatoryAce(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint32_t mandatorypolicy, void* plabelsid);
int32_t windowssys_windows_win32_security_addResourceAttributeAce(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint32_t accessmask, void* psid, void* pattributeinfo, void* preturnlength);
int32_t windowssys_windows_win32_security_addScopedPolicyIDAce(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint32_t accessmask, void* psid);
int32_t windowssys_windows_win32_security_adjustTokenGroups(void* tokenhandle, int32_t resettodefault, void* newstate, uint32_t bufferlength, void* previousstate, void* returnlength);
int32_t windowssys_windows_win32_security_adjustTokenPrivileges(void* tokenhandle, int32_t disableallprivileges, void* newstate, uint32_t bufferlength, void* previousstate, void* returnlength);
int32_t windowssys_windows_win32_security_allocateAndInitializeSid(void* pidentifierauthority, uint8_t nsubauthoritycount, uint32_t nsubauthority0, uint32_t nsubauthority1, uint32_t nsubauthority2, uint32_t nsubauthority3, uint32_t nsubauthority4, uint32_t nsubauthority5, uint32_t nsubauthority6, uint32_t nsubauthority7, void* psid);
int32_t windowssys_windows_win32_security_allocateLocallyUniqueId(void* luid);
int32_t windowssys_windows_win32_security_areAllAccessesGranted(uint32_t grantedaccess, uint32_t desiredaccess);
int32_t windowssys_windows_win32_security_areAnyAccessesGranted(uint32_t grantedaccess, uint32_t desiredaccess);
int32_t windowssys_windows_win32_security_checkTokenCapability(void* tokenhandle, void* capabilitysidtocheck, void* hascapability);
int32_t windowssys_windows_win32_security_checkTokenMembership(void* tokenhandle, void* sidtocheck, void* ismember);
int32_t windowssys_windows_win32_security_checkTokenMembershipEx(void* tokenhandle, void* sidtocheck, uint32_t flags, void* ismember);
int32_t windowssys_windows_win32_security_convertToAutoInheritPrivateObjectSecurity(void* parentdescriptor, void* currentsecuritydescriptor, void* newsecuritydescriptor, void* objecttype, bool isdirectoryobject, void* genericmapping);
int32_t windowssys_windows_win32_security_copySid(uint32_t ndestinationsidlength, void* pdestinationsid, void* psourcesid);
int32_t windowssys_windows_win32_security_createPrivateObjectSecurity(void* parentdescriptor, void* creatordescriptor, void* newdescriptor, int32_t isdirectoryobject, void* token, void* genericmapping);
int32_t windowssys_windows_win32_security_createPrivateObjectSecurityEx(void* parentdescriptor, void* creatordescriptor, void* newdescriptor, void* objecttype, int32_t iscontainerobject, uint32_t autoinheritflags, void* token, void* genericmapping);
int32_t windowssys_windows_win32_security_createPrivateObjectSecurityWithMultipleInheritance(void* parentdescriptor, void* creatordescriptor, void* newdescriptor, void* objecttypes, uint32_t guidcount, int32_t iscontainerobject, uint32_t autoinheritflags, void* token, void* genericmapping);
int32_t windowssys_windows_win32_security_createRestrictedToken(void* existingtokenhandle, uint32_t flags, uint32_t disablesidcount, void* sidstodisable, uint32_t deleteprivilegecount, void* privilegestodelete, uint32_t restrictedsidcount, void* sidstorestrict, void* newtokenhandle);
int32_t windowssys_windows_win32_security_createWellKnownSid(int32_t wellknownsidtype, void* domainsid, void* psid, void* cbsid);
int32_t windowssys_windows_win32_security_deleteAce(void* pacl, uint32_t dwaceindex);
int32_t windowssys_windows_win32_security_deriveCapabilitySidsFromName(void* capname, void* capabilitygroupsids, void* capabilitygroupsidcount, void* capabilitysids, void* capabilitysidcount);
int32_t windowssys_windows_win32_security_destroyPrivateObjectSecurity(void* objectdescriptor);
int32_t windowssys_windows_win32_security_duplicateToken(void* existingtokenhandle, int32_t impersonationlevel, void* duplicatetokenhandle);
int32_t windowssys_windows_win32_security_duplicateTokenEx(void* hexistingtoken, uint32_t dwdesiredaccess, void* lptokenattributes, int32_t impersonationlevel, int32_t tokentype, void* phnewtoken);
int32_t windowssys_windows_win32_security_equalDomainSid(void* psid1, void* psid2, void* pfequal);
int32_t windowssys_windows_win32_security_equalPrefixSid(void* psid1, void* psid2);
int32_t windowssys_windows_win32_security_equalSid(void* psid1, void* psid2);
int32_t windowssys_windows_win32_security_findFirstFreeAce(void* pacl, void* pace);
void* windowssys_windows_win32_security_freeSid(void* psid);
int32_t windowssys_windows_win32_security_getAce(void* pacl, uint32_t dwaceindex, void* pace);
int32_t windowssys_windows_win32_security_getAclInformation(void* pacl, void* paclinformation, uint32_t naclinformationlength, int32_t dwaclinformationclass);
int32_t windowssys_windows_win32_security_getAppContainerAce(void* acl, uint32_t startingaceindex, void* appcontainerace, void* appcontaineraceindex);
int32_t windowssys_windows_win32_security_getCachedSigningLevel(void* file, void* flags, void* signinglevel, void* thumbprint, void* thumbprintsize, void* thumbprintalgorithm);
int32_t windowssys_windows_win32_security_getFileSecurityA(void* lpfilename, uint32_t requestedinformation, void* psecuritydescriptor, uint32_t nlength, void* lpnlengthneeded);
int32_t windowssys_windows_win32_security_getFileSecurityW(void* lpfilename, uint32_t requestedinformation, void* psecuritydescriptor, uint32_t nlength, void* lpnlengthneeded);
int32_t windowssys_windows_win32_security_getKernelObjectSecurity(void* handle, uint32_t requestedinformation, void* psecuritydescriptor, uint32_t nlength, void* lpnlengthneeded);
uint32_t windowssys_windows_win32_security_getLengthSid(void* psid);
int32_t windowssys_windows_win32_security_getPrivateObjectSecurity(void* objectdescriptor, uint32_t securityinformation, void* resultantdescriptor, uint32_t descriptorlength, void* returnlength);
int32_t windowssys_windows_win32_security_getSecurityDescriptorControl(void* psecuritydescriptor, void* pcontrol, void* lpdwrevision);
int32_t windowssys_windows_win32_security_getSecurityDescriptorDacl(void* psecuritydescriptor, void* lpbdaclpresent, void* pdacl, void* lpbdacldefaulted);
int32_t windowssys_windows_win32_security_getSecurityDescriptorGroup(void* psecuritydescriptor, void* pgroup, void* lpbgroupdefaulted);
uint32_t windowssys_windows_win32_security_getSecurityDescriptorLength(void* psecuritydescriptor);
int32_t windowssys_windows_win32_security_getSecurityDescriptorOwner(void* psecuritydescriptor, void* powner, void* lpbownerdefaulted);
uint32_t windowssys_windows_win32_security_getSecurityDescriptorRMControl(void* securitydescriptor, void* rmcontrol);
int32_t windowssys_windows_win32_security_getSecurityDescriptorSacl(void* psecuritydescriptor, void* lpbsaclpresent, void* psacl, void* lpbsacldefaulted);
void* windowssys_windows_win32_security_getSidIdentifierAuthority(void* psid);
uint32_t windowssys_windows_win32_security_getSidLengthRequired(uint8_t nsubauthoritycount);
void* windowssys_windows_win32_security_getSidSubAuthority(void* psid, uint32_t nsubauthority);
void* windowssys_windows_win32_security_getSidSubAuthorityCount(void* psid);
int32_t windowssys_windows_win32_security_getTokenInformation(void* tokenhandle, int32_t tokeninformationclass, void* tokeninformation, uint32_t tokeninformationlength, void* returnlength);
int32_t windowssys_windows_win32_security_getUserObjectSecurity(void* hobj, void* psirequested, void* psid, uint32_t nlength, void* lpnlengthneeded);
int32_t windowssys_windows_win32_security_getWindowsAccountDomainSid(void* psid, void* pdomainsid, void* cbdomainsid);
int32_t windowssys_windows_win32_security_impersonateAnonymousToken(void* threadhandle);
int32_t windowssys_windows_win32_security_impersonateLoggedOnUser(void* htoken);
int32_t windowssys_windows_win32_security_impersonateSelf(int32_t impersonationlevel);
int32_t windowssys_windows_win32_security_initializeAcl(void* pacl, uint32_t nacllength, uint32_t dwaclrevision);
int32_t windowssys_windows_win32_security_initializeSecurityDescriptor(void* psecuritydescriptor, uint32_t dwrevision);
int32_t windowssys_windows_win32_security_initializeSid(void* sid, void* pidentifierauthority, uint8_t nsubauthoritycount);
int32_t windowssys_windows_win32_security_isTokenRestricted(void* tokenhandle);
int32_t windowssys_windows_win32_security_isValidAcl(void* pacl);
int32_t windowssys_windows_win32_security_isValidSecurityDescriptor(void* psecuritydescriptor);
int32_t windowssys_windows_win32_security_isValidSid(void* psid);
int32_t windowssys_windows_win32_security_isWellKnownSid(void* psid, int32_t wellknownsidtype);
int32_t windowssys_windows_win32_security_logonUserA(void* lpszusername, void* lpszdomain, void* lpszpassword, uint32_t dwlogontype, uint32_t dwlogonprovider, void* phtoken);
int32_t windowssys_windows_win32_security_logonUserExA(void* lpszusername, void* lpszdomain, void* lpszpassword, uint32_t dwlogontype, uint32_t dwlogonprovider, void* phtoken, void* pplogonsid, void* ppprofilebuffer, void* pdwprofilelength, void* pquotalimits);
int32_t windowssys_windows_win32_security_logonUserExW(void* lpszusername, void* lpszdomain, void* lpszpassword, uint32_t dwlogontype, uint32_t dwlogonprovider, void* phtoken, void* pplogonsid, void* ppprofilebuffer, void* pdwprofilelength, void* pquotalimits);
int32_t windowssys_windows_win32_security_logonUserW(void* lpszusername, void* lpszdomain, void* lpszpassword, uint32_t dwlogontype, uint32_t dwlogonprovider, void* phtoken);
int32_t windowssys_windows_win32_security_lookupAccountNameA(void* lpsystemname, void* lpaccountname, void* sid, void* cbsid, void* referenceddomainname, void* cchreferenceddomainname, void* peuse);
int32_t windowssys_windows_win32_security_lookupAccountNameW(void* lpsystemname, void* lpaccountname, void* sid, void* cbsid, void* referenceddomainname, void* cchreferenceddomainname, void* peuse);
int32_t windowssys_windows_win32_security_lookupAccountSidA(void* lpsystemname, void* sid, void* name, void* cchname, void* referenceddomainname, void* cchreferenceddomainname, void* peuse);
int32_t windowssys_windows_win32_security_lookupAccountSidW(void* lpsystemname, void* sid, void* name, void* cchname, void* referenceddomainname, void* cchreferenceddomainname, void* peuse);
int32_t windowssys_windows_win32_security_lookupPrivilegeDisplayNameA(void* lpsystemname, void* lpname, void* lpdisplayname, void* cchdisplayname, void* lplanguageid);
int32_t windowssys_windows_win32_security_lookupPrivilegeDisplayNameW(void* lpsystemname, void* lpname, void* lpdisplayname, void* cchdisplayname, void* lplanguageid);
int32_t windowssys_windows_win32_security_lookupPrivilegeNameA(void* lpsystemname, void* lpluid, void* lpname, void* cchname);
int32_t windowssys_windows_win32_security_lookupPrivilegeNameW(void* lpsystemname, void* lpluid, void* lpname, void* cchname);
int32_t windowssys_windows_win32_security_lookupPrivilegeValueA(void* lpsystemname, void* lpname, void* lpluid);
int32_t windowssys_windows_win32_security_lookupPrivilegeValueW(void* lpsystemname, void* lpname, void* lpluid);
int32_t windowssys_windows_win32_security_makeAbsoluteSD(void* pselfrelativesecuritydescriptor, void* pabsolutesecuritydescriptor, void* lpdwabsolutesecuritydescriptorsize, void* pdacl, void* lpdwdaclsize, void* psacl, void* lpdwsaclsize, void* powner, void* lpdwownersize, void* pprimarygroup, void* lpdwprimarygroupsize);
int32_t windowssys_windows_win32_security_makeSelfRelativeSD(void* pabsolutesecuritydescriptor, void* pselfrelativesecuritydescriptor, void* lpdwbufferlength);
void windowssys_windows_win32_security_mapGenericMask(void* accessmask, void* genericmapping);
int32_t windowssys_windows_win32_security_objectCloseAuditAlarmA(void* subsystemname, void* handleid, int32_t generateonclose);
int32_t windowssys_windows_win32_security_objectCloseAuditAlarmW(void* subsystemname, void* handleid, int32_t generateonclose);
int32_t windowssys_windows_win32_security_objectDeleteAuditAlarmA(void* subsystemname, void* handleid, int32_t generateonclose);
int32_t windowssys_windows_win32_security_objectDeleteAuditAlarmW(void* subsystemname, void* handleid, int32_t generateonclose);
int32_t windowssys_windows_win32_security_objectOpenAuditAlarmA(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* psecuritydescriptor, void* clienttoken, uint32_t desiredaccess, uint32_t grantedaccess, void* privileges, int32_t objectcreation, int32_t accessgranted, void* generateonclose);
int32_t windowssys_windows_win32_security_objectOpenAuditAlarmW(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* psecuritydescriptor, void* clienttoken, uint32_t desiredaccess, uint32_t grantedaccess, void* privileges, int32_t objectcreation, int32_t accessgranted, void* generateonclose);
int32_t windowssys_windows_win32_security_objectPrivilegeAuditAlarmA(void* subsystemname, void* handleid, void* clienttoken, uint32_t desiredaccess, void* privileges, int32_t accessgranted);
int32_t windowssys_windows_win32_security_objectPrivilegeAuditAlarmW(void* subsystemname, void* handleid, void* clienttoken, uint32_t desiredaccess, void* privileges, int32_t accessgranted);
int32_t windowssys_windows_win32_security_privilegeCheck(void* clienttoken, void* requiredprivileges, void* pfresult);
int32_t windowssys_windows_win32_security_privilegedServiceAuditAlarmA(void* subsystemname, void* servicename, void* clienttoken, void* privileges, int32_t accessgranted);
int32_t windowssys_windows_win32_security_privilegedServiceAuditAlarmW(void* subsystemname, void* servicename, void* clienttoken, void* privileges, int32_t accessgranted);
void windowssys_windows_win32_security_querySecurityAccessMask(uint32_t securityinformation, void* desiredaccess);
int32_t windowssys_windows_win32_security_revertToSelf(void);
int32_t windowssys_windows_win32_security_rtlConvertSidToUnicodeString(void* unicodestring, void* sid, bool allocatedestinationstring);
bool windowssys_windows_win32_security_rtlNormalizeSecurityDescriptor(void* securitydescriptor, uint32_t securitydescriptorlength, void* newsecuritydescriptor, void* newsecuritydescriptorlength, bool checkonly);
int32_t windowssys_windows_win32_security_setAclInformation(void* pacl, void* paclinformation, uint32_t naclinformationlength, int32_t dwaclinformationclass);
int32_t windowssys_windows_win32_security_setCachedSigningLevel(void* sourcefiles, uint32_t sourcefilecount, uint32_t flags, void* targetfile);
int32_t windowssys_windows_win32_security_setFileSecurityA(void* lpfilename, uint32_t securityinformation, void* psecuritydescriptor);
int32_t windowssys_windows_win32_security_setFileSecurityW(void* lpfilename, uint32_t securityinformation, void* psecuritydescriptor);
int32_t windowssys_windows_win32_security_setKernelObjectSecurity(void* handle, uint32_t securityinformation, void* securitydescriptor);
int32_t windowssys_windows_win32_security_setPrivateObjectSecurity(uint32_t securityinformation, void* modificationdescriptor, void* objectssecuritydescriptor, void* genericmapping, void* token);
int32_t windowssys_windows_win32_security_setPrivateObjectSecurityEx(uint32_t securityinformation, void* modificationdescriptor, void* objectssecuritydescriptor, uint32_t autoinheritflags, void* genericmapping, void* token);
void windowssys_windows_win32_security_setSecurityAccessMask(uint32_t securityinformation, void* desiredaccess);
int32_t windowssys_windows_win32_security_setSecurityDescriptorControl(void* psecuritydescriptor, uint16_t controlbitsofinterest, uint16_t controlbitstoset);
int32_t windowssys_windows_win32_security_setSecurityDescriptorDacl(void* psecuritydescriptor, int32_t bdaclpresent, void* pdacl, int32_t bdacldefaulted);
int32_t windowssys_windows_win32_security_setSecurityDescriptorGroup(void* psecuritydescriptor, void* pgroup, int32_t bgroupdefaulted);
int32_t windowssys_windows_win32_security_setSecurityDescriptorOwner(void* psecuritydescriptor, void* powner, int32_t bownerdefaulted);
uint32_t windowssys_windows_win32_security_setSecurityDescriptorRMControl(void* securitydescriptor, void* rmcontrol);
int32_t windowssys_windows_win32_security_setSecurityDescriptorSacl(void* psecuritydescriptor, int32_t bsaclpresent, void* psacl, int32_t bsacldefaulted);
int32_t windowssys_windows_win32_security_setTokenInformation(void* tokenhandle, int32_t tokeninformationclass, void* tokeninformation, uint32_t tokeninformationlength);
int32_t windowssys_windows_win32_security_setUserObjectSecurity(void* hobj, void* psirequested, void* psid);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SECURITY_WINDOWS_WIN32_SECURITY_WRAPPER_H */
