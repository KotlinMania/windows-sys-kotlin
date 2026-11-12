#ifndef WINDOWSSYS_WINDOWS_WIN32_NETWORKING_ACTIVEDIRECTORY_WINDOWS_WIN32_NETWORKING_ACTIVEDIRECTORY_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_NETWORKING_ACTIVEDIRECTORY_WINDOWS_WIN32_NETWORKING_ACTIVEDIRECTORY_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32NetworkingActivedirectoryADsBuildEnumerator(void* padscontainer, void* ppenumvariant);
int32_t windowssysWindowsWin32NetworkingActivedirectoryADsBuildVarArrayInt(void* lpdwobjecttypes, uint32_t dwobjecttypes, void* pvar);
int32_t windowssysWindowsWin32NetworkingActivedirectoryADsBuildVarArrayStr(void* lpppathnames, uint32_t dwpathnames, void* pvar);
int32_t windowssysWindowsWin32NetworkingActivedirectoryADsDecodeBinaryData(void* szsrcdata, void* ppbdestdata, void* pdwdestlen);
int32_t windowssysWindowsWin32NetworkingActivedirectoryADsEncodeBinaryData(void* pbsrcdata, uint32_t dwsrclen, void* ppszdestdata);
int32_t windowssysWindowsWin32NetworkingActivedirectoryADsEnumerateNext(void* penumvariant, uint32_t celements, void* pvar, void* pcelementsfetched);
int32_t windowssysWindowsWin32NetworkingActivedirectoryADsFreeEnumerator(void* penumvariant);
int32_t windowssysWindowsWin32NetworkingActivedirectoryADsGetLastError(void* lperror, void* lperrorbuf, uint32_t dwerrorbuflen, void* lpnamebuf, uint32_t dwnamebuflen);
int32_t windowssysWindowsWin32NetworkingActivedirectoryADsGetObject(void* lpszpathname, void* riid, void* ppobject);
int32_t windowssysWindowsWin32NetworkingActivedirectoryADsOpenObject(void* lpszpathname, void* lpszusername, void* lpszpassword, uint32_t dwreserved, void* riid, void* ppobject);
int32_t windowssysWindowsWin32NetworkingActivedirectoryADsPropCheckIfWritable(void* pwzattr, void* pwritableattrs);
int32_t windowssysWindowsWin32NetworkingActivedirectoryADsPropCreateNotifyObj(void* pappthddataobj, void* pwzadsobjname, void* phnotifyobj);
int32_t windowssysWindowsWin32NetworkingActivedirectoryADsPropGetInitInfo(void* hnotifyobj, void* pinitparams);
int32_t windowssysWindowsWin32NetworkingActivedirectoryADsPropSendErrorMessage(void* hnotifyobj, void* perror);
int32_t windowssysWindowsWin32NetworkingActivedirectoryADsPropSetHwnd(void* hnotifyobj, void* hpage);
int32_t windowssysWindowsWin32NetworkingActivedirectoryADsPropSetHwndWithTitle(void* hnotifyobj, void* hpage, void* ptztitle);
int32_t windowssysWindowsWin32NetworkingActivedirectoryADsPropShowErrorDialog(void* hnotifyobj, void* hpage);
void windowssysWindowsWin32NetworkingActivedirectoryADsSetLastError(uint32_t dwerr, void* pszerror, void* pszprovider);
void windowssysWindowsWin32NetworkingActivedirectoryAdsFreeAdsValues(void* padsvalues, uint32_t dwnumvalues);
int32_t windowssysWindowsWin32NetworkingActivedirectoryAdsTypeToPropVariant(void* padsvalues, uint32_t dwnumvalues, void* pvariant);
void* windowssysWindowsWin32NetworkingActivedirectoryAllocADsMem(uint32_t cb);
void* windowssysWindowsWin32NetworkingActivedirectoryAllocADsStr(void* pstr);
int32_t windowssysWindowsWin32NetworkingActivedirectoryBinarySDToSecurityDescriptor(void* psecuritydescriptor, void* pvarsec, void* pszservername, void* username, void* password, uint32_t dwflags);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsAddSidHistoryA(void* hds, uint32_t flags, void* srcdomain, void* srcprincipal, void* srcdomaincontroller, void* srcdomaincreds, void* dstdomain, void* dstprincipal);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsAddSidHistoryW(void* hds, uint32_t flags, void* srcdomain, void* srcprincipal, void* srcdomaincontroller, void* srcdomaincreds, void* dstdomain, void* dstprincipal);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsAddressToSiteNamesA(void* computername, uint32_t entrycount, void* socketaddresses, void* sitenames);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsAddressToSiteNamesExA(void* computername, uint32_t entrycount, void* socketaddresses, void* sitenames, void* subnetnames);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsAddressToSiteNamesExW(void* computername, uint32_t entrycount, void* socketaddresses, void* sitenames, void* subnetnames);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsAddressToSiteNamesW(void* computername, uint32_t entrycount, void* socketaddresses, void* sitenames);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsBindA(void* domaincontrollername, void* dnsdomainname, void* phds);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsBindByInstanceA(void* servername, void* annotation, void* instanceguid, void* dnsdomainname, void* authidentity, void* serviceprincipalname, uint32_t bindflags, void* phds);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsBindByInstanceW(void* servername, void* annotation, void* instanceguid, void* dnsdomainname, void* authidentity, void* serviceprincipalname, uint32_t bindflags, void* phds);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsBindToISTGA(void* sitename, void* phds);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsBindToISTGW(void* sitename, void* phds);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsBindW(void* domaincontrollername, void* dnsdomainname, void* phds);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsBindWithCredA(void* domaincontrollername, void* dnsdomainname, void* authidentity, void* phds);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsBindWithCredW(void* domaincontrollername, void* dnsdomainname, void* authidentity, void* phds);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsBindWithSpnA(void* domaincontrollername, void* dnsdomainname, void* authidentity, void* serviceprincipalname, void* phds);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsBindWithSpnExA(void* domaincontrollername, void* dnsdomainname, void* authidentity, void* serviceprincipalname, uint32_t bindflags, void* phds);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsBindWithSpnExW(void* domaincontrollername, void* dnsdomainname, void* authidentity, void* serviceprincipalname, uint32_t bindflags, void* phds);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsBindWithSpnW(void* domaincontrollername, void* dnsdomainname, void* authidentity, void* serviceprincipalname, void* phds);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsBindingSetTimeout(void* hds, uint32_t ctimeoutsecs);
int32_t windowssysWindowsWin32NetworkingActivedirectoryDsBrowseForContainerA(void* pinfo);
int32_t windowssysWindowsWin32NetworkingActivedirectoryDsBrowseForContainerW(void* pinfo);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsClientMakeSpnForTargetServerA(void* serviceclass, void* servicename, void* pcspnlength, void* pszspn);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsClientMakeSpnForTargetServerW(void* serviceclass, void* servicename, void* pcspnlength, void* pszspn);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsCrackNamesA(void* hds, int32_t flags, int32_t formatoffered, int32_t formatdesired, uint32_t cnames, void* rpnames, void* ppresult);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsCrackNamesW(void* hds, int32_t flags, int32_t formatoffered, int32_t formatdesired, uint32_t cnames, void* rpnames, void* ppresult);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpn2A(void* pszspn, uint32_t cspn, void* pcserviceclass, void* serviceclass, void* pcservicename, void* servicename, void* pcinstancename, void* instancename, void* pinstanceport);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpn2W(void* pszspn, uint32_t cspn, void* pcserviceclass, void* serviceclass, void* pcservicename, void* servicename, void* pcinstancename, void* instancename, void* pinstanceport);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpn3W(void* pszspn, uint32_t cspn, void* pchostname, void* hostname, void* pcinstancename, void* instancename, void* pportnumber, void* pcdomainname, void* domainname, void* pcrealmname, void* realmname);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpn4W(void* pszspn, uint32_t cspn, void* pchostname, void* hostname, void* pcinstancename, void* instancename, void* pcportname, void* portname, void* pcdomainname, void* domainname, void* pcrealmname, void* realmname);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpnA(void* pszspn, void* pcserviceclass, void* serviceclass, void* pcservicename, void* servicename, void* pcinstancename, void* instancename, void* pinstanceport);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpnW(void* pszspn, void* pcserviceclass, void* serviceclass, void* pcservicename, void* servicename, void* pcinstancename, void* instancename, void* pinstanceport);
int32_t windowssysWindowsWin32NetworkingActivedirectoryDsCrackUnquotedMangledRdnA(void* pszrdn, uint32_t cchrdn, void* pguid, void* pedsmanglefor);
int32_t windowssysWindowsWin32NetworkingActivedirectoryDsCrackUnquotedMangledRdnW(void* pszrdn, uint32_t cchrdn, void* pguid, void* pedsmanglefor);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsDeregisterDnsHostRecordsA(void* servername, void* dnsdomainname, void* domainguid, void* dsaguid, void* dnshostname);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsDeregisterDnsHostRecordsW(void* servername, void* dnsdomainname, void* domainguid, void* dsaguid, void* dnshostname);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsEnumerateDomainTrustsA(void* servername, uint32_t flags, void* domains, void* domaincount);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsEnumerateDomainTrustsW(void* servername, uint32_t flags, void* domains, void* domaincount);
void windowssysWindowsWin32NetworkingActivedirectoryDsFreeDomainControllerInfoA(uint32_t infolevel, uint32_t cinfo, void* pinfo);
void windowssysWindowsWin32NetworkingActivedirectoryDsFreeDomainControllerInfoW(uint32_t infolevel, uint32_t cinfo, void* pinfo);
void windowssysWindowsWin32NetworkingActivedirectoryDsFreeNameResultA(void* presult);
void windowssysWindowsWin32NetworkingActivedirectoryDsFreeNameResultW(void* presult);
void windowssysWindowsWin32NetworkingActivedirectoryDsFreePasswordCredentials(void* authidentity);
void windowssysWindowsWin32NetworkingActivedirectoryDsFreeSchemaGuidMapA(void* pguidmap);
void windowssysWindowsWin32NetworkingActivedirectoryDsFreeSchemaGuidMapW(void* pguidmap);
void windowssysWindowsWin32NetworkingActivedirectoryDsFreeSpnArrayA(uint32_t cspn, void* rpszspn);
void windowssysWindowsWin32NetworkingActivedirectoryDsFreeSpnArrayW(uint32_t cspn, void* rpszspn);
void windowssysWindowsWin32NetworkingActivedirectoryDsGetDcCloseW(void* getdccontexthandle);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsGetDcNameA(void* computername, void* domainname, void* domainguid, void* sitename, uint32_t flags, void* domaincontrollerinfo);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsGetDcNameW(void* computername, void* domainname, void* domainguid, void* sitename, uint32_t flags, void* domaincontrollerinfo);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsGetDcNextA(void* getdccontexthandle, void* sockaddresscount, void* sockaddresses, void* dnshostname);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsGetDcNextW(void* getdccontexthandle, void* sockaddresscount, void* sockaddresses, void* dnshostname);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsGetDcOpenA(void* dnsname, uint32_t optionflags, void* sitename, void* domainguid, void* dnsforestname, uint32_t dcflags, void* retgetdccontext);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsGetDcOpenW(void* dnsname, uint32_t optionflags, void* sitename, void* domainguid, void* dnsforestname, uint32_t dcflags, void* retgetdccontext);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsGetDcSiteCoverageA(void* servername, void* entrycount, void* sitenames);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsGetDcSiteCoverageW(void* servername, void* entrycount, void* sitenames);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsGetDomainControllerInfoA(void* hds, void* domainname, uint32_t infolevel, void* pcout, void* ppinfo);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsGetDomainControllerInfoW(void* hds, void* domainname, uint32_t infolevel, void* pcout, void* ppinfo);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsGetForestTrustInformationW(void* servername, void* trusteddomainname, uint32_t flags, void* foresttrustinfo);
int32_t windowssysWindowsWin32NetworkingActivedirectoryDsGetFriendlyClassName(void* pszobjectclass, void* pszbuffer, uint32_t cchbuffer);
void* windowssysWindowsWin32NetworkingActivedirectoryDsGetIcon(uint32_t dwflags, void* pszobjectclass, int32_t cximage, int32_t cyimage);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsGetRdnW(void* ppdn, void* pcdn, void* ppkey, void* pckey, void* ppval, void* pcval);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsGetSiteNameA(void* computername, void* sitename);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsGetSiteNameW(void* computername, void* sitename);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsGetSpnA(int32_t servicetype, void* serviceclass, void* servicename, uint16_t instanceport, uint16_t cinstancenames, void* pinstancenames, void* pinstanceports, void* pcspn, void* prpszspn);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsGetSpnW(int32_t servicetype, void* serviceclass, void* servicename, uint16_t instanceport, uint16_t cinstancenames, void* pinstancenames, void* pinstanceports, void* pcspn, void* prpszspn);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsInheritSecurityIdentityA(void* hds, uint32_t flags, void* srcprincipal, void* dstprincipal);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsInheritSecurityIdentityW(void* hds, uint32_t flags, void* srcprincipal, void* dstprincipal);
int32_t windowssysWindowsWin32NetworkingActivedirectoryDsIsMangledDnA(void* pszdn, int32_t edsmanglefor);
int32_t windowssysWindowsWin32NetworkingActivedirectoryDsIsMangledDnW(void* pszdn, int32_t edsmanglefor);
int32_t windowssysWindowsWin32NetworkingActivedirectoryDsIsMangledRdnValueA(void* pszrdn, uint32_t crdn, int32_t edsmanglefordesired);
int32_t windowssysWindowsWin32NetworkingActivedirectoryDsIsMangledRdnValueW(void* pszrdn, uint32_t crdn, int32_t edsmanglefordesired);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsListDomainsInSiteA(void* hds, void* site, void* ppdomains);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsListDomainsInSiteW(void* hds, void* site, void* ppdomains);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsListInfoForServerA(void* hds, void* server, void* ppinfo);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsListInfoForServerW(void* hds, void* server, void* ppinfo);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsListRolesA(void* hds, void* pproles);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsListRolesW(void* hds, void* pproles);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsListServersForDomainInSiteA(void* hds, void* domain, void* site, void* ppservers);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsListServersForDomainInSiteW(void* hds, void* domain, void* site, void* ppservers);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsListServersInSiteA(void* hds, void* site, void* ppservers);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsListServersInSiteW(void* hds, void* site, void* ppservers);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsListSitesA(void* hds, void* ppsites);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsListSitesW(void* hds, void* ppsites);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsMakePasswordCredentialsA(void* user, void* domain, void* password, void* pauthidentity);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsMakePasswordCredentialsW(void* user, void* domain, void* password, void* pauthidentity);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsMakeSpnA(void* serviceclass, void* servicename, void* instancename, uint16_t instanceport, void* referrer, void* pcspnlength, void* pszspn);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsMakeSpnW(void* serviceclass, void* servicename, void* instancename, uint16_t instanceport, void* referrer, void* pcspnlength, void* pszspn);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsMapSchemaGuidsA(void* hds, uint32_t cguids, void* rguids, void* ppguidmap);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsMapSchemaGuidsW(void* hds, uint32_t cguids, void* rguids, void* ppguidmap);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsMergeForestTrustInformationW(void* domainname, void* newforesttrustinfo, void* oldforesttrustinfo, void* mergedforesttrustinfo);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsQuerySitesByCostA(void* hds, void* pszfromsite, void* rgsztosites, uint32_t ctosites, uint32_t dwflags, void* prgsiteinfo);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsQuerySitesByCostW(void* hds, void* pwszfromsite, void* rgwsztosites, uint32_t ctosites, uint32_t dwflags, void* prgsiteinfo);
void windowssysWindowsWin32NetworkingActivedirectoryDsQuerySitesFree(void* rgsiteinfo);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsQuoteRdnValueA(uint32_t cunquotedrdnvaluelength, void* psunquotedrdnvalue, void* pcquotedrdnvaluelength, void* psquotedrdnvalue);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsQuoteRdnValueW(uint32_t cunquotedrdnvaluelength, void* psunquotedrdnvalue, void* pcquotedrdnvaluelength, void* psquotedrdnvalue);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsRemoveDsDomainA(void* hds, void* domaindn);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsRemoveDsDomainW(void* hds, void* domaindn);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsRemoveDsServerA(void* hds, void* serverdn, void* domaindn, void* flastdcindomain, int32_t fcommit);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsRemoveDsServerW(void* hds, void* serverdn, void* domaindn, void* flastdcindomain, int32_t fcommit);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsReplicaAddA(void* hds, void* namecontext, void* sourcedsadn, void* transportdn, void* sourcedsaaddress, void* pschedule, uint32_t options);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsReplicaAddW(void* hds, void* namecontext, void* sourcedsadn, void* transportdn, void* sourcedsaaddress, void* pschedule, uint32_t options);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsReplicaConsistencyCheck(void* hds, int32_t taskid, uint32_t dwflags);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsReplicaDelA(void* hds, void* namecontext, void* dsasrc, uint32_t options);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsReplicaDelW(void* hds, void* namecontext, void* dsasrc, uint32_t options);
void windowssysWindowsWin32NetworkingActivedirectoryDsReplicaFreeInfo(int32_t infotype, void* pinfo);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsReplicaGetInfo2W(void* hds, int32_t infotype, void* pszobject, void* puuidforsourcedsaobjguid, void* pszattributename, void* pszvalue, uint32_t dwflags, uint32_t dwenumerationcontext, void* ppinfo);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsReplicaGetInfoW(void* hds, int32_t infotype, void* pszobject, void* puuidforsourcedsaobjguid, void* ppinfo);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsReplicaModifyA(void* hds, void* namecontext, void* puuidsourcedsa, void* transportdn, void* sourcedsaaddress, void* pschedule, uint32_t replicaflags, uint32_t modifyfields, uint32_t options);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsReplicaModifyW(void* hds, void* namecontext, void* puuidsourcedsa, void* transportdn, void* sourcedsaaddress, void* pschedule, uint32_t replicaflags, uint32_t modifyfields, uint32_t options);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsReplicaSyncA(void* hds, void* namecontext, void* puuiddsasrc, uint32_t options);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsReplicaSyncAllA(void* hds, void* psznamecontext, uint32_t ulflags, int64_t pfncallback, void* pcallbackdata, void* perrors);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsReplicaSyncAllW(void* hds, void* psznamecontext, uint32_t ulflags, int64_t pfncallback, void* pcallbackdata, void* perrors);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsReplicaSyncW(void* hds, void* namecontext, void* puuiddsasrc, uint32_t options);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsReplicaUpdateRefsA(void* hds, void* namecontext, void* dsadest, void* puuiddsadest, uint32_t options);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsReplicaUpdateRefsW(void* hds, void* namecontext, void* dsadest, void* puuiddsadest, uint32_t options);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsReplicaVerifyObjectsA(void* hds, void* namecontext, void* puuiddsasrc, uint32_t uloptions);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsReplicaVerifyObjectsW(void* hds, void* namecontext, void* puuiddsasrc, uint32_t uloptions);
void windowssysWindowsWin32NetworkingActivedirectoryDsRoleFreeMemory(void* buffer);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsRoleGetPrimaryDomainInformation(void* lpserver, int32_t infolevel, void* buffer);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsServerRegisterSpnA(int32_t operation, void* serviceclass, void* userobjectdn);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsServerRegisterSpnW(int32_t operation, void* serviceclass, void* userobjectdn);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsUnBindA(void* phds);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsUnBindW(void* phds);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsUnquoteRdnValueA(uint32_t cquotedrdnvaluelength, void* psquotedrdnvalue, void* pcunquotedrdnvaluelength, void* psunquotedrdnvalue);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsUnquoteRdnValueW(uint32_t cquotedrdnvaluelength, void* psquotedrdnvalue, void* pcunquotedrdnvaluelength, void* psunquotedrdnvalue);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsValidateSubnetNameA(void* subnetname);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsValidateSubnetNameW(void* subnetname);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsWriteAccountSpnA(void* hds, int32_t operation, void* pszaccount, uint32_t cspn, void* rpszspn);
uint32_t windowssysWindowsWin32NetworkingActivedirectoryDsWriteAccountSpnW(void* hds, int32_t operation, void* pszaccount, uint32_t cspn, void* rpszspn);
int32_t windowssysWindowsWin32NetworkingActivedirectoryFreeADsMem(void* pmem);
int32_t windowssysWindowsWin32NetworkingActivedirectoryFreeADsStr(void* pstr);
int32_t windowssysWindowsWin32NetworkingActivedirectoryPropVariantToAdsType(void* pvariant, uint32_t dwnumvariant, void* ppadsvalues, void* pdwnumvalues);
void* windowssysWindowsWin32NetworkingActivedirectoryReallocADsMem(void* poldmem, uint32_t cbold, uint32_t cbnew);
int32_t windowssysWindowsWin32NetworkingActivedirectoryReallocADsStr(void* ppstr, void* pstr);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_NETWORKING_ACTIVEDIRECTORY_WINDOWS_WIN32_NETWORKING_ACTIVEDIRECTORY_WRAPPER_H */
