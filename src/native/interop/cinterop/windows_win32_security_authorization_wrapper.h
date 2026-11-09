#ifndef WINDOWSSYS_WINDOWS_WIN32_SECURITY_AUTHORIZATION_WINDOWS_WIN32_SECURITY_AUTHORIZATION_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SECURITY_AUTHORIZATION_WINDOWS_WIN32_SECURITY_AUTHORIZATION_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_security_authorization_AuthzAccessCheck(uint32_t flags, void* hauthzclientcontext, void* prequest, void* hauditevent, void* psecuritydescriptor, void* optionalsecuritydescriptorarray, uint32_t optionalsecuritydescriptorcount, void* preply, void* phaccesscheckresults);
int32_t windowssys_windows_win32_security_authorization_AuthzAddSidsToContext(void* hauthzclientcontext, void* sids, uint32_t sidcount, void* restrictedsids, uint32_t restrictedsidcount, void* phnewauthzclientcontext);
int32_t windowssys_windows_win32_security_authorization_AuthzCachedAccessCheck(uint32_t flags, void* haccesscheckresults, void* prequest, void* hauditevent, void* preply);
int32_t windowssys_windows_win32_security_authorization_AuthzEnumerateSecurityEventSources(uint32_t dwflags, void* buffer, void* pdwcount, void* pdwlength);
int32_t windowssys_windows_win32_security_authorization_AuthzEvaluateSacl(void* authzclientcontext, void* prequest, void* sacl, uint32_t grantedaccess, int32_t accessgranted, void* pbgenerateaudit);
int32_t windowssys_windows_win32_security_authorization_AuthzFreeAuditEvent(void* hauditevent);
int32_t windowssys_windows_win32_security_authorization_AuthzFreeCentralAccessPolicyCache(void);
int32_t windowssys_windows_win32_security_authorization_AuthzFreeContext(void* hauthzclientcontext);
int32_t windowssys_windows_win32_security_authorization_AuthzFreeHandle(void* haccesscheckresults);
int32_t windowssys_windows_win32_security_authorization_AuthzFreeResourceManager(void* hauthzresourcemanager);
int32_t windowssys_windows_win32_security_authorization_AuthzGetInformationFromContext(void* hauthzclientcontext, int32_t infoclass, uint32_t buffersize, void* psizerequired, void* buffer);
int32_t windowssys_windows_win32_security_authorization_AuthzInitializeCompoundContext(void* usercontext, void* devicecontext, void* phcompoundcontext);
int32_t windowssys_windows_win32_security_authorization_AuthzInitializeRemoteResourceManager(void* prpcinitinfo, void* phauthzresourcemanager);
int32_t windowssys_windows_win32_security_authorization_AuthzInitializeResourceManager(uint32_t flags, void* pfndynamicaccesscheck, void* pfncomputedynamicgroups, void* pfnfreedynamicgroups, void* szresourcemanagername, void* phauthzresourcemanager);
int32_t windowssys_windows_win32_security_authorization_AuthzInitializeResourceManagerEx(uint32_t flags, void* pauthzinitinfo, void* phauthzresourcemanager);
int32_t windowssys_windows_win32_security_authorization_AuthzInstallSecurityEventSource(uint32_t dwflags, void* pregistration);
int32_t windowssys_windows_win32_security_authorization_AuthzModifyClaims(void* hauthzclientcontext, int32_t claimclass, void* pclaimoperations, void* pclaims);
int32_t windowssys_windows_win32_security_authorization_AuthzModifySecurityAttributes(void* hauthzclientcontext, void* poperations, void* pattributes);
int32_t windowssys_windows_win32_security_authorization_AuthzModifySids(void* hauthzclientcontext, int32_t sidclass, void* psidoperations, void* psids);
int32_t windowssys_windows_win32_security_authorization_AuthzOpenObjectAudit(uint32_t flags, void* hauthzclientcontext, void* prequest, void* hauditevent, void* psecuritydescriptor, void* optionalsecuritydescriptorarray, uint32_t optionalsecuritydescriptorcount, void* preply);
int32_t windowssys_windows_win32_security_authorization_AuthzRegisterSecurityEventSource(uint32_t dwflags, void* szeventsourcename, void* pheventprovider);
int32_t windowssys_windows_win32_security_authorization_AuthzReportSecurityEventFromParams(uint32_t dwflags, void* heventprovider, uint32_t dwauditid, void* pusersid, void* pparams);
int32_t windowssys_windows_win32_security_authorization_AuthzSetAppContainerInformation(void* hauthzclientcontext, void* pappcontainersid, uint32_t capabilitycount, void* pcapabilitysids);
int32_t windowssys_windows_win32_security_authorization_AuthzUninstallSecurityEventSource(uint32_t dwflags, void* szeventsourcename);
int32_t windowssys_windows_win32_security_authorization_AuthzUnregisterCapChangeNotification(void* hcapchangesubscription);
int32_t windowssys_windows_win32_security_authorization_AuthzUnregisterSecurityEventSource(uint32_t dwflags, void* pheventprovider);
void windowssys_windows_win32_security_authorization_BuildExplicitAccessWithNameA(void* pexplicitaccess, void* ptrusteename, uint32_t accesspermissions, int32_t accessmode, uint32_t inheritance);
void windowssys_windows_win32_security_authorization_BuildExplicitAccessWithNameW(void* pexplicitaccess, void* ptrusteename, uint32_t accesspermissions, int32_t accessmode, uint32_t inheritance);
void windowssys_windows_win32_security_authorization_BuildImpersonateExplicitAccessWithNameA(void* pexplicitaccess, void* ptrusteename, void* ptrustee, uint32_t accesspermissions, int32_t accessmode, uint32_t inheritance);
void windowssys_windows_win32_security_authorization_BuildImpersonateExplicitAccessWithNameW(void* pexplicitaccess, void* ptrusteename, void* ptrustee, uint32_t accesspermissions, int32_t accessmode, uint32_t inheritance);
void windowssys_windows_win32_security_authorization_BuildImpersonateTrusteeA(void* ptrustee, void* pimpersonatetrustee);
void windowssys_windows_win32_security_authorization_BuildImpersonateTrusteeW(void* ptrustee, void* pimpersonatetrustee);
uint32_t windowssys_windows_win32_security_authorization_BuildSecurityDescriptorA(void* powner, void* pgroup, uint32_t ccountofaccessentries, void* plistofaccessentries, uint32_t ccountofauditentries, void* plistofauditentries, void* poldsd, void* psizenewsd, void* pnewsd);
uint32_t windowssys_windows_win32_security_authorization_BuildSecurityDescriptorW(void* powner, void* pgroup, uint32_t ccountofaccessentries, void* plistofaccessentries, uint32_t ccountofauditentries, void* plistofauditentries, void* poldsd, void* psizenewsd, void* pnewsd);
void windowssys_windows_win32_security_authorization_BuildTrusteeWithNameA(void* ptrustee, void* pname);
void windowssys_windows_win32_security_authorization_BuildTrusteeWithNameW(void* ptrustee, void* pname);
void windowssys_windows_win32_security_authorization_BuildTrusteeWithObjectsAndNameA(void* ptrustee, void* pobjname, int32_t objecttype, void* objecttypename, void* inheritedobjecttypename, void* name);
void windowssys_windows_win32_security_authorization_BuildTrusteeWithObjectsAndNameW(void* ptrustee, void* pobjname, int32_t objecttype, void* objecttypename, void* inheritedobjecttypename, void* name);
void windowssys_windows_win32_security_authorization_BuildTrusteeWithObjectsAndSidA(void* ptrustee, void* pobjsid, void* pobjectguid, void* pinheritedobjectguid, void* psid);
void windowssys_windows_win32_security_authorization_BuildTrusteeWithObjectsAndSidW(void* ptrustee, void* pobjsid, void* pobjectguid, void* pinheritedobjectguid, void* psid);
void windowssys_windows_win32_security_authorization_BuildTrusteeWithSidA(void* ptrustee, void* psid);
void windowssys_windows_win32_security_authorization_BuildTrusteeWithSidW(void* ptrustee, void* psid);
int32_t windowssys_windows_win32_security_authorization_ConvertSecurityDescriptorToStringSecurityDescriptorA(void* securitydescriptor, uint32_t requestedstringsdrevision, uint32_t securityinformation, void* stringsecuritydescriptor, void* stringsecuritydescriptorlen);
int32_t windowssys_windows_win32_security_authorization_ConvertSecurityDescriptorToStringSecurityDescriptorW(void* securitydescriptor, uint32_t requestedstringsdrevision, uint32_t securityinformation, void* stringsecuritydescriptor, void* stringsecuritydescriptorlen);
int32_t windowssys_windows_win32_security_authorization_ConvertSidToStringSidA(void* sid, void* stringsid);
int32_t windowssys_windows_win32_security_authorization_ConvertSidToStringSidW(void* sid, void* stringsid);
int32_t windowssys_windows_win32_security_authorization_ConvertStringSecurityDescriptorToSecurityDescriptorA(void* stringsecuritydescriptor, uint32_t stringsdrevision, void* securitydescriptor, void* securitydescriptorsize);
int32_t windowssys_windows_win32_security_authorization_ConvertStringSecurityDescriptorToSecurityDescriptorW(void* stringsecuritydescriptor, uint32_t stringsdrevision, void* securitydescriptor, void* securitydescriptorsize);
int32_t windowssys_windows_win32_security_authorization_ConvertStringSidToSidA(void* stringsid, void* sid);
int32_t windowssys_windows_win32_security_authorization_ConvertStringSidToSidW(void* stringsid, void* sid);
uint32_t windowssys_windows_win32_security_authorization_FreeInheritedFromArray(void* pinheritarray, uint16_t acecnt, void* pfnarray);
uint32_t windowssys_windows_win32_security_authorization_GetAuditedPermissionsFromAclA(void* pacl, void* ptrustee, void* psuccessfulauditedrights, void* pfailedauditrights);
uint32_t windowssys_windows_win32_security_authorization_GetAuditedPermissionsFromAclW(void* pacl, void* ptrustee, void* psuccessfulauditedrights, void* pfailedauditrights);
uint32_t windowssys_windows_win32_security_authorization_GetEffectiveRightsFromAclA(void* pacl, void* ptrustee, void* paccessrights);
uint32_t windowssys_windows_win32_security_authorization_GetEffectiveRightsFromAclW(void* pacl, void* ptrustee, void* paccessrights);
uint32_t windowssys_windows_win32_security_authorization_GetExplicitEntriesFromAclA(void* pacl, void* pccountofexplicitentries, void* plistofexplicitentries);
uint32_t windowssys_windows_win32_security_authorization_GetExplicitEntriesFromAclW(void* pacl, void* pccountofexplicitentries, void* plistofexplicitentries);
uint32_t windowssys_windows_win32_security_authorization_GetInheritanceSourceA(void* pobjectname, int32_t objecttype, uint32_t securityinfo, int32_t container, void* pobjectclassguids, uint32_t guidcount, void* pacl, void* pfnarray, void* pgenericmapping, void* pinheritarray);
uint32_t windowssys_windows_win32_security_authorization_GetInheritanceSourceW(void* pobjectname, int32_t objecttype, uint32_t securityinfo, int32_t container, void* pobjectclassguids, uint32_t guidcount, void* pacl, void* pfnarray, void* pgenericmapping, void* pinheritarray);
void* windowssys_windows_win32_security_authorization_GetMultipleTrusteeA(void* ptrustee);
int32_t windowssys_windows_win32_security_authorization_GetMultipleTrusteeOperationA(void* ptrustee);
int32_t windowssys_windows_win32_security_authorization_GetMultipleTrusteeOperationW(void* ptrustee);
void* windowssys_windows_win32_security_authorization_GetMultipleTrusteeW(void* ptrustee);
uint32_t windowssys_windows_win32_security_authorization_GetNamedSecurityInfoA(void* pobjectname, int32_t objecttype, uint32_t securityinfo, void* ppsidowner, void* ppsidgroup, void* ppdacl, void* ppsacl, void* ppsecuritydescriptor);
uint32_t windowssys_windows_win32_security_authorization_GetNamedSecurityInfoW(void* pobjectname, int32_t objecttype, uint32_t securityinfo, void* ppsidowner, void* ppsidgroup, void* ppdacl, void* ppsacl, void* ppsecuritydescriptor);
uint32_t windowssys_windows_win32_security_authorization_GetSecurityInfo(void* handle, int32_t objecttype, uint32_t securityinfo, void* ppsidowner, void* ppsidgroup, void* ppdacl, void* ppsacl, void* ppsecuritydescriptor);
int32_t windowssys_windows_win32_security_authorization_GetTrusteeFormA(void* ptrustee);
int32_t windowssys_windows_win32_security_authorization_GetTrusteeFormW(void* ptrustee);
void* windowssys_windows_win32_security_authorization_GetTrusteeNameA(void* ptrustee);
void* windowssys_windows_win32_security_authorization_GetTrusteeNameW(void* ptrustee);
int32_t windowssys_windows_win32_security_authorization_GetTrusteeTypeA(void* ptrustee);
int32_t windowssys_windows_win32_security_authorization_GetTrusteeTypeW(void* ptrustee);
uint32_t windowssys_windows_win32_security_authorization_LookupSecurityDescriptorPartsA(void* ppowner, void* ppgroup, void* pccountofaccessentries, void* pplistofaccessentries, void* pccountofauditentries, void* pplistofauditentries, void* psd);
uint32_t windowssys_windows_win32_security_authorization_LookupSecurityDescriptorPartsW(void* ppowner, void* ppgroup, void* pccountofaccessentries, void* pplistofaccessentries, void* pccountofauditentries, void* pplistofauditentries, void* psd);
uint32_t windowssys_windows_win32_security_authorization_SetEntriesInAclA(uint32_t ccountofexplicitentries, void* plistofexplicitentries, void* oldacl, void* newacl);
uint32_t windowssys_windows_win32_security_authorization_SetEntriesInAclW(uint32_t ccountofexplicitentries, void* plistofexplicitentries, void* oldacl, void* newacl);
uint32_t windowssys_windows_win32_security_authorization_SetNamedSecurityInfoA(void* pobjectname, int32_t objecttype, uint32_t securityinfo, void* psidowner, void* psidgroup, void* pdacl, void* psacl);
uint32_t windowssys_windows_win32_security_authorization_SetNamedSecurityInfoW(void* pobjectname, int32_t objecttype, uint32_t securityinfo, void* psidowner, void* psidgroup, void* pdacl, void* psacl);
uint32_t windowssys_windows_win32_security_authorization_SetSecurityInfo(void* handle, int32_t objecttype, uint32_t securityinfo, void* psidowner, void* psidgroup, void* pdacl, void* psacl);
uint32_t windowssys_windows_win32_security_authorization_TreeResetNamedSecurityInfoA(void* pobjectname, int32_t objecttype, uint32_t securityinfo, void* powner, void* pgroup, void* pdacl, void* psacl, int32_t keepexplicit, void* fnprogress, int32_t progressinvokesetting, void* args);
uint32_t windowssys_windows_win32_security_authorization_TreeResetNamedSecurityInfoW(void* pobjectname, int32_t objecttype, uint32_t securityinfo, void* powner, void* pgroup, void* pdacl, void* psacl, int32_t keepexplicit, void* fnprogress, int32_t progressinvokesetting, void* args);
uint32_t windowssys_windows_win32_security_authorization_TreeSetNamedSecurityInfoA(void* pobjectname, int32_t objecttype, uint32_t securityinfo, void* powner, void* pgroup, void* pdacl, void* psacl, uint32_t dwaction, void* fnprogress, int32_t progressinvokesetting, void* args);
uint32_t windowssys_windows_win32_security_authorization_TreeSetNamedSecurityInfoW(void* pobjectname, int32_t objecttype, uint32_t securityinfo, void* powner, void* pgroup, void* pdacl, void* psacl, uint32_t dwaction, void* fnprogress, int32_t progressinvokesetting, void* args);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SECURITY_AUTHORIZATION_WINDOWS_WIN32_SECURITY_AUTHORIZATION_WRAPPER_H */
