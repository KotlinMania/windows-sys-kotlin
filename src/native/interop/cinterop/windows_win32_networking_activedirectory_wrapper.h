#ifndef WINDOWSSYS_WINDOWS_WIN32_NETWORKING_ACTIVEDIRECTORY_WINDOWS_WIN32_NETWORKING_ACTIVEDIRECTORY_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_NETWORKING_ACTIVEDIRECTORY_WINDOWS_WIN32_NETWORKING_ACTIVEDIRECTORY_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_networking_activedirectory_aDsBuildEnumerator(void* padscontainer, void* ppenumvariant);
int32_t windowssys_windows_win32_networking_activedirectory_aDsBuildVarArrayInt(void* lpdwobjecttypes, uint32_t dwobjecttypes, void* pvar);
int32_t windowssys_windows_win32_networking_activedirectory_aDsBuildVarArrayStr(void* lpppathnames, uint32_t dwpathnames, void* pvar);
int32_t windowssys_windows_win32_networking_activedirectory_aDsDecodeBinaryData(void* szsrcdata, void* ppbdestdata, void* pdwdestlen);
int32_t windowssys_windows_win32_networking_activedirectory_aDsEncodeBinaryData(void* pbsrcdata, uint32_t dwsrclen, void* ppszdestdata);
int32_t windowssys_windows_win32_networking_activedirectory_aDsEnumerateNext(void* penumvariant, uint32_t celements, void* pvar, void* pcelementsfetched);
int32_t windowssys_windows_win32_networking_activedirectory_aDsFreeEnumerator(void* penumvariant);
int32_t windowssys_windows_win32_networking_activedirectory_aDsGetLastError(void* lperror, void* lperrorbuf, uint32_t dwerrorbuflen, void* lpnamebuf, uint32_t dwnamebuflen);
int32_t windowssys_windows_win32_networking_activedirectory_aDsGetObject(void* lpszpathname, void* riid, void* ppobject);
int32_t windowssys_windows_win32_networking_activedirectory_aDsOpenObject(void* lpszpathname, void* lpszusername, void* lpszpassword, uint32_t dwreserved, void* riid, void* ppobject);
int32_t windowssys_windows_win32_networking_activedirectory_aDsPropCheckIfWritable(void* pwzattr, void* pwritableattrs);
int32_t windowssys_windows_win32_networking_activedirectory_aDsPropCreateNotifyObj(void* pappthddataobj, void* pwzadsobjname, void* phnotifyobj);
int32_t windowssys_windows_win32_networking_activedirectory_aDsPropGetInitInfo(void* hnotifyobj, void* pinitparams);
int32_t windowssys_windows_win32_networking_activedirectory_aDsPropSendErrorMessage(void* hnotifyobj, void* perror);
int32_t windowssys_windows_win32_networking_activedirectory_aDsPropSetHwnd(void* hnotifyobj, void* hpage);
int32_t windowssys_windows_win32_networking_activedirectory_aDsPropSetHwndWithTitle(void* hnotifyobj, void* hpage, void* ptztitle);
int32_t windowssys_windows_win32_networking_activedirectory_aDsPropShowErrorDialog(void* hnotifyobj, void* hpage);
void windowssys_windows_win32_networking_activedirectory_aDsSetLastError(uint32_t dwerr, void* pszerror, void* pszprovider);
void windowssys_windows_win32_networking_activedirectory_adsFreeAdsValues(void* padsvalues, uint32_t dwnumvalues);
int32_t windowssys_windows_win32_networking_activedirectory_adsTypeToPropVariant(void* padsvalues, uint32_t dwnumvalues, void* pvariant);
void* windowssys_windows_win32_networking_activedirectory_allocADsMem(uint32_t cb);
void* windowssys_windows_win32_networking_activedirectory_allocADsStr(void* pstr);
int32_t windowssys_windows_win32_networking_activedirectory_binarySDToSecurityDescriptor(void* psecuritydescriptor, void* pvarsec, void* pszservername, void* username, void* password, uint32_t dwflags);
uint32_t windowssys_windows_win32_networking_activedirectory_dsAddSidHistoryA(void* hds, uint32_t flags, void* srcdomain, void* srcprincipal, void* srcdomaincontroller, void* srcdomaincreds, void* dstdomain, void* dstprincipal);
uint32_t windowssys_windows_win32_networking_activedirectory_dsAddSidHistoryW(void* hds, uint32_t flags, void* srcdomain, void* srcprincipal, void* srcdomaincontroller, void* srcdomaincreds, void* dstdomain, void* dstprincipal);
uint32_t windowssys_windows_win32_networking_activedirectory_dsAddressToSiteNamesA(void* computername, uint32_t entrycount, void* socketaddresses, void* sitenames);
uint32_t windowssys_windows_win32_networking_activedirectory_dsAddressToSiteNamesExA(void* computername, uint32_t entrycount, void* socketaddresses, void* sitenames, void* subnetnames);
uint32_t windowssys_windows_win32_networking_activedirectory_dsAddressToSiteNamesExW(void* computername, uint32_t entrycount, void* socketaddresses, void* sitenames, void* subnetnames);
uint32_t windowssys_windows_win32_networking_activedirectory_dsAddressToSiteNamesW(void* computername, uint32_t entrycount, void* socketaddresses, void* sitenames);
uint32_t windowssys_windows_win32_networking_activedirectory_dsBindA(void* domaincontrollername, void* dnsdomainname, void* phds);
uint32_t windowssys_windows_win32_networking_activedirectory_dsBindByInstanceA(void* servername, void* annotation, void* instanceguid, void* dnsdomainname, void* authidentity, void* serviceprincipalname, uint32_t bindflags, void* phds);
uint32_t windowssys_windows_win32_networking_activedirectory_dsBindByInstanceW(void* servername, void* annotation, void* instanceguid, void* dnsdomainname, void* authidentity, void* serviceprincipalname, uint32_t bindflags, void* phds);
uint32_t windowssys_windows_win32_networking_activedirectory_dsBindToISTGA(void* sitename, void* phds);
uint32_t windowssys_windows_win32_networking_activedirectory_dsBindToISTGW(void* sitename, void* phds);
uint32_t windowssys_windows_win32_networking_activedirectory_dsBindW(void* domaincontrollername, void* dnsdomainname, void* phds);
uint32_t windowssys_windows_win32_networking_activedirectory_dsBindWithCredA(void* domaincontrollername, void* dnsdomainname, void* authidentity, void* phds);
uint32_t windowssys_windows_win32_networking_activedirectory_dsBindWithCredW(void* domaincontrollername, void* dnsdomainname, void* authidentity, void* phds);
uint32_t windowssys_windows_win32_networking_activedirectory_dsBindWithSpnA(void* domaincontrollername, void* dnsdomainname, void* authidentity, void* serviceprincipalname, void* phds);
uint32_t windowssys_windows_win32_networking_activedirectory_dsBindWithSpnExA(void* domaincontrollername, void* dnsdomainname, void* authidentity, void* serviceprincipalname, uint32_t bindflags, void* phds);
uint32_t windowssys_windows_win32_networking_activedirectory_dsBindWithSpnExW(void* domaincontrollername, void* dnsdomainname, void* authidentity, void* serviceprincipalname, uint32_t bindflags, void* phds);
uint32_t windowssys_windows_win32_networking_activedirectory_dsBindWithSpnW(void* domaincontrollername, void* dnsdomainname, void* authidentity, void* serviceprincipalname, void* phds);
uint32_t windowssys_windows_win32_networking_activedirectory_dsBindingSetTimeout(void* hds, uint32_t ctimeoutsecs);
int32_t windowssys_windows_win32_networking_activedirectory_dsBrowseForContainerA(void* pinfo);
int32_t windowssys_windows_win32_networking_activedirectory_dsBrowseForContainerW(void* pinfo);
uint32_t windowssys_windows_win32_networking_activedirectory_dsClientMakeSpnForTargetServerA(void* serviceclass, void* servicename, void* pcspnlength, void* pszspn);
uint32_t windowssys_windows_win32_networking_activedirectory_dsClientMakeSpnForTargetServerW(void* serviceclass, void* servicename, void* pcspnlength, void* pszspn);
uint32_t windowssys_windows_win32_networking_activedirectory_dsCrackNamesA(void* hds, int32_t flags, int32_t formatoffered, int32_t formatdesired, uint32_t cnames, void* rpnames, void* ppresult);
uint32_t windowssys_windows_win32_networking_activedirectory_dsCrackNamesW(void* hds, int32_t flags, int32_t formatoffered, int32_t formatdesired, uint32_t cnames, void* rpnames, void* ppresult);
uint32_t windowssys_windows_win32_networking_activedirectory_dsCrackSpn2A(void* pszspn, uint32_t cspn, void* pcserviceclass, void* serviceclass, void* pcservicename, void* servicename, void* pcinstancename, void* instancename, void* pinstanceport);
uint32_t windowssys_windows_win32_networking_activedirectory_dsCrackSpn2W(void* pszspn, uint32_t cspn, void* pcserviceclass, void* serviceclass, void* pcservicename, void* servicename, void* pcinstancename, void* instancename, void* pinstanceport);
uint32_t windowssys_windows_win32_networking_activedirectory_dsCrackSpn3W(void* pszspn, uint32_t cspn, void* pchostname, void* hostname, void* pcinstancename, void* instancename, void* pportnumber, void* pcdomainname, void* domainname, void* pcrealmname, void* realmname);
uint32_t windowssys_windows_win32_networking_activedirectory_dsCrackSpn4W(void* pszspn, uint32_t cspn, void* pchostname, void* hostname, void* pcinstancename, void* instancename, void* pcportname, void* portname, void* pcdomainname, void* domainname, void* pcrealmname, void* realmname);
uint32_t windowssys_windows_win32_networking_activedirectory_dsCrackSpnA(void* pszspn, void* pcserviceclass, void* serviceclass, void* pcservicename, void* servicename, void* pcinstancename, void* instancename, void* pinstanceport);
uint32_t windowssys_windows_win32_networking_activedirectory_dsCrackSpnW(void* pszspn, void* pcserviceclass, void* serviceclass, void* pcservicename, void* servicename, void* pcinstancename, void* instancename, void* pinstanceport);
int32_t windowssys_windows_win32_networking_activedirectory_dsCrackUnquotedMangledRdnA(void* pszrdn, uint32_t cchrdn, void* pguid, void* pedsmanglefor);
int32_t windowssys_windows_win32_networking_activedirectory_dsCrackUnquotedMangledRdnW(void* pszrdn, uint32_t cchrdn, void* pguid, void* pedsmanglefor);
uint32_t windowssys_windows_win32_networking_activedirectory_dsDeregisterDnsHostRecordsA(void* servername, void* dnsdomainname, void* domainguid, void* dsaguid, void* dnshostname);
uint32_t windowssys_windows_win32_networking_activedirectory_dsDeregisterDnsHostRecordsW(void* servername, void* dnsdomainname, void* domainguid, void* dsaguid, void* dnshostname);
uint32_t windowssys_windows_win32_networking_activedirectory_dsEnumerateDomainTrustsA(void* servername, uint32_t flags, void* domains, void* domaincount);
uint32_t windowssys_windows_win32_networking_activedirectory_dsEnumerateDomainTrustsW(void* servername, uint32_t flags, void* domains, void* domaincount);
void windowssys_windows_win32_networking_activedirectory_dsFreeDomainControllerInfoA(uint32_t infolevel, uint32_t cinfo, void* pinfo);
void windowssys_windows_win32_networking_activedirectory_dsFreeDomainControllerInfoW(uint32_t infolevel, uint32_t cinfo, void* pinfo);
void windowssys_windows_win32_networking_activedirectory_dsFreeNameResultA(void* presult);
void windowssys_windows_win32_networking_activedirectory_dsFreeNameResultW(void* presult);
void windowssys_windows_win32_networking_activedirectory_dsFreePasswordCredentials(void* authidentity);
void windowssys_windows_win32_networking_activedirectory_dsFreeSchemaGuidMapA(void* pguidmap);
void windowssys_windows_win32_networking_activedirectory_dsFreeSchemaGuidMapW(void* pguidmap);
void windowssys_windows_win32_networking_activedirectory_dsFreeSpnArrayA(uint32_t cspn, void* rpszspn);
void windowssys_windows_win32_networking_activedirectory_dsFreeSpnArrayW(uint32_t cspn, void* rpszspn);
void windowssys_windows_win32_networking_activedirectory_dsGetDcCloseW(void* getdccontexthandle);
uint32_t windowssys_windows_win32_networking_activedirectory_dsGetDcNameA(void* computername, void* domainname, void* domainguid, void* sitename, uint32_t flags, void* domaincontrollerinfo);
uint32_t windowssys_windows_win32_networking_activedirectory_dsGetDcNameW(void* computername, void* domainname, void* domainguid, void* sitename, uint32_t flags, void* domaincontrollerinfo);
uint32_t windowssys_windows_win32_networking_activedirectory_dsGetDcNextA(void* getdccontexthandle, void* sockaddresscount, void* sockaddresses, void* dnshostname);
uint32_t windowssys_windows_win32_networking_activedirectory_dsGetDcNextW(void* getdccontexthandle, void* sockaddresscount, void* sockaddresses, void* dnshostname);
uint32_t windowssys_windows_win32_networking_activedirectory_dsGetDcOpenA(void* dnsname, uint32_t optionflags, void* sitename, void* domainguid, void* dnsforestname, uint32_t dcflags, void* retgetdccontext);
uint32_t windowssys_windows_win32_networking_activedirectory_dsGetDcOpenW(void* dnsname, uint32_t optionflags, void* sitename, void* domainguid, void* dnsforestname, uint32_t dcflags, void* retgetdccontext);
uint32_t windowssys_windows_win32_networking_activedirectory_dsGetDcSiteCoverageA(void* servername, void* entrycount, void* sitenames);
uint32_t windowssys_windows_win32_networking_activedirectory_dsGetDcSiteCoverageW(void* servername, void* entrycount, void* sitenames);
uint32_t windowssys_windows_win32_networking_activedirectory_dsGetDomainControllerInfoA(void* hds, void* domainname, uint32_t infolevel, void* pcout, void* ppinfo);
uint32_t windowssys_windows_win32_networking_activedirectory_dsGetDomainControllerInfoW(void* hds, void* domainname, uint32_t infolevel, void* pcout, void* ppinfo);
uint32_t windowssys_windows_win32_networking_activedirectory_dsGetForestTrustInformationW(void* servername, void* trusteddomainname, uint32_t flags, void* foresttrustinfo);
int32_t windowssys_windows_win32_networking_activedirectory_dsGetFriendlyClassName(void* pszobjectclass, void* pszbuffer, uint32_t cchbuffer);
void* windowssys_windows_win32_networking_activedirectory_dsGetIcon(uint32_t dwflags, void* pszobjectclass, int32_t cximage, int32_t cyimage);
uint32_t windowssys_windows_win32_networking_activedirectory_dsGetRdnW(void* ppdn, void* pcdn, void* ppkey, void* pckey, void* ppval, void* pcval);
uint32_t windowssys_windows_win32_networking_activedirectory_dsGetSiteNameA(void* computername, void* sitename);
uint32_t windowssys_windows_win32_networking_activedirectory_dsGetSiteNameW(void* computername, void* sitename);
uint32_t windowssys_windows_win32_networking_activedirectory_dsGetSpnA(int32_t servicetype, void* serviceclass, void* servicename, uint16_t instanceport, uint16_t cinstancenames, void* pinstancenames, void* pinstanceports, void* pcspn, void* prpszspn);
uint32_t windowssys_windows_win32_networking_activedirectory_dsGetSpnW(int32_t servicetype, void* serviceclass, void* servicename, uint16_t instanceport, uint16_t cinstancenames, void* pinstancenames, void* pinstanceports, void* pcspn, void* prpszspn);
uint32_t windowssys_windows_win32_networking_activedirectory_dsInheritSecurityIdentityA(void* hds, uint32_t flags, void* srcprincipal, void* dstprincipal);
uint32_t windowssys_windows_win32_networking_activedirectory_dsInheritSecurityIdentityW(void* hds, uint32_t flags, void* srcprincipal, void* dstprincipal);
int32_t windowssys_windows_win32_networking_activedirectory_dsIsMangledDnA(void* pszdn, int32_t edsmanglefor);
int32_t windowssys_windows_win32_networking_activedirectory_dsIsMangledDnW(void* pszdn, int32_t edsmanglefor);
int32_t windowssys_windows_win32_networking_activedirectory_dsIsMangledRdnValueA(void* pszrdn, uint32_t crdn, int32_t edsmanglefordesired);
int32_t windowssys_windows_win32_networking_activedirectory_dsIsMangledRdnValueW(void* pszrdn, uint32_t crdn, int32_t edsmanglefordesired);
uint32_t windowssys_windows_win32_networking_activedirectory_dsListDomainsInSiteA(void* hds, void* site, void* ppdomains);
uint32_t windowssys_windows_win32_networking_activedirectory_dsListDomainsInSiteW(void* hds, void* site, void* ppdomains);
uint32_t windowssys_windows_win32_networking_activedirectory_dsListInfoForServerA(void* hds, void* server, void* ppinfo);
uint32_t windowssys_windows_win32_networking_activedirectory_dsListInfoForServerW(void* hds, void* server, void* ppinfo);
uint32_t windowssys_windows_win32_networking_activedirectory_dsListRolesA(void* hds, void* pproles);
uint32_t windowssys_windows_win32_networking_activedirectory_dsListRolesW(void* hds, void* pproles);
uint32_t windowssys_windows_win32_networking_activedirectory_dsListServersForDomainInSiteA(void* hds, void* domain, void* site, void* ppservers);
uint32_t windowssys_windows_win32_networking_activedirectory_dsListServersForDomainInSiteW(void* hds, void* domain, void* site, void* ppservers);
uint32_t windowssys_windows_win32_networking_activedirectory_dsListServersInSiteA(void* hds, void* site, void* ppservers);
uint32_t windowssys_windows_win32_networking_activedirectory_dsListServersInSiteW(void* hds, void* site, void* ppservers);
uint32_t windowssys_windows_win32_networking_activedirectory_dsListSitesA(void* hds, void* ppsites);
uint32_t windowssys_windows_win32_networking_activedirectory_dsListSitesW(void* hds, void* ppsites);
uint32_t windowssys_windows_win32_networking_activedirectory_dsMakePasswordCredentialsA(void* user, void* domain, void* password, void* pauthidentity);
uint32_t windowssys_windows_win32_networking_activedirectory_dsMakePasswordCredentialsW(void* user, void* domain, void* password, void* pauthidentity);
uint32_t windowssys_windows_win32_networking_activedirectory_dsMakeSpnA(void* serviceclass, void* servicename, void* instancename, uint16_t instanceport, void* referrer, void* pcspnlength, void* pszspn);
uint32_t windowssys_windows_win32_networking_activedirectory_dsMakeSpnW(void* serviceclass, void* servicename, void* instancename, uint16_t instanceport, void* referrer, void* pcspnlength, void* pszspn);
uint32_t windowssys_windows_win32_networking_activedirectory_dsMapSchemaGuidsA(void* hds, uint32_t cguids, void* rguids, void* ppguidmap);
uint32_t windowssys_windows_win32_networking_activedirectory_dsMapSchemaGuidsW(void* hds, uint32_t cguids, void* rguids, void* ppguidmap);
uint32_t windowssys_windows_win32_networking_activedirectory_dsMergeForestTrustInformationW(void* domainname, void* newforesttrustinfo, void* oldforesttrustinfo, void* mergedforesttrustinfo);
uint32_t windowssys_windows_win32_networking_activedirectory_dsQuerySitesByCostA(void* hds, void* pszfromsite, void* rgsztosites, uint32_t ctosites, uint32_t dwflags, void* prgsiteinfo);
uint32_t windowssys_windows_win32_networking_activedirectory_dsQuerySitesByCostW(void* hds, void* pwszfromsite, void* rgwsztosites, uint32_t ctosites, uint32_t dwflags, void* prgsiteinfo);
void windowssys_windows_win32_networking_activedirectory_dsQuerySitesFree(void* rgsiteinfo);
uint32_t windowssys_windows_win32_networking_activedirectory_dsQuoteRdnValueA(uint32_t cunquotedrdnvaluelength, void* psunquotedrdnvalue, void* pcquotedrdnvaluelength, void* psquotedrdnvalue);
uint32_t windowssys_windows_win32_networking_activedirectory_dsQuoteRdnValueW(uint32_t cunquotedrdnvaluelength, void* psunquotedrdnvalue, void* pcquotedrdnvaluelength, void* psquotedrdnvalue);
uint32_t windowssys_windows_win32_networking_activedirectory_dsRemoveDsDomainA(void* hds, void* domaindn);
uint32_t windowssys_windows_win32_networking_activedirectory_dsRemoveDsDomainW(void* hds, void* domaindn);
uint32_t windowssys_windows_win32_networking_activedirectory_dsRemoveDsServerA(void* hds, void* serverdn, void* domaindn, void* flastdcindomain, int32_t fcommit);
uint32_t windowssys_windows_win32_networking_activedirectory_dsRemoveDsServerW(void* hds, void* serverdn, void* domaindn, void* flastdcindomain, int32_t fcommit);
uint32_t windowssys_windows_win32_networking_activedirectory_dsReplicaAddA(void* hds, void* namecontext, void* sourcedsadn, void* transportdn, void* sourcedsaaddress, void* pschedule, uint32_t options);
uint32_t windowssys_windows_win32_networking_activedirectory_dsReplicaAddW(void* hds, void* namecontext, void* sourcedsadn, void* transportdn, void* sourcedsaaddress, void* pschedule, uint32_t options);
uint32_t windowssys_windows_win32_networking_activedirectory_dsReplicaConsistencyCheck(void* hds, int32_t taskid, uint32_t dwflags);
uint32_t windowssys_windows_win32_networking_activedirectory_dsReplicaDelA(void* hds, void* namecontext, void* dsasrc, uint32_t options);
uint32_t windowssys_windows_win32_networking_activedirectory_dsReplicaDelW(void* hds, void* namecontext, void* dsasrc, uint32_t options);
void windowssys_windows_win32_networking_activedirectory_dsReplicaFreeInfo(int32_t infotype, void* pinfo);
uint32_t windowssys_windows_win32_networking_activedirectory_dsReplicaGetInfo2W(void* hds, int32_t infotype, void* pszobject, void* puuidforsourcedsaobjguid, void* pszattributename, void* pszvalue, uint32_t dwflags, uint32_t dwenumerationcontext, void* ppinfo);
uint32_t windowssys_windows_win32_networking_activedirectory_dsReplicaGetInfoW(void* hds, int32_t infotype, void* pszobject, void* puuidforsourcedsaobjguid, void* ppinfo);
uint32_t windowssys_windows_win32_networking_activedirectory_dsReplicaModifyA(void* hds, void* namecontext, void* puuidsourcedsa, void* transportdn, void* sourcedsaaddress, void* pschedule, uint32_t replicaflags, uint32_t modifyfields, uint32_t options);
uint32_t windowssys_windows_win32_networking_activedirectory_dsReplicaModifyW(void* hds, void* namecontext, void* puuidsourcedsa, void* transportdn, void* sourcedsaaddress, void* pschedule, uint32_t replicaflags, uint32_t modifyfields, uint32_t options);
uint32_t windowssys_windows_win32_networking_activedirectory_dsReplicaSyncA(void* hds, void* namecontext, void* puuiddsasrc, uint32_t options);
uint32_t windowssys_windows_win32_networking_activedirectory_dsReplicaSyncAllA(void* hds, void* psznamecontext, uint32_t ulflags, int64_t pfncallback, void* pcallbackdata, void* perrors);
uint32_t windowssys_windows_win32_networking_activedirectory_dsReplicaSyncAllW(void* hds, void* psznamecontext, uint32_t ulflags, int64_t pfncallback, void* pcallbackdata, void* perrors);
uint32_t windowssys_windows_win32_networking_activedirectory_dsReplicaSyncW(void* hds, void* namecontext, void* puuiddsasrc, uint32_t options);
uint32_t windowssys_windows_win32_networking_activedirectory_dsReplicaUpdateRefsA(void* hds, void* namecontext, void* dsadest, void* puuiddsadest, uint32_t options);
uint32_t windowssys_windows_win32_networking_activedirectory_dsReplicaUpdateRefsW(void* hds, void* namecontext, void* dsadest, void* puuiddsadest, uint32_t options);
uint32_t windowssys_windows_win32_networking_activedirectory_dsReplicaVerifyObjectsA(void* hds, void* namecontext, void* puuiddsasrc, uint32_t uloptions);
uint32_t windowssys_windows_win32_networking_activedirectory_dsReplicaVerifyObjectsW(void* hds, void* namecontext, void* puuiddsasrc, uint32_t uloptions);
void windowssys_windows_win32_networking_activedirectory_dsRoleFreeMemory(void* buffer);
uint32_t windowssys_windows_win32_networking_activedirectory_dsRoleGetPrimaryDomainInformation(void* lpserver, int32_t infolevel, void* buffer);
uint32_t windowssys_windows_win32_networking_activedirectory_dsServerRegisterSpnA(int32_t operation, void* serviceclass, void* userobjectdn);
uint32_t windowssys_windows_win32_networking_activedirectory_dsServerRegisterSpnW(int32_t operation, void* serviceclass, void* userobjectdn);
uint32_t windowssys_windows_win32_networking_activedirectory_dsUnBindA(void* phds);
uint32_t windowssys_windows_win32_networking_activedirectory_dsUnBindW(void* phds);
uint32_t windowssys_windows_win32_networking_activedirectory_dsUnquoteRdnValueA(uint32_t cquotedrdnvaluelength, void* psquotedrdnvalue, void* pcunquotedrdnvaluelength, void* psunquotedrdnvalue);
uint32_t windowssys_windows_win32_networking_activedirectory_dsUnquoteRdnValueW(uint32_t cquotedrdnvaluelength, void* psquotedrdnvalue, void* pcunquotedrdnvaluelength, void* psunquotedrdnvalue);
uint32_t windowssys_windows_win32_networking_activedirectory_dsValidateSubnetNameA(void* subnetname);
uint32_t windowssys_windows_win32_networking_activedirectory_dsValidateSubnetNameW(void* subnetname);
uint32_t windowssys_windows_win32_networking_activedirectory_dsWriteAccountSpnA(void* hds, int32_t operation, void* pszaccount, uint32_t cspn, void* rpszspn);
uint32_t windowssys_windows_win32_networking_activedirectory_dsWriteAccountSpnW(void* hds, int32_t operation, void* pszaccount, uint32_t cspn, void* rpszspn);
int32_t windowssys_windows_win32_networking_activedirectory_freeADsMem(void* pmem);
int32_t windowssys_windows_win32_networking_activedirectory_freeADsStr(void* pstr);
int32_t windowssys_windows_win32_networking_activedirectory_propVariantToAdsType(void* pvariant, uint32_t dwnumvariant, void* ppadsvalues, void* pdwnumvalues);
void* windowssys_windows_win32_networking_activedirectory_reallocADsMem(void* poldmem, uint32_t cbold, uint32_t cbnew);
int32_t windowssys_windows_win32_networking_activedirectory_reallocADsStr(void* ppstr, void* pstr);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_NETWORKING_ACTIVEDIRECTORY_WINDOWS_WIN32_NETWORKING_ACTIVEDIRECTORY_WRAPPER_H */
