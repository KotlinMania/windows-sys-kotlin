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

private object WindowsWin32NetworkingActivedirectoryJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_ADsBuildEnumerator(padscontainer: Long, ppenumvariant: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_ADsBuildVarArrayInt(lpdwobjecttypes: Long, dwobjecttypes: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_ADsBuildVarArrayStr(lpppathnames: Long, dwpathnames: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_ADsDecodeBinaryData(szsrcdata: Long, ppbdestdata: Long, pdwdestlen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_ADsEncodeBinaryData(pbsrcdata: Long, dwsrclen: Int, ppszdestdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_ADsEnumerateNext(penumvariant: Long, celements: Int, pvar: Long, pcelementsfetched: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_ADsFreeEnumerator(penumvariant: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_ADsGetLastError(lperror: Long, lperrorbuf: Long, dwerrorbuflen: Int, lpnamebuf: Long, dwnamebuflen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_ADsGetObject(lpszpathname: Long, riid: Long, ppobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_ADsOpenObject(lpszpathname: Long, lpszusername: Long, lpszpassword: Long, dwreserved: Int, riid: Long, ppobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_ADsPropCheckIfWritable(pwzattr: Long, pwritableattrs: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_ADsPropCreateNotifyObj(pappthddataobj: Long, pwzadsobjname: Long, phnotifyobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_ADsPropGetInitInfo(hnotifyobj: Long, pinitparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_ADsPropSendErrorMessage(hnotifyobj: Long, perror: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_ADsPropSetHwnd(hnotifyobj: Long, hpage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_ADsPropSetHwndWithTitle(hnotifyobj: Long, hpage: Long, ptztitle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_ADsPropShowErrorDialog(hnotifyobj: Long, hpage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_ADsSetLastError(dwerr: Int, pszerror: Long, pszprovider: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_AdsFreeAdsValues(padsvalues: Long, dwnumvalues: Int)

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_AdsTypeToPropVariant(padsvalues: Long, dwnumvalues: Int, pvariant: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_AllocADsMem(cb: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_AllocADsStr(pstr: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_BinarySDToSecurityDescriptor(psecuritydescriptor: Long, pvarsec: Long, pszservername: Long, username: Long, password: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsAddSidHistoryA(hds: Long, flags: Int, srcdomain: Long, srcprincipal: Long, srcdomaincontroller: Long, srcdomaincreds: Long, dstdomain: Long, dstprincipal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsAddSidHistoryW(hds: Long, flags: Int, srcdomain: Long, srcprincipal: Long, srcdomaincontroller: Long, srcdomaincreds: Long, dstdomain: Long, dstprincipal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsAddressToSiteNamesA(computername: Long, entrycount: Int, socketaddresses: Long, sitenames: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsAddressToSiteNamesExA(computername: Long, entrycount: Int, socketaddresses: Long, sitenames: Long, subnetnames: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsAddressToSiteNamesExW(computername: Long, entrycount: Int, socketaddresses: Long, sitenames: Long, subnetnames: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsAddressToSiteNamesW(computername: Long, entrycount: Int, socketaddresses: Long, sitenames: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsBindA(domaincontrollername: Long, dnsdomainname: Long, phds: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsBindByInstanceA(servername: Long, annotation: Long, instanceguid: Long, dnsdomainname: Long, authidentity: Long, serviceprincipalname: Long, bindflags: Int, phds: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsBindByInstanceW(servername: Long, annotation: Long, instanceguid: Long, dnsdomainname: Long, authidentity: Long, serviceprincipalname: Long, bindflags: Int, phds: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsBindToISTGA(sitename: Long, phds: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsBindToISTGW(sitename: Long, phds: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsBindW(domaincontrollername: Long, dnsdomainname: Long, phds: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsBindWithCredA(domaincontrollername: Long, dnsdomainname: Long, authidentity: Long, phds: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsBindWithCredW(domaincontrollername: Long, dnsdomainname: Long, authidentity: Long, phds: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsBindWithSpnA(domaincontrollername: Long, dnsdomainname: Long, authidentity: Long, serviceprincipalname: Long, phds: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsBindWithSpnExA(domaincontrollername: Long, dnsdomainname: Long, authidentity: Long, serviceprincipalname: Long, bindflags: Int, phds: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsBindWithSpnExW(domaincontrollername: Long, dnsdomainname: Long, authidentity: Long, serviceprincipalname: Long, bindflags: Int, phds: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsBindWithSpnW(domaincontrollername: Long, dnsdomainname: Long, authidentity: Long, serviceprincipalname: Long, phds: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsBindingSetTimeout(hds: Long, ctimeoutsecs: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsBrowseForContainerA(pinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsBrowseForContainerW(pinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsClientMakeSpnForTargetServerA(serviceclass: Long, servicename: Long, pcspnlength: Long, pszspn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsClientMakeSpnForTargetServerW(serviceclass: Long, servicename: Long, pcspnlength: Long, pszspn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsCrackNamesA(hds: Long, flags: Int, formatoffered: Int, formatdesired: Int, cnames: Int, rpnames: Long, ppresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsCrackNamesW(hds: Long, flags: Int, formatoffered: Int, formatdesired: Int, cnames: Int, rpnames: Long, ppresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsCrackSpn2A(pszspn: Long, cspn: Int, pcserviceclass: Long, serviceclass: Long, pcservicename: Long, servicename: Long, pcinstancename: Long, instancename: Long, pinstanceport: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsCrackSpn2W(pszspn: Long, cspn: Int, pcserviceclass: Long, serviceclass: Long, pcservicename: Long, servicename: Long, pcinstancename: Long, instancename: Long, pinstanceport: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsCrackSpn3W(pszspn: Long, cspn: Int, pchostname: Long, hostname: Long, pcinstancename: Long, instancename: Long, pportnumber: Long, pcdomainname: Long, domainname: Long, pcrealmname: Long, realmname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsCrackSpn4W(pszspn: Long, cspn: Int, pchostname: Long, hostname: Long, pcinstancename: Long, instancename: Long, pcportname: Long, portname: Long, pcdomainname: Long, domainname: Long, pcrealmname: Long, realmname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsCrackSpnA(pszspn: Long, pcserviceclass: Long, serviceclass: Long, pcservicename: Long, servicename: Long, pcinstancename: Long, instancename: Long, pinstanceport: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsCrackSpnW(pszspn: Long, pcserviceclass: Long, serviceclass: Long, pcservicename: Long, servicename: Long, pcinstancename: Long, instancename: Long, pinstanceport: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsCrackUnquotedMangledRdnA(pszrdn: Long, cchrdn: Int, pguid: Long, pedsmanglefor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsCrackUnquotedMangledRdnW(pszrdn: Long, cchrdn: Int, pguid: Long, pedsmanglefor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsDeregisterDnsHostRecordsA(servername: Long, dnsdomainname: Long, domainguid: Long, dsaguid: Long, dnshostname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsDeregisterDnsHostRecordsW(servername: Long, dnsdomainname: Long, domainguid: Long, dsaguid: Long, dnshostname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsEnumerateDomainTrustsA(servername: Long, flags: Int, domains: Long, domaincount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsEnumerateDomainTrustsW(servername: Long, flags: Int, domains: Long, domaincount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsFreeDomainControllerInfoA(infolevel: Int, cinfo: Int, pinfo: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsFreeDomainControllerInfoW(infolevel: Int, cinfo: Int, pinfo: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsFreeNameResultA(presult: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsFreeNameResultW(presult: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsFreePasswordCredentials(authidentity: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsFreeSchemaGuidMapA(pguidmap: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsFreeSchemaGuidMapW(pguidmap: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsFreeSpnArrayA(cspn: Int, rpszspn: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsFreeSpnArrayW(cspn: Int, rpszspn: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsGetDcCloseW(getdccontexthandle: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsGetDcNameA(computername: Long, domainname: Long, domainguid: Long, sitename: Long, flags: Int, domaincontrollerinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsGetDcNameW(computername: Long, domainname: Long, domainguid: Long, sitename: Long, flags: Int, domaincontrollerinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsGetDcNextA(getdccontexthandle: Long, sockaddresscount: Long, sockaddresses: Long, dnshostname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsGetDcNextW(getdccontexthandle: Long, sockaddresscount: Long, sockaddresses: Long, dnshostname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsGetDcOpenA(dnsname: Long, optionflags: Int, sitename: Long, domainguid: Long, dnsforestname: Long, dcflags: Int, retgetdccontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsGetDcOpenW(dnsname: Long, optionflags: Int, sitename: Long, domainguid: Long, dnsforestname: Long, dcflags: Int, retgetdccontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsGetDcSiteCoverageA(servername: Long, entrycount: Long, sitenames: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsGetDcSiteCoverageW(servername: Long, entrycount: Long, sitenames: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsGetDomainControllerInfoA(hds: Long, domainname: Long, infolevel: Int, pcout: Long, ppinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsGetDomainControllerInfoW(hds: Long, domainname: Long, infolevel: Int, pcout: Long, ppinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsGetForestTrustInformationW(servername: Long, trusteddomainname: Long, flags: Int, foresttrustinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsGetFriendlyClassName(pszobjectclass: Long, pszbuffer: Long, cchbuffer: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsGetIcon(dwflags: Int, pszobjectclass: Long, cximage: Int, cyimage: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsGetRdnW(ppdn: Long, pcdn: Long, ppkey: Long, pckey: Long, ppval: Long, pcval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsGetSiteNameA(computername: Long, sitename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsGetSiteNameW(computername: Long, sitename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsGetSpnA(servicetype: Int, serviceclass: Long, servicename: Long, instanceport: Short, cinstancenames: Short, pinstancenames: Long, pinstanceports: Long, pcspn: Long, prpszspn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsGetSpnW(servicetype: Int, serviceclass: Long, servicename: Long, instanceport: Short, cinstancenames: Short, pinstancenames: Long, pinstanceports: Long, pcspn: Long, prpszspn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsInheritSecurityIdentityA(hds: Long, flags: Int, srcprincipal: Long, dstprincipal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsInheritSecurityIdentityW(hds: Long, flags: Int, srcprincipal: Long, dstprincipal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsIsMangledDnA(pszdn: Long, edsmanglefor: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsIsMangledDnW(pszdn: Long, edsmanglefor: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsIsMangledRdnValueA(pszrdn: Long, crdn: Int, edsmanglefordesired: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsIsMangledRdnValueW(pszrdn: Long, crdn: Int, edsmanglefordesired: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsListDomainsInSiteA(hds: Long, site: Long, ppdomains: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsListDomainsInSiteW(hds: Long, site: Long, ppdomains: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsListInfoForServerA(hds: Long, server: Long, ppinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsListInfoForServerW(hds: Long, server: Long, ppinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsListRolesA(hds: Long, pproles: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsListRolesW(hds: Long, pproles: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsListServersForDomainInSiteA(hds: Long, domain: Long, site: Long, ppservers: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsListServersForDomainInSiteW(hds: Long, domain: Long, site: Long, ppservers: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsListServersInSiteA(hds: Long, site: Long, ppservers: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsListServersInSiteW(hds: Long, site: Long, ppservers: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsListSitesA(hds: Long, ppsites: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsListSitesW(hds: Long, ppsites: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsMakePasswordCredentialsA(user: Long, domain: Long, password: Long, pauthidentity: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsMakePasswordCredentialsW(user: Long, domain: Long, password: Long, pauthidentity: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsMakeSpnA(serviceclass: Long, servicename: Long, instancename: Long, instanceport: Short, referrer: Long, pcspnlength: Long, pszspn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsMakeSpnW(serviceclass: Long, servicename: Long, instancename: Long, instanceport: Short, referrer: Long, pcspnlength: Long, pszspn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsMapSchemaGuidsA(hds: Long, cguids: Int, rguids: Long, ppguidmap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsMapSchemaGuidsW(hds: Long, cguids: Int, rguids: Long, ppguidmap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsMergeForestTrustInformationW(domainname: Long, newforesttrustinfo: Long, oldforesttrustinfo: Long, mergedforesttrustinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsQuerySitesByCostA(hds: Long, pszfromsite: Long, rgsztosites: Long, ctosites: Int, dwflags: Int, prgsiteinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsQuerySitesByCostW(hds: Long, pwszfromsite: Long, rgwsztosites: Long, ctosites: Int, dwflags: Int, prgsiteinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsQuerySitesFree(rgsiteinfo: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsQuoteRdnValueA(cunquotedrdnvaluelength: Int, psunquotedrdnvalue: Long, pcquotedrdnvaluelength: Long, psquotedrdnvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsQuoteRdnValueW(cunquotedrdnvaluelength: Int, psunquotedrdnvalue: Long, pcquotedrdnvaluelength: Long, psquotedrdnvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsRemoveDsDomainA(hds: Long, domaindn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsRemoveDsDomainW(hds: Long, domaindn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsRemoveDsServerA(hds: Long, serverdn: Long, domaindn: Long, flastdcindomain: Long, fcommit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsRemoveDsServerW(hds: Long, serverdn: Long, domaindn: Long, flastdcindomain: Long, fcommit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsReplicaAddA(hds: Long, namecontext: Long, sourcedsadn: Long, transportdn: Long, sourcedsaaddress: Long, pschedule: Long, options: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsReplicaAddW(hds: Long, namecontext: Long, sourcedsadn: Long, transportdn: Long, sourcedsaaddress: Long, pschedule: Long, options: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsReplicaConsistencyCheck(hds: Long, taskid: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsReplicaDelA(hds: Long, namecontext: Long, dsasrc: Long, options: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsReplicaDelW(hds: Long, namecontext: Long, dsasrc: Long, options: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsReplicaFreeInfo(infotype: Int, pinfo: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsReplicaGetInfo2W(hds: Long, infotype: Int, pszobject: Long, puuidforsourcedsaobjguid: Long, pszattributename: Long, pszvalue: Long, dwflags: Int, dwenumerationcontext: Int, ppinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsReplicaGetInfoW(hds: Long, infotype: Int, pszobject: Long, puuidforsourcedsaobjguid: Long, ppinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsReplicaModifyA(hds: Long, namecontext: Long, puuidsourcedsa: Long, transportdn: Long, sourcedsaaddress: Long, pschedule: Long, replicaflags: Int, modifyfields: Int, options: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsReplicaModifyW(hds: Long, namecontext: Long, puuidsourcedsa: Long, transportdn: Long, sourcedsaaddress: Long, pschedule: Long, replicaflags: Int, modifyfields: Int, options: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsReplicaSyncA(hds: Long, namecontext: Long, puuiddsasrc: Long, options: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsReplicaSyncAllA(hds: Long, psznamecontext: Long, ulflags: Int, pfncallback: Long, pcallbackdata: Long, perrors: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsReplicaSyncAllW(hds: Long, psznamecontext: Long, ulflags: Int, pfncallback: Long, pcallbackdata: Long, perrors: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsReplicaSyncW(hds: Long, namecontext: Long, puuiddsasrc: Long, options: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsReplicaUpdateRefsA(hds: Long, namecontext: Long, dsadest: Long, puuiddsadest: Long, options: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsReplicaUpdateRefsW(hds: Long, namecontext: Long, dsadest: Long, puuiddsadest: Long, options: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsReplicaVerifyObjectsA(hds: Long, namecontext: Long, puuiddsasrc: Long, uloptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsReplicaVerifyObjectsW(hds: Long, namecontext: Long, puuiddsasrc: Long, uloptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsRoleFreeMemory(buffer: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsRoleGetPrimaryDomainInformation(lpserver: Long, infolevel: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsServerRegisterSpnA(operation: Int, serviceclass: Long, userobjectdn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsServerRegisterSpnW(operation: Int, serviceclass: Long, userobjectdn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsUnBindA(phds: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsUnBindW(phds: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsUnquoteRdnValueA(cquotedrdnvaluelength: Int, psquotedrdnvalue: Long, pcunquotedrdnvaluelength: Long, psunquotedrdnvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsUnquoteRdnValueW(cquotedrdnvaluelength: Int, psquotedrdnvalue: Long, pcunquotedrdnvaluelength: Long, psunquotedrdnvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsValidateSubnetNameA(subnetname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsValidateSubnetNameW(subnetname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsWriteAccountSpnA(hds: Long, operation: Int, pszaccount: Long, cspn: Int, rpszspn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_DsWriteAccountSpnW(hds: Long, operation: Int, pszaccount: Long, cspn: Int, rpszspn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_FreeADsMem(pmem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_FreeADsStr(pstr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_PropVariantToAdsType(pvariant: Long, dwnumvariant: Int, ppadsvalues: Long, pdwnumvalues: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_ReallocADsMem(poldmem: Long, cbold: Int, cbnew: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_ReallocADsStr(ppstr: Long, pstr: Long): Int
}

public actual fun ADsBuildEnumerator(padscontainer: Long, ppenumvariant: Long): HRESULT =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_ADsBuildEnumerator(padscontainer, ppenumvariant)

public actual fun ADsBuildVarArrayInt(lpdwobjecttypes: Long, dwobjecttypes: UInt, pvar: Long): HRESULT =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_ADsBuildVarArrayInt(lpdwobjecttypes, dwobjecttypes.toInt(), pvar)

public actual fun ADsBuildVarArrayStr(lpppathnames: Long, dwpathnames: UInt, pvar: Long): HRESULT =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_ADsBuildVarArrayStr(lpppathnames, dwpathnames.toInt(), pvar)

public actual fun ADsDecodeBinaryData(szsrcdata: PCWSTR, ppbdestdata: Long, pdwdestlen: Long): HRESULT =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_ADsDecodeBinaryData(szsrcdata, ppbdestdata, pdwdestlen)

public actual fun ADsEncodeBinaryData(pbsrcdata: Long, dwsrclen: UInt, ppszdestdata: Long): HRESULT =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_ADsEncodeBinaryData(pbsrcdata, dwsrclen.toInt(), ppszdestdata)

public actual fun ADsEnumerateNext(penumvariant: Long, celements: UInt, pvar: Long, pcelementsfetched: Long): HRESULT =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_ADsEnumerateNext(penumvariant, celements.toInt(), pvar, pcelementsfetched)

public actual fun ADsFreeEnumerator(penumvariant: Long): HRESULT =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_ADsFreeEnumerator(penumvariant)

public actual fun ADsGetLastError(lperror: Long, lperrorbuf: PWSTR, dwerrorbuflen: UInt, lpnamebuf: PWSTR, dwnamebuflen: UInt): HRESULT =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_ADsGetLastError(lperror, lperrorbuf, dwerrorbuflen.toInt(), lpnamebuf, dwnamebuflen.toInt())

public actual fun ADsGetObject(lpszpathname: PCWSTR, riid: Long, ppobject: Long): HRESULT =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_ADsGetObject(lpszpathname, riid, ppobject)

public actual fun ADsOpenObject(lpszpathname: PCWSTR, lpszusername: PCWSTR, lpszpassword: PCWSTR, dwreserved: ADS_AUTHENTICATION_ENUM, riid: Long, ppobject: Long): HRESULT =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_ADsOpenObject(lpszpathname, lpszusername, lpszpassword, dwreserved.toInt(), riid, ppobject)

public actual fun ADsPropCheckIfWritable(pwzattr: PCWSTR, pwritableattrs: Long): BOOL =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_ADsPropCheckIfWritable(pwzattr, pwritableattrs)

public actual fun ADsPropCreateNotifyObj(pappthddataobj: Long, pwzadsobjname: PCWSTR, phnotifyobj: Long): HRESULT =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_ADsPropCreateNotifyObj(pappthddataobj, pwzadsobjname, phnotifyobj)

public actual fun ADsPropGetInitInfo(hnotifyobj: HWND, pinitparams: Long): BOOL =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_ADsPropGetInitInfo(hnotifyobj, pinitparams)

public actual fun ADsPropSendErrorMessage(hnotifyobj: HWND, perror: Long): BOOL =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_ADsPropSendErrorMessage(hnotifyobj, perror)

public actual fun ADsPropSetHwnd(hnotifyobj: HWND, hpage: HWND): BOOL =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_ADsPropSetHwnd(hnotifyobj, hpage)

public actual fun ADsPropSetHwndWithTitle(hnotifyobj: HWND, hpage: HWND, ptztitle: Long): BOOL =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_ADsPropSetHwndWithTitle(hnotifyobj, hpage, ptztitle)

public actual fun ADsPropShowErrorDialog(hnotifyobj: HWND, hpage: HWND): BOOL =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_ADsPropShowErrorDialog(hnotifyobj, hpage)

public actual fun ADsSetLastError(dwerr: UInt, pszerror: PCWSTR, pszprovider: PCWSTR) {
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_ADsSetLastError(dwerr.toInt(), pszerror, pszprovider)
}

public actual fun AdsFreeAdsValues(padsvalues: Long, dwnumvalues: UInt) {
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_AdsFreeAdsValues(padsvalues, dwnumvalues.toInt())
}

public actual fun AdsTypeToPropVariant(padsvalues: Long, dwnumvalues: UInt, pvariant: Long): HRESULT =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_AdsTypeToPropVariant(padsvalues, dwnumvalues.toInt(), pvariant)

public actual fun AllocADsMem(cb: UInt): Long =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_AllocADsMem(cb.toInt())

public actual fun AllocADsStr(pstr: PCWSTR): PWSTR =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_AllocADsStr(pstr)

public actual fun BinarySDToSecurityDescriptor(psecuritydescriptor: PSECURITY_DESCRIPTOR, pvarsec: Long, pszservername: PCWSTR, username: PCWSTR, password: PCWSTR, dwflags: UInt): HRESULT =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_BinarySDToSecurityDescriptor(psecuritydescriptor, pvarsec, pszservername, username, password, dwflags.toInt())

public actual fun DsAddSidHistoryA(hds: HANDLE, flags: UInt, srcdomain: PCSTR, srcprincipal: PCSTR, srcdomaincontroller: PCSTR, srcdomaincreds: Long, dstdomain: PCSTR, dstprincipal: PCSTR): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsAddSidHistoryA(hds, flags.toInt(), srcdomain, srcprincipal, srcdomaincontroller, srcdomaincreds, dstdomain, dstprincipal).toUInt()

public actual fun DsAddSidHistoryW(hds: HANDLE, flags: UInt, srcdomain: PCWSTR, srcprincipal: PCWSTR, srcdomaincontroller: PCWSTR, srcdomaincreds: Long, dstdomain: PCWSTR, dstprincipal: PCWSTR): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsAddSidHistoryW(hds, flags.toInt(), srcdomain, srcprincipal, srcdomaincontroller, srcdomaincreds, dstdomain, dstprincipal).toUInt()

public actual fun DsAddressToSiteNamesA(computername: PCSTR, entrycount: UInt, socketaddresses: Long, sitenames: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsAddressToSiteNamesA(computername, entrycount.toInt(), socketaddresses, sitenames).toUInt()

public actual fun DsAddressToSiteNamesExA(computername: PCSTR, entrycount: UInt, socketaddresses: Long, sitenames: Long, subnetnames: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsAddressToSiteNamesExA(computername, entrycount.toInt(), socketaddresses, sitenames, subnetnames).toUInt()

public actual fun DsAddressToSiteNamesExW(computername: PCWSTR, entrycount: UInt, socketaddresses: Long, sitenames: Long, subnetnames: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsAddressToSiteNamesExW(computername, entrycount.toInt(), socketaddresses, sitenames, subnetnames).toUInt()

public actual fun DsAddressToSiteNamesW(computername: PCWSTR, entrycount: UInt, socketaddresses: Long, sitenames: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsAddressToSiteNamesW(computername, entrycount.toInt(), socketaddresses, sitenames).toUInt()

public actual fun DsBindA(domaincontrollername: PCSTR, dnsdomainname: PCSTR, phds: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsBindA(domaincontrollername, dnsdomainname, phds).toUInt()

public actual fun DsBindByInstanceA(servername: PCSTR, annotation: PCSTR, instanceguid: Long, dnsdomainname: PCSTR, authidentity: Long, serviceprincipalname: PCSTR, bindflags: UInt, phds: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsBindByInstanceA(servername, annotation, instanceguid, dnsdomainname, authidentity, serviceprincipalname, bindflags.toInt(), phds).toUInt()

public actual fun DsBindByInstanceW(servername: PCWSTR, annotation: PCWSTR, instanceguid: Long, dnsdomainname: PCWSTR, authidentity: Long, serviceprincipalname: PCWSTR, bindflags: UInt, phds: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsBindByInstanceW(servername, annotation, instanceguid, dnsdomainname, authidentity, serviceprincipalname, bindflags.toInt(), phds).toUInt()

public actual fun DsBindToISTGA(sitename: PCSTR, phds: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsBindToISTGA(sitename, phds).toUInt()

public actual fun DsBindToISTGW(sitename: PCWSTR, phds: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsBindToISTGW(sitename, phds).toUInt()

public actual fun DsBindW(domaincontrollername: PCWSTR, dnsdomainname: PCWSTR, phds: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsBindW(domaincontrollername, dnsdomainname, phds).toUInt()

public actual fun DsBindWithCredA(domaincontrollername: PCSTR, dnsdomainname: PCSTR, authidentity: Long, phds: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsBindWithCredA(domaincontrollername, dnsdomainname, authidentity, phds).toUInt()

public actual fun DsBindWithCredW(domaincontrollername: PCWSTR, dnsdomainname: PCWSTR, authidentity: Long, phds: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsBindWithCredW(domaincontrollername, dnsdomainname, authidentity, phds).toUInt()

public actual fun DsBindWithSpnA(domaincontrollername: PCSTR, dnsdomainname: PCSTR, authidentity: Long, serviceprincipalname: PCSTR, phds: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsBindWithSpnA(domaincontrollername, dnsdomainname, authidentity, serviceprincipalname, phds).toUInt()

public actual fun DsBindWithSpnExA(domaincontrollername: PCSTR, dnsdomainname: PCSTR, authidentity: Long, serviceprincipalname: PCSTR, bindflags: UInt, phds: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsBindWithSpnExA(domaincontrollername, dnsdomainname, authidentity, serviceprincipalname, bindflags.toInt(), phds).toUInt()

public actual fun DsBindWithSpnExW(domaincontrollername: PCWSTR, dnsdomainname: PCWSTR, authidentity: Long, serviceprincipalname: PCWSTR, bindflags: UInt, phds: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsBindWithSpnExW(domaincontrollername, dnsdomainname, authidentity, serviceprincipalname, bindflags.toInt(), phds).toUInt()

public actual fun DsBindWithSpnW(domaincontrollername: PCWSTR, dnsdomainname: PCWSTR, authidentity: Long, serviceprincipalname: PCWSTR, phds: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsBindWithSpnW(domaincontrollername, dnsdomainname, authidentity, serviceprincipalname, phds).toUInt()

public actual fun DsBindingSetTimeout(hds: HANDLE, ctimeoutsecs: UInt): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsBindingSetTimeout(hds, ctimeoutsecs.toInt()).toUInt()

public actual fun DsBrowseForContainerA(pinfo: Long): Int =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsBrowseForContainerA(pinfo)

public actual fun DsBrowseForContainerW(pinfo: Long): Int =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsBrowseForContainerW(pinfo)

public actual fun DsClientMakeSpnForTargetServerA(serviceclass: PCSTR, servicename: PCSTR, pcspnlength: Long, pszspn: PSTR): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsClientMakeSpnForTargetServerA(serviceclass, servicename, pcspnlength, pszspn).toUInt()

public actual fun DsClientMakeSpnForTargetServerW(serviceclass: PCWSTR, servicename: PCWSTR, pcspnlength: Long, pszspn: PWSTR): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsClientMakeSpnForTargetServerW(serviceclass, servicename, pcspnlength, pszspn).toUInt()

public actual fun DsCrackNamesA(hds: HANDLE, flags: DS_NAME_FLAGS, formatoffered: DS_NAME_FORMAT, formatdesired: DS_NAME_FORMAT, cnames: UInt, rpnames: Long, ppresult: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsCrackNamesA(hds, flags, formatoffered, formatdesired, cnames.toInt(), rpnames, ppresult).toUInt()

public actual fun DsCrackNamesW(hds: HANDLE, flags: DS_NAME_FLAGS, formatoffered: DS_NAME_FORMAT, formatdesired: DS_NAME_FORMAT, cnames: UInt, rpnames: Long, ppresult: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsCrackNamesW(hds, flags, formatoffered, formatdesired, cnames.toInt(), rpnames, ppresult).toUInt()

public actual fun DsCrackSpn2A(pszspn: PCSTR, cspn: UInt, pcserviceclass: Long, serviceclass: PSTR, pcservicename: Long, servicename: PSTR, pcinstancename: Long, instancename: PSTR, pinstanceport: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsCrackSpn2A(pszspn, cspn.toInt(), pcserviceclass, serviceclass, pcservicename, servicename, pcinstancename, instancename, pinstanceport).toUInt()

public actual fun DsCrackSpn2W(pszspn: PCWSTR, cspn: UInt, pcserviceclass: Long, serviceclass: PWSTR, pcservicename: Long, servicename: PWSTR, pcinstancename: Long, instancename: PWSTR, pinstanceport: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsCrackSpn2W(pszspn, cspn.toInt(), pcserviceclass, serviceclass, pcservicename, servicename, pcinstancename, instancename, pinstanceport).toUInt()

public actual fun DsCrackSpn3W(pszspn: PCWSTR, cspn: UInt, pchostname: Long, hostname: PWSTR, pcinstancename: Long, instancename: PWSTR, pportnumber: Long, pcdomainname: Long, domainname: PWSTR, pcrealmname: Long, realmname: PWSTR): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsCrackSpn3W(pszspn, cspn.toInt(), pchostname, hostname, pcinstancename, instancename, pportnumber, pcdomainname, domainname, pcrealmname, realmname).toUInt()

public actual fun DsCrackSpn4W(pszspn: PCWSTR, cspn: UInt, pchostname: Long, hostname: PWSTR, pcinstancename: Long, instancename: PWSTR, pcportname: Long, portname: PWSTR, pcdomainname: Long, domainname: PWSTR, pcrealmname: Long, realmname: PWSTR): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsCrackSpn4W(pszspn, cspn.toInt(), pchostname, hostname, pcinstancename, instancename, pcportname, portname, pcdomainname, domainname, pcrealmname, realmname).toUInt()

public actual fun DsCrackSpnA(pszspn: PCSTR, pcserviceclass: Long, serviceclass: PSTR, pcservicename: Long, servicename: PSTR, pcinstancename: Long, instancename: PSTR, pinstanceport: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsCrackSpnA(pszspn, pcserviceclass, serviceclass, pcservicename, servicename, pcinstancename, instancename, pinstanceport).toUInt()

public actual fun DsCrackSpnW(pszspn: PCWSTR, pcserviceclass: Long, serviceclass: PWSTR, pcservicename: Long, servicename: PWSTR, pcinstancename: Long, instancename: PWSTR, pinstanceport: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsCrackSpnW(pszspn, pcserviceclass, serviceclass, pcservicename, servicename, pcinstancename, instancename, pinstanceport).toUInt()

public actual fun DsCrackUnquotedMangledRdnA(pszrdn: PCSTR, cchrdn: UInt, pguid: Long, pedsmanglefor: Long): BOOL =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsCrackUnquotedMangledRdnA(pszrdn, cchrdn.toInt(), pguid, pedsmanglefor)

public actual fun DsCrackUnquotedMangledRdnW(pszrdn: PCWSTR, cchrdn: UInt, pguid: Long, pedsmanglefor: Long): BOOL =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsCrackUnquotedMangledRdnW(pszrdn, cchrdn.toInt(), pguid, pedsmanglefor)

public actual fun DsDeregisterDnsHostRecordsA(servername: PCSTR, dnsdomainname: PCSTR, domainguid: Long, dsaguid: Long, dnshostname: PCSTR): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsDeregisterDnsHostRecordsA(servername, dnsdomainname, domainguid, dsaguid, dnshostname).toUInt()

public actual fun DsDeregisterDnsHostRecordsW(servername: PCWSTR, dnsdomainname: PCWSTR, domainguid: Long, dsaguid: Long, dnshostname: PCWSTR): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsDeregisterDnsHostRecordsW(servername, dnsdomainname, domainguid, dsaguid, dnshostname).toUInt()

public actual fun DsEnumerateDomainTrustsA(servername: PCSTR, flags: UInt, domains: Long, domaincount: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsEnumerateDomainTrustsA(servername, flags.toInt(), domains, domaincount).toUInt()

public actual fun DsEnumerateDomainTrustsW(servername: PCWSTR, flags: UInt, domains: Long, domaincount: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsEnumerateDomainTrustsW(servername, flags.toInt(), domains, domaincount).toUInt()

public actual fun DsFreeDomainControllerInfoA(infolevel: UInt, cinfo: UInt, pinfo: Long) {
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsFreeDomainControllerInfoA(infolevel.toInt(), cinfo.toInt(), pinfo)
}

public actual fun DsFreeDomainControllerInfoW(infolevel: UInt, cinfo: UInt, pinfo: Long) {
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsFreeDomainControllerInfoW(infolevel.toInt(), cinfo.toInt(), pinfo)
}

public actual fun DsFreeNameResultA(presult: Long) {
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsFreeNameResultA(presult)
}

public actual fun DsFreeNameResultW(presult: Long) {
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsFreeNameResultW(presult)
}

public actual fun DsFreePasswordCredentials(authidentity: Long) {
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsFreePasswordCredentials(authidentity)
}

public actual fun DsFreeSchemaGuidMapA(pguidmap: Long) {
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsFreeSchemaGuidMapA(pguidmap)
}

public actual fun DsFreeSchemaGuidMapW(pguidmap: Long) {
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsFreeSchemaGuidMapW(pguidmap)
}

public actual fun DsFreeSpnArrayA(cspn: UInt, rpszspn: Long) {
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsFreeSpnArrayA(cspn.toInt(), rpszspn)
}

public actual fun DsFreeSpnArrayW(cspn: UInt, rpszspn: Long) {
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsFreeSpnArrayW(cspn.toInt(), rpszspn)
}

public actual fun DsGetDcCloseW(getdccontexthandle: HANDLE) {
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsGetDcCloseW(getdccontexthandle)
}

public actual fun DsGetDcNameA(computername: PCSTR, domainname: PCSTR, domainguid: Long, sitename: PCSTR, flags: UInt, domaincontrollerinfo: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsGetDcNameA(computername, domainname, domainguid, sitename, flags.toInt(), domaincontrollerinfo).toUInt()

public actual fun DsGetDcNameW(computername: PCWSTR, domainname: PCWSTR, domainguid: Long, sitename: PCWSTR, flags: UInt, domaincontrollerinfo: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsGetDcNameW(computername, domainname, domainguid, sitename, flags.toInt(), domaincontrollerinfo).toUInt()

public actual fun DsGetDcNextA(getdccontexthandle: HANDLE, sockaddresscount: Long, sockaddresses: Long, dnshostname: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsGetDcNextA(getdccontexthandle, sockaddresscount, sockaddresses, dnshostname).toUInt()

public actual fun DsGetDcNextW(getdccontexthandle: HANDLE, sockaddresscount: Long, sockaddresses: Long, dnshostname: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsGetDcNextW(getdccontexthandle, sockaddresscount, sockaddresses, dnshostname).toUInt()

public actual fun DsGetDcOpenA(dnsname: PCSTR, optionflags: UInt, sitename: PCSTR, domainguid: Long, dnsforestname: PCSTR, dcflags: UInt, retgetdccontext: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsGetDcOpenA(dnsname, optionflags.toInt(), sitename, domainguid, dnsforestname, dcflags.toInt(), retgetdccontext).toUInt()

public actual fun DsGetDcOpenW(dnsname: PCWSTR, optionflags: UInt, sitename: PCWSTR, domainguid: Long, dnsforestname: PCWSTR, dcflags: UInt, retgetdccontext: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsGetDcOpenW(dnsname, optionflags.toInt(), sitename, domainguid, dnsforestname, dcflags.toInt(), retgetdccontext).toUInt()

public actual fun DsGetDcSiteCoverageA(servername: PCSTR, entrycount: Long, sitenames: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsGetDcSiteCoverageA(servername, entrycount, sitenames).toUInt()

public actual fun DsGetDcSiteCoverageW(servername: PCWSTR, entrycount: Long, sitenames: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsGetDcSiteCoverageW(servername, entrycount, sitenames).toUInt()

public actual fun DsGetDomainControllerInfoA(hds: HANDLE, domainname: PCSTR, infolevel: UInt, pcout: Long, ppinfo: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsGetDomainControllerInfoA(hds, domainname, infolevel.toInt(), pcout, ppinfo).toUInt()

public actual fun DsGetDomainControllerInfoW(hds: HANDLE, domainname: PCWSTR, infolevel: UInt, pcout: Long, ppinfo: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsGetDomainControllerInfoW(hds, domainname, infolevel.toInt(), pcout, ppinfo).toUInt()

public actual fun DsGetForestTrustInformationW(servername: PCWSTR, trusteddomainname: PCWSTR, flags: UInt, foresttrustinfo: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsGetForestTrustInformationW(servername, trusteddomainname, flags.toInt(), foresttrustinfo).toUInt()

public actual fun DsGetFriendlyClassName(pszobjectclass: PCWSTR, pszbuffer: PWSTR, cchbuffer: UInt): HRESULT =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsGetFriendlyClassName(pszobjectclass, pszbuffer, cchbuffer.toInt())

public actual fun DsGetIcon(dwflags: UInt, pszobjectclass: PCWSTR, cximage: Int, cyimage: Int): HICON =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsGetIcon(dwflags.toInt(), pszobjectclass, cximage, cyimage)

public actual fun DsGetRdnW(ppdn: Long, pcdn: Long, ppkey: Long, pckey: Long, ppval: Long, pcval: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsGetRdnW(ppdn, pcdn, ppkey, pckey, ppval, pcval).toUInt()

public actual fun DsGetSiteNameA(computername: PCSTR, sitename: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsGetSiteNameA(computername, sitename).toUInt()

public actual fun DsGetSiteNameW(computername: PCWSTR, sitename: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsGetSiteNameW(computername, sitename).toUInt()

public actual fun DsGetSpnA(servicetype: DS_SPN_NAME_TYPE, serviceclass: PCSTR, servicename: PCSTR, instanceport: UShort, cinstancenames: UShort, pinstancenames: Long, pinstanceports: Long, pcspn: Long, prpszspn: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsGetSpnA(servicetype, serviceclass, servicename, instanceport.toShort(), cinstancenames.toShort(), pinstancenames, pinstanceports, pcspn, prpszspn).toUInt()

public actual fun DsGetSpnW(servicetype: DS_SPN_NAME_TYPE, serviceclass: PCWSTR, servicename: PCWSTR, instanceport: UShort, cinstancenames: UShort, pinstancenames: Long, pinstanceports: Long, pcspn: Long, prpszspn: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsGetSpnW(servicetype, serviceclass, servicename, instanceport.toShort(), cinstancenames.toShort(), pinstancenames, pinstanceports, pcspn, prpszspn).toUInt()

public actual fun DsInheritSecurityIdentityA(hds: HANDLE, flags: UInt, srcprincipal: PCSTR, dstprincipal: PCSTR): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsInheritSecurityIdentityA(hds, flags.toInt(), srcprincipal, dstprincipal).toUInt()

public actual fun DsInheritSecurityIdentityW(hds: HANDLE, flags: UInt, srcprincipal: PCWSTR, dstprincipal: PCWSTR): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsInheritSecurityIdentityW(hds, flags.toInt(), srcprincipal, dstprincipal).toUInt()

public actual fun DsIsMangledDnA(pszdn: PCSTR, edsmanglefor: DS_MANGLE_FOR): BOOL =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsIsMangledDnA(pszdn, edsmanglefor)

public actual fun DsIsMangledDnW(pszdn: PCWSTR, edsmanglefor: DS_MANGLE_FOR): BOOL =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsIsMangledDnW(pszdn, edsmanglefor)

public actual fun DsIsMangledRdnValueA(pszrdn: PCSTR, crdn: UInt, edsmanglefordesired: DS_MANGLE_FOR): BOOL =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsIsMangledRdnValueA(pszrdn, crdn.toInt(), edsmanglefordesired)

public actual fun DsIsMangledRdnValueW(pszrdn: PCWSTR, crdn: UInt, edsmanglefordesired: DS_MANGLE_FOR): BOOL =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsIsMangledRdnValueW(pszrdn, crdn.toInt(), edsmanglefordesired)

public actual fun DsListDomainsInSiteA(hds: HANDLE, site: PCSTR, ppdomains: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsListDomainsInSiteA(hds, site, ppdomains).toUInt()

public actual fun DsListDomainsInSiteW(hds: HANDLE, site: PCWSTR, ppdomains: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsListDomainsInSiteW(hds, site, ppdomains).toUInt()

public actual fun DsListInfoForServerA(hds: HANDLE, server: PCSTR, ppinfo: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsListInfoForServerA(hds, server, ppinfo).toUInt()

public actual fun DsListInfoForServerW(hds: HANDLE, server: PCWSTR, ppinfo: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsListInfoForServerW(hds, server, ppinfo).toUInt()

public actual fun DsListRolesA(hds: HANDLE, pproles: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsListRolesA(hds, pproles).toUInt()

public actual fun DsListRolesW(hds: HANDLE, pproles: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsListRolesW(hds, pproles).toUInt()

public actual fun DsListServersForDomainInSiteA(hds: HANDLE, domain: PCSTR, site: PCSTR, ppservers: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsListServersForDomainInSiteA(hds, domain, site, ppservers).toUInt()

public actual fun DsListServersForDomainInSiteW(hds: HANDLE, domain: PCWSTR, site: PCWSTR, ppservers: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsListServersForDomainInSiteW(hds, domain, site, ppservers).toUInt()

public actual fun DsListServersInSiteA(hds: HANDLE, site: PCSTR, ppservers: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsListServersInSiteA(hds, site, ppservers).toUInt()

public actual fun DsListServersInSiteW(hds: HANDLE, site: PCWSTR, ppservers: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsListServersInSiteW(hds, site, ppservers).toUInt()

public actual fun DsListSitesA(hds: HANDLE, ppsites: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsListSitesA(hds, ppsites).toUInt()

public actual fun DsListSitesW(hds: HANDLE, ppsites: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsListSitesW(hds, ppsites).toUInt()

public actual fun DsMakePasswordCredentialsA(user: PCSTR, domain: PCSTR, password: PCSTR, pauthidentity: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsMakePasswordCredentialsA(user, domain, password, pauthidentity).toUInt()

public actual fun DsMakePasswordCredentialsW(user: PCWSTR, domain: PCWSTR, password: PCWSTR, pauthidentity: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsMakePasswordCredentialsW(user, domain, password, pauthidentity).toUInt()

public actual fun DsMakeSpnA(serviceclass: PCSTR, servicename: PCSTR, instancename: PCSTR, instanceport: UShort, referrer: PCSTR, pcspnlength: Long, pszspn: PSTR): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsMakeSpnA(serviceclass, servicename, instancename, instanceport.toShort(), referrer, pcspnlength, pszspn).toUInt()

public actual fun DsMakeSpnW(serviceclass: PCWSTR, servicename: PCWSTR, instancename: PCWSTR, instanceport: UShort, referrer: PCWSTR, pcspnlength: Long, pszspn: PWSTR): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsMakeSpnW(serviceclass, servicename, instancename, instanceport.toShort(), referrer, pcspnlength, pszspn).toUInt()

public actual fun DsMapSchemaGuidsA(hds: HANDLE, cguids: UInt, rguids: Long, ppguidmap: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsMapSchemaGuidsA(hds, cguids.toInt(), rguids, ppguidmap).toUInt()

public actual fun DsMapSchemaGuidsW(hds: HANDLE, cguids: UInt, rguids: Long, ppguidmap: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsMapSchemaGuidsW(hds, cguids.toInt(), rguids, ppguidmap).toUInt()

public actual fun DsMergeForestTrustInformationW(domainname: PCWSTR, newforesttrustinfo: Long, oldforesttrustinfo: Long, mergedforesttrustinfo: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsMergeForestTrustInformationW(domainname, newforesttrustinfo, oldforesttrustinfo, mergedforesttrustinfo).toUInt()

public actual fun DsQuerySitesByCostA(hds: HANDLE, pszfromsite: PCSTR, rgsztosites: Long, ctosites: UInt, dwflags: UInt, prgsiteinfo: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsQuerySitesByCostA(hds, pszfromsite, rgsztosites, ctosites.toInt(), dwflags.toInt(), prgsiteinfo).toUInt()

public actual fun DsQuerySitesByCostW(hds: HANDLE, pwszfromsite: PCWSTR, rgwsztosites: Long, ctosites: UInt, dwflags: UInt, prgsiteinfo: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsQuerySitesByCostW(hds, pwszfromsite, rgwsztosites, ctosites.toInt(), dwflags.toInt(), prgsiteinfo).toUInt()

public actual fun DsQuerySitesFree(rgsiteinfo: Long) {
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsQuerySitesFree(rgsiteinfo)
}

public actual fun DsQuoteRdnValueA(cunquotedrdnvaluelength: UInt, psunquotedrdnvalue: PCSTR, pcquotedrdnvaluelength: Long, psquotedrdnvalue: PSTR): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsQuoteRdnValueA(cunquotedrdnvaluelength.toInt(), psunquotedrdnvalue, pcquotedrdnvaluelength, psquotedrdnvalue).toUInt()

public actual fun DsQuoteRdnValueW(cunquotedrdnvaluelength: UInt, psunquotedrdnvalue: PCWSTR, pcquotedrdnvaluelength: Long, psquotedrdnvalue: PWSTR): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsQuoteRdnValueW(cunquotedrdnvaluelength.toInt(), psunquotedrdnvalue, pcquotedrdnvaluelength, psquotedrdnvalue).toUInt()

public actual fun DsRemoveDsDomainA(hds: HANDLE, domaindn: PCSTR): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsRemoveDsDomainA(hds, domaindn).toUInt()

public actual fun DsRemoveDsDomainW(hds: HANDLE, domaindn: PCWSTR): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsRemoveDsDomainW(hds, domaindn).toUInt()

public actual fun DsRemoveDsServerA(hds: HANDLE, serverdn: PCSTR, domaindn: PCSTR, flastdcindomain: Long, fcommit: BOOL): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsRemoveDsServerA(hds, serverdn, domaindn, flastdcindomain, fcommit).toUInt()

public actual fun DsRemoveDsServerW(hds: HANDLE, serverdn: PCWSTR, domaindn: PCWSTR, flastdcindomain: Long, fcommit: BOOL): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsRemoveDsServerW(hds, serverdn, domaindn, flastdcindomain, fcommit).toUInt()

public actual fun DsReplicaAddA(hds: HANDLE, namecontext: PCSTR, sourcedsadn: PCSTR, transportdn: PCSTR, sourcedsaaddress: PCSTR, pschedule: Long, options: UInt): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsReplicaAddA(hds, namecontext, sourcedsadn, transportdn, sourcedsaaddress, pschedule, options.toInt()).toUInt()

public actual fun DsReplicaAddW(hds: HANDLE, namecontext: PCWSTR, sourcedsadn: PCWSTR, transportdn: PCWSTR, sourcedsaaddress: PCWSTR, pschedule: Long, options: UInt): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsReplicaAddW(hds, namecontext, sourcedsadn, transportdn, sourcedsaaddress, pschedule, options.toInt()).toUInt()

public actual fun DsReplicaConsistencyCheck(hds: HANDLE, taskid: DS_KCC_TASKID, dwflags: UInt): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsReplicaConsistencyCheck(hds, taskid, dwflags.toInt()).toUInt()

public actual fun DsReplicaDelA(hds: HANDLE, namecontext: PCSTR, dsasrc: PCSTR, options: UInt): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsReplicaDelA(hds, namecontext, dsasrc, options.toInt()).toUInt()

public actual fun DsReplicaDelW(hds: HANDLE, namecontext: PCWSTR, dsasrc: PCWSTR, options: UInt): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsReplicaDelW(hds, namecontext, dsasrc, options.toInt()).toUInt()

public actual fun DsReplicaFreeInfo(infotype: DS_REPL_INFO_TYPE, pinfo: Long) {
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsReplicaFreeInfo(infotype, pinfo)
}

public actual fun DsReplicaGetInfo2W(hds: HANDLE, infotype: DS_REPL_INFO_TYPE, pszobject: PCWSTR, puuidforsourcedsaobjguid: Long, pszattributename: PCWSTR, pszvalue: PCWSTR, dwflags: UInt, dwenumerationcontext: UInt, ppinfo: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsReplicaGetInfo2W(hds, infotype, pszobject, puuidforsourcedsaobjguid, pszattributename, pszvalue, dwflags.toInt(), dwenumerationcontext.toInt(), ppinfo).toUInt()

public actual fun DsReplicaGetInfoW(hds: HANDLE, infotype: DS_REPL_INFO_TYPE, pszobject: PCWSTR, puuidforsourcedsaobjguid: Long, ppinfo: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsReplicaGetInfoW(hds, infotype, pszobject, puuidforsourcedsaobjguid, ppinfo).toUInt()

public actual fun DsReplicaModifyA(hds: HANDLE, namecontext: PCSTR, puuidsourcedsa: Long, transportdn: PCSTR, sourcedsaaddress: PCSTR, pschedule: Long, replicaflags: UInt, modifyfields: UInt, options: UInt): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsReplicaModifyA(hds, namecontext, puuidsourcedsa, transportdn, sourcedsaaddress, pschedule, replicaflags.toInt(), modifyfields.toInt(), options.toInt()).toUInt()

public actual fun DsReplicaModifyW(hds: HANDLE, namecontext: PCWSTR, puuidsourcedsa: Long, transportdn: PCWSTR, sourcedsaaddress: PCWSTR, pschedule: Long, replicaflags: UInt, modifyfields: UInt, options: UInt): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsReplicaModifyW(hds, namecontext, puuidsourcedsa, transportdn, sourcedsaaddress, pschedule, replicaflags.toInt(), modifyfields.toInt(), options.toInt()).toUInt()

public actual fun DsReplicaSyncA(hds: HANDLE, namecontext: PCSTR, puuiddsasrc: Long, options: UInt): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsReplicaSyncA(hds, namecontext, puuiddsasrc, options.toInt()).toUInt()

public actual fun DsReplicaSyncAllA(hds: HANDLE, psznamecontext: PCSTR, ulflags: UInt, pfncallback: Long, pcallbackdata: Long, perrors: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsReplicaSyncAllA(hds, psznamecontext, ulflags.toInt(), pfncallback, pcallbackdata, perrors).toUInt()

public actual fun DsReplicaSyncAllW(hds: HANDLE, psznamecontext: PCWSTR, ulflags: UInt, pfncallback: Long, pcallbackdata: Long, perrors: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsReplicaSyncAllW(hds, psznamecontext, ulflags.toInt(), pfncallback, pcallbackdata, perrors).toUInt()

public actual fun DsReplicaSyncW(hds: HANDLE, namecontext: PCWSTR, puuiddsasrc: Long, options: UInt): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsReplicaSyncW(hds, namecontext, puuiddsasrc, options.toInt()).toUInt()

public actual fun DsReplicaUpdateRefsA(hds: HANDLE, namecontext: PCSTR, dsadest: PCSTR, puuiddsadest: Long, options: UInt): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsReplicaUpdateRefsA(hds, namecontext, dsadest, puuiddsadest, options.toInt()).toUInt()

public actual fun DsReplicaUpdateRefsW(hds: HANDLE, namecontext: PCWSTR, dsadest: PCWSTR, puuiddsadest: Long, options: UInt): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsReplicaUpdateRefsW(hds, namecontext, dsadest, puuiddsadest, options.toInt()).toUInt()

public actual fun DsReplicaVerifyObjectsA(hds: HANDLE, namecontext: PCSTR, puuiddsasrc: Long, uloptions: UInt): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsReplicaVerifyObjectsA(hds, namecontext, puuiddsasrc, uloptions.toInt()).toUInt()

public actual fun DsReplicaVerifyObjectsW(hds: HANDLE, namecontext: PCWSTR, puuiddsasrc: Long, uloptions: UInt): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsReplicaVerifyObjectsW(hds, namecontext, puuiddsasrc, uloptions.toInt()).toUInt()

public actual fun DsRoleFreeMemory(buffer: Long) {
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsRoleFreeMemory(buffer)
}

public actual fun DsRoleGetPrimaryDomainInformation(lpserver: PCWSTR, infolevel: DSROLE_PRIMARY_DOMAIN_INFO_LEVEL, buffer: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsRoleGetPrimaryDomainInformation(lpserver, infolevel, buffer).toUInt()

public actual fun DsServerRegisterSpnA(operation: DS_SPN_WRITE_OP, serviceclass: PCSTR, userobjectdn: PCSTR): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsServerRegisterSpnA(operation, serviceclass, userobjectdn).toUInt()

public actual fun DsServerRegisterSpnW(operation: DS_SPN_WRITE_OP, serviceclass: PCWSTR, userobjectdn: PCWSTR): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsServerRegisterSpnW(operation, serviceclass, userobjectdn).toUInt()

public actual fun DsUnBindA(phds: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsUnBindA(phds).toUInt()

public actual fun DsUnBindW(phds: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsUnBindW(phds).toUInt()

public actual fun DsUnquoteRdnValueA(cquotedrdnvaluelength: UInt, psquotedrdnvalue: PCSTR, pcunquotedrdnvaluelength: Long, psunquotedrdnvalue: PSTR): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsUnquoteRdnValueA(cquotedrdnvaluelength.toInt(), psquotedrdnvalue, pcunquotedrdnvaluelength, psunquotedrdnvalue).toUInt()

public actual fun DsUnquoteRdnValueW(cquotedrdnvaluelength: UInt, psquotedrdnvalue: PCWSTR, pcunquotedrdnvaluelength: Long, psunquotedrdnvalue: PWSTR): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsUnquoteRdnValueW(cquotedrdnvaluelength.toInt(), psquotedrdnvalue, pcunquotedrdnvaluelength, psunquotedrdnvalue).toUInt()

public actual fun DsValidateSubnetNameA(subnetname: PCSTR): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsValidateSubnetNameA(subnetname).toUInt()

public actual fun DsValidateSubnetNameW(subnetname: PCWSTR): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsValidateSubnetNameW(subnetname).toUInt()

public actual fun DsWriteAccountSpnA(hds: HANDLE, operation: DS_SPN_WRITE_OP, pszaccount: PCSTR, cspn: UInt, rpszspn: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsWriteAccountSpnA(hds, operation, pszaccount, cspn.toInt(), rpszspn).toUInt()

public actual fun DsWriteAccountSpnW(hds: HANDLE, operation: DS_SPN_WRITE_OP, pszaccount: PCWSTR, cspn: UInt, rpszspn: Long): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_DsWriteAccountSpnW(hds, operation, pszaccount, cspn.toInt(), rpszspn).toUInt()

public actual fun FreeADsMem(pmem: Long): BOOL =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_FreeADsMem(pmem)

public actual fun FreeADsStr(pstr: PCWSTR): BOOL =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_FreeADsStr(pstr)

public actual fun PropVariantToAdsType(pvariant: Long, dwnumvariant: UInt, ppadsvalues: Long, pdwnumvalues: Long): HRESULT =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_PropVariantToAdsType(pvariant, dwnumvariant.toInt(), ppadsvalues, pdwnumvalues)

public actual fun ReallocADsMem(poldmem: Long, cbold: UInt, cbnew: UInt): Long =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_ReallocADsMem(poldmem, cbold.toInt(), cbnew.toInt())

public actual fun ReallocADsStr(ppstr: Long, pstr: PCWSTR): BOOL =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_ReallocADsStr(ppstr, pstr)

public actual fun SecurityDescriptorToBinarySD(vvarsecdes: VARIANT, ppsecuritydescriptor: Long, pdwsdlength: Long, pszservername: PCWSTR, username: PCWSTR, password: PCWSTR, dwflags: UInt): HRESULT =
    0
