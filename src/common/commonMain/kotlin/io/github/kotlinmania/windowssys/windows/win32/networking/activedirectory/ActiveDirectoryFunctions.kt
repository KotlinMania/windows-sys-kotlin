package io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR
import io.github.kotlinmania.windowssys.windows.win32.system.variant.VARIANT
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.HICON

public expect fun ADsBuildEnumerator(padscontainer: Long, ppenumvariant: Long): HRESULT

public expect fun ADsBuildVarArrayInt(lpdwobjecttypes: Long, dwobjecttypes: UInt, pvar: Long): HRESULT

public expect fun ADsBuildVarArrayStr(lpppathnames: Long, dwpathnames: UInt, pvar: Long): HRESULT

public expect fun ADsDecodeBinaryData(szsrcdata: PCWSTR, ppbdestdata: Long, pdwdestlen: Long): HRESULT

public expect fun ADsEncodeBinaryData(pbsrcdata: Long, dwsrclen: UInt, ppszdestdata: Long): HRESULT

public expect fun ADsEnumerateNext(penumvariant: Long, celements: UInt, pvar: Long, pcelementsfetched: Long): HRESULT

public expect fun ADsFreeEnumerator(penumvariant: Long): HRESULT

public expect fun ADsGetLastError(lperror: Long, lperrorbuf: PWSTR, dwerrorbuflen: UInt, lpnamebuf: PWSTR, dwnamebuflen: UInt): HRESULT

public expect fun ADsGetObject(lpszpathname: PCWSTR, riid: Long, ppobject: Long): HRESULT

public expect fun ADsOpenObject(lpszpathname: PCWSTR, lpszusername: PCWSTR, lpszpassword: PCWSTR, dwreserved: ADS_AUTHENTICATION_ENUM, riid: Long, ppobject: Long): HRESULT

public expect fun ADsPropCheckIfWritable(pwzattr: PCWSTR, pwritableattrs: Long): BOOL

public expect fun ADsPropCreateNotifyObj(pappthddataobj: Long, pwzadsobjname: PCWSTR, phnotifyobj: Long): HRESULT

public expect fun ADsPropGetInitInfo(hnotifyobj: HWND, pinitparams: Long): BOOL

public expect fun ADsPropSendErrorMessage(hnotifyobj: HWND, perror: Long): BOOL

public expect fun ADsPropSetHwnd(hnotifyobj: HWND, hpage: HWND): BOOL

public expect fun ADsPropSetHwndWithTitle(hnotifyobj: HWND, hpage: HWND, ptztitle: Long): BOOL

public expect fun ADsPropShowErrorDialog(hnotifyobj: HWND, hpage: HWND): BOOL

public expect fun ADsSetLastError(dwerr: UInt, pszerror: PCWSTR, pszprovider: PCWSTR)

public expect fun AdsFreeAdsValues(padsvalues: Long, dwnumvalues: UInt)

public expect fun AdsTypeToPropVariant(padsvalues: Long, dwnumvalues: UInt, pvariant: Long): HRESULT

public expect fun AllocADsMem(cb: UInt): Long

public expect fun AllocADsStr(pstr: PCWSTR): PWSTR

public expect fun BinarySDToSecurityDescriptor(psecuritydescriptor: PSECURITY_DESCRIPTOR, pvarsec: Long, pszservername: PCWSTR, username: PCWSTR, password: PCWSTR, dwflags: UInt): HRESULT

public expect fun DsAddSidHistoryA(hds: HANDLE, flags: UInt, srcdomain: PCSTR, srcprincipal: PCSTR, srcdomaincontroller: PCSTR, srcdomaincreds: Long, dstdomain: PCSTR, dstprincipal: PCSTR): UInt

public expect fun DsAddSidHistoryW(hds: HANDLE, flags: UInt, srcdomain: PCWSTR, srcprincipal: PCWSTR, srcdomaincontroller: PCWSTR, srcdomaincreds: Long, dstdomain: PCWSTR, dstprincipal: PCWSTR): UInt

public expect fun DsAddressToSiteNamesA(computername: PCSTR, entrycount: UInt, socketaddresses: Long, sitenames: Long): UInt

public expect fun DsAddressToSiteNamesExA(computername: PCSTR, entrycount: UInt, socketaddresses: Long, sitenames: Long, subnetnames: Long): UInt

public expect fun DsAddressToSiteNamesExW(computername: PCWSTR, entrycount: UInt, socketaddresses: Long, sitenames: Long, subnetnames: Long): UInt

public expect fun DsAddressToSiteNamesW(computername: PCWSTR, entrycount: UInt, socketaddresses: Long, sitenames: Long): UInt

public expect fun DsBindA(domaincontrollername: PCSTR, dnsdomainname: PCSTR, phds: Long): UInt

public expect fun DsBindByInstanceA(servername: PCSTR, annotation: PCSTR, instanceguid: Long, dnsdomainname: PCSTR, authidentity: Long, serviceprincipalname: PCSTR, bindflags: UInt, phds: Long): UInt

public expect fun DsBindByInstanceW(servername: PCWSTR, annotation: PCWSTR, instanceguid: Long, dnsdomainname: PCWSTR, authidentity: Long, serviceprincipalname: PCWSTR, bindflags: UInt, phds: Long): UInt

public expect fun DsBindToISTGA(sitename: PCSTR, phds: Long): UInt

public expect fun DsBindToISTGW(sitename: PCWSTR, phds: Long): UInt

public expect fun DsBindW(domaincontrollername: PCWSTR, dnsdomainname: PCWSTR, phds: Long): UInt

public expect fun DsBindWithCredA(domaincontrollername: PCSTR, dnsdomainname: PCSTR, authidentity: Long, phds: Long): UInt

public expect fun DsBindWithCredW(domaincontrollername: PCWSTR, dnsdomainname: PCWSTR, authidentity: Long, phds: Long): UInt

public expect fun DsBindWithSpnA(domaincontrollername: PCSTR, dnsdomainname: PCSTR, authidentity: Long, serviceprincipalname: PCSTR, phds: Long): UInt

public expect fun DsBindWithSpnExA(domaincontrollername: PCSTR, dnsdomainname: PCSTR, authidentity: Long, serviceprincipalname: PCSTR, bindflags: UInt, phds: Long): UInt

public expect fun DsBindWithSpnExW(domaincontrollername: PCWSTR, dnsdomainname: PCWSTR, authidentity: Long, serviceprincipalname: PCWSTR, bindflags: UInt, phds: Long): UInt

public expect fun DsBindWithSpnW(domaincontrollername: PCWSTR, dnsdomainname: PCWSTR, authidentity: Long, serviceprincipalname: PCWSTR, phds: Long): UInt

public expect fun DsBindingSetTimeout(hds: HANDLE, ctimeoutsecs: UInt): UInt

public expect fun DsBrowseForContainerA(pinfo: Long): Int

public expect fun DsBrowseForContainerW(pinfo: Long): Int

public expect fun DsClientMakeSpnForTargetServerA(serviceclass: PCSTR, servicename: PCSTR, pcspnlength: Long, pszspn: PSTR): UInt

public expect fun DsClientMakeSpnForTargetServerW(serviceclass: PCWSTR, servicename: PCWSTR, pcspnlength: Long, pszspn: PWSTR): UInt

public expect fun DsCrackNamesA(hds: HANDLE, flags: DS_NAME_FLAGS, formatoffered: DS_NAME_FORMAT, formatdesired: DS_NAME_FORMAT, cnames: UInt, rpnames: Long, ppresult: Long): UInt

public expect fun DsCrackNamesW(hds: HANDLE, flags: DS_NAME_FLAGS, formatoffered: DS_NAME_FORMAT, formatdesired: DS_NAME_FORMAT, cnames: UInt, rpnames: Long, ppresult: Long): UInt

public expect fun DsCrackSpn2A(pszspn: PCSTR, cspn: UInt, pcserviceclass: Long, serviceclass: PSTR, pcservicename: Long, servicename: PSTR, pcinstancename: Long, instancename: PSTR, pinstanceport: Long): UInt

public expect fun DsCrackSpn2W(pszspn: PCWSTR, cspn: UInt, pcserviceclass: Long, serviceclass: PWSTR, pcservicename: Long, servicename: PWSTR, pcinstancename: Long, instancename: PWSTR, pinstanceport: Long): UInt

public expect fun DsCrackSpn3W(pszspn: PCWSTR, cspn: UInt, pchostname: Long, hostname: PWSTR, pcinstancename: Long, instancename: PWSTR, pportnumber: Long, pcdomainname: Long, domainname: PWSTR, pcrealmname: Long, realmname: PWSTR): UInt

public expect fun DsCrackSpn4W(pszspn: PCWSTR, cspn: UInt, pchostname: Long, hostname: PWSTR, pcinstancename: Long, instancename: PWSTR, pcportname: Long, portname: PWSTR, pcdomainname: Long, domainname: PWSTR, pcrealmname: Long, realmname: PWSTR): UInt

public expect fun DsCrackSpnA(pszspn: PCSTR, pcserviceclass: Long, serviceclass: PSTR, pcservicename: Long, servicename: PSTR, pcinstancename: Long, instancename: PSTR, pinstanceport: Long): UInt

public expect fun DsCrackSpnW(pszspn: PCWSTR, pcserviceclass: Long, serviceclass: PWSTR, pcservicename: Long, servicename: PWSTR, pcinstancename: Long, instancename: PWSTR, pinstanceport: Long): UInt

public expect fun DsCrackUnquotedMangledRdnA(pszrdn: PCSTR, cchrdn: UInt, pguid: Long, pedsmanglefor: Long): BOOL

public expect fun DsCrackUnquotedMangledRdnW(pszrdn: PCWSTR, cchrdn: UInt, pguid: Long, pedsmanglefor: Long): BOOL

public expect fun DsDeregisterDnsHostRecordsA(servername: PCSTR, dnsdomainname: PCSTR, domainguid: Long, dsaguid: Long, dnshostname: PCSTR): UInt

public expect fun DsDeregisterDnsHostRecordsW(servername: PCWSTR, dnsdomainname: PCWSTR, domainguid: Long, dsaguid: Long, dnshostname: PCWSTR): UInt

public expect fun DsEnumerateDomainTrustsA(servername: PCSTR, flags: UInt, domains: Long, domaincount: Long): UInt

public expect fun DsEnumerateDomainTrustsW(servername: PCWSTR, flags: UInt, domains: Long, domaincount: Long): UInt

public expect fun DsFreeDomainControllerInfoA(infolevel: UInt, cinfo: UInt, pinfo: Long)

public expect fun DsFreeDomainControllerInfoW(infolevel: UInt, cinfo: UInt, pinfo: Long)

public expect fun DsFreeNameResultA(presult: Long)

public expect fun DsFreeNameResultW(presult: Long)

public expect fun DsFreePasswordCredentials(authidentity: Long)

public expect fun DsFreeSchemaGuidMapA(pguidmap: Long)

public expect fun DsFreeSchemaGuidMapW(pguidmap: Long)

public expect fun DsFreeSpnArrayA(cspn: UInt, rpszspn: Long)

public expect fun DsFreeSpnArrayW(cspn: UInt, rpszspn: Long)

public expect fun DsGetDcCloseW(getdccontexthandle: HANDLE)

public expect fun DsGetDcNameA(computername: PCSTR, domainname: PCSTR, domainguid: Long, sitename: PCSTR, flags: UInt, domaincontrollerinfo: Long): UInt

public expect fun DsGetDcNameW(computername: PCWSTR, domainname: PCWSTR, domainguid: Long, sitename: PCWSTR, flags: UInt, domaincontrollerinfo: Long): UInt

public expect fun DsGetDcNextA(getdccontexthandle: HANDLE, sockaddresscount: Long, sockaddresses: Long, dnshostname: Long): UInt

public expect fun DsGetDcNextW(getdccontexthandle: HANDLE, sockaddresscount: Long, sockaddresses: Long, dnshostname: Long): UInt

public expect fun DsGetDcOpenA(dnsname: PCSTR, optionflags: UInt, sitename: PCSTR, domainguid: Long, dnsforestname: PCSTR, dcflags: UInt, retgetdccontext: Long): UInt

public expect fun DsGetDcOpenW(dnsname: PCWSTR, optionflags: UInt, sitename: PCWSTR, domainguid: Long, dnsforestname: PCWSTR, dcflags: UInt, retgetdccontext: Long): UInt

public expect fun DsGetDcSiteCoverageA(servername: PCSTR, entrycount: Long, sitenames: Long): UInt

public expect fun DsGetDcSiteCoverageW(servername: PCWSTR, entrycount: Long, sitenames: Long): UInt

public expect fun DsGetDomainControllerInfoA(hds: HANDLE, domainname: PCSTR, infolevel: UInt, pcout: Long, ppinfo: Long): UInt

public expect fun DsGetDomainControllerInfoW(hds: HANDLE, domainname: PCWSTR, infolevel: UInt, pcout: Long, ppinfo: Long): UInt

public expect fun DsGetForestTrustInformationW(servername: PCWSTR, trusteddomainname: PCWSTR, flags: UInt, foresttrustinfo: Long): UInt

public expect fun DsGetFriendlyClassName(pszobjectclass: PCWSTR, pszbuffer: PWSTR, cchbuffer: UInt): HRESULT

public expect fun DsGetIcon(dwflags: UInt, pszobjectclass: PCWSTR, cximage: Int, cyimage: Int): HICON

public expect fun DsGetRdnW(ppdn: Long, pcdn: Long, ppkey: Long, pckey: Long, ppval: Long, pcval: Long): UInt

public expect fun DsGetSiteNameA(computername: PCSTR, sitename: Long): UInt

public expect fun DsGetSiteNameW(computername: PCWSTR, sitename: Long): UInt

public expect fun DsGetSpnA(servicetype: DS_SPN_NAME_TYPE, serviceclass: PCSTR, servicename: PCSTR, instanceport: UShort, cinstancenames: UShort, pinstancenames: Long, pinstanceports: Long, pcspn: Long, prpszspn: Long): UInt

public expect fun DsGetSpnW(servicetype: DS_SPN_NAME_TYPE, serviceclass: PCWSTR, servicename: PCWSTR, instanceport: UShort, cinstancenames: UShort, pinstancenames: Long, pinstanceports: Long, pcspn: Long, prpszspn: Long): UInt

public expect fun DsInheritSecurityIdentityA(hds: HANDLE, flags: UInt, srcprincipal: PCSTR, dstprincipal: PCSTR): UInt

public expect fun DsInheritSecurityIdentityW(hds: HANDLE, flags: UInt, srcprincipal: PCWSTR, dstprincipal: PCWSTR): UInt

public expect fun DsIsMangledDnA(pszdn: PCSTR, edsmanglefor: DS_MANGLE_FOR): BOOL

public expect fun DsIsMangledDnW(pszdn: PCWSTR, edsmanglefor: DS_MANGLE_FOR): BOOL

public expect fun DsIsMangledRdnValueA(pszrdn: PCSTR, crdn: UInt, edsmanglefordesired: DS_MANGLE_FOR): BOOL

public expect fun DsIsMangledRdnValueW(pszrdn: PCWSTR, crdn: UInt, edsmanglefordesired: DS_MANGLE_FOR): BOOL

public expect fun DsListDomainsInSiteA(hds: HANDLE, site: PCSTR, ppdomains: Long): UInt

public expect fun DsListDomainsInSiteW(hds: HANDLE, site: PCWSTR, ppdomains: Long): UInt

public expect fun DsListInfoForServerA(hds: HANDLE, server: PCSTR, ppinfo: Long): UInt

public expect fun DsListInfoForServerW(hds: HANDLE, server: PCWSTR, ppinfo: Long): UInt

public expect fun DsListRolesA(hds: HANDLE, pproles: Long): UInt

public expect fun DsListRolesW(hds: HANDLE, pproles: Long): UInt

public expect fun DsListServersForDomainInSiteA(hds: HANDLE, domain: PCSTR, site: PCSTR, ppservers: Long): UInt

public expect fun DsListServersForDomainInSiteW(hds: HANDLE, domain: PCWSTR, site: PCWSTR, ppservers: Long): UInt

public expect fun DsListServersInSiteA(hds: HANDLE, site: PCSTR, ppservers: Long): UInt

public expect fun DsListServersInSiteW(hds: HANDLE, site: PCWSTR, ppservers: Long): UInt

public expect fun DsListSitesA(hds: HANDLE, ppsites: Long): UInt

public expect fun DsListSitesW(hds: HANDLE, ppsites: Long): UInt

public expect fun DsMakePasswordCredentialsA(user: PCSTR, domain: PCSTR, password: PCSTR, pauthidentity: Long): UInt

public expect fun DsMakePasswordCredentialsW(user: PCWSTR, domain: PCWSTR, password: PCWSTR, pauthidentity: Long): UInt

public expect fun DsMakeSpnA(serviceclass: PCSTR, servicename: PCSTR, instancename: PCSTR, instanceport: UShort, referrer: PCSTR, pcspnlength: Long, pszspn: PSTR): UInt

public expect fun DsMakeSpnW(serviceclass: PCWSTR, servicename: PCWSTR, instancename: PCWSTR, instanceport: UShort, referrer: PCWSTR, pcspnlength: Long, pszspn: PWSTR): UInt

public expect fun DsMapSchemaGuidsA(hds: HANDLE, cguids: UInt, rguids: Long, ppguidmap: Long): UInt

public expect fun DsMapSchemaGuidsW(hds: HANDLE, cguids: UInt, rguids: Long, ppguidmap: Long): UInt

public expect fun DsMergeForestTrustInformationW(domainname: PCWSTR, newforesttrustinfo: Long, oldforesttrustinfo: Long, mergedforesttrustinfo: Long): UInt

public expect fun DsQuerySitesByCostA(hds: HANDLE, pszfromsite: PCSTR, rgsztosites: Long, ctosites: UInt, dwflags: UInt, prgsiteinfo: Long): UInt

public expect fun DsQuerySitesByCostW(hds: HANDLE, pwszfromsite: PCWSTR, rgwsztosites: Long, ctosites: UInt, dwflags: UInt, prgsiteinfo: Long): UInt

public expect fun DsQuerySitesFree(rgsiteinfo: Long)

public expect fun DsQuoteRdnValueA(cunquotedrdnvaluelength: UInt, psunquotedrdnvalue: PCSTR, pcquotedrdnvaluelength: Long, psquotedrdnvalue: PSTR): UInt

public expect fun DsQuoteRdnValueW(cunquotedrdnvaluelength: UInt, psunquotedrdnvalue: PCWSTR, pcquotedrdnvaluelength: Long, psquotedrdnvalue: PWSTR): UInt

public expect fun DsRemoveDsDomainA(hds: HANDLE, domaindn: PCSTR): UInt

public expect fun DsRemoveDsDomainW(hds: HANDLE, domaindn: PCWSTR): UInt

public expect fun DsRemoveDsServerA(hds: HANDLE, serverdn: PCSTR, domaindn: PCSTR, flastdcindomain: Long, fcommit: BOOL): UInt

public expect fun DsRemoveDsServerW(hds: HANDLE, serverdn: PCWSTR, domaindn: PCWSTR, flastdcindomain: Long, fcommit: BOOL): UInt

public expect fun DsReplicaAddA(hds: HANDLE, namecontext: PCSTR, sourcedsadn: PCSTR, transportdn: PCSTR, sourcedsaaddress: PCSTR, pschedule: Long, options: UInt): UInt

public expect fun DsReplicaAddW(hds: HANDLE, namecontext: PCWSTR, sourcedsadn: PCWSTR, transportdn: PCWSTR, sourcedsaaddress: PCWSTR, pschedule: Long, options: UInt): UInt

public expect fun DsReplicaConsistencyCheck(hds: HANDLE, taskid: DS_KCC_TASKID, dwflags: UInt): UInt

public expect fun DsReplicaDelA(hds: HANDLE, namecontext: PCSTR, dsasrc: PCSTR, options: UInt): UInt

public expect fun DsReplicaDelW(hds: HANDLE, namecontext: PCWSTR, dsasrc: PCWSTR, options: UInt): UInt

public expect fun DsReplicaFreeInfo(infotype: DS_REPL_INFO_TYPE, pinfo: Long)

public expect fun DsReplicaGetInfo2W(hds: HANDLE, infotype: DS_REPL_INFO_TYPE, pszobject: PCWSTR, puuidforsourcedsaobjguid: Long, pszattributename: PCWSTR, pszvalue: PCWSTR, dwflags: UInt, dwenumerationcontext: UInt, ppinfo: Long): UInt

public expect fun DsReplicaGetInfoW(hds: HANDLE, infotype: DS_REPL_INFO_TYPE, pszobject: PCWSTR, puuidforsourcedsaobjguid: Long, ppinfo: Long): UInt

public expect fun DsReplicaModifyA(hds: HANDLE, namecontext: PCSTR, puuidsourcedsa: Long, transportdn: PCSTR, sourcedsaaddress: PCSTR, pschedule: Long, replicaflags: UInt, modifyfields: UInt, options: UInt): UInt

public expect fun DsReplicaModifyW(hds: HANDLE, namecontext: PCWSTR, puuidsourcedsa: Long, transportdn: PCWSTR, sourcedsaaddress: PCWSTR, pschedule: Long, replicaflags: UInt, modifyfields: UInt, options: UInt): UInt

public expect fun DsReplicaSyncA(hds: HANDLE, namecontext: PCSTR, puuiddsasrc: Long, options: UInt): UInt

public expect fun DsReplicaSyncAllA(hds: HANDLE, psznamecontext: PCSTR, ulflags: UInt, pfncallback: Long, pcallbackdata: Long, perrors: Long): UInt

public expect fun DsReplicaSyncAllW(hds: HANDLE, psznamecontext: PCWSTR, ulflags: UInt, pfncallback: Long, pcallbackdata: Long, perrors: Long): UInt

public expect fun DsReplicaSyncW(hds: HANDLE, namecontext: PCWSTR, puuiddsasrc: Long, options: UInt): UInt

public expect fun DsReplicaUpdateRefsA(hds: HANDLE, namecontext: PCSTR, dsadest: PCSTR, puuiddsadest: Long, options: UInt): UInt

public expect fun DsReplicaUpdateRefsW(hds: HANDLE, namecontext: PCWSTR, dsadest: PCWSTR, puuiddsadest: Long, options: UInt): UInt

public expect fun DsReplicaVerifyObjectsA(hds: HANDLE, namecontext: PCSTR, puuiddsasrc: Long, uloptions: UInt): UInt

public expect fun DsReplicaVerifyObjectsW(hds: HANDLE, namecontext: PCWSTR, puuiddsasrc: Long, uloptions: UInt): UInt

public expect fun DsRoleFreeMemory(buffer: Long)

public expect fun DsRoleGetPrimaryDomainInformation(lpserver: PCWSTR, infolevel: DSROLE_PRIMARY_DOMAIN_INFO_LEVEL, buffer: Long): UInt

public expect fun DsServerRegisterSpnA(operation: DS_SPN_WRITE_OP, serviceclass: PCSTR, userobjectdn: PCSTR): UInt

public expect fun DsServerRegisterSpnW(operation: DS_SPN_WRITE_OP, serviceclass: PCWSTR, userobjectdn: PCWSTR): UInt

public expect fun DsUnBindA(phds: Long): UInt

public expect fun DsUnBindW(phds: Long): UInt

public expect fun DsUnquoteRdnValueA(cquotedrdnvaluelength: UInt, psquotedrdnvalue: PCSTR, pcunquotedrdnvaluelength: Long, psunquotedrdnvalue: PSTR): UInt

public expect fun DsUnquoteRdnValueW(cquotedrdnvaluelength: UInt, psquotedrdnvalue: PCWSTR, pcunquotedrdnvaluelength: Long, psunquotedrdnvalue: PWSTR): UInt

public expect fun DsValidateSubnetNameA(subnetname: PCSTR): UInt

public expect fun DsValidateSubnetNameW(subnetname: PCWSTR): UInt

public expect fun DsWriteAccountSpnA(hds: HANDLE, operation: DS_SPN_WRITE_OP, pszaccount: PCSTR, cspn: UInt, rpszspn: Long): UInt

public expect fun DsWriteAccountSpnW(hds: HANDLE, operation: DS_SPN_WRITE_OP, pszaccount: PCWSTR, cspn: UInt, rpszspn: Long): UInt

public expect fun FreeADsMem(pmem: Long): BOOL

public expect fun FreeADsStr(pstr: PCWSTR): BOOL

public expect fun PropVariantToAdsType(pvariant: Long, dwnumvariant: UInt, ppadsvalues: Long, pdwnumvalues: Long): HRESULT

public expect fun ReallocADsMem(poldmem: Long, cbold: UInt, cbnew: UInt): Long

public expect fun ReallocADsStr(ppstr: Long, pstr: PCWSTR): BOOL

public expect fun SecurityDescriptorToBinarySD(vvarsecdes: VARIANT, ppsecuritydescriptor: Long, pdwsdlength: Long, pszservername: PCWSTR, username: PCWSTR, password: PCWSTR, dwflags: UInt): HRESULT
