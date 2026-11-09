@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

public actual fun ADsBuildEnumerator(padscontainer: Long, ppenumvariant: Long): HRESULT =
    0

public actual fun ADsBuildVarArrayInt(lpdwobjecttypes: Long, dwobjecttypes: UInt, pvar: Long): HRESULT =
    0

public actual fun ADsBuildVarArrayStr(lpppathnames: Long, dwpathnames: UInt, pvar: Long): HRESULT =
    0

public actual fun ADsDecodeBinaryData(szsrcdata: PCWSTR, ppbdestdata: Long, pdwdestlen: Long): HRESULT =
    0

public actual fun ADsEncodeBinaryData(pbsrcdata: Long, dwsrclen: UInt, ppszdestdata: Long): HRESULT =
    0

public actual fun ADsEnumerateNext(penumvariant: Long, celements: UInt, pvar: Long, pcelementsfetched: Long): HRESULT =
    0

public actual fun ADsFreeEnumerator(penumvariant: Long): HRESULT =
    0

public actual fun ADsGetLastError(lperror: Long, lperrorbuf: PWSTR, dwerrorbuflen: UInt, lpnamebuf: PWSTR, dwnamebuflen: UInt): HRESULT =
    0

public actual fun ADsGetObject(lpszpathname: PCWSTR, riid: Long, ppobject: Long): HRESULT =
    0

public actual fun ADsOpenObject(lpszpathname: PCWSTR, lpszusername: PCWSTR, lpszpassword: PCWSTR, dwreserved: ADS_AUTHENTICATION_ENUM, riid: Long, ppobject: Long): HRESULT =
    0

public actual fun ADsPropCheckIfWritable(pwzattr: PCWSTR, pwritableattrs: Long): BOOL =
    0

public actual fun ADsPropCreateNotifyObj(pappthddataobj: Long, pwzadsobjname: PCWSTR, phnotifyobj: Long): HRESULT =
    0

public actual fun ADsPropGetInitInfo(hnotifyobj: HWND, pinitparams: Long): BOOL =
    0

public actual fun ADsPropSendErrorMessage(hnotifyobj: HWND, perror: Long): BOOL =
    0

public actual fun ADsPropSetHwnd(hnotifyobj: HWND, hpage: HWND): BOOL =
    0

public actual fun ADsPropSetHwndWithTitle(hnotifyobj: HWND, hpage: HWND, ptztitle: Long): BOOL =
    0

public actual fun ADsPropShowErrorDialog(hnotifyobj: HWND, hpage: HWND): BOOL =
    0

public actual fun ADsSetLastError(dwerr: UInt, pszerror: PCWSTR, pszprovider: PCWSTR) {
}

public actual fun AdsFreeAdsValues(padsvalues: Long, dwnumvalues: UInt) {
}

public actual fun AdsTypeToPropVariant(padsvalues: Long, dwnumvalues: UInt, pvariant: Long): HRESULT =
    0

public actual fun AllocADsMem(cb: UInt): Long =
    0L

public actual fun AllocADsStr(pstr: PCWSTR): PWSTR =
    0L

public actual fun BinarySDToSecurityDescriptor(psecuritydescriptor: PSECURITY_DESCRIPTOR, pvarsec: Long, pszservername: PCWSTR, username: PCWSTR, password: PCWSTR, dwflags: UInt): HRESULT =
    0

public actual fun DsAddSidHistoryA(hds: HANDLE, flags: UInt, srcdomain: PCSTR, srcprincipal: PCSTR, srcdomaincontroller: PCSTR, srcdomaincreds: Long, dstdomain: PCSTR, dstprincipal: PCSTR): UInt =
    0u

public actual fun DsAddSidHistoryW(hds: HANDLE, flags: UInt, srcdomain: PCWSTR, srcprincipal: PCWSTR, srcdomaincontroller: PCWSTR, srcdomaincreds: Long, dstdomain: PCWSTR, dstprincipal: PCWSTR): UInt =
    0u

public actual fun DsAddressToSiteNamesA(computername: PCSTR, entrycount: UInt, socketaddresses: Long, sitenames: Long): UInt =
    0u

public actual fun DsAddressToSiteNamesExA(computername: PCSTR, entrycount: UInt, socketaddresses: Long, sitenames: Long, subnetnames: Long): UInt =
    0u

public actual fun DsAddressToSiteNamesExW(computername: PCWSTR, entrycount: UInt, socketaddresses: Long, sitenames: Long, subnetnames: Long): UInt =
    0u

public actual fun DsAddressToSiteNamesW(computername: PCWSTR, entrycount: UInt, socketaddresses: Long, sitenames: Long): UInt =
    0u

public actual fun DsBindA(domaincontrollername: PCSTR, dnsdomainname: PCSTR, phds: Long): UInt =
    0u

public actual fun DsBindByInstanceA(servername: PCSTR, annotation: PCSTR, instanceguid: Long, dnsdomainname: PCSTR, authidentity: Long, serviceprincipalname: PCSTR, bindflags: UInt, phds: Long): UInt =
    0u

public actual fun DsBindByInstanceW(servername: PCWSTR, annotation: PCWSTR, instanceguid: Long, dnsdomainname: PCWSTR, authidentity: Long, serviceprincipalname: PCWSTR, bindflags: UInt, phds: Long): UInt =
    0u

public actual fun DsBindToISTGA(sitename: PCSTR, phds: Long): UInt =
    0u

public actual fun DsBindToISTGW(sitename: PCWSTR, phds: Long): UInt =
    0u

public actual fun DsBindW(domaincontrollername: PCWSTR, dnsdomainname: PCWSTR, phds: Long): UInt =
    0u

public actual fun DsBindWithCredA(domaincontrollername: PCSTR, dnsdomainname: PCSTR, authidentity: Long, phds: Long): UInt =
    0u

public actual fun DsBindWithCredW(domaincontrollername: PCWSTR, dnsdomainname: PCWSTR, authidentity: Long, phds: Long): UInt =
    0u

public actual fun DsBindWithSpnA(domaincontrollername: PCSTR, dnsdomainname: PCSTR, authidentity: Long, serviceprincipalname: PCSTR, phds: Long): UInt =
    0u

public actual fun DsBindWithSpnExA(domaincontrollername: PCSTR, dnsdomainname: PCSTR, authidentity: Long, serviceprincipalname: PCSTR, bindflags: UInt, phds: Long): UInt =
    0u

public actual fun DsBindWithSpnExW(domaincontrollername: PCWSTR, dnsdomainname: PCWSTR, authidentity: Long, serviceprincipalname: PCWSTR, bindflags: UInt, phds: Long): UInt =
    0u

public actual fun DsBindWithSpnW(domaincontrollername: PCWSTR, dnsdomainname: PCWSTR, authidentity: Long, serviceprincipalname: PCWSTR, phds: Long): UInt =
    0u

public actual fun DsBindingSetTimeout(hds: HANDLE, ctimeoutsecs: UInt): UInt =
    0u

public actual fun DsBrowseForContainerA(pinfo: Long): Int =
    0

public actual fun DsBrowseForContainerW(pinfo: Long): Int =
    0

public actual fun DsClientMakeSpnForTargetServerA(serviceclass: PCSTR, servicename: PCSTR, pcspnlength: Long, pszspn: PSTR): UInt =
    0u

public actual fun DsClientMakeSpnForTargetServerW(serviceclass: PCWSTR, servicename: PCWSTR, pcspnlength: Long, pszspn: PWSTR): UInt =
    0u

public actual fun DsCrackNamesA(hds: HANDLE, flags: DS_NAME_FLAGS, formatoffered: DS_NAME_FORMAT, formatdesired: DS_NAME_FORMAT, cnames: UInt, rpnames: Long, ppresult: Long): UInt =
    0u

public actual fun DsCrackNamesW(hds: HANDLE, flags: DS_NAME_FLAGS, formatoffered: DS_NAME_FORMAT, formatdesired: DS_NAME_FORMAT, cnames: UInt, rpnames: Long, ppresult: Long): UInt =
    0u

public actual fun DsCrackSpn2A(pszspn: PCSTR, cspn: UInt, pcserviceclass: Long, serviceclass: PSTR, pcservicename: Long, servicename: PSTR, pcinstancename: Long, instancename: PSTR, pinstanceport: Long): UInt =
    0u

public actual fun DsCrackSpn2W(pszspn: PCWSTR, cspn: UInt, pcserviceclass: Long, serviceclass: PWSTR, pcservicename: Long, servicename: PWSTR, pcinstancename: Long, instancename: PWSTR, pinstanceport: Long): UInt =
    0u

public actual fun DsCrackSpn3W(pszspn: PCWSTR, cspn: UInt, pchostname: Long, hostname: PWSTR, pcinstancename: Long, instancename: PWSTR, pportnumber: Long, pcdomainname: Long, domainname: PWSTR, pcrealmname: Long, realmname: PWSTR): UInt =
    0u

public actual fun DsCrackSpn4W(pszspn: PCWSTR, cspn: UInt, pchostname: Long, hostname: PWSTR, pcinstancename: Long, instancename: PWSTR, pcportname: Long, portname: PWSTR, pcdomainname: Long, domainname: PWSTR, pcrealmname: Long, realmname: PWSTR): UInt =
    0u

public actual fun DsCrackSpnA(pszspn: PCSTR, pcserviceclass: Long, serviceclass: PSTR, pcservicename: Long, servicename: PSTR, pcinstancename: Long, instancename: PSTR, pinstanceport: Long): UInt =
    0u

public actual fun DsCrackSpnW(pszspn: PCWSTR, pcserviceclass: Long, serviceclass: PWSTR, pcservicename: Long, servicename: PWSTR, pcinstancename: Long, instancename: PWSTR, pinstanceport: Long): UInt =
    0u

public actual fun DsCrackUnquotedMangledRdnA(pszrdn: PCSTR, cchrdn: UInt, pguid: Long, pedsmanglefor: Long): BOOL =
    0

public actual fun DsCrackUnquotedMangledRdnW(pszrdn: PCWSTR, cchrdn: UInt, pguid: Long, pedsmanglefor: Long): BOOL =
    0

public actual fun DsDeregisterDnsHostRecordsA(servername: PCSTR, dnsdomainname: PCSTR, domainguid: Long, dsaguid: Long, dnshostname: PCSTR): UInt =
    0u

public actual fun DsDeregisterDnsHostRecordsW(servername: PCWSTR, dnsdomainname: PCWSTR, domainguid: Long, dsaguid: Long, dnshostname: PCWSTR): UInt =
    0u

public actual fun DsEnumerateDomainTrustsA(servername: PCSTR, flags: UInt, domains: Long, domaincount: Long): UInt =
    0u

public actual fun DsEnumerateDomainTrustsW(servername: PCWSTR, flags: UInt, domains: Long, domaincount: Long): UInt =
    0u

public actual fun DsFreeDomainControllerInfoA(infolevel: UInt, cinfo: UInt, pinfo: Long) {
}

public actual fun DsFreeDomainControllerInfoW(infolevel: UInt, cinfo: UInt, pinfo: Long) {
}

public actual fun DsFreeNameResultA(presult: Long) {
}

public actual fun DsFreeNameResultW(presult: Long) {
}

public actual fun DsFreePasswordCredentials(authidentity: Long) {
}

public actual fun DsFreeSchemaGuidMapA(pguidmap: Long) {
}

public actual fun DsFreeSchemaGuidMapW(pguidmap: Long) {
}

public actual fun DsFreeSpnArrayA(cspn: UInt, rpszspn: Long) {
}

public actual fun DsFreeSpnArrayW(cspn: UInt, rpszspn: Long) {
}

public actual fun DsGetDcCloseW(getdccontexthandle: HANDLE) {
}

public actual fun DsGetDcNameA(computername: PCSTR, domainname: PCSTR, domainguid: Long, sitename: PCSTR, flags: UInt, domaincontrollerinfo: Long): UInt =
    0u

public actual fun DsGetDcNameW(computername: PCWSTR, domainname: PCWSTR, domainguid: Long, sitename: PCWSTR, flags: UInt, domaincontrollerinfo: Long): UInt =
    0u

public actual fun DsGetDcNextA(getdccontexthandle: HANDLE, sockaddresscount: Long, sockaddresses: Long, dnshostname: Long): UInt =
    0u

public actual fun DsGetDcNextW(getdccontexthandle: HANDLE, sockaddresscount: Long, sockaddresses: Long, dnshostname: Long): UInt =
    0u

public actual fun DsGetDcOpenA(dnsname: PCSTR, optionflags: UInt, sitename: PCSTR, domainguid: Long, dnsforestname: PCSTR, dcflags: UInt, retgetdccontext: Long): UInt =
    0u

public actual fun DsGetDcOpenW(dnsname: PCWSTR, optionflags: UInt, sitename: PCWSTR, domainguid: Long, dnsforestname: PCWSTR, dcflags: UInt, retgetdccontext: Long): UInt =
    0u

public actual fun DsGetDcSiteCoverageA(servername: PCSTR, entrycount: Long, sitenames: Long): UInt =
    0u

public actual fun DsGetDcSiteCoverageW(servername: PCWSTR, entrycount: Long, sitenames: Long): UInt =
    0u

public actual fun DsGetDomainControllerInfoA(hds: HANDLE, domainname: PCSTR, infolevel: UInt, pcout: Long, ppinfo: Long): UInt =
    0u

public actual fun DsGetDomainControllerInfoW(hds: HANDLE, domainname: PCWSTR, infolevel: UInt, pcout: Long, ppinfo: Long): UInt =
    0u

public actual fun DsGetForestTrustInformationW(servername: PCWSTR, trusteddomainname: PCWSTR, flags: UInt, foresttrustinfo: Long): UInt =
    0u

public actual fun DsGetFriendlyClassName(pszobjectclass: PCWSTR, pszbuffer: PWSTR, cchbuffer: UInt): HRESULT =
    0

public actual fun DsGetIcon(dwflags: UInt, pszobjectclass: PCWSTR, cximage: Int, cyimage: Int): HICON =
    0L

public actual fun DsGetRdnW(ppdn: Long, pcdn: Long, ppkey: Long, pckey: Long, ppval: Long, pcval: Long): UInt =
    0u

public actual fun DsGetSiteNameA(computername: PCSTR, sitename: Long): UInt =
    0u

public actual fun DsGetSiteNameW(computername: PCWSTR, sitename: Long): UInt =
    0u

public actual fun DsGetSpnA(servicetype: DS_SPN_NAME_TYPE, serviceclass: PCSTR, servicename: PCSTR, instanceport: UShort, cinstancenames: UShort, pinstancenames: Long, pinstanceports: Long, pcspn: Long, prpszspn: Long): UInt =
    0u

public actual fun DsGetSpnW(servicetype: DS_SPN_NAME_TYPE, serviceclass: PCWSTR, servicename: PCWSTR, instanceport: UShort, cinstancenames: UShort, pinstancenames: Long, pinstanceports: Long, pcspn: Long, prpszspn: Long): UInt =
    0u

public actual fun DsInheritSecurityIdentityA(hds: HANDLE, flags: UInt, srcprincipal: PCSTR, dstprincipal: PCSTR): UInt =
    0u

public actual fun DsInheritSecurityIdentityW(hds: HANDLE, flags: UInt, srcprincipal: PCWSTR, dstprincipal: PCWSTR): UInt =
    0u

public actual fun DsIsMangledDnA(pszdn: PCSTR, edsmanglefor: DS_MANGLE_FOR): BOOL =
    0

public actual fun DsIsMangledDnW(pszdn: PCWSTR, edsmanglefor: DS_MANGLE_FOR): BOOL =
    0

public actual fun DsIsMangledRdnValueA(pszrdn: PCSTR, crdn: UInt, edsmanglefordesired: DS_MANGLE_FOR): BOOL =
    0

public actual fun DsIsMangledRdnValueW(pszrdn: PCWSTR, crdn: UInt, edsmanglefordesired: DS_MANGLE_FOR): BOOL =
    0

public actual fun DsListDomainsInSiteA(hds: HANDLE, site: PCSTR, ppdomains: Long): UInt =
    0u

public actual fun DsListDomainsInSiteW(hds: HANDLE, site: PCWSTR, ppdomains: Long): UInt =
    0u

public actual fun DsListInfoForServerA(hds: HANDLE, server: PCSTR, ppinfo: Long): UInt =
    0u

public actual fun DsListInfoForServerW(hds: HANDLE, server: PCWSTR, ppinfo: Long): UInt =
    0u

public actual fun DsListRolesA(hds: HANDLE, pproles: Long): UInt =
    0u

public actual fun DsListRolesW(hds: HANDLE, pproles: Long): UInt =
    0u

public actual fun DsListServersForDomainInSiteA(hds: HANDLE, domain: PCSTR, site: PCSTR, ppservers: Long): UInt =
    0u

public actual fun DsListServersForDomainInSiteW(hds: HANDLE, domain: PCWSTR, site: PCWSTR, ppservers: Long): UInt =
    0u

public actual fun DsListServersInSiteA(hds: HANDLE, site: PCSTR, ppservers: Long): UInt =
    0u

public actual fun DsListServersInSiteW(hds: HANDLE, site: PCWSTR, ppservers: Long): UInt =
    0u

public actual fun DsListSitesA(hds: HANDLE, ppsites: Long): UInt =
    0u

public actual fun DsListSitesW(hds: HANDLE, ppsites: Long): UInt =
    0u

public actual fun DsMakePasswordCredentialsA(user: PCSTR, domain: PCSTR, password: PCSTR, pauthidentity: Long): UInt =
    0u

public actual fun DsMakePasswordCredentialsW(user: PCWSTR, domain: PCWSTR, password: PCWSTR, pauthidentity: Long): UInt =
    0u

public actual fun DsMakeSpnA(serviceclass: PCSTR, servicename: PCSTR, instancename: PCSTR, instanceport: UShort, referrer: PCSTR, pcspnlength: Long, pszspn: PSTR): UInt =
    0u

public actual fun DsMakeSpnW(serviceclass: PCWSTR, servicename: PCWSTR, instancename: PCWSTR, instanceport: UShort, referrer: PCWSTR, pcspnlength: Long, pszspn: PWSTR): UInt =
    0u

public actual fun DsMapSchemaGuidsA(hds: HANDLE, cguids: UInt, rguids: Long, ppguidmap: Long): UInt =
    0u

public actual fun DsMapSchemaGuidsW(hds: HANDLE, cguids: UInt, rguids: Long, ppguidmap: Long): UInt =
    0u

public actual fun DsMergeForestTrustInformationW(domainname: PCWSTR, newforesttrustinfo: Long, oldforesttrustinfo: Long, mergedforesttrustinfo: Long): UInt =
    0u

public actual fun DsQuerySitesByCostA(hds: HANDLE, pszfromsite: PCSTR, rgsztosites: Long, ctosites: UInt, dwflags: UInt, prgsiteinfo: Long): UInt =
    0u

public actual fun DsQuerySitesByCostW(hds: HANDLE, pwszfromsite: PCWSTR, rgwsztosites: Long, ctosites: UInt, dwflags: UInt, prgsiteinfo: Long): UInt =
    0u

public actual fun DsQuerySitesFree(rgsiteinfo: Long) {
}

public actual fun DsQuoteRdnValueA(cunquotedrdnvaluelength: UInt, psunquotedrdnvalue: PCSTR, pcquotedrdnvaluelength: Long, psquotedrdnvalue: PSTR): UInt =
    0u

public actual fun DsQuoteRdnValueW(cunquotedrdnvaluelength: UInt, psunquotedrdnvalue: PCWSTR, pcquotedrdnvaluelength: Long, psquotedrdnvalue: PWSTR): UInt =
    0u

public actual fun DsRemoveDsDomainA(hds: HANDLE, domaindn: PCSTR): UInt =
    0u

public actual fun DsRemoveDsDomainW(hds: HANDLE, domaindn: PCWSTR): UInt =
    0u

public actual fun DsRemoveDsServerA(hds: HANDLE, serverdn: PCSTR, domaindn: PCSTR, flastdcindomain: Long, fcommit: BOOL): UInt =
    0u

public actual fun DsRemoveDsServerW(hds: HANDLE, serverdn: PCWSTR, domaindn: PCWSTR, flastdcindomain: Long, fcommit: BOOL): UInt =
    0u

public actual fun DsReplicaAddA(hds: HANDLE, namecontext: PCSTR, sourcedsadn: PCSTR, transportdn: PCSTR, sourcedsaaddress: PCSTR, pschedule: Long, options: UInt): UInt =
    0u

public actual fun DsReplicaAddW(hds: HANDLE, namecontext: PCWSTR, sourcedsadn: PCWSTR, transportdn: PCWSTR, sourcedsaaddress: PCWSTR, pschedule: Long, options: UInt): UInt =
    0u

public actual fun DsReplicaConsistencyCheck(hds: HANDLE, taskid: DS_KCC_TASKID, dwflags: UInt): UInt =
    0u

public actual fun DsReplicaDelA(hds: HANDLE, namecontext: PCSTR, dsasrc: PCSTR, options: UInt): UInt =
    0u

public actual fun DsReplicaDelW(hds: HANDLE, namecontext: PCWSTR, dsasrc: PCWSTR, options: UInt): UInt =
    0u

public actual fun DsReplicaFreeInfo(infotype: DS_REPL_INFO_TYPE, pinfo: Long) {
}

public actual fun DsReplicaGetInfo2W(hds: HANDLE, infotype: DS_REPL_INFO_TYPE, pszobject: PCWSTR, puuidforsourcedsaobjguid: Long, pszattributename: PCWSTR, pszvalue: PCWSTR, dwflags: UInt, dwenumerationcontext: UInt, ppinfo: Long): UInt =
    0u

public actual fun DsReplicaGetInfoW(hds: HANDLE, infotype: DS_REPL_INFO_TYPE, pszobject: PCWSTR, puuidforsourcedsaobjguid: Long, ppinfo: Long): UInt =
    0u

public actual fun DsReplicaModifyA(hds: HANDLE, namecontext: PCSTR, puuidsourcedsa: Long, transportdn: PCSTR, sourcedsaaddress: PCSTR, pschedule: Long, replicaflags: UInt, modifyfields: UInt, options: UInt): UInt =
    0u

public actual fun DsReplicaModifyW(hds: HANDLE, namecontext: PCWSTR, puuidsourcedsa: Long, transportdn: PCWSTR, sourcedsaaddress: PCWSTR, pschedule: Long, replicaflags: UInt, modifyfields: UInt, options: UInt): UInt =
    0u

public actual fun DsReplicaSyncA(hds: HANDLE, namecontext: PCSTR, puuiddsasrc: Long, options: UInt): UInt =
    0u

public actual fun DsReplicaSyncAllA(hds: HANDLE, psznamecontext: PCSTR, ulflags: UInt, pfncallback: Long, pcallbackdata: Long, perrors: Long): UInt =
    0u

public actual fun DsReplicaSyncAllW(hds: HANDLE, psznamecontext: PCWSTR, ulflags: UInt, pfncallback: Long, pcallbackdata: Long, perrors: Long): UInt =
    0u

public actual fun DsReplicaSyncW(hds: HANDLE, namecontext: PCWSTR, puuiddsasrc: Long, options: UInt): UInt =
    0u

public actual fun DsReplicaUpdateRefsA(hds: HANDLE, namecontext: PCSTR, dsadest: PCSTR, puuiddsadest: Long, options: UInt): UInt =
    0u

public actual fun DsReplicaUpdateRefsW(hds: HANDLE, namecontext: PCWSTR, dsadest: PCWSTR, puuiddsadest: Long, options: UInt): UInt =
    0u

public actual fun DsReplicaVerifyObjectsA(hds: HANDLE, namecontext: PCSTR, puuiddsasrc: Long, uloptions: UInt): UInt =
    0u

public actual fun DsReplicaVerifyObjectsW(hds: HANDLE, namecontext: PCWSTR, puuiddsasrc: Long, uloptions: UInt): UInt =
    0u

public actual fun DsRoleFreeMemory(buffer: Long) {
}

public actual fun DsRoleGetPrimaryDomainInformation(lpserver: PCWSTR, infolevel: DSROLE_PRIMARY_DOMAIN_INFO_LEVEL, buffer: Long): UInt =
    0u

public actual fun DsServerRegisterSpnA(operation: DS_SPN_WRITE_OP, serviceclass: PCSTR, userobjectdn: PCSTR): UInt =
    0u

public actual fun DsServerRegisterSpnW(operation: DS_SPN_WRITE_OP, serviceclass: PCWSTR, userobjectdn: PCWSTR): UInt =
    0u

public actual fun DsUnBindA(phds: Long): UInt =
    0u

public actual fun DsUnBindW(phds: Long): UInt =
    0u

public actual fun DsUnquoteRdnValueA(cquotedrdnvaluelength: UInt, psquotedrdnvalue: PCSTR, pcunquotedrdnvaluelength: Long, psunquotedrdnvalue: PSTR): UInt =
    0u

public actual fun DsUnquoteRdnValueW(cquotedrdnvaluelength: UInt, psquotedrdnvalue: PCWSTR, pcunquotedrdnvaluelength: Long, psunquotedrdnvalue: PWSTR): UInt =
    0u

public actual fun DsValidateSubnetNameA(subnetname: PCSTR): UInt =
    0u

public actual fun DsValidateSubnetNameW(subnetname: PCWSTR): UInt =
    0u

public actual fun DsWriteAccountSpnA(hds: HANDLE, operation: DS_SPN_WRITE_OP, pszaccount: PCSTR, cspn: UInt, rpszspn: Long): UInt =
    0u

public actual fun DsWriteAccountSpnW(hds: HANDLE, operation: DS_SPN_WRITE_OP, pszaccount: PCWSTR, cspn: UInt, rpszspn: Long): UInt =
    0u

public actual fun FreeADsMem(pmem: Long): BOOL =
    0

public actual fun FreeADsStr(pstr: PCWSTR): BOOL =
    0

public actual fun PropVariantToAdsType(pvariant: Long, dwnumvariant: UInt, ppadsvalues: Long, pdwnumvalues: Long): HRESULT =
    0

public actual fun ReallocADsMem(poldmem: Long, cbold: UInt, cbnew: UInt): Long =
    0L

public actual fun ReallocADsStr(ppstr: Long, pstr: PCWSTR): BOOL =
    0

public actual fun SecurityDescriptorToBinarySD(vvarsecdes: VARIANT, ppsecuritydescriptor: Long, pdwsdlength: Long, pszservername: PCWSTR, username: PCWSTR, password: PCWSTR, dwflags: UInt): HRESULT =
    0
