#ifndef WINDOWSSYS_WINDOWS_WIN32_NETWORKING_ACTIVEDIRECTORY_WINDOWS_WIN32_NETWORKING_ACTIVEDIRECTORY_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_NETWORKING_ACTIVEDIRECTORY_WINDOWS_WIN32_NETWORKING_ACTIVEDIRECTORY_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_networking_activedirectory_ADsBuildEnumerator(void* padscontainer, void* ppenumvariant);
int32_t windowssys_windows_win32_networking_activedirectory_ADsBuildVarArrayInt(void* lpdwobjecttypes, uint32_t dwobjecttypes, void* pvar);
int32_t windowssys_windows_win32_networking_activedirectory_ADsBuildVarArrayStr(void* lpppathnames, uint32_t dwpathnames, void* pvar);
int32_t windowssys_windows_win32_networking_activedirectory_ADsDecodeBinaryData(void* szsrcdata, void* ppbdestdata, void* pdwdestlen);
int32_t windowssys_windows_win32_networking_activedirectory_ADsEncodeBinaryData(void* pbsrcdata, uint32_t dwsrclen, void* ppszdestdata);
int32_t windowssys_windows_win32_networking_activedirectory_ADsEnumerateNext(void* penumvariant, uint32_t celements, void* pvar, void* pcelementsfetched);
int32_t windowssys_windows_win32_networking_activedirectory_ADsFreeEnumerator(void* penumvariant);
int32_t windowssys_windows_win32_networking_activedirectory_ADsGetLastError(void* lperror, void* lperrorbuf, uint32_t dwerrorbuflen, void* lpnamebuf, uint32_t dwnamebuflen);
int32_t windowssys_windows_win32_networking_activedirectory_ADsGetObject(void* lpszpathname, void* riid, void* ppobject);
int32_t windowssys_windows_win32_networking_activedirectory_ADsOpenObject(void* lpszpathname, void* lpszusername, void* lpszpassword, uint32_t dwreserved, void* riid, void* ppobject);
int32_t windowssys_windows_win32_networking_activedirectory_ADsPropCheckIfWritable(void* pwzattr, void* pwritableattrs);
int32_t windowssys_windows_win32_networking_activedirectory_ADsPropCreateNotifyObj(void* pappthddataobj, void* pwzadsobjname, void* phnotifyobj);
int32_t windowssys_windows_win32_networking_activedirectory_ADsPropGetInitInfo(void* hnotifyobj, void* pinitparams);
int32_t windowssys_windows_win32_networking_activedirectory_ADsPropSendErrorMessage(void* hnotifyobj, void* perror);
int32_t windowssys_windows_win32_networking_activedirectory_ADsPropSetHwnd(void* hnotifyobj, void* hpage);
int32_t windowssys_windows_win32_networking_activedirectory_ADsPropSetHwndWithTitle(void* hnotifyobj, void* hpage, void* ptztitle);
int32_t windowssys_windows_win32_networking_activedirectory_ADsPropShowErrorDialog(void* hnotifyobj, void* hpage);
void windowssys_windows_win32_networking_activedirectory_ADsSetLastError(uint32_t dwerr, void* pszerror, void* pszprovider);
void windowssys_windows_win32_networking_activedirectory_AdsFreeAdsValues(void* padsvalues, uint32_t dwnumvalues);
int32_t windowssys_windows_win32_networking_activedirectory_AdsTypeToPropVariant(void* padsvalues, uint32_t dwnumvalues, void* pvariant);
void* windowssys_windows_win32_networking_activedirectory_AllocADsMem(uint32_t cb);
void* windowssys_windows_win32_networking_activedirectory_AllocADsStr(void* pstr);
int32_t windowssys_windows_win32_networking_activedirectory_BinarySDToSecurityDescriptor(void* psecuritydescriptor, void* pvarsec, void* pszservername, void* username, void* password, uint32_t dwflags);
uint32_t windowssys_windows_win32_networking_activedirectory_DsAddSidHistoryA(void* hds, uint32_t flags, void* srcdomain, void* srcprincipal, void* srcdomaincontroller, void* srcdomaincreds, void* dstdomain, void* dstprincipal);
uint32_t windowssys_windows_win32_networking_activedirectory_DsAddSidHistoryW(void* hds, uint32_t flags, void* srcdomain, void* srcprincipal, void* srcdomaincontroller, void* srcdomaincreds, void* dstdomain, void* dstprincipal);
uint32_t windowssys_windows_win32_networking_activedirectory_DsAddressToSiteNamesA(void* computername, uint32_t entrycount, void* socketaddresses, void* sitenames);
uint32_t windowssys_windows_win32_networking_activedirectory_DsAddressToSiteNamesExA(void* computername, uint32_t entrycount, void* socketaddresses, void* sitenames, void* subnetnames);
uint32_t windowssys_windows_win32_networking_activedirectory_DsAddressToSiteNamesExW(void* computername, uint32_t entrycount, void* socketaddresses, void* sitenames, void* subnetnames);
uint32_t windowssys_windows_win32_networking_activedirectory_DsAddressToSiteNamesW(void* computername, uint32_t entrycount, void* socketaddresses, void* sitenames);
uint32_t windowssys_windows_win32_networking_activedirectory_DsBindA(void* domaincontrollername, void* dnsdomainname, void* phds);
uint32_t windowssys_windows_win32_networking_activedirectory_DsBindByInstanceA(void* servername, void* annotation, void* instanceguid, void* dnsdomainname, void* authidentity, void* serviceprincipalname, uint32_t bindflags, void* phds);
uint32_t windowssys_windows_win32_networking_activedirectory_DsBindByInstanceW(void* servername, void* annotation, void* instanceguid, void* dnsdomainname, void* authidentity, void* serviceprincipalname, uint32_t bindflags, void* phds);
uint32_t windowssys_windows_win32_networking_activedirectory_DsBindToISTGA(void* sitename, void* phds);
uint32_t windowssys_windows_win32_networking_activedirectory_DsBindToISTGW(void* sitename, void* phds);
uint32_t windowssys_windows_win32_networking_activedirectory_DsBindW(void* domaincontrollername, void* dnsdomainname, void* phds);
uint32_t windowssys_windows_win32_networking_activedirectory_DsBindWithCredA(void* domaincontrollername, void* dnsdomainname, void* authidentity, void* phds);
uint32_t windowssys_windows_win32_networking_activedirectory_DsBindWithCredW(void* domaincontrollername, void* dnsdomainname, void* authidentity, void* phds);
uint32_t windowssys_windows_win32_networking_activedirectory_DsBindWithSpnA(void* domaincontrollername, void* dnsdomainname, void* authidentity, void* serviceprincipalname, void* phds);
uint32_t windowssys_windows_win32_networking_activedirectory_DsBindWithSpnExA(void* domaincontrollername, void* dnsdomainname, void* authidentity, void* serviceprincipalname, uint32_t bindflags, void* phds);
uint32_t windowssys_windows_win32_networking_activedirectory_DsBindWithSpnExW(void* domaincontrollername, void* dnsdomainname, void* authidentity, void* serviceprincipalname, uint32_t bindflags, void* phds);
uint32_t windowssys_windows_win32_networking_activedirectory_DsBindWithSpnW(void* domaincontrollername, void* dnsdomainname, void* authidentity, void* serviceprincipalname, void* phds);
uint32_t windowssys_windows_win32_networking_activedirectory_DsBindingSetTimeout(void* hds, uint32_t ctimeoutsecs);
int32_t windowssys_windows_win32_networking_activedirectory_DsBrowseForContainerA(void* pinfo);
int32_t windowssys_windows_win32_networking_activedirectory_DsBrowseForContainerW(void* pinfo);
uint32_t windowssys_windows_win32_networking_activedirectory_DsClientMakeSpnForTargetServerA(void* serviceclass, void* servicename, void* pcspnlength, void* pszspn);
uint32_t windowssys_windows_win32_networking_activedirectory_DsClientMakeSpnForTargetServerW(void* serviceclass, void* servicename, void* pcspnlength, void* pszspn);
uint32_t windowssys_windows_win32_networking_activedirectory_DsCrackNamesA(void* hds, int32_t flags, int32_t formatoffered, int32_t formatdesired, uint32_t cnames, void* rpnames, void* ppresult);
uint32_t windowssys_windows_win32_networking_activedirectory_DsCrackNamesW(void* hds, int32_t flags, int32_t formatoffered, int32_t formatdesired, uint32_t cnames, void* rpnames, void* ppresult);
uint32_t windowssys_windows_win32_networking_activedirectory_DsCrackSpn2A(void* pszspn, uint32_t cspn, void* pcserviceclass, void* serviceclass, void* pcservicename, void* servicename, void* pcinstancename, void* instancename, void* pinstanceport);
uint32_t windowssys_windows_win32_networking_activedirectory_DsCrackSpn2W(void* pszspn, uint32_t cspn, void* pcserviceclass, void* serviceclass, void* pcservicename, void* servicename, void* pcinstancename, void* instancename, void* pinstanceport);
uint32_t windowssys_windows_win32_networking_activedirectory_DsCrackSpn3W(void* pszspn, uint32_t cspn, void* pchostname, void* hostname, void* pcinstancename, void* instancename, void* pportnumber, void* pcdomainname, void* domainname, void* pcrealmname, void* realmname);
uint32_t windowssys_windows_win32_networking_activedirectory_DsCrackSpn4W(void* pszspn, uint32_t cspn, void* pchostname, void* hostname, void* pcinstancename, void* instancename, void* pcportname, void* portname, void* pcdomainname, void* domainname, void* pcrealmname, void* realmname);
uint32_t windowssys_windows_win32_networking_activedirectory_DsCrackSpnA(void* pszspn, void* pcserviceclass, void* serviceclass, void* pcservicename, void* servicename, void* pcinstancename, void* instancename, void* pinstanceport);
uint32_t windowssys_windows_win32_networking_activedirectory_DsCrackSpnW(void* pszspn, void* pcserviceclass, void* serviceclass, void* pcservicename, void* servicename, void* pcinstancename, void* instancename, void* pinstanceport);
int32_t windowssys_windows_win32_networking_activedirectory_DsCrackUnquotedMangledRdnA(void* pszrdn, uint32_t cchrdn, void* pguid, void* pedsmanglefor);
int32_t windowssys_windows_win32_networking_activedirectory_DsCrackUnquotedMangledRdnW(void* pszrdn, uint32_t cchrdn, void* pguid, void* pedsmanglefor);
uint32_t windowssys_windows_win32_networking_activedirectory_DsDeregisterDnsHostRecordsA(void* servername, void* dnsdomainname, void* domainguid, void* dsaguid, void* dnshostname);
uint32_t windowssys_windows_win32_networking_activedirectory_DsDeregisterDnsHostRecordsW(void* servername, void* dnsdomainname, void* domainguid, void* dsaguid, void* dnshostname);
uint32_t windowssys_windows_win32_networking_activedirectory_DsEnumerateDomainTrustsA(void* servername, uint32_t flags, void* domains, void* domaincount);
uint32_t windowssys_windows_win32_networking_activedirectory_DsEnumerateDomainTrustsW(void* servername, uint32_t flags, void* domains, void* domaincount);
void windowssys_windows_win32_networking_activedirectory_DsFreeDomainControllerInfoA(uint32_t infolevel, uint32_t cinfo, void* pinfo);
void windowssys_windows_win32_networking_activedirectory_DsFreeDomainControllerInfoW(uint32_t infolevel, uint32_t cinfo, void* pinfo);
void windowssys_windows_win32_networking_activedirectory_DsFreeNameResultA(void* presult);
void windowssys_windows_win32_networking_activedirectory_DsFreeNameResultW(void* presult);
void windowssys_windows_win32_networking_activedirectory_DsFreePasswordCredentials(void* authidentity);
void windowssys_windows_win32_networking_activedirectory_DsFreeSchemaGuidMapA(void* pguidmap);
void windowssys_windows_win32_networking_activedirectory_DsFreeSchemaGuidMapW(void* pguidmap);
void windowssys_windows_win32_networking_activedirectory_DsFreeSpnArrayA(uint32_t cspn, void* rpszspn);
void windowssys_windows_win32_networking_activedirectory_DsFreeSpnArrayW(uint32_t cspn, void* rpszspn);
void windowssys_windows_win32_networking_activedirectory_DsGetDcCloseW(void* getdccontexthandle);
uint32_t windowssys_windows_win32_networking_activedirectory_DsGetDcNameA(void* computername, void* domainname, void* domainguid, void* sitename, uint32_t flags, void* domaincontrollerinfo);
uint32_t windowssys_windows_win32_networking_activedirectory_DsGetDcNameW(void* computername, void* domainname, void* domainguid, void* sitename, uint32_t flags, void* domaincontrollerinfo);
uint32_t windowssys_windows_win32_networking_activedirectory_DsGetDcNextA(void* getdccontexthandle, void* sockaddresscount, void* sockaddresses, void* dnshostname);
uint32_t windowssys_windows_win32_networking_activedirectory_DsGetDcNextW(void* getdccontexthandle, void* sockaddresscount, void* sockaddresses, void* dnshostname);
uint32_t windowssys_windows_win32_networking_activedirectory_DsGetDcOpenA(void* dnsname, uint32_t optionflags, void* sitename, void* domainguid, void* dnsforestname, uint32_t dcflags, void* retgetdccontext);
uint32_t windowssys_windows_win32_networking_activedirectory_DsGetDcOpenW(void* dnsname, uint32_t optionflags, void* sitename, void* domainguid, void* dnsforestname, uint32_t dcflags, void* retgetdccontext);
uint32_t windowssys_windows_win32_networking_activedirectory_DsGetDcSiteCoverageA(void* servername, void* entrycount, void* sitenames);
uint32_t windowssys_windows_win32_networking_activedirectory_DsGetDcSiteCoverageW(void* servername, void* entrycount, void* sitenames);
uint32_t windowssys_windows_win32_networking_activedirectory_DsGetDomainControllerInfoA(void* hds, void* domainname, uint32_t infolevel, void* pcout, void* ppinfo);
uint32_t windowssys_windows_win32_networking_activedirectory_DsGetDomainControllerInfoW(void* hds, void* domainname, uint32_t infolevel, void* pcout, void* ppinfo);
uint32_t windowssys_windows_win32_networking_activedirectory_DsGetForestTrustInformationW(void* servername, void* trusteddomainname, uint32_t flags, void* foresttrustinfo);
int32_t windowssys_windows_win32_networking_activedirectory_DsGetFriendlyClassName(void* pszobjectclass, void* pszbuffer, uint32_t cchbuffer);
void* windowssys_windows_win32_networking_activedirectory_DsGetIcon(uint32_t dwflags, void* pszobjectclass, int32_t cximage, int32_t cyimage);
uint32_t windowssys_windows_win32_networking_activedirectory_DsGetRdnW(void* ppdn, void* pcdn, void* ppkey, void* pckey, void* ppval, void* pcval);
uint32_t windowssys_windows_win32_networking_activedirectory_DsGetSiteNameA(void* computername, void* sitename);
uint32_t windowssys_windows_win32_networking_activedirectory_DsGetSiteNameW(void* computername, void* sitename);
uint32_t windowssys_windows_win32_networking_activedirectory_DsGetSpnA(int32_t servicetype, void* serviceclass, void* servicename, uint16_t instanceport, uint16_t cinstancenames, void* pinstancenames, void* pinstanceports, void* pcspn, void* prpszspn);
uint32_t windowssys_windows_win32_networking_activedirectory_DsGetSpnW(int32_t servicetype, void* serviceclass, void* servicename, uint16_t instanceport, uint16_t cinstancenames, void* pinstancenames, void* pinstanceports, void* pcspn, void* prpszspn);
uint32_t windowssys_windows_win32_networking_activedirectory_DsInheritSecurityIdentityA(void* hds, uint32_t flags, void* srcprincipal, void* dstprincipal);
uint32_t windowssys_windows_win32_networking_activedirectory_DsInheritSecurityIdentityW(void* hds, uint32_t flags, void* srcprincipal, void* dstprincipal);
int32_t windowssys_windows_win32_networking_activedirectory_DsIsMangledDnA(void* pszdn, int32_t edsmanglefor);
int32_t windowssys_windows_win32_networking_activedirectory_DsIsMangledDnW(void* pszdn, int32_t edsmanglefor);
int32_t windowssys_windows_win32_networking_activedirectory_DsIsMangledRdnValueA(void* pszrdn, uint32_t crdn, int32_t edsmanglefordesired);
int32_t windowssys_windows_win32_networking_activedirectory_DsIsMangledRdnValueW(void* pszrdn, uint32_t crdn, int32_t edsmanglefordesired);
uint32_t windowssys_windows_win32_networking_activedirectory_DsListDomainsInSiteA(void* hds, void* site, void* ppdomains);
uint32_t windowssys_windows_win32_networking_activedirectory_DsListDomainsInSiteW(void* hds, void* site, void* ppdomains);
uint32_t windowssys_windows_win32_networking_activedirectory_DsListInfoForServerA(void* hds, void* server, void* ppinfo);
uint32_t windowssys_windows_win32_networking_activedirectory_DsListInfoForServerW(void* hds, void* server, void* ppinfo);
uint32_t windowssys_windows_win32_networking_activedirectory_DsListRolesA(void* hds, void* pproles);
uint32_t windowssys_windows_win32_networking_activedirectory_DsListRolesW(void* hds, void* pproles);
uint32_t windowssys_windows_win32_networking_activedirectory_DsListServersForDomainInSiteA(void* hds, void* domain, void* site, void* ppservers);
uint32_t windowssys_windows_win32_networking_activedirectory_DsListServersForDomainInSiteW(void* hds, void* domain, void* site, void* ppservers);
uint32_t windowssys_windows_win32_networking_activedirectory_DsListServersInSiteA(void* hds, void* site, void* ppservers);
uint32_t windowssys_windows_win32_networking_activedirectory_DsListServersInSiteW(void* hds, void* site, void* ppservers);
uint32_t windowssys_windows_win32_networking_activedirectory_DsListSitesA(void* hds, void* ppsites);
uint32_t windowssys_windows_win32_networking_activedirectory_DsListSitesW(void* hds, void* ppsites);
uint32_t windowssys_windows_win32_networking_activedirectory_DsMakePasswordCredentialsA(void* user, void* domain, void* password, void* pauthidentity);
uint32_t windowssys_windows_win32_networking_activedirectory_DsMakePasswordCredentialsW(void* user, void* domain, void* password, void* pauthidentity);
uint32_t windowssys_windows_win32_networking_activedirectory_DsMakeSpnA(void* serviceclass, void* servicename, void* instancename, uint16_t instanceport, void* referrer, void* pcspnlength, void* pszspn);
uint32_t windowssys_windows_win32_networking_activedirectory_DsMakeSpnW(void* serviceclass, void* servicename, void* instancename, uint16_t instanceport, void* referrer, void* pcspnlength, void* pszspn);
uint32_t windowssys_windows_win32_networking_activedirectory_DsMapSchemaGuidsA(void* hds, uint32_t cguids, void* rguids, void* ppguidmap);
uint32_t windowssys_windows_win32_networking_activedirectory_DsMapSchemaGuidsW(void* hds, uint32_t cguids, void* rguids, void* ppguidmap);
uint32_t windowssys_windows_win32_networking_activedirectory_DsMergeForestTrustInformationW(void* domainname, void* newforesttrustinfo, void* oldforesttrustinfo, void* mergedforesttrustinfo);
uint32_t windowssys_windows_win32_networking_activedirectory_DsQuerySitesByCostA(void* hds, void* pszfromsite, void* rgsztosites, uint32_t ctosites, uint32_t dwflags, void* prgsiteinfo);
uint32_t windowssys_windows_win32_networking_activedirectory_DsQuerySitesByCostW(void* hds, void* pwszfromsite, void* rgwsztosites, uint32_t ctosites, uint32_t dwflags, void* prgsiteinfo);
void windowssys_windows_win32_networking_activedirectory_DsQuerySitesFree(void* rgsiteinfo);
uint32_t windowssys_windows_win32_networking_activedirectory_DsQuoteRdnValueA(uint32_t cunquotedrdnvaluelength, void* psunquotedrdnvalue, void* pcquotedrdnvaluelength, void* psquotedrdnvalue);
uint32_t windowssys_windows_win32_networking_activedirectory_DsQuoteRdnValueW(uint32_t cunquotedrdnvaluelength, void* psunquotedrdnvalue, void* pcquotedrdnvaluelength, void* psquotedrdnvalue);
uint32_t windowssys_windows_win32_networking_activedirectory_DsRemoveDsDomainA(void* hds, void* domaindn);
uint32_t windowssys_windows_win32_networking_activedirectory_DsRemoveDsDomainW(void* hds, void* domaindn);
uint32_t windowssys_windows_win32_networking_activedirectory_DsRemoveDsServerA(void* hds, void* serverdn, void* domaindn, void* flastdcindomain, int32_t fcommit);
uint32_t windowssys_windows_win32_networking_activedirectory_DsRemoveDsServerW(void* hds, void* serverdn, void* domaindn, void* flastdcindomain, int32_t fcommit);
uint32_t windowssys_windows_win32_networking_activedirectory_DsReplicaAddA(void* hds, void* namecontext, void* sourcedsadn, void* transportdn, void* sourcedsaaddress, void* pschedule, uint32_t options);
uint32_t windowssys_windows_win32_networking_activedirectory_DsReplicaAddW(void* hds, void* namecontext, void* sourcedsadn, void* transportdn, void* sourcedsaaddress, void* pschedule, uint32_t options);
uint32_t windowssys_windows_win32_networking_activedirectory_DsReplicaConsistencyCheck(void* hds, int32_t taskid, uint32_t dwflags);
uint32_t windowssys_windows_win32_networking_activedirectory_DsReplicaDelA(void* hds, void* namecontext, void* dsasrc, uint32_t options);
uint32_t windowssys_windows_win32_networking_activedirectory_DsReplicaDelW(void* hds, void* namecontext, void* dsasrc, uint32_t options);
void windowssys_windows_win32_networking_activedirectory_DsReplicaFreeInfo(int32_t infotype, void* pinfo);
uint32_t windowssys_windows_win32_networking_activedirectory_DsReplicaGetInfo2W(void* hds, int32_t infotype, void* pszobject, void* puuidforsourcedsaobjguid, void* pszattributename, void* pszvalue, uint32_t dwflags, uint32_t dwenumerationcontext, void* ppinfo);
uint32_t windowssys_windows_win32_networking_activedirectory_DsReplicaGetInfoW(void* hds, int32_t infotype, void* pszobject, void* puuidforsourcedsaobjguid, void* ppinfo);
uint32_t windowssys_windows_win32_networking_activedirectory_DsReplicaModifyA(void* hds, void* namecontext, void* puuidsourcedsa, void* transportdn, void* sourcedsaaddress, void* pschedule, uint32_t replicaflags, uint32_t modifyfields, uint32_t options);
uint32_t windowssys_windows_win32_networking_activedirectory_DsReplicaModifyW(void* hds, void* namecontext, void* puuidsourcedsa, void* transportdn, void* sourcedsaaddress, void* pschedule, uint32_t replicaflags, uint32_t modifyfields, uint32_t options);
uint32_t windowssys_windows_win32_networking_activedirectory_DsReplicaSyncA(void* hds, void* namecontext, void* puuiddsasrc, uint32_t options);
uint32_t windowssys_windows_win32_networking_activedirectory_DsReplicaSyncAllA(void* hds, void* psznamecontext, uint32_t ulflags, int64_t pfncallback, void* pcallbackdata, void* perrors);
uint32_t windowssys_windows_win32_networking_activedirectory_DsReplicaSyncAllW(void* hds, void* psznamecontext, uint32_t ulflags, int64_t pfncallback, void* pcallbackdata, void* perrors);
uint32_t windowssys_windows_win32_networking_activedirectory_DsReplicaSyncW(void* hds, void* namecontext, void* puuiddsasrc, uint32_t options);
uint32_t windowssys_windows_win32_networking_activedirectory_DsReplicaUpdateRefsA(void* hds, void* namecontext, void* dsadest, void* puuiddsadest, uint32_t options);
uint32_t windowssys_windows_win32_networking_activedirectory_DsReplicaUpdateRefsW(void* hds, void* namecontext, void* dsadest, void* puuiddsadest, uint32_t options);
uint32_t windowssys_windows_win32_networking_activedirectory_DsReplicaVerifyObjectsA(void* hds, void* namecontext, void* puuiddsasrc, uint32_t uloptions);
uint32_t windowssys_windows_win32_networking_activedirectory_DsReplicaVerifyObjectsW(void* hds, void* namecontext, void* puuiddsasrc, uint32_t uloptions);
void windowssys_windows_win32_networking_activedirectory_DsRoleFreeMemory(void* buffer);
uint32_t windowssys_windows_win32_networking_activedirectory_DsRoleGetPrimaryDomainInformation(void* lpserver, int32_t infolevel, void* buffer);
uint32_t windowssys_windows_win32_networking_activedirectory_DsServerRegisterSpnA(int32_t operation, void* serviceclass, void* userobjectdn);
uint32_t windowssys_windows_win32_networking_activedirectory_DsServerRegisterSpnW(int32_t operation, void* serviceclass, void* userobjectdn);
uint32_t windowssys_windows_win32_networking_activedirectory_DsUnBindA(void* phds);
uint32_t windowssys_windows_win32_networking_activedirectory_DsUnBindW(void* phds);
uint32_t windowssys_windows_win32_networking_activedirectory_DsUnquoteRdnValueA(uint32_t cquotedrdnvaluelength, void* psquotedrdnvalue, void* pcunquotedrdnvaluelength, void* psunquotedrdnvalue);
uint32_t windowssys_windows_win32_networking_activedirectory_DsUnquoteRdnValueW(uint32_t cquotedrdnvaluelength, void* psquotedrdnvalue, void* pcunquotedrdnvaluelength, void* psunquotedrdnvalue);
uint32_t windowssys_windows_win32_networking_activedirectory_DsValidateSubnetNameA(void* subnetname);
uint32_t windowssys_windows_win32_networking_activedirectory_DsValidateSubnetNameW(void* subnetname);
uint32_t windowssys_windows_win32_networking_activedirectory_DsWriteAccountSpnA(void* hds, int32_t operation, void* pszaccount, uint32_t cspn, void* rpszspn);
uint32_t windowssys_windows_win32_networking_activedirectory_DsWriteAccountSpnW(void* hds, int32_t operation, void* pszaccount, uint32_t cspn, void* rpszspn);
int32_t windowssys_windows_win32_networking_activedirectory_FreeADsMem(void* pmem);
int32_t windowssys_windows_win32_networking_activedirectory_FreeADsStr(void* pstr);
int32_t windowssys_windows_win32_networking_activedirectory_PropVariantToAdsType(void* pvariant, uint32_t dwnumvariant, void* ppadsvalues, void* pdwnumvalues);
void* windowssys_windows_win32_networking_activedirectory_ReallocADsMem(void* poldmem, uint32_t cbold, uint32_t cbnew);
int32_t windowssys_windows_win32_networking_activedirectory_ReallocADsStr(void* ppstr, void* pstr);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_NETWORKING_ACTIVEDIRECTORY_WINDOWS_WIN32_NETWORKING_ACTIVEDIRECTORY_WRAPPER_H */
