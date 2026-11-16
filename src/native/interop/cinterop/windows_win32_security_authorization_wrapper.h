#ifndef WINDOWSSYS_WINDOWS_WIN32_SECURITY_AUTHORIZATION_WINDOWS_WIN32_SECURITY_AUTHORIZATION_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SECURITY_AUTHORIZATION_WINDOWS_WIN32_SECURITY_AUTHORIZATION_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32SecurityAuthorizationAuthzAccessCheck(uint32_t flags, void* hauthzclientcontext, void* prequest, void* hauditevent, void* psecuritydescriptor, void* optionalsecuritydescriptorarray, uint32_t optionalsecuritydescriptorcount, void* preply, void* phaccesscheckresults);
int32_t windowssysWindowsWin32SecurityAuthorizationAuthzAddSidsToContext(void* hauthzclientcontext, void* sids, uint32_t sidcount, void* restrictedsids, uint32_t restrictedsidcount, void* phnewauthzclientcontext);
int32_t windowssysWindowsWin32SecurityAuthorizationAuthzCachedAccessCheck(uint32_t flags, void* haccesscheckresults, void* prequest, void* hauditevent, void* preply);
int32_t windowssysWindowsWin32SecurityAuthorizationAuthzEnumerateSecurityEventSources(uint32_t dwflags, void* buffer, void* pdwcount, void* pdwlength);
int32_t windowssysWindowsWin32SecurityAuthorizationAuthzEvaluateSacl(void* authzclientcontext, void* prequest, void* sacl, uint32_t grantedaccess, int32_t accessgranted, void* pbgenerateaudit);
int32_t windowssysWindowsWin32SecurityAuthorizationAuthzFreeAuditEvent(void* hauditevent);
int32_t windowssysWindowsWin32SecurityAuthorizationAuthzFreeCentralAccessPolicyCache(void);
int32_t windowssysWindowsWin32SecurityAuthorizationAuthzFreeContext(void* hauthzclientcontext);
int32_t windowssysWindowsWin32SecurityAuthorizationAuthzFreeHandle(void* haccesscheckresults);
int32_t windowssysWindowsWin32SecurityAuthorizationAuthzFreeResourceManager(void* hauthzresourcemanager);
int32_t windowssysWindowsWin32SecurityAuthorizationAuthzGetInformationFromContext(void* hauthzclientcontext, int32_t infoclass, uint32_t buffersize, void* psizerequired, void* buffer);
int32_t windowssysWindowsWin32SecurityAuthorizationAuthzInitializeCompoundContext(void* usercontext, void* devicecontext, void* phcompoundcontext);
int32_t windowssysWindowsWin32SecurityAuthorizationAuthzInitializeObjectAccessAuditEvent(uint32_t flags, void* hauditeventtype, void* szoperationtype, void* szobjecttype, void* szobjectname, void* szadditionalinfo, void* phauditevent, uint32_t dwadditionalparametercount, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t windowssysWindowsWin32SecurityAuthorizationAuthzInitializeObjectAccessAuditEvent2(uint32_t flags, void* hauditeventtype, void* szoperationtype, void* szobjecttype, void* szobjectname, void* szadditionalinfo, void* szadditionalinfo2, void* phauditevent, uint32_t dwadditionalparametercount, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t windowssysWindowsWin32SecurityAuthorizationAuthzInitializeRemoteResourceManager(void* prpcinitinfo, void* phauthzresourcemanager);
int32_t windowssysWindowsWin32SecurityAuthorizationAuthzInitializeResourceManager(uint32_t flags, void* pfndynamicaccesscheck, void* pfncomputedynamicgroups, void* pfnfreedynamicgroups, void* szresourcemanagername, void* phauthzresourcemanager);
int32_t windowssysWindowsWin32SecurityAuthorizationAuthzInitializeResourceManagerEx(uint32_t flags, void* pauthzinitinfo, void* phauthzresourcemanager);
int32_t windowssysWindowsWin32SecurityAuthorizationAuthzInstallSecurityEventSource(uint32_t dwflags, void* pregistration);
int32_t windowssysWindowsWin32SecurityAuthorizationAuthzModifyClaims(void* hauthzclientcontext, int32_t claimclass, void* pclaimoperations, void* pclaims);
int32_t windowssysWindowsWin32SecurityAuthorizationAuthzModifySecurityAttributes(void* hauthzclientcontext, void* poperations, void* pattributes);
int32_t windowssysWindowsWin32SecurityAuthorizationAuthzModifySids(void* hauthzclientcontext, int32_t sidclass, void* psidoperations, void* psids);
int32_t windowssysWindowsWin32SecurityAuthorizationAuthzOpenObjectAudit(uint32_t flags, void* hauthzclientcontext, void* prequest, void* hauditevent, void* psecuritydescriptor, void* optionalsecuritydescriptorarray, uint32_t optionalsecuritydescriptorcount, void* preply);
int32_t windowssysWindowsWin32SecurityAuthorizationAuthzRegisterCapChangeNotification(void* phcapchangesubscription, void* pfncapchangecallback, void* pcallbackcontext);
int32_t windowssysWindowsWin32SecurityAuthorizationAuthzRegisterSecurityEventSource(uint32_t dwflags, void* szeventsourcename, void* pheventprovider);
int32_t windowssysWindowsWin32SecurityAuthorizationAuthzReportSecurityEvent(uint32_t dwflags, void* heventprovider, uint32_t dwauditid, void* pusersid, uint32_t dwcount, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t windowssysWindowsWin32SecurityAuthorizationAuthzReportSecurityEventFromParams(uint32_t dwflags, void* heventprovider, uint32_t dwauditid, void* pusersid, void* pparams);
int32_t windowssysWindowsWin32SecurityAuthorizationAuthzSetAppContainerInformation(void* hauthzclientcontext, void* pappcontainersid, uint32_t capabilitycount, void* pcapabilitysids);
int32_t windowssysWindowsWin32SecurityAuthorizationAuthzUninstallSecurityEventSource(uint32_t dwflags, void* szeventsourcename);
int32_t windowssysWindowsWin32SecurityAuthorizationAuthzUnregisterCapChangeNotification(void* hcapchangesubscription);
int32_t windowssysWindowsWin32SecurityAuthorizationAuthzUnregisterSecurityEventSource(uint32_t dwflags, void* pheventprovider);
void windowssysWindowsWin32SecurityAuthorizationBuildExplicitAccessWithNameA(void* pexplicitaccess, void* ptrusteename, uint32_t accesspermissions, int32_t accessmode, uint32_t inheritance);
void windowssysWindowsWin32SecurityAuthorizationBuildExplicitAccessWithNameW(void* pexplicitaccess, void* ptrusteename, uint32_t accesspermissions, int32_t accessmode, uint32_t inheritance);
void windowssysWindowsWin32SecurityAuthorizationBuildImpersonateExplicitAccessWithNameA(void* pexplicitaccess, void* ptrusteename, void* ptrustee, uint32_t accesspermissions, int32_t accessmode, uint32_t inheritance);
void windowssysWindowsWin32SecurityAuthorizationBuildImpersonateExplicitAccessWithNameW(void* pexplicitaccess, void* ptrusteename, void* ptrustee, uint32_t accesspermissions, int32_t accessmode, uint32_t inheritance);
void windowssysWindowsWin32SecurityAuthorizationBuildImpersonateTrusteeA(void* ptrustee, void* pimpersonatetrustee);
void windowssysWindowsWin32SecurityAuthorizationBuildImpersonateTrusteeW(void* ptrustee, void* pimpersonatetrustee);
uint32_t windowssysWindowsWin32SecurityAuthorizationBuildSecurityDescriptorA(void* powner, void* pgroup, uint32_t ccountofaccessentries, void* plistofaccessentries, uint32_t ccountofauditentries, void* plistofauditentries, void* poldsd, void* psizenewsd, void* pnewsd);
uint32_t windowssysWindowsWin32SecurityAuthorizationBuildSecurityDescriptorW(void* powner, void* pgroup, uint32_t ccountofaccessentries, void* plistofaccessentries, uint32_t ccountofauditentries, void* plistofauditentries, void* poldsd, void* psizenewsd, void* pnewsd);
void windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithNameA(void* ptrustee, void* pname);
void windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithNameW(void* ptrustee, void* pname);
void windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndNameA(void* ptrustee, void* pobjname, int32_t objecttype, void* objecttypename, void* inheritedobjecttypename, void* name);
void windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndNameW(void* ptrustee, void* pobjname, int32_t objecttype, void* objecttypename, void* inheritedobjecttypename, void* name);
void windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndSidA(void* ptrustee, void* pobjsid, void* pobjectguid, void* pinheritedobjectguid, void* psid);
void windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithObjectsAndSidW(void* ptrustee, void* pobjsid, void* pobjectguid, void* pinheritedobjectguid, void* psid);
void windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithSidA(void* ptrustee, void* psid);
void windowssysWindowsWin32SecurityAuthorizationBuildTrusteeWithSidW(void* ptrustee, void* psid);
int32_t windowssysWindowsWin32SecurityAuthorizationConvertSecurityDescriptorToStringSecurityDescriptorA(void* securitydescriptor, uint32_t requestedstringsdrevision, uint32_t securityinformation, void* stringsecuritydescriptor, void* stringsecuritydescriptorlen);
int32_t windowssysWindowsWin32SecurityAuthorizationConvertSecurityDescriptorToStringSecurityDescriptorW(void* securitydescriptor, uint32_t requestedstringsdrevision, uint32_t securityinformation, void* stringsecuritydescriptor, void* stringsecuritydescriptorlen);
int32_t windowssysWindowsWin32SecurityAuthorizationConvertSidToStringSidA(void* sid, void* stringsid);
int32_t windowssysWindowsWin32SecurityAuthorizationConvertSidToStringSidW(void* sid, void* stringsid);
int32_t windowssysWindowsWin32SecurityAuthorizationConvertStringSecurityDescriptorToSecurityDescriptorA(void* stringsecuritydescriptor, uint32_t stringsdrevision, void* securitydescriptor, void* securitydescriptorsize);
int32_t windowssysWindowsWin32SecurityAuthorizationConvertStringSecurityDescriptorToSecurityDescriptorW(void* stringsecuritydescriptor, uint32_t stringsdrevision, void* securitydescriptor, void* securitydescriptorsize);
int32_t windowssysWindowsWin32SecurityAuthorizationConvertStringSidToSidA(void* stringsid, void* sid);
int32_t windowssysWindowsWin32SecurityAuthorizationConvertStringSidToSidW(void* stringsid, void* sid);
uint32_t windowssysWindowsWin32SecurityAuthorizationFreeInheritedFromArray(void* pinheritarray, uint16_t acecnt, void* pfnarray);
uint32_t windowssysWindowsWin32SecurityAuthorizationGetAuditedPermissionsFromAclA(void* pacl, void* ptrustee, void* psuccessfulauditedrights, void* pfailedauditrights);
uint32_t windowssysWindowsWin32SecurityAuthorizationGetAuditedPermissionsFromAclW(void* pacl, void* ptrustee, void* psuccessfulauditedrights, void* pfailedauditrights);
uint32_t windowssysWindowsWin32SecurityAuthorizationGetEffectiveRightsFromAclA(void* pacl, void* ptrustee, void* paccessrights);
uint32_t windowssysWindowsWin32SecurityAuthorizationGetEffectiveRightsFromAclW(void* pacl, void* ptrustee, void* paccessrights);
uint32_t windowssysWindowsWin32SecurityAuthorizationGetExplicitEntriesFromAclA(void* pacl, void* pccountofexplicitentries, void* plistofexplicitentries);
uint32_t windowssysWindowsWin32SecurityAuthorizationGetExplicitEntriesFromAclW(void* pacl, void* pccountofexplicitentries, void* plistofexplicitentries);
uint32_t windowssysWindowsWin32SecurityAuthorizationGetInheritanceSourceA(void* pobjectname, int32_t objecttype, uint32_t securityinfo, int32_t container, void* pobjectclassguids, uint32_t guidcount, void* pacl, void* pfnarray, void* pgenericmapping, void* pinheritarray);
uint32_t windowssysWindowsWin32SecurityAuthorizationGetInheritanceSourceW(void* pobjectname, int32_t objecttype, uint32_t securityinfo, int32_t container, void* pobjectclassguids, uint32_t guidcount, void* pacl, void* pfnarray, void* pgenericmapping, void* pinheritarray);
void* windowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeA(void* ptrustee);
int32_t windowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeOperationA(void* ptrustee);
int32_t windowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeOperationW(void* ptrustee);
void* windowssysWindowsWin32SecurityAuthorizationGetMultipleTrusteeW(void* ptrustee);
uint32_t windowssysWindowsWin32SecurityAuthorizationGetNamedSecurityInfoA(void* pobjectname, int32_t objecttype, uint32_t securityinfo, void* ppsidowner, void* ppsidgroup, void* ppdacl, void* ppsacl, void* ppsecuritydescriptor);
uint32_t windowssysWindowsWin32SecurityAuthorizationGetNamedSecurityInfoW(void* pobjectname, int32_t objecttype, uint32_t securityinfo, void* ppsidowner, void* ppsidgroup, void* ppdacl, void* ppsacl, void* ppsecuritydescriptor);
uint32_t windowssysWindowsWin32SecurityAuthorizationGetSecurityInfo(void* handle, int32_t objecttype, uint32_t securityinfo, void* ppsidowner, void* ppsidgroup, void* ppdacl, void* ppsacl, void* ppsecuritydescriptor);
int32_t windowssysWindowsWin32SecurityAuthorizationGetTrusteeFormA(void* ptrustee);
int32_t windowssysWindowsWin32SecurityAuthorizationGetTrusteeFormW(void* ptrustee);
void* windowssysWindowsWin32SecurityAuthorizationGetTrusteeNameA(void* ptrustee);
void* windowssysWindowsWin32SecurityAuthorizationGetTrusteeNameW(void* ptrustee);
int32_t windowssysWindowsWin32SecurityAuthorizationGetTrusteeTypeA(void* ptrustee);
int32_t windowssysWindowsWin32SecurityAuthorizationGetTrusteeTypeW(void* ptrustee);
uint32_t windowssysWindowsWin32SecurityAuthorizationLookupSecurityDescriptorPartsA(void* ppowner, void* ppgroup, void* pccountofaccessentries, void* pplistofaccessentries, void* pccountofauditentries, void* pplistofauditentries, void* psd);
uint32_t windowssysWindowsWin32SecurityAuthorizationLookupSecurityDescriptorPartsW(void* ppowner, void* ppgroup, void* pccountofaccessentries, void* pplistofaccessentries, void* pccountofauditentries, void* pplistofauditentries, void* psd);
uint32_t windowssysWindowsWin32SecurityAuthorizationSetEntriesInAclA(uint32_t ccountofexplicitentries, void* plistofexplicitentries, void* oldacl, void* newacl);
uint32_t windowssysWindowsWin32SecurityAuthorizationSetEntriesInAclW(uint32_t ccountofexplicitentries, void* plistofexplicitentries, void* oldacl, void* newacl);
uint32_t windowssysWindowsWin32SecurityAuthorizationSetNamedSecurityInfoA(void* pobjectname, int32_t objecttype, uint32_t securityinfo, void* psidowner, void* psidgroup, void* pdacl, void* psacl);
uint32_t windowssysWindowsWin32SecurityAuthorizationSetNamedSecurityInfoW(void* pobjectname, int32_t objecttype, uint32_t securityinfo, void* psidowner, void* psidgroup, void* pdacl, void* psacl);
uint32_t windowssysWindowsWin32SecurityAuthorizationSetSecurityInfo(void* handle, int32_t objecttype, uint32_t securityinfo, void* psidowner, void* psidgroup, void* pdacl, void* psacl);
uint32_t windowssysWindowsWin32SecurityAuthorizationTreeResetNamedSecurityInfoA(void* pobjectname, int32_t objecttype, uint32_t securityinfo, void* powner, void* pgroup, void* pdacl, void* psacl, int32_t keepexplicit, void* fnprogress, int32_t progressinvokesetting, void* args);
uint32_t windowssysWindowsWin32SecurityAuthorizationTreeResetNamedSecurityInfoW(void* pobjectname, int32_t objecttype, uint32_t securityinfo, void* powner, void* pgroup, void* pdacl, void* psacl, int32_t keepexplicit, void* fnprogress, int32_t progressinvokesetting, void* args);
uint32_t windowssysWindowsWin32SecurityAuthorizationTreeSetNamedSecurityInfoA(void* pobjectname, int32_t objecttype, uint32_t securityinfo, void* powner, void* pgroup, void* pdacl, void* psacl, uint32_t dwaction, void* fnprogress, int32_t progressinvokesetting, void* args);
uint32_t windowssysWindowsWin32SecurityAuthorizationTreeSetNamedSecurityInfoW(void* pobjectname, int32_t objecttype, uint32_t securityinfo, void* powner, void* pgroup, void* pdacl, void* psacl, uint32_t dwaction, void* fnprogress, int32_t progressinvokesetting, void* args);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SECURITY_AUTHORIZATION_WINDOWS_WIN32_SECURITY_AUTHORIZATION_WRAPPER_H */
