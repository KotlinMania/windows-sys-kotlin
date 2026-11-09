#ifndef WINDOWSSYS_WINDOWS_WIN32_SECURITY_WINDOWS_WIN32_SECURITY_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SECURITY_WINDOWS_WIN32_SECURITY_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_security_AccessCheck(void* psecuritydescriptor, void* clienttoken, uint32_t desiredaccess, void* genericmapping, void* privilegeset, void* privilegesetlength, void* grantedaccess, void* accessstatus);
int32_t windowssys_windows_win32_security_AccessCheckAndAuditAlarmA(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* securitydescriptor, uint32_t desiredaccess, void* genericmapping, int32_t objectcreation, void* grantedaccess, void* accessstatus, void* pfgenerateonclose);
int32_t windowssys_windows_win32_security_AccessCheckAndAuditAlarmW(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* securitydescriptor, uint32_t desiredaccess, void* genericmapping, int32_t objectcreation, void* grantedaccess, void* accessstatus, void* pfgenerateonclose);
int32_t windowssys_windows_win32_security_AccessCheckByType(void* psecuritydescriptor, void* principalselfsid, void* clienttoken, uint32_t desiredaccess, void* objecttypelist, uint32_t objecttypelistlength, void* genericmapping, void* privilegeset, void* privilegesetlength, void* grantedaccess, void* accessstatus);
int32_t windowssys_windows_win32_security_AccessCheckByTypeAndAuditAlarmA(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* securitydescriptor, void* principalselfsid, uint32_t desiredaccess, int32_t audittype, uint32_t flags, void* objecttypelist, uint32_t objecttypelistlength, void* genericmapping, int32_t objectcreation, void* grantedaccess, void* accessstatus, void* pfgenerateonclose);
int32_t windowssys_windows_win32_security_AccessCheckByTypeAndAuditAlarmW(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* securitydescriptor, void* principalselfsid, uint32_t desiredaccess, int32_t audittype, uint32_t flags, void* objecttypelist, uint32_t objecttypelistlength, void* genericmapping, int32_t objectcreation, void* grantedaccess, void* accessstatus, void* pfgenerateonclose);
int32_t windowssys_windows_win32_security_AccessCheckByTypeResultList(void* psecuritydescriptor, void* principalselfsid, void* clienttoken, uint32_t desiredaccess, void* objecttypelist, uint32_t objecttypelistlength, void* genericmapping, void* privilegeset, void* privilegesetlength, void* grantedaccesslist, void* accessstatuslist);
int32_t windowssys_windows_win32_security_AccessCheckByTypeResultListAndAuditAlarmA(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* securitydescriptor, void* principalselfsid, uint32_t desiredaccess, int32_t audittype, uint32_t flags, void* objecttypelist, uint32_t objecttypelistlength, void* genericmapping, int32_t objectcreation, void* grantedaccess, void* accessstatuslist, void* pfgenerateonclose);
int32_t windowssys_windows_win32_security_AccessCheckByTypeResultListAndAuditAlarmByHandleA(void* subsystemname, void* handleid, void* clienttoken, void* objecttypename, void* objectname, void* securitydescriptor, void* principalselfsid, uint32_t desiredaccess, int32_t audittype, uint32_t flags, void* objecttypelist, uint32_t objecttypelistlength, void* genericmapping, int32_t objectcreation, void* grantedaccess, void* accessstatuslist, void* pfgenerateonclose);
int32_t windowssys_windows_win32_security_AccessCheckByTypeResultListAndAuditAlarmByHandleW(void* subsystemname, void* handleid, void* clienttoken, void* objecttypename, void* objectname, void* securitydescriptor, void* principalselfsid, uint32_t desiredaccess, int32_t audittype, uint32_t flags, void* objecttypelist, uint32_t objecttypelistlength, void* genericmapping, int32_t objectcreation, void* grantedaccesslist, void* accessstatuslist, void* pfgenerateonclose);
int32_t windowssys_windows_win32_security_AccessCheckByTypeResultListAndAuditAlarmW(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* securitydescriptor, void* principalselfsid, uint32_t desiredaccess, int32_t audittype, uint32_t flags, void* objecttypelist, uint32_t objecttypelistlength, void* genericmapping, int32_t objectcreation, void* grantedaccesslist, void* accessstatuslist, void* pfgenerateonclose);
int32_t windowssys_windows_win32_security_AddAccessAllowedAce(void* pacl, uint32_t dwacerevision, uint32_t accessmask, void* psid);
int32_t windowssys_windows_win32_security_AddAccessAllowedAceEx(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint32_t accessmask, void* psid);
int32_t windowssys_windows_win32_security_AddAccessAllowedObjectAce(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint32_t accessmask, void* objecttypeguid, void* inheritedobjecttypeguid, void* psid);
int32_t windowssys_windows_win32_security_AddAccessDeniedAce(void* pacl, uint32_t dwacerevision, uint32_t accessmask, void* psid);
int32_t windowssys_windows_win32_security_AddAccessDeniedAceEx(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint32_t accessmask, void* psid);
int32_t windowssys_windows_win32_security_AddAccessDeniedObjectAce(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint32_t accessmask, void* objecttypeguid, void* inheritedobjecttypeguid, void* psid);
int32_t windowssys_windows_win32_security_AddAce(void* pacl, uint32_t dwacerevision, uint32_t dwstartingaceindex, void* pacelist, uint32_t nacelistlength);
int32_t windowssys_windows_win32_security_AddAuditAccessAce(void* pacl, uint32_t dwacerevision, uint32_t dwaccessmask, void* psid, int32_t bauditsuccess, int32_t bauditfailure);
int32_t windowssys_windows_win32_security_AddAuditAccessAceEx(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint32_t dwaccessmask, void* psid, int32_t bauditsuccess, int32_t bauditfailure);
int32_t windowssys_windows_win32_security_AddAuditAccessObjectAce(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint32_t accessmask, void* objecttypeguid, void* inheritedobjecttypeguid, void* psid, int32_t bauditsuccess, int32_t bauditfailure);
int32_t windowssys_windows_win32_security_AddConditionalAce(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint8_t acetype, uint32_t accessmask, void* psid, void* conditionstr, void* returnlength);
int32_t windowssys_windows_win32_security_AddMandatoryAce(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint32_t mandatorypolicy, void* plabelsid);
int32_t windowssys_windows_win32_security_AddResourceAttributeAce(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint32_t accessmask, void* psid, void* pattributeinfo, void* preturnlength);
int32_t windowssys_windows_win32_security_AddScopedPolicyIDAce(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint32_t accessmask, void* psid);
int32_t windowssys_windows_win32_security_AdjustTokenGroups(void* tokenhandle, int32_t resettodefault, void* newstate, uint32_t bufferlength, void* previousstate, void* returnlength);
int32_t windowssys_windows_win32_security_AdjustTokenPrivileges(void* tokenhandle, int32_t disableallprivileges, void* newstate, uint32_t bufferlength, void* previousstate, void* returnlength);
int32_t windowssys_windows_win32_security_AllocateAndInitializeSid(void* pidentifierauthority, uint8_t nsubauthoritycount, uint32_t nsubauthority0, uint32_t nsubauthority1, uint32_t nsubauthority2, uint32_t nsubauthority3, uint32_t nsubauthority4, uint32_t nsubauthority5, uint32_t nsubauthority6, uint32_t nsubauthority7, void* psid);
int32_t windowssys_windows_win32_security_AllocateLocallyUniqueId(void* luid);
int32_t windowssys_windows_win32_security_AreAllAccessesGranted(uint32_t grantedaccess, uint32_t desiredaccess);
int32_t windowssys_windows_win32_security_AreAnyAccessesGranted(uint32_t grantedaccess, uint32_t desiredaccess);
int32_t windowssys_windows_win32_security_CheckTokenCapability(void* tokenhandle, void* capabilitysidtocheck, void* hascapability);
int32_t windowssys_windows_win32_security_CheckTokenMembership(void* tokenhandle, void* sidtocheck, void* ismember);
int32_t windowssys_windows_win32_security_CheckTokenMembershipEx(void* tokenhandle, void* sidtocheck, uint32_t flags, void* ismember);
int32_t windowssys_windows_win32_security_ConvertToAutoInheritPrivateObjectSecurity(void* parentdescriptor, void* currentsecuritydescriptor, void* newsecuritydescriptor, void* objecttype, bool isdirectoryobject, void* genericmapping);
int32_t windowssys_windows_win32_security_CopySid(uint32_t ndestinationsidlength, void* pdestinationsid, void* psourcesid);
int32_t windowssys_windows_win32_security_CreatePrivateObjectSecurity(void* parentdescriptor, void* creatordescriptor, void* newdescriptor, int32_t isdirectoryobject, void* token, void* genericmapping);
int32_t windowssys_windows_win32_security_CreatePrivateObjectSecurityEx(void* parentdescriptor, void* creatordescriptor, void* newdescriptor, void* objecttype, int32_t iscontainerobject, uint32_t autoinheritflags, void* token, void* genericmapping);
int32_t windowssys_windows_win32_security_CreatePrivateObjectSecurityWithMultipleInheritance(void* parentdescriptor, void* creatordescriptor, void* newdescriptor, void* objecttypes, uint32_t guidcount, int32_t iscontainerobject, uint32_t autoinheritflags, void* token, void* genericmapping);
int32_t windowssys_windows_win32_security_CreateRestrictedToken(void* existingtokenhandle, uint32_t flags, uint32_t disablesidcount, void* sidstodisable, uint32_t deleteprivilegecount, void* privilegestodelete, uint32_t restrictedsidcount, void* sidstorestrict, void* newtokenhandle);
int32_t windowssys_windows_win32_security_CreateWellKnownSid(int32_t wellknownsidtype, void* domainsid, void* psid, void* cbsid);
int32_t windowssys_windows_win32_security_DeleteAce(void* pacl, uint32_t dwaceindex);
int32_t windowssys_windows_win32_security_DeriveCapabilitySidsFromName(void* capname, void* capabilitygroupsids, void* capabilitygroupsidcount, void* capabilitysids, void* capabilitysidcount);
int32_t windowssys_windows_win32_security_DestroyPrivateObjectSecurity(void* objectdescriptor);
int32_t windowssys_windows_win32_security_DuplicateToken(void* existingtokenhandle, int32_t impersonationlevel, void* duplicatetokenhandle);
int32_t windowssys_windows_win32_security_DuplicateTokenEx(void* hexistingtoken, uint32_t dwdesiredaccess, void* lptokenattributes, int32_t impersonationlevel, int32_t tokentype, void* phnewtoken);
int32_t windowssys_windows_win32_security_EqualDomainSid(void* psid1, void* psid2, void* pfequal);
int32_t windowssys_windows_win32_security_EqualPrefixSid(void* psid1, void* psid2);
int32_t windowssys_windows_win32_security_EqualSid(void* psid1, void* psid2);
int32_t windowssys_windows_win32_security_FindFirstFreeAce(void* pacl, void* pace);
void* windowssys_windows_win32_security_FreeSid(void* psid);
int32_t windowssys_windows_win32_security_GetAce(void* pacl, uint32_t dwaceindex, void* pace);
int32_t windowssys_windows_win32_security_GetAclInformation(void* pacl, void* paclinformation, uint32_t naclinformationlength, int32_t dwaclinformationclass);
int32_t windowssys_windows_win32_security_GetAppContainerAce(void* acl, uint32_t startingaceindex, void* appcontainerace, void* appcontaineraceindex);
int32_t windowssys_windows_win32_security_GetCachedSigningLevel(void* file, void* flags, void* signinglevel, void* thumbprint, void* thumbprintsize, void* thumbprintalgorithm);
int32_t windowssys_windows_win32_security_GetFileSecurityA(void* lpfilename, uint32_t requestedinformation, void* psecuritydescriptor, uint32_t nlength, void* lpnlengthneeded);
int32_t windowssys_windows_win32_security_GetFileSecurityW(void* lpfilename, uint32_t requestedinformation, void* psecuritydescriptor, uint32_t nlength, void* lpnlengthneeded);
int32_t windowssys_windows_win32_security_GetKernelObjectSecurity(void* handle, uint32_t requestedinformation, void* psecuritydescriptor, uint32_t nlength, void* lpnlengthneeded);
uint32_t windowssys_windows_win32_security_GetLengthSid(void* psid);
int32_t windowssys_windows_win32_security_GetPrivateObjectSecurity(void* objectdescriptor, uint32_t securityinformation, void* resultantdescriptor, uint32_t descriptorlength, void* returnlength);
int32_t windowssys_windows_win32_security_GetSecurityDescriptorControl(void* psecuritydescriptor, void* pcontrol, void* lpdwrevision);
int32_t windowssys_windows_win32_security_GetSecurityDescriptorDacl(void* psecuritydescriptor, void* lpbdaclpresent, void* pdacl, void* lpbdacldefaulted);
int32_t windowssys_windows_win32_security_GetSecurityDescriptorGroup(void* psecuritydescriptor, void* pgroup, void* lpbgroupdefaulted);
uint32_t windowssys_windows_win32_security_GetSecurityDescriptorLength(void* psecuritydescriptor);
int32_t windowssys_windows_win32_security_GetSecurityDescriptorOwner(void* psecuritydescriptor, void* powner, void* lpbownerdefaulted);
uint32_t windowssys_windows_win32_security_GetSecurityDescriptorRMControl(void* securitydescriptor, void* rmcontrol);
int32_t windowssys_windows_win32_security_GetSecurityDescriptorSacl(void* psecuritydescriptor, void* lpbsaclpresent, void* psacl, void* lpbsacldefaulted);
void* windowssys_windows_win32_security_GetSidIdentifierAuthority(void* psid);
uint32_t windowssys_windows_win32_security_GetSidLengthRequired(uint8_t nsubauthoritycount);
void* windowssys_windows_win32_security_GetSidSubAuthority(void* psid, uint32_t nsubauthority);
void* windowssys_windows_win32_security_GetSidSubAuthorityCount(void* psid);
int32_t windowssys_windows_win32_security_GetTokenInformation(void* tokenhandle, int32_t tokeninformationclass, void* tokeninformation, uint32_t tokeninformationlength, void* returnlength);
int32_t windowssys_windows_win32_security_GetUserObjectSecurity(void* hobj, void* psirequested, void* psid, uint32_t nlength, void* lpnlengthneeded);
int32_t windowssys_windows_win32_security_GetWindowsAccountDomainSid(void* psid, void* pdomainsid, void* cbdomainsid);
int32_t windowssys_windows_win32_security_ImpersonateAnonymousToken(void* threadhandle);
int32_t windowssys_windows_win32_security_ImpersonateLoggedOnUser(void* htoken);
int32_t windowssys_windows_win32_security_ImpersonateSelf(int32_t impersonationlevel);
int32_t windowssys_windows_win32_security_InitializeAcl(void* pacl, uint32_t nacllength, uint32_t dwaclrevision);
int32_t windowssys_windows_win32_security_InitializeSecurityDescriptor(void* psecuritydescriptor, uint32_t dwrevision);
int32_t windowssys_windows_win32_security_InitializeSid(void* sid, void* pidentifierauthority, uint8_t nsubauthoritycount);
int32_t windowssys_windows_win32_security_IsTokenRestricted(void* tokenhandle);
int32_t windowssys_windows_win32_security_IsValidAcl(void* pacl);
int32_t windowssys_windows_win32_security_IsValidSecurityDescriptor(void* psecuritydescriptor);
int32_t windowssys_windows_win32_security_IsValidSid(void* psid);
int32_t windowssys_windows_win32_security_IsWellKnownSid(void* psid, int32_t wellknownsidtype);
int32_t windowssys_windows_win32_security_LogonUserA(void* lpszusername, void* lpszdomain, void* lpszpassword, uint32_t dwlogontype, uint32_t dwlogonprovider, void* phtoken);
int32_t windowssys_windows_win32_security_LogonUserExA(void* lpszusername, void* lpszdomain, void* lpszpassword, uint32_t dwlogontype, uint32_t dwlogonprovider, void* phtoken, void* pplogonsid, void* ppprofilebuffer, void* pdwprofilelength, void* pquotalimits);
int32_t windowssys_windows_win32_security_LogonUserExW(void* lpszusername, void* lpszdomain, void* lpszpassword, uint32_t dwlogontype, uint32_t dwlogonprovider, void* phtoken, void* pplogonsid, void* ppprofilebuffer, void* pdwprofilelength, void* pquotalimits);
int32_t windowssys_windows_win32_security_LogonUserW(void* lpszusername, void* lpszdomain, void* lpszpassword, uint32_t dwlogontype, uint32_t dwlogonprovider, void* phtoken);
int32_t windowssys_windows_win32_security_LookupAccountNameA(void* lpsystemname, void* lpaccountname, void* sid, void* cbsid, void* referenceddomainname, void* cchreferenceddomainname, void* peuse);
int32_t windowssys_windows_win32_security_LookupAccountNameW(void* lpsystemname, void* lpaccountname, void* sid, void* cbsid, void* referenceddomainname, void* cchreferenceddomainname, void* peuse);
int32_t windowssys_windows_win32_security_LookupAccountSidA(void* lpsystemname, void* sid, void* name, void* cchname, void* referenceddomainname, void* cchreferenceddomainname, void* peuse);
int32_t windowssys_windows_win32_security_LookupAccountSidW(void* lpsystemname, void* sid, void* name, void* cchname, void* referenceddomainname, void* cchreferenceddomainname, void* peuse);
int32_t windowssys_windows_win32_security_LookupPrivilegeDisplayNameA(void* lpsystemname, void* lpname, void* lpdisplayname, void* cchdisplayname, void* lplanguageid);
int32_t windowssys_windows_win32_security_LookupPrivilegeDisplayNameW(void* lpsystemname, void* lpname, void* lpdisplayname, void* cchdisplayname, void* lplanguageid);
int32_t windowssys_windows_win32_security_LookupPrivilegeNameA(void* lpsystemname, void* lpluid, void* lpname, void* cchname);
int32_t windowssys_windows_win32_security_LookupPrivilegeNameW(void* lpsystemname, void* lpluid, void* lpname, void* cchname);
int32_t windowssys_windows_win32_security_LookupPrivilegeValueA(void* lpsystemname, void* lpname, void* lpluid);
int32_t windowssys_windows_win32_security_LookupPrivilegeValueW(void* lpsystemname, void* lpname, void* lpluid);
int32_t windowssys_windows_win32_security_MakeAbsoluteSD(void* pselfrelativesecuritydescriptor, void* pabsolutesecuritydescriptor, void* lpdwabsolutesecuritydescriptorsize, void* pdacl, void* lpdwdaclsize, void* psacl, void* lpdwsaclsize, void* powner, void* lpdwownersize, void* pprimarygroup, void* lpdwprimarygroupsize);
int32_t windowssys_windows_win32_security_MakeSelfRelativeSD(void* pabsolutesecuritydescriptor, void* pselfrelativesecuritydescriptor, void* lpdwbufferlength);
void windowssys_windows_win32_security_MapGenericMask(void* accessmask, void* genericmapping);
int32_t windowssys_windows_win32_security_ObjectCloseAuditAlarmA(void* subsystemname, void* handleid, int32_t generateonclose);
int32_t windowssys_windows_win32_security_ObjectCloseAuditAlarmW(void* subsystemname, void* handleid, int32_t generateonclose);
int32_t windowssys_windows_win32_security_ObjectDeleteAuditAlarmA(void* subsystemname, void* handleid, int32_t generateonclose);
int32_t windowssys_windows_win32_security_ObjectDeleteAuditAlarmW(void* subsystemname, void* handleid, int32_t generateonclose);
int32_t windowssys_windows_win32_security_ObjectOpenAuditAlarmA(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* psecuritydescriptor, void* clienttoken, uint32_t desiredaccess, uint32_t grantedaccess, void* privileges, int32_t objectcreation, int32_t accessgranted, void* generateonclose);
int32_t windowssys_windows_win32_security_ObjectOpenAuditAlarmW(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* psecuritydescriptor, void* clienttoken, uint32_t desiredaccess, uint32_t grantedaccess, void* privileges, int32_t objectcreation, int32_t accessgranted, void* generateonclose);
int32_t windowssys_windows_win32_security_ObjectPrivilegeAuditAlarmA(void* subsystemname, void* handleid, void* clienttoken, uint32_t desiredaccess, void* privileges, int32_t accessgranted);
int32_t windowssys_windows_win32_security_ObjectPrivilegeAuditAlarmW(void* subsystemname, void* handleid, void* clienttoken, uint32_t desiredaccess, void* privileges, int32_t accessgranted);
int32_t windowssys_windows_win32_security_PrivilegeCheck(void* clienttoken, void* requiredprivileges, void* pfresult);
int32_t windowssys_windows_win32_security_PrivilegedServiceAuditAlarmA(void* subsystemname, void* servicename, void* clienttoken, void* privileges, int32_t accessgranted);
int32_t windowssys_windows_win32_security_PrivilegedServiceAuditAlarmW(void* subsystemname, void* servicename, void* clienttoken, void* privileges, int32_t accessgranted);
void windowssys_windows_win32_security_QuerySecurityAccessMask(uint32_t securityinformation, void* desiredaccess);
int32_t windowssys_windows_win32_security_RevertToSelf(void);
int32_t windowssys_windows_win32_security_RtlConvertSidToUnicodeString(void* unicodestring, void* sid, bool allocatedestinationstring);
bool windowssys_windows_win32_security_RtlNormalizeSecurityDescriptor(void* securitydescriptor, uint32_t securitydescriptorlength, void* newsecuritydescriptor, void* newsecuritydescriptorlength, bool checkonly);
int32_t windowssys_windows_win32_security_SetAclInformation(void* pacl, void* paclinformation, uint32_t naclinformationlength, int32_t dwaclinformationclass);
int32_t windowssys_windows_win32_security_SetCachedSigningLevel(void* sourcefiles, uint32_t sourcefilecount, uint32_t flags, void* targetfile);
int32_t windowssys_windows_win32_security_SetFileSecurityA(void* lpfilename, uint32_t securityinformation, void* psecuritydescriptor);
int32_t windowssys_windows_win32_security_SetFileSecurityW(void* lpfilename, uint32_t securityinformation, void* psecuritydescriptor);
int32_t windowssys_windows_win32_security_SetKernelObjectSecurity(void* handle, uint32_t securityinformation, void* securitydescriptor);
int32_t windowssys_windows_win32_security_SetPrivateObjectSecurity(uint32_t securityinformation, void* modificationdescriptor, void* objectssecuritydescriptor, void* genericmapping, void* token);
int32_t windowssys_windows_win32_security_SetPrivateObjectSecurityEx(uint32_t securityinformation, void* modificationdescriptor, void* objectssecuritydescriptor, uint32_t autoinheritflags, void* genericmapping, void* token);
void windowssys_windows_win32_security_SetSecurityAccessMask(uint32_t securityinformation, void* desiredaccess);
int32_t windowssys_windows_win32_security_SetSecurityDescriptorControl(void* psecuritydescriptor, uint16_t controlbitsofinterest, uint16_t controlbitstoset);
int32_t windowssys_windows_win32_security_SetSecurityDescriptorDacl(void* psecuritydescriptor, int32_t bdaclpresent, void* pdacl, int32_t bdacldefaulted);
int32_t windowssys_windows_win32_security_SetSecurityDescriptorGroup(void* psecuritydescriptor, void* pgroup, int32_t bgroupdefaulted);
int32_t windowssys_windows_win32_security_SetSecurityDescriptorOwner(void* psecuritydescriptor, void* powner, int32_t bownerdefaulted);
uint32_t windowssys_windows_win32_security_SetSecurityDescriptorRMControl(void* securitydescriptor, void* rmcontrol);
int32_t windowssys_windows_win32_security_SetSecurityDescriptorSacl(void* psecuritydescriptor, int32_t bsaclpresent, void* psacl, int32_t bsacldefaulted);
int32_t windowssys_windows_win32_security_SetTokenInformation(void* tokenhandle, int32_t tokeninformationclass, void* tokeninformation, uint32_t tokeninformationlength);
int32_t windowssys_windows_win32_security_SetUserObjectSecurity(void* hobj, void* psirequested, void* psid);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SECURITY_WINDOWS_WIN32_SECURITY_WRAPPER_H */
