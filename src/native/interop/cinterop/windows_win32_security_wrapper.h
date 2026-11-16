#ifndef WINDOWSSYS_WINDOWS_WIN32_SECURITY_WINDOWS_WIN32_SECURITY_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SECURITY_WINDOWS_WIN32_SECURITY_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32SecurityAccessCheck(void* psecuritydescriptor, void* clienttoken, uint32_t desiredaccess, void* genericmapping, void* privilegeset, void* privilegesetlength, void* grantedaccess, void* accessstatus);
int32_t windowssysWindowsWin32SecurityAccessCheckAndAuditAlarmA(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* securitydescriptor, uint32_t desiredaccess, void* genericmapping, int32_t objectcreation, void* grantedaccess, void* accessstatus, void* pfgenerateonclose);
int32_t windowssysWindowsWin32SecurityAccessCheckAndAuditAlarmW(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* securitydescriptor, uint32_t desiredaccess, void* genericmapping, int32_t objectcreation, void* grantedaccess, void* accessstatus, void* pfgenerateonclose);
int32_t windowssysWindowsWin32SecurityAccessCheckByType(void* psecuritydescriptor, void* principalselfsid, void* clienttoken, uint32_t desiredaccess, void* objecttypelist, uint32_t objecttypelistlength, void* genericmapping, void* privilegeset, void* privilegesetlength, void* grantedaccess, void* accessstatus);
int32_t windowssysWindowsWin32SecurityAccessCheckByTypeAndAuditAlarmA(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* securitydescriptor, void* principalselfsid, uint32_t desiredaccess, int32_t audittype, uint32_t flags, void* objecttypelist, uint32_t objecttypelistlength, void* genericmapping, int32_t objectcreation, void* grantedaccess, void* accessstatus, void* pfgenerateonclose);
int32_t windowssysWindowsWin32SecurityAccessCheckByTypeAndAuditAlarmW(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* securitydescriptor, void* principalselfsid, uint32_t desiredaccess, int32_t audittype, uint32_t flags, void* objecttypelist, uint32_t objecttypelistlength, void* genericmapping, int32_t objectcreation, void* grantedaccess, void* accessstatus, void* pfgenerateonclose);
int32_t windowssysWindowsWin32SecurityAccessCheckByTypeResultList(void* psecuritydescriptor, void* principalselfsid, void* clienttoken, uint32_t desiredaccess, void* objecttypelist, uint32_t objecttypelistlength, void* genericmapping, void* privilegeset, void* privilegesetlength, void* grantedaccesslist, void* accessstatuslist);
int32_t windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmA(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* securitydescriptor, void* principalselfsid, uint32_t desiredaccess, int32_t audittype, uint32_t flags, void* objecttypelist, uint32_t objecttypelistlength, void* genericmapping, int32_t objectcreation, void* grantedaccess, void* accessstatuslist, void* pfgenerateonclose);
int32_t windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmByHandleA(void* subsystemname, void* handleid, void* clienttoken, void* objecttypename, void* objectname, void* securitydescriptor, void* principalselfsid, uint32_t desiredaccess, int32_t audittype, uint32_t flags, void* objecttypelist, uint32_t objecttypelistlength, void* genericmapping, int32_t objectcreation, void* grantedaccess, void* accessstatuslist, void* pfgenerateonclose);
int32_t windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmByHandleW(void* subsystemname, void* handleid, void* clienttoken, void* objecttypename, void* objectname, void* securitydescriptor, void* principalselfsid, uint32_t desiredaccess, int32_t audittype, uint32_t flags, void* objecttypelist, uint32_t objecttypelistlength, void* genericmapping, int32_t objectcreation, void* grantedaccesslist, void* accessstatuslist, void* pfgenerateonclose);
int32_t windowssysWindowsWin32SecurityAccessCheckByTypeResultListAndAuditAlarmW(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* securitydescriptor, void* principalselfsid, uint32_t desiredaccess, int32_t audittype, uint32_t flags, void* objecttypelist, uint32_t objecttypelistlength, void* genericmapping, int32_t objectcreation, void* grantedaccesslist, void* accessstatuslist, void* pfgenerateonclose);
int32_t windowssysWindowsWin32SecurityAddAccessAllowedAce(void* pacl, uint32_t dwacerevision, uint32_t accessmask, void* psid);
int32_t windowssysWindowsWin32SecurityAddAccessAllowedAceEx(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint32_t accessmask, void* psid);
int32_t windowssysWindowsWin32SecurityAddAccessAllowedObjectAce(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint32_t accessmask, void* objecttypeguid, void* inheritedobjecttypeguid, void* psid);
int32_t windowssysWindowsWin32SecurityAddAccessDeniedAce(void* pacl, uint32_t dwacerevision, uint32_t accessmask, void* psid);
int32_t windowssysWindowsWin32SecurityAddAccessDeniedAceEx(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint32_t accessmask, void* psid);
int32_t windowssysWindowsWin32SecurityAddAccessDeniedObjectAce(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint32_t accessmask, void* objecttypeguid, void* inheritedobjecttypeguid, void* psid);
int32_t windowssysWindowsWin32SecurityAddAce(void* pacl, uint32_t dwacerevision, uint32_t dwstartingaceindex, void* pacelist, uint32_t nacelistlength);
int32_t windowssysWindowsWin32SecurityAddAuditAccessAce(void* pacl, uint32_t dwacerevision, uint32_t dwaccessmask, void* psid, int32_t bauditsuccess, int32_t bauditfailure);
int32_t windowssysWindowsWin32SecurityAddAuditAccessAceEx(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint32_t dwaccessmask, void* psid, int32_t bauditsuccess, int32_t bauditfailure);
int32_t windowssysWindowsWin32SecurityAddAuditAccessObjectAce(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint32_t accessmask, void* objecttypeguid, void* inheritedobjecttypeguid, void* psid, int32_t bauditsuccess, int32_t bauditfailure);
int32_t windowssysWindowsWin32SecurityAddConditionalAce(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint8_t acetype, uint32_t accessmask, void* psid, void* conditionstr, void* returnlength);
int32_t windowssysWindowsWin32SecurityAddMandatoryAce(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint32_t mandatorypolicy, void* plabelsid);
int32_t windowssysWindowsWin32SecurityAddResourceAttributeAce(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint32_t accessmask, void* psid, void* pattributeinfo, void* preturnlength);
int32_t windowssysWindowsWin32SecurityAddScopedPolicyIDAce(void* pacl, uint32_t dwacerevision, uint32_t aceflags, uint32_t accessmask, void* psid);
int32_t windowssysWindowsWin32SecurityAdjustTokenGroups(void* tokenhandle, int32_t resettodefault, void* newstate, uint32_t bufferlength, void* previousstate, void* returnlength);
int32_t windowssysWindowsWin32SecurityAdjustTokenPrivileges(void* tokenhandle, int32_t disableallprivileges, void* newstate, uint32_t bufferlength, void* previousstate, void* returnlength);
int32_t windowssysWindowsWin32SecurityAllocateAndInitializeSid(void* pidentifierauthority, uint8_t nsubauthoritycount, uint32_t nsubauthority0, uint32_t nsubauthority1, uint32_t nsubauthority2, uint32_t nsubauthority3, uint32_t nsubauthority4, uint32_t nsubauthority5, uint32_t nsubauthority6, uint32_t nsubauthority7, void* psid);
int32_t windowssysWindowsWin32SecurityAllocateLocallyUniqueId(void* luid);
int32_t windowssysWindowsWin32SecurityAreAllAccessesGranted(uint32_t grantedaccess, uint32_t desiredaccess);
int32_t windowssysWindowsWin32SecurityAreAnyAccessesGranted(uint32_t grantedaccess, uint32_t desiredaccess);
int32_t windowssysWindowsWin32SecurityCheckTokenCapability(void* tokenhandle, void* capabilitysidtocheck, void* hascapability);
int32_t windowssysWindowsWin32SecurityCheckTokenMembership(void* tokenhandle, void* sidtocheck, void* ismember);
int32_t windowssysWindowsWin32SecurityCheckTokenMembershipEx(void* tokenhandle, void* sidtocheck, uint32_t flags, void* ismember);
int32_t windowssysWindowsWin32SecurityConvertToAutoInheritPrivateObjectSecurity(void* parentdescriptor, void* currentsecuritydescriptor, void* newsecuritydescriptor, void* objecttype, bool isdirectoryobject, void* genericmapping);
int32_t windowssysWindowsWin32SecurityCopySid(uint32_t ndestinationsidlength, void* pdestinationsid, void* psourcesid);
int32_t windowssysWindowsWin32SecurityCreatePrivateObjectSecurity(void* parentdescriptor, void* creatordescriptor, void* newdescriptor, int32_t isdirectoryobject, void* token, void* genericmapping);
int32_t windowssysWindowsWin32SecurityCreatePrivateObjectSecurityEx(void* parentdescriptor, void* creatordescriptor, void* newdescriptor, void* objecttype, int32_t iscontainerobject, uint32_t autoinheritflags, void* token, void* genericmapping);
int32_t windowssysWindowsWin32SecurityCreatePrivateObjectSecurityWithMultipleInheritance(void* parentdescriptor, void* creatordescriptor, void* newdescriptor, void* objecttypes, uint32_t guidcount, int32_t iscontainerobject, uint32_t autoinheritflags, void* token, void* genericmapping);
int32_t windowssysWindowsWin32SecurityCreateRestrictedToken(void* existingtokenhandle, uint32_t flags, uint32_t disablesidcount, void* sidstodisable, uint32_t deleteprivilegecount, void* privilegestodelete, uint32_t restrictedsidcount, void* sidstorestrict, void* newtokenhandle);
int32_t windowssysWindowsWin32SecurityCreateWellKnownSid(int32_t wellknownsidtype, void* domainsid, void* psid, void* cbsid);
int32_t windowssysWindowsWin32SecurityDeleteAce(void* pacl, uint32_t dwaceindex);
int32_t windowssysWindowsWin32SecurityDeriveCapabilitySidsFromName(void* capname, void* capabilitygroupsids, void* capabilitygroupsidcount, void* capabilitysids, void* capabilitysidcount);
int32_t windowssysWindowsWin32SecurityDestroyPrivateObjectSecurity(void* objectdescriptor);
int32_t windowssysWindowsWin32SecurityDuplicateToken(void* existingtokenhandle, int32_t impersonationlevel, void* duplicatetokenhandle);
int32_t windowssysWindowsWin32SecurityDuplicateTokenEx(void* hexistingtoken, uint32_t dwdesiredaccess, void* lptokenattributes, int32_t impersonationlevel, int32_t tokentype, void* phnewtoken);
int32_t windowssysWindowsWin32SecurityEqualDomainSid(void* psid1, void* psid2, void* pfequal);
int32_t windowssysWindowsWin32SecurityEqualPrefixSid(void* psid1, void* psid2);
int32_t windowssysWindowsWin32SecurityEqualSid(void* psid1, void* psid2);
int32_t windowssysWindowsWin32SecurityFindFirstFreeAce(void* pacl, void* pace);
void* windowssysWindowsWin32SecurityFreeSid(void* psid);
int32_t windowssysWindowsWin32SecurityGetAce(void* pacl, uint32_t dwaceindex, void* pace);
int32_t windowssysWindowsWin32SecurityGetAclInformation(void* pacl, void* paclinformation, uint32_t naclinformationlength, int32_t dwaclinformationclass);
int32_t windowssysWindowsWin32SecurityGetAppContainerAce(void* acl, uint32_t startingaceindex, void* appcontainerace, void* appcontaineraceindex);
int32_t windowssysWindowsWin32SecurityGetCachedSigningLevel(void* file, void* flags, void* signinglevel, void* thumbprint, void* thumbprintsize, void* thumbprintalgorithm);
int32_t windowssysWindowsWin32SecurityGetFileSecurityA(void* lpfilename, uint32_t requestedinformation, void* psecuritydescriptor, uint32_t nlength, void* lpnlengthneeded);
int32_t windowssysWindowsWin32SecurityGetFileSecurityW(void* lpfilename, uint32_t requestedinformation, void* psecuritydescriptor, uint32_t nlength, void* lpnlengthneeded);
int32_t windowssysWindowsWin32SecurityGetKernelObjectSecurity(void* handle, uint32_t requestedinformation, void* psecuritydescriptor, uint32_t nlength, void* lpnlengthneeded);
uint32_t windowssysWindowsWin32SecurityGetLengthSid(void* psid);
int32_t windowssysWindowsWin32SecurityGetPrivateObjectSecurity(void* objectdescriptor, uint32_t securityinformation, void* resultantdescriptor, uint32_t descriptorlength, void* returnlength);
int32_t windowssysWindowsWin32SecurityGetSecurityDescriptorControl(void* psecuritydescriptor, void* pcontrol, void* lpdwrevision);
int32_t windowssysWindowsWin32SecurityGetSecurityDescriptorDacl(void* psecuritydescriptor, void* lpbdaclpresent, void* pdacl, void* lpbdacldefaulted);
int32_t windowssysWindowsWin32SecurityGetSecurityDescriptorGroup(void* psecuritydescriptor, void* pgroup, void* lpbgroupdefaulted);
uint32_t windowssysWindowsWin32SecurityGetSecurityDescriptorLength(void* psecuritydescriptor);
int32_t windowssysWindowsWin32SecurityGetSecurityDescriptorOwner(void* psecuritydescriptor, void* powner, void* lpbownerdefaulted);
uint32_t windowssysWindowsWin32SecurityGetSecurityDescriptorRMControl(void* securitydescriptor, void* rmcontrol);
int32_t windowssysWindowsWin32SecurityGetSecurityDescriptorSacl(void* psecuritydescriptor, void* lpbsaclpresent, void* psacl, void* lpbsacldefaulted);
void* windowssysWindowsWin32SecurityGetSidIdentifierAuthority(void* psid);
uint32_t windowssysWindowsWin32SecurityGetSidLengthRequired(uint8_t nsubauthoritycount);
void* windowssysWindowsWin32SecurityGetSidSubAuthority(void* psid, uint32_t nsubauthority);
void* windowssysWindowsWin32SecurityGetSidSubAuthorityCount(void* psid);
int32_t windowssysWindowsWin32SecurityGetTokenInformation(void* tokenhandle, int32_t tokeninformationclass, void* tokeninformation, uint32_t tokeninformationlength, void* returnlength);
int32_t windowssysWindowsWin32SecurityGetUserObjectSecurity(void* hobj, void* psirequested, void* psid, uint32_t nlength, void* lpnlengthneeded);
int32_t windowssysWindowsWin32SecurityGetWindowsAccountDomainSid(void* psid, void* pdomainsid, void* cbdomainsid);
int32_t windowssysWindowsWin32SecurityImpersonateAnonymousToken(void* threadhandle);
int32_t windowssysWindowsWin32SecurityImpersonateLoggedOnUser(void* htoken);
int32_t windowssysWindowsWin32SecurityImpersonateSelf(int32_t impersonationlevel);
int32_t windowssysWindowsWin32SecurityInitializeAcl(void* pacl, uint32_t nacllength, uint32_t dwaclrevision);
int32_t windowssysWindowsWin32SecurityInitializeSecurityDescriptor(void* psecuritydescriptor, uint32_t dwrevision);
int32_t windowssysWindowsWin32SecurityInitializeSid(void* sid, void* pidentifierauthority, uint8_t nsubauthoritycount);
int32_t windowssysWindowsWin32SecurityIsTokenRestricted(void* tokenhandle);
int32_t windowssysWindowsWin32SecurityIsValidAcl(void* pacl);
int32_t windowssysWindowsWin32SecurityIsValidSecurityDescriptor(void* psecuritydescriptor);
int32_t windowssysWindowsWin32SecurityIsValidSid(void* psid);
int32_t windowssysWindowsWin32SecurityIsWellKnownSid(void* psid, int32_t wellknownsidtype);
int32_t windowssysWindowsWin32SecurityLogonUserA(void* lpszusername, void* lpszdomain, void* lpszpassword, uint32_t dwlogontype, uint32_t dwlogonprovider, void* phtoken);
int32_t windowssysWindowsWin32SecurityLogonUserExA(void* lpszusername, void* lpszdomain, void* lpszpassword, uint32_t dwlogontype, uint32_t dwlogonprovider, void* phtoken, void* pplogonsid, void* ppprofilebuffer, void* pdwprofilelength, void* pquotalimits);
int32_t windowssysWindowsWin32SecurityLogonUserExW(void* lpszusername, void* lpszdomain, void* lpszpassword, uint32_t dwlogontype, uint32_t dwlogonprovider, void* phtoken, void* pplogonsid, void* ppprofilebuffer, void* pdwprofilelength, void* pquotalimits);
int32_t windowssysWindowsWin32SecurityLogonUserW(void* lpszusername, void* lpszdomain, void* lpszpassword, uint32_t dwlogontype, uint32_t dwlogonprovider, void* phtoken);
int32_t windowssysWindowsWin32SecurityLookupAccountNameA(void* lpsystemname, void* lpaccountname, void* sid, void* cbsid, void* referenceddomainname, void* cchreferenceddomainname, void* peuse);
int32_t windowssysWindowsWin32SecurityLookupAccountNameW(void* lpsystemname, void* lpaccountname, void* sid, void* cbsid, void* referenceddomainname, void* cchreferenceddomainname, void* peuse);
int32_t windowssysWindowsWin32SecurityLookupAccountSidA(void* lpsystemname, void* sid, void* name, void* cchname, void* referenceddomainname, void* cchreferenceddomainname, void* peuse);
int32_t windowssysWindowsWin32SecurityLookupAccountSidW(void* lpsystemname, void* sid, void* name, void* cchname, void* referenceddomainname, void* cchreferenceddomainname, void* peuse);
int32_t windowssysWindowsWin32SecurityLookupPrivilegeDisplayNameA(void* lpsystemname, void* lpname, void* lpdisplayname, void* cchdisplayname, void* lplanguageid);
int32_t windowssysWindowsWin32SecurityLookupPrivilegeDisplayNameW(void* lpsystemname, void* lpname, void* lpdisplayname, void* cchdisplayname, void* lplanguageid);
int32_t windowssysWindowsWin32SecurityLookupPrivilegeNameA(void* lpsystemname, void* lpluid, void* lpname, void* cchname);
int32_t windowssysWindowsWin32SecurityLookupPrivilegeNameW(void* lpsystemname, void* lpluid, void* lpname, void* cchname);
int32_t windowssysWindowsWin32SecurityLookupPrivilegeValueA(void* lpsystemname, void* lpname, void* lpluid);
int32_t windowssysWindowsWin32SecurityLookupPrivilegeValueW(void* lpsystemname, void* lpname, void* lpluid);
int32_t windowssysWindowsWin32SecurityMakeAbsoluteSD(void* pselfrelativesecuritydescriptor, void* pabsolutesecuritydescriptor, void* lpdwabsolutesecuritydescriptorsize, void* pdacl, void* lpdwdaclsize, void* psacl, void* lpdwsaclsize, void* powner, void* lpdwownersize, void* pprimarygroup, void* lpdwprimarygroupsize);
int32_t windowssysWindowsWin32SecurityMakeSelfRelativeSD(void* pabsolutesecuritydescriptor, void* pselfrelativesecuritydescriptor, void* lpdwbufferlength);
void windowssysWindowsWin32SecurityMapGenericMask(void* accessmask, void* genericmapping);
int32_t windowssysWindowsWin32SecurityObjectCloseAuditAlarmA(void* subsystemname, void* handleid, int32_t generateonclose);
int32_t windowssysWindowsWin32SecurityObjectCloseAuditAlarmW(void* subsystemname, void* handleid, int32_t generateonclose);
int32_t windowssysWindowsWin32SecurityObjectDeleteAuditAlarmA(void* subsystemname, void* handleid, int32_t generateonclose);
int32_t windowssysWindowsWin32SecurityObjectDeleteAuditAlarmW(void* subsystemname, void* handleid, int32_t generateonclose);
int32_t windowssysWindowsWin32SecurityObjectOpenAuditAlarmA(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* psecuritydescriptor, void* clienttoken, uint32_t desiredaccess, uint32_t grantedaccess, void* privileges, int32_t objectcreation, int32_t accessgranted, void* generateonclose);
int32_t windowssysWindowsWin32SecurityObjectOpenAuditAlarmW(void* subsystemname, void* handleid, void* objecttypename, void* objectname, void* psecuritydescriptor, void* clienttoken, uint32_t desiredaccess, uint32_t grantedaccess, void* privileges, int32_t objectcreation, int32_t accessgranted, void* generateonclose);
int32_t windowssysWindowsWin32SecurityObjectPrivilegeAuditAlarmA(void* subsystemname, void* handleid, void* clienttoken, uint32_t desiredaccess, void* privileges, int32_t accessgranted);
int32_t windowssysWindowsWin32SecurityObjectPrivilegeAuditAlarmW(void* subsystemname, void* handleid, void* clienttoken, uint32_t desiredaccess, void* privileges, int32_t accessgranted);
int32_t windowssysWindowsWin32SecurityPrivilegeCheck(void* clienttoken, void* requiredprivileges, void* pfresult);
int32_t windowssysWindowsWin32SecurityPrivilegedServiceAuditAlarmA(void* subsystemname, void* servicename, void* clienttoken, void* privileges, int32_t accessgranted);
int32_t windowssysWindowsWin32SecurityPrivilegedServiceAuditAlarmW(void* subsystemname, void* servicename, void* clienttoken, void* privileges, int32_t accessgranted);
void windowssysWindowsWin32SecurityQuerySecurityAccessMask(uint32_t securityinformation, void* desiredaccess);
int32_t windowssysWindowsWin32SecurityRevertToSelf(void);
int32_t windowssysWindowsWin32SecurityRtlConvertSidToUnicodeString(void* unicodestring, void* sid, bool allocatedestinationstring);
bool windowssysWindowsWin32SecurityRtlNormalizeSecurityDescriptor(void* securitydescriptor, uint32_t securitydescriptorlength, void* newsecuritydescriptor, void* newsecuritydescriptorlength, bool checkonly);
int32_t windowssysWindowsWin32SecuritySetAclInformation(void* pacl, void* paclinformation, uint32_t naclinformationlength, int32_t dwaclinformationclass);
int32_t windowssysWindowsWin32SecuritySetCachedSigningLevel(void* sourcefiles, uint32_t sourcefilecount, uint32_t flags, void* targetfile);
int32_t windowssysWindowsWin32SecuritySetFileSecurityA(void* lpfilename, uint32_t securityinformation, void* psecuritydescriptor);
int32_t windowssysWindowsWin32SecuritySetFileSecurityW(void* lpfilename, uint32_t securityinformation, void* psecuritydescriptor);
int32_t windowssysWindowsWin32SecuritySetKernelObjectSecurity(void* handle, uint32_t securityinformation, void* securitydescriptor);
int32_t windowssysWindowsWin32SecuritySetPrivateObjectSecurity(uint32_t securityinformation, void* modificationdescriptor, void* objectssecuritydescriptor, void* genericmapping, void* token);
int32_t windowssysWindowsWin32SecuritySetPrivateObjectSecurityEx(uint32_t securityinformation, void* modificationdescriptor, void* objectssecuritydescriptor, uint32_t autoinheritflags, void* genericmapping, void* token);
void windowssysWindowsWin32SecuritySetSecurityAccessMask(uint32_t securityinformation, void* desiredaccess);
int32_t windowssysWindowsWin32SecuritySetSecurityDescriptorControl(void* psecuritydescriptor, uint16_t controlbitsofinterest, uint16_t controlbitstoset);
int32_t windowssysWindowsWin32SecuritySetSecurityDescriptorDacl(void* psecuritydescriptor, int32_t bdaclpresent, void* pdacl, int32_t bdacldefaulted);
int32_t windowssysWindowsWin32SecuritySetSecurityDescriptorGroup(void* psecuritydescriptor, void* pgroup, int32_t bgroupdefaulted);
int32_t windowssysWindowsWin32SecuritySetSecurityDescriptorOwner(void* psecuritydescriptor, void* powner, int32_t bownerdefaulted);
uint32_t windowssysWindowsWin32SecuritySetSecurityDescriptorRMControl(void* securitydescriptor, void* rmcontrol);
int32_t windowssysWindowsWin32SecuritySetSecurityDescriptorSacl(void* psecuritydescriptor, int32_t bsaclpresent, void* psacl, int32_t bsacldefaulted);
int32_t windowssysWindowsWin32SecuritySetTokenInformation(void* tokenhandle, int32_t tokeninformationclass, void* tokeninformation, uint32_t tokeninformationlength);
int32_t windowssysWindowsWin32SecuritySetUserObjectSecurity(void* hobj, void* psirequested, void* psid);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SECURITY_WINDOWS_WIN32_SECURITY_WRAPPER_H */
