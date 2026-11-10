#ifndef WINDOWSSYS_WINDOWS_WIN32_SECURITY_AUTHORIZATION_WINDOWS_WIN32_SECURITY_AUTHORIZATION_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SECURITY_AUTHORIZATION_WINDOWS_WIN32_SECURITY_AUTHORIZATION_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_security_authorization_authzAccessCheck(uint32_t flags, void* hauthzclientcontext, void* prequest, void* hauditevent, void* psecuritydescriptor, void* optionalsecuritydescriptorarray, uint32_t optionalsecuritydescriptorcount, void* preply, void* phaccesscheckresults);
int32_t windowssys_windows_win32_security_authorization_authzAddSidsToContext(void* hauthzclientcontext, void* sids, uint32_t sidcount, void* restrictedsids, uint32_t restrictedsidcount, void* phnewauthzclientcontext);
int32_t windowssys_windows_win32_security_authorization_authzCachedAccessCheck(uint32_t flags, void* haccesscheckresults, void* prequest, void* hauditevent, void* preply);
int32_t windowssys_windows_win32_security_authorization_authzEnumerateSecurityEventSources(uint32_t dwflags, void* buffer, void* pdwcount, void* pdwlength);
int32_t windowssys_windows_win32_security_authorization_authzEvaluateSacl(void* authzclientcontext, void* prequest, void* sacl, uint32_t grantedaccess, int32_t accessgranted, void* pbgenerateaudit);
int32_t windowssys_windows_win32_security_authorization_authzFreeAuditEvent(void* hauditevent);
int32_t windowssys_windows_win32_security_authorization_authzFreeCentralAccessPolicyCache(void);
int32_t windowssys_windows_win32_security_authorization_authzFreeContext(void* hauthzclientcontext);
int32_t windowssys_windows_win32_security_authorization_authzFreeHandle(void* haccesscheckresults);
int32_t windowssys_windows_win32_security_authorization_authzFreeResourceManager(void* hauthzresourcemanager);
int32_t windowssys_windows_win32_security_authorization_authzGetInformationFromContext(void* hauthzclientcontext, int32_t infoclass, uint32_t buffersize, void* psizerequired, void* buffer);
int32_t windowssys_windows_win32_security_authorization_authzInitializeCompoundContext(void* usercontext, void* devicecontext, void* phcompoundcontext);
int32_t windowssys_windows_win32_security_authorization_authzInitializeObjectAccessAuditEvent(uint32_t flags, void* hauditeventtype, void* szoperationtype, void* szobjecttype, void* szobjectname, void* szadditionalinfo, void* phauditevent, uint32_t dwadditionalparametercount, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t windowssys_windows_win32_security_authorization_authzInitializeObjectAccessAuditEvent2(uint32_t flags, void* hauditeventtype, void* szoperationtype, void* szobjecttype, void* szobjectname, void* szadditionalinfo, void* szadditionalinfo2, void* phauditevent, uint32_t dwadditionalparametercount, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t windowssys_windows_win32_security_authorization_authzInitializeRemoteResourceManager(void* prpcinitinfo, void* phauthzresourcemanager);
int32_t windowssys_windows_win32_security_authorization_authzInitializeResourceManager(uint32_t flags, void* pfndynamicaccesscheck, void* pfncomputedynamicgroups, void* pfnfreedynamicgroups, void* szresourcemanagername, void* phauthzresourcemanager);
int32_t windowssys_windows_win32_security_authorization_authzInitializeResourceManagerEx(uint32_t flags, void* pauthzinitinfo, void* phauthzresourcemanager);
int32_t windowssys_windows_win32_security_authorization_authzInstallSecurityEventSource(uint32_t dwflags, void* pregistration);
int32_t windowssys_windows_win32_security_authorization_authzModifyClaims(void* hauthzclientcontext, int32_t claimclass, void* pclaimoperations, void* pclaims);
int32_t windowssys_windows_win32_security_authorization_authzModifySecurityAttributes(void* hauthzclientcontext, void* poperations, void* pattributes);
int32_t windowssys_windows_win32_security_authorization_authzModifySids(void* hauthzclientcontext, int32_t sidclass, void* psidoperations, void* psids);
int32_t windowssys_windows_win32_security_authorization_authzOpenObjectAudit(uint32_t flags, void* hauthzclientcontext, void* prequest, void* hauditevent, void* psecuritydescriptor, void* optionalsecuritydescriptorarray, uint32_t optionalsecuritydescriptorcount, void* preply);
int32_t windowssys_windows_win32_security_authorization_authzRegisterCapChangeNotification(void* phcapchangesubscription, void* pfncapchangecallback, void* pcallbackcontext);
int32_t windowssys_windows_win32_security_authorization_authzRegisterSecurityEventSource(uint32_t dwflags, void* szeventsourcename, void* pheventprovider);
int32_t windowssys_windows_win32_security_authorization_authzReportSecurityEvent(uint32_t dwflags, void* heventprovider, uint32_t dwauditid, void* pusersid, uint32_t dwcount, int32_t km_vac, int64_t km_va0, int64_t km_va1, int64_t km_va2, int64_t km_va3);
int32_t windowssys_windows_win32_security_authorization_authzReportSecurityEventFromParams(uint32_t dwflags, void* heventprovider, uint32_t dwauditid, void* pusersid, void* pparams);
int32_t windowssys_windows_win32_security_authorization_authzSetAppContainerInformation(void* hauthzclientcontext, void* pappcontainersid, uint32_t capabilitycount, void* pcapabilitysids);
int32_t windowssys_windows_win32_security_authorization_authzUninstallSecurityEventSource(uint32_t dwflags, void* szeventsourcename);
int32_t windowssys_windows_win32_security_authorization_authzUnregisterCapChangeNotification(void* hcapchangesubscription);
int32_t windowssys_windows_win32_security_authorization_authzUnregisterSecurityEventSource(uint32_t dwflags, void* pheventprovider);
void windowssys_windows_win32_security_authorization_buildExplicitAccessWithNameA(void* pexplicitaccess, void* ptrusteename, uint32_t accesspermissions, int32_t accessmode, uint32_t inheritance);
void windowssys_windows_win32_security_authorization_buildExplicitAccessWithNameW(void* pexplicitaccess, void* ptrusteename, uint32_t accesspermissions, int32_t accessmode, uint32_t inheritance);
void windowssys_windows_win32_security_authorization_buildImpersonateExplicitAccessWithNameA(void* pexplicitaccess, void* ptrusteename, void* ptrustee, uint32_t accesspermissions, int32_t accessmode, uint32_t inheritance);
void windowssys_windows_win32_security_authorization_buildImpersonateExplicitAccessWithNameW(void* pexplicitaccess, void* ptrusteename, void* ptrustee, uint32_t accesspermissions, int32_t accessmode, uint32_t inheritance);
void windowssys_windows_win32_security_authorization_buildImpersonateTrusteeA(void* ptrustee, void* pimpersonatetrustee);
void windowssys_windows_win32_security_authorization_buildImpersonateTrusteeW(void* ptrustee, void* pimpersonatetrustee);
uint32_t windowssys_windows_win32_security_authorization_buildSecurityDescriptorA(void* powner, void* pgroup, uint32_t ccountofaccessentries, void* plistofaccessentries, uint32_t ccountofauditentries, void* plistofauditentries, void* poldsd, void* psizenewsd, void* pnewsd);
uint32_t windowssys_windows_win32_security_authorization_buildSecurityDescriptorW(void* powner, void* pgroup, uint32_t ccountofaccessentries, void* plistofaccessentries, uint32_t ccountofauditentries, void* plistofauditentries, void* poldsd, void* psizenewsd, void* pnewsd);
void windowssys_windows_win32_security_authorization_buildTrusteeWithNameA(void* ptrustee, void* pname);
void windowssys_windows_win32_security_authorization_buildTrusteeWithNameW(void* ptrustee, void* pname);
void windowssys_windows_win32_security_authorization_buildTrusteeWithObjectsAndNameA(void* ptrustee, void* pobjname, int32_t objecttype, void* objecttypename, void* inheritedobjecttypename, void* name);
void windowssys_windows_win32_security_authorization_buildTrusteeWithObjectsAndNameW(void* ptrustee, void* pobjname, int32_t objecttype, void* objecttypename, void* inheritedobjecttypename, void* name);
void windowssys_windows_win32_security_authorization_buildTrusteeWithObjectsAndSidA(void* ptrustee, void* pobjsid, void* pobjectguid, void* pinheritedobjectguid, void* psid);
void windowssys_windows_win32_security_authorization_buildTrusteeWithObjectsAndSidW(void* ptrustee, void* pobjsid, void* pobjectguid, void* pinheritedobjectguid, void* psid);
void windowssys_windows_win32_security_authorization_buildTrusteeWithSidA(void* ptrustee, void* psid);
void windowssys_windows_win32_security_authorization_buildTrusteeWithSidW(void* ptrustee, void* psid);
int32_t windowssys_windows_win32_security_authorization_convertSecurityDescriptorToStringSecurityDescriptorA(void* securitydescriptor, uint32_t requestedstringsdrevision, uint32_t securityinformation, void* stringsecuritydescriptor, void* stringsecuritydescriptorlen);
int32_t windowssys_windows_win32_security_authorization_convertSecurityDescriptorToStringSecurityDescriptorW(void* securitydescriptor, uint32_t requestedstringsdrevision, uint32_t securityinformation, void* stringsecuritydescriptor, void* stringsecuritydescriptorlen);
int32_t windowssys_windows_win32_security_authorization_convertSidToStringSidA(void* sid, void* stringsid);
int32_t windowssys_windows_win32_security_authorization_convertSidToStringSidW(void* sid, void* stringsid);
int32_t windowssys_windows_win32_security_authorization_convertStringSecurityDescriptorToSecurityDescriptorA(void* stringsecuritydescriptor, uint32_t stringsdrevision, void* securitydescriptor, void* securitydescriptorsize);
int32_t windowssys_windows_win32_security_authorization_convertStringSecurityDescriptorToSecurityDescriptorW(void* stringsecuritydescriptor, uint32_t stringsdrevision, void* securitydescriptor, void* securitydescriptorsize);
int32_t windowssys_windows_win32_security_authorization_convertStringSidToSidA(void* stringsid, void* sid);
int32_t windowssys_windows_win32_security_authorization_convertStringSidToSidW(void* stringsid, void* sid);
uint32_t windowssys_windows_win32_security_authorization_freeInheritedFromArray(void* pinheritarray, uint16_t acecnt, void* pfnarray);
uint32_t windowssys_windows_win32_security_authorization_getAuditedPermissionsFromAclA(void* pacl, void* ptrustee, void* psuccessfulauditedrights, void* pfailedauditrights);
uint32_t windowssys_windows_win32_security_authorization_getAuditedPermissionsFromAclW(void* pacl, void* ptrustee, void* psuccessfulauditedrights, void* pfailedauditrights);
uint32_t windowssys_windows_win32_security_authorization_getEffectiveRightsFromAclA(void* pacl, void* ptrustee, void* paccessrights);
uint32_t windowssys_windows_win32_security_authorization_getEffectiveRightsFromAclW(void* pacl, void* ptrustee, void* paccessrights);
uint32_t windowssys_windows_win32_security_authorization_getExplicitEntriesFromAclA(void* pacl, void* pccountofexplicitentries, void* plistofexplicitentries);
uint32_t windowssys_windows_win32_security_authorization_getExplicitEntriesFromAclW(void* pacl, void* pccountofexplicitentries, void* plistofexplicitentries);
uint32_t windowssys_windows_win32_security_authorization_getInheritanceSourceA(void* pobjectname, int32_t objecttype, uint32_t securityinfo, int32_t container, void* pobjectclassguids, uint32_t guidcount, void* pacl, void* pfnarray, void* pgenericmapping, void* pinheritarray);
uint32_t windowssys_windows_win32_security_authorization_getInheritanceSourceW(void* pobjectname, int32_t objecttype, uint32_t securityinfo, int32_t container, void* pobjectclassguids, uint32_t guidcount, void* pacl, void* pfnarray, void* pgenericmapping, void* pinheritarray);
void* windowssys_windows_win32_security_authorization_getMultipleTrusteeA(void* ptrustee);
int32_t windowssys_windows_win32_security_authorization_getMultipleTrusteeOperationA(void* ptrustee);
int32_t windowssys_windows_win32_security_authorization_getMultipleTrusteeOperationW(void* ptrustee);
void* windowssys_windows_win32_security_authorization_getMultipleTrusteeW(void* ptrustee);
uint32_t windowssys_windows_win32_security_authorization_getNamedSecurityInfoA(void* pobjectname, int32_t objecttype, uint32_t securityinfo, void* ppsidowner, void* ppsidgroup, void* ppdacl, void* ppsacl, void* ppsecuritydescriptor);
uint32_t windowssys_windows_win32_security_authorization_getNamedSecurityInfoW(void* pobjectname, int32_t objecttype, uint32_t securityinfo, void* ppsidowner, void* ppsidgroup, void* ppdacl, void* ppsacl, void* ppsecuritydescriptor);
uint32_t windowssys_windows_win32_security_authorization_getSecurityInfo(void* handle, int32_t objecttype, uint32_t securityinfo, void* ppsidowner, void* ppsidgroup, void* ppdacl, void* ppsacl, void* ppsecuritydescriptor);
int32_t windowssys_windows_win32_security_authorization_getTrusteeFormA(void* ptrustee);
int32_t windowssys_windows_win32_security_authorization_getTrusteeFormW(void* ptrustee);
void* windowssys_windows_win32_security_authorization_getTrusteeNameA(void* ptrustee);
void* windowssys_windows_win32_security_authorization_getTrusteeNameW(void* ptrustee);
int32_t windowssys_windows_win32_security_authorization_getTrusteeTypeA(void* ptrustee);
int32_t windowssys_windows_win32_security_authorization_getTrusteeTypeW(void* ptrustee);
uint32_t windowssys_windows_win32_security_authorization_lookupSecurityDescriptorPartsA(void* ppowner, void* ppgroup, void* pccountofaccessentries, void* pplistofaccessentries, void* pccountofauditentries, void* pplistofauditentries, void* psd);
uint32_t windowssys_windows_win32_security_authorization_lookupSecurityDescriptorPartsW(void* ppowner, void* ppgroup, void* pccountofaccessentries, void* pplistofaccessentries, void* pccountofauditentries, void* pplistofauditentries, void* psd);
uint32_t windowssys_windows_win32_security_authorization_setEntriesInAclA(uint32_t ccountofexplicitentries, void* plistofexplicitentries, void* oldacl, void* newacl);
uint32_t windowssys_windows_win32_security_authorization_setEntriesInAclW(uint32_t ccountofexplicitentries, void* plistofexplicitentries, void* oldacl, void* newacl);
uint32_t windowssys_windows_win32_security_authorization_setNamedSecurityInfoA(void* pobjectname, int32_t objecttype, uint32_t securityinfo, void* psidowner, void* psidgroup, void* pdacl, void* psacl);
uint32_t windowssys_windows_win32_security_authorization_setNamedSecurityInfoW(void* pobjectname, int32_t objecttype, uint32_t securityinfo, void* psidowner, void* psidgroup, void* pdacl, void* psacl);
uint32_t windowssys_windows_win32_security_authorization_setSecurityInfo(void* handle, int32_t objecttype, uint32_t securityinfo, void* psidowner, void* psidgroup, void* pdacl, void* psacl);
uint32_t windowssys_windows_win32_security_authorization_treeResetNamedSecurityInfoA(void* pobjectname, int32_t objecttype, uint32_t securityinfo, void* powner, void* pgroup, void* pdacl, void* psacl, int32_t keepexplicit, void* fnprogress, int32_t progressinvokesetting, void* args);
uint32_t windowssys_windows_win32_security_authorization_treeResetNamedSecurityInfoW(void* pobjectname, int32_t objecttype, uint32_t securityinfo, void* powner, void* pgroup, void* pdacl, void* psacl, int32_t keepexplicit, void* fnprogress, int32_t progressinvokesetting, void* args);
uint32_t windowssys_windows_win32_security_authorization_treeSetNamedSecurityInfoA(void* pobjectname, int32_t objecttype, uint32_t securityinfo, void* powner, void* pgroup, void* pdacl, void* psacl, uint32_t dwaction, void* fnprogress, int32_t progressinvokesetting, void* args);
uint32_t windowssys_windows_win32_security_authorization_treeSetNamedSecurityInfoW(void* pobjectname, int32_t objecttype, uint32_t securityinfo, void* powner, void* pgroup, void* pdacl, void* psacl, uint32_t dwaction, void* fnprogress, int32_t progressinvokesetting, void* args);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SECURITY_AUTHORIZATION_WINDOWS_WIN32_SECURITY_AUTHORIZATION_WRAPPER_H */
