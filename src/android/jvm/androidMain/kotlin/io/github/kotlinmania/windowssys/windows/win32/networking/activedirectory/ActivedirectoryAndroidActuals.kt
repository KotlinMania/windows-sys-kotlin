@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Variant
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon

private object WindowsWin32NetworkingActivedirectoryJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_aDsBuildEnumerator(padscontainer: Long, ppenumvariant: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_aDsBuildVarArrayInt(lpdwobjecttypes: Long, dwobjecttypes: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_aDsBuildVarArrayStr(lpppathnames: Long, dwpathnames: Int, pvar: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_aDsDecodeBinaryData(szsrcdata: Long, ppbdestdata: Long, pdwdestlen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_aDsEncodeBinaryData(pbsrcdata: Long, dwsrclen: Int, ppszdestdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_aDsEnumerateNext(penumvariant: Long, celements: Int, pvar: Long, pcelementsfetched: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_aDsFreeEnumerator(penumvariant: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_aDsGetLastError(lperror: Long, lperrorbuf: Long, dwerrorbuflen: Int, lpnamebuf: Long, dwnamebuflen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_aDsGetObject(lpszpathname: Long, riid: Long, ppobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_aDsOpenObject(lpszpathname: Long, lpszusername: Long, lpszpassword: Long, dwreserved: Int, riid: Long, ppobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_aDsPropCheckIfWritable(pwzattr: Long, pwritableattrs: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_aDsPropCreateNotifyObj(pappthddataobj: Long, pwzadsobjname: Long, phnotifyobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_aDsPropGetInitInfo(hnotifyobj: Long, pinitparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_aDsPropSendErrorMessage(hnotifyobj: Long, perror: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_aDsPropSetHwnd(hnotifyobj: Long, hpage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_aDsPropSetHwndWithTitle(hnotifyobj: Long, hpage: Long, ptztitle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_aDsPropShowErrorDialog(hnotifyobj: Long, hpage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_aDsSetLastError(dwerr: Int, pszerror: Long, pszprovider: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_adsFreeAdsValues(padsvalues: Long, dwnumvalues: Int)

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_adsTypeToPropVariant(padsvalues: Long, dwnumvalues: Int, pvariant: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_allocADsMem(cb: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_allocADsStr(pstr: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_binarySDToSecurityDescriptor(psecuritydescriptor: Long, pvarsec: Long, pszservername: Long, username: Long, password: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsAddSidHistoryA(hds: Long, flags: Int, srcdomain: Long, srcprincipal: Long, srcdomaincontroller: Long, srcdomaincreds: Long, dstdomain: Long, dstprincipal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsAddSidHistoryW(hds: Long, flags: Int, srcdomain: Long, srcprincipal: Long, srcdomaincontroller: Long, srcdomaincreds: Long, dstdomain: Long, dstprincipal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsAddressToSiteNamesA(computername: Long, entrycount: Int, socketaddresses: Long, sitenames: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsAddressToSiteNamesExA(computername: Long, entrycount: Int, socketaddresses: Long, sitenames: Long, subnetnames: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsAddressToSiteNamesExW(computername: Long, entrycount: Int, socketaddresses: Long, sitenames: Long, subnetnames: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsAddressToSiteNamesW(computername: Long, entrycount: Int, socketaddresses: Long, sitenames: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsBindA(domaincontrollername: Long, dnsdomainname: Long, phds: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsBindByInstanceA(servername: Long, annotation: Long, instanceguid: Long, dnsdomainname: Long, authidentity: Long, serviceprincipalname: Long, bindflags: Int, phds: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsBindByInstanceW(servername: Long, annotation: Long, instanceguid: Long, dnsdomainname: Long, authidentity: Long, serviceprincipalname: Long, bindflags: Int, phds: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsBindToISTGA(sitename: Long, phds: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsBindToISTGW(sitename: Long, phds: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsBindW(domaincontrollername: Long, dnsdomainname: Long, phds: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsBindWithCredA(domaincontrollername: Long, dnsdomainname: Long, authidentity: Long, phds: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsBindWithCredW(domaincontrollername: Long, dnsdomainname: Long, authidentity: Long, phds: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsBindWithSpnA(domaincontrollername: Long, dnsdomainname: Long, authidentity: Long, serviceprincipalname: Long, phds: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsBindWithSpnExA(domaincontrollername: Long, dnsdomainname: Long, authidentity: Long, serviceprincipalname: Long, bindflags: Int, phds: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsBindWithSpnExW(domaincontrollername: Long, dnsdomainname: Long, authidentity: Long, serviceprincipalname: Long, bindflags: Int, phds: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsBindWithSpnW(domaincontrollername: Long, dnsdomainname: Long, authidentity: Long, serviceprincipalname: Long, phds: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsBindingSetTimeout(hds: Long, ctimeoutsecs: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsBrowseForContainerA(pinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsBrowseForContainerW(pinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsClientMakeSpnForTargetServerA(serviceclass: Long, servicename: Long, pcspnlength: Long, pszspn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsClientMakeSpnForTargetServerW(serviceclass: Long, servicename: Long, pcspnlength: Long, pszspn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsCrackNamesA(hds: Long, flags: Int, formatoffered: Int, formatdesired: Int, cnames: Int, rpnames: Long, ppresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsCrackNamesW(hds: Long, flags: Int, formatoffered: Int, formatdesired: Int, cnames: Int, rpnames: Long, ppresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsCrackSpn2A(pszspn: Long, cspn: Int, pcserviceclass: Long, serviceclass: Long, pcservicename: Long, servicename: Long, pcinstancename: Long, instancename: Long, pinstanceport: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsCrackSpn2W(pszspn: Long, cspn: Int, pcserviceclass: Long, serviceclass: Long, pcservicename: Long, servicename: Long, pcinstancename: Long, instancename: Long, pinstanceport: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsCrackSpn3W(pszspn: Long, cspn: Int, pchostname: Long, hostname: Long, pcinstancename: Long, instancename: Long, pportnumber: Long, pcdomainname: Long, domainname: Long, pcrealmname: Long, realmname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsCrackSpn4W(pszspn: Long, cspn: Int, pchostname: Long, hostname: Long, pcinstancename: Long, instancename: Long, pcportname: Long, portname: Long, pcdomainname: Long, domainname: Long, pcrealmname: Long, realmname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsCrackSpnA(pszspn: Long, pcserviceclass: Long, serviceclass: Long, pcservicename: Long, servicename: Long, pcinstancename: Long, instancename: Long, pinstanceport: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsCrackSpnW(pszspn: Long, pcserviceclass: Long, serviceclass: Long, pcservicename: Long, servicename: Long, pcinstancename: Long, instancename: Long, pinstanceport: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsCrackUnquotedMangledRdnA(pszrdn: Long, cchrdn: Int, pguid: Long, pedsmanglefor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsCrackUnquotedMangledRdnW(pszrdn: Long, cchrdn: Int, pguid: Long, pedsmanglefor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsDeregisterDnsHostRecordsA(servername: Long, dnsdomainname: Long, domainguid: Long, dsaguid: Long, dnshostname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsDeregisterDnsHostRecordsW(servername: Long, dnsdomainname: Long, domainguid: Long, dsaguid: Long, dnshostname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsEnumerateDomainTrustsA(servername: Long, flags: Int, domains: Long, domaincount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsEnumerateDomainTrustsW(servername: Long, flags: Int, domains: Long, domaincount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsFreeDomainControllerInfoA(infolevel: Int, cinfo: Int, pinfo: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsFreeDomainControllerInfoW(infolevel: Int, cinfo: Int, pinfo: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsFreeNameResultA(presult: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsFreeNameResultW(presult: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsFreePasswordCredentials(authidentity: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsFreeSchemaGuidMapA(pguidmap: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsFreeSchemaGuidMapW(pguidmap: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsFreeSpnArrayA(cspn: Int, rpszspn: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsFreeSpnArrayW(cspn: Int, rpszspn: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsGetDcCloseW(getdccontexthandle: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsGetDcNameA(computername: Long, domainname: Long, domainguid: Long, sitename: Long, flags: Int, domaincontrollerinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsGetDcNameW(computername: Long, domainname: Long, domainguid: Long, sitename: Long, flags: Int, domaincontrollerinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsGetDcNextA(getdccontexthandle: Long, sockaddresscount: Long, sockaddresses: Long, dnshostname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsGetDcNextW(getdccontexthandle: Long, sockaddresscount: Long, sockaddresses: Long, dnshostname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsGetDcOpenA(dnsname: Long, optionflags: Int, sitename: Long, domainguid: Long, dnsforestname: Long, dcflags: Int, retgetdccontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsGetDcOpenW(dnsname: Long, optionflags: Int, sitename: Long, domainguid: Long, dnsforestname: Long, dcflags: Int, retgetdccontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsGetDcSiteCoverageA(servername: Long, entrycount: Long, sitenames: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsGetDcSiteCoverageW(servername: Long, entrycount: Long, sitenames: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsGetDomainControllerInfoA(hds: Long, domainname: Long, infolevel: Int, pcout: Long, ppinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsGetDomainControllerInfoW(hds: Long, domainname: Long, infolevel: Int, pcout: Long, ppinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsGetForestTrustInformationW(servername: Long, trusteddomainname: Long, flags: Int, foresttrustinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsGetFriendlyClassName(pszobjectclass: Long, pszbuffer: Long, cchbuffer: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsGetIcon(dwflags: Int, pszobjectclass: Long, cximage: Int, cyimage: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsGetRdnW(ppdn: Long, pcdn: Long, ppkey: Long, pckey: Long, ppval: Long, pcval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsGetSiteNameA(computername: Long, sitename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsGetSiteNameW(computername: Long, sitename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsGetSpnA(servicetype: Int, serviceclass: Long, servicename: Long, instanceport: Short, cinstancenames: Short, pinstancenames: Long, pinstanceports: Long, pcspn: Long, prpszspn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsGetSpnW(servicetype: Int, serviceclass: Long, servicename: Long, instanceport: Short, cinstancenames: Short, pinstancenames: Long, pinstanceports: Long, pcspn: Long, prpszspn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsInheritSecurityIdentityA(hds: Long, flags: Int, srcprincipal: Long, dstprincipal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsInheritSecurityIdentityW(hds: Long, flags: Int, srcprincipal: Long, dstprincipal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsIsMangledDnA(pszdn: Long, edsmanglefor: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsIsMangledDnW(pszdn: Long, edsmanglefor: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsIsMangledRdnValueA(pszrdn: Long, crdn: Int, edsmanglefordesired: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsIsMangledRdnValueW(pszrdn: Long, crdn: Int, edsmanglefordesired: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsListDomainsInSiteA(hds: Long, site: Long, ppdomains: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsListDomainsInSiteW(hds: Long, site: Long, ppdomains: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsListInfoForServerA(hds: Long, server: Long, ppinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsListInfoForServerW(hds: Long, server: Long, ppinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsListRolesA(hds: Long, pproles: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsListRolesW(hds: Long, pproles: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsListServersForDomainInSiteA(hds: Long, domain: Long, site: Long, ppservers: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsListServersForDomainInSiteW(hds: Long, domain: Long, site: Long, ppservers: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsListServersInSiteA(hds: Long, site: Long, ppservers: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsListServersInSiteW(hds: Long, site: Long, ppservers: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsListSitesA(hds: Long, ppsites: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsListSitesW(hds: Long, ppsites: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsMakePasswordCredentialsA(user: Long, domain: Long, password: Long, pauthidentity: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsMakePasswordCredentialsW(user: Long, domain: Long, password: Long, pauthidentity: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsMakeSpnA(serviceclass: Long, servicename: Long, instancename: Long, instanceport: Short, referrer: Long, pcspnlength: Long, pszspn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsMakeSpnW(serviceclass: Long, servicename: Long, instancename: Long, instanceport: Short, referrer: Long, pcspnlength: Long, pszspn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsMapSchemaGuidsA(hds: Long, cguids: Int, rguids: Long, ppguidmap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsMapSchemaGuidsW(hds: Long, cguids: Int, rguids: Long, ppguidmap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsMergeForestTrustInformationW(domainname: Long, newforesttrustinfo: Long, oldforesttrustinfo: Long, mergedforesttrustinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsQuerySitesByCostA(hds: Long, pszfromsite: Long, rgsztosites: Long, ctosites: Int, dwflags: Int, prgsiteinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsQuerySitesByCostW(hds: Long, pwszfromsite: Long, rgwsztosites: Long, ctosites: Int, dwflags: Int, prgsiteinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsQuerySitesFree(rgsiteinfo: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsQuoteRdnValueA(cunquotedrdnvaluelength: Int, psunquotedrdnvalue: Long, pcquotedrdnvaluelength: Long, psquotedrdnvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsQuoteRdnValueW(cunquotedrdnvaluelength: Int, psunquotedrdnvalue: Long, pcquotedrdnvaluelength: Long, psquotedrdnvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsRemoveDsDomainA(hds: Long, domaindn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsRemoveDsDomainW(hds: Long, domaindn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsRemoveDsServerA(hds: Long, serverdn: Long, domaindn: Long, flastdcindomain: Long, fcommit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsRemoveDsServerW(hds: Long, serverdn: Long, domaindn: Long, flastdcindomain: Long, fcommit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsReplicaAddA(hds: Long, namecontext: Long, sourcedsadn: Long, transportdn: Long, sourcedsaaddress: Long, pschedule: Long, options: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsReplicaAddW(hds: Long, namecontext: Long, sourcedsadn: Long, transportdn: Long, sourcedsaaddress: Long, pschedule: Long, options: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsReplicaConsistencyCheck(hds: Long, taskid: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsReplicaDelA(hds: Long, namecontext: Long, dsasrc: Long, options: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsReplicaDelW(hds: Long, namecontext: Long, dsasrc: Long, options: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsReplicaFreeInfo(infotype: Int, pinfo: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsReplicaGetInfo2W(hds: Long, infotype: Int, pszobject: Long, puuidforsourcedsaobjguid: Long, pszattributename: Long, pszvalue: Long, dwflags: Int, dwenumerationcontext: Int, ppinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsReplicaGetInfoW(hds: Long, infotype: Int, pszobject: Long, puuidforsourcedsaobjguid: Long, ppinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsReplicaModifyA(hds: Long, namecontext: Long, puuidsourcedsa: Long, transportdn: Long, sourcedsaaddress: Long, pschedule: Long, replicaflags: Int, modifyfields: Int, options: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsReplicaModifyW(hds: Long, namecontext: Long, puuidsourcedsa: Long, transportdn: Long, sourcedsaaddress: Long, pschedule: Long, replicaflags: Int, modifyfields: Int, options: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsReplicaSyncA(hds: Long, namecontext: Long, puuiddsasrc: Long, options: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsReplicaSyncAllA(hds: Long, psznamecontext: Long, ulflags: Int, pfncallback: Long, pcallbackdata: Long, perrors: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsReplicaSyncAllW(hds: Long, psznamecontext: Long, ulflags: Int, pfncallback: Long, pcallbackdata: Long, perrors: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsReplicaSyncW(hds: Long, namecontext: Long, puuiddsasrc: Long, options: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsReplicaUpdateRefsA(hds: Long, namecontext: Long, dsadest: Long, puuiddsadest: Long, options: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsReplicaUpdateRefsW(hds: Long, namecontext: Long, dsadest: Long, puuiddsadest: Long, options: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsReplicaVerifyObjectsA(hds: Long, namecontext: Long, puuiddsasrc: Long, uloptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsReplicaVerifyObjectsW(hds: Long, namecontext: Long, puuiddsasrc: Long, uloptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsRoleFreeMemory(buffer: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsRoleGetPrimaryDomainInformation(lpserver: Long, infolevel: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsServerRegisterSpnA(operation: Int, serviceclass: Long, userobjectdn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsServerRegisterSpnW(operation: Int, serviceclass: Long, userobjectdn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsUnBindA(phds: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsUnBindW(phds: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsUnquoteRdnValueA(cquotedrdnvaluelength: Int, psquotedrdnvalue: Long, pcunquotedrdnvaluelength: Long, psunquotedrdnvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsUnquoteRdnValueW(cquotedrdnvaluelength: Int, psquotedrdnvalue: Long, pcunquotedrdnvaluelength: Long, psunquotedrdnvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsValidateSubnetNameA(subnetname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsValidateSubnetNameW(subnetname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsWriteAccountSpnA(hds: Long, operation: Int, pszaccount: Long, cspn: Int, rpszspn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_dsWriteAccountSpnW(hds: Long, operation: Int, pszaccount: Long, cspn: Int, rpszspn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_freeADsMem(pmem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_freeADsStr(pstr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_propVariantToAdsType(pvariant: Long, dwnumvariant: Int, ppadsvalues: Long, pdwnumvalues: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_reallocADsMem(poldmem: Long, cbold: Int, cbnew: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_activedirectory_reallocADsStr(ppstr: Long, pstr: Long): Int
}

public actual fun aDsBuildEnumerator(padscontainer: COpaquePointer?, ppenumvariant: COpaquePointer?): Hresult =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_aDsBuildEnumerator((padscontainer?.value ?: 0L), (ppenumvariant?.value ?: 0L))

public actual fun aDsBuildVarArrayInt(lpdwobjecttypes: COpaquePointer?, dwobjecttypes: UInt, pvar: COpaquePointer?): Hresult =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_aDsBuildVarArrayInt((lpdwobjecttypes?.value ?: 0L), dwobjecttypes.toInt(), (pvar?.value ?: 0L))

public actual fun aDsBuildVarArrayStr(lpppathnames: COpaquePointer?, dwpathnames: UInt, pvar: COpaquePointer?): Hresult =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_aDsBuildVarArrayStr((lpppathnames?.value ?: 0L), dwpathnames.toInt(), (pvar?.value ?: 0L))

public actual fun aDsDecodeBinaryData(szsrcdata: Pcwstr, ppbdestdata: COpaquePointer?, pdwdestlen: COpaquePointer?): Hresult =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_aDsDecodeBinaryData((szsrcdata?.value ?: 0L), (ppbdestdata?.value ?: 0L), (pdwdestlen?.value ?: 0L))

public actual fun aDsEncodeBinaryData(pbsrcdata: COpaquePointer?, dwsrclen: UInt, ppszdestdata: COpaquePointer?): Hresult =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_aDsEncodeBinaryData((pbsrcdata?.value ?: 0L), dwsrclen.toInt(), (ppszdestdata?.value ?: 0L))

public actual fun aDsEnumerateNext(penumvariant: COpaquePointer?, celements: UInt, pvar: COpaquePointer?, pcelementsfetched: COpaquePointer?): Hresult =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_aDsEnumerateNext((penumvariant?.value ?: 0L), celements.toInt(), (pvar?.value ?: 0L), (pcelementsfetched?.value ?: 0L))

public actual fun aDsFreeEnumerator(penumvariant: COpaquePointer?): Hresult =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_aDsFreeEnumerator((penumvariant?.value ?: 0L))

public actual fun aDsGetLastError(lperror: COpaquePointer?, lperrorbuf: Pwstr, dwerrorbuflen: UInt, lpnamebuf: Pwstr, dwnamebuflen: UInt): Hresult =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_aDsGetLastError((lperror?.value ?: 0L), (lperrorbuf?.value ?: 0L), dwerrorbuflen.toInt(), (lpnamebuf?.value ?: 0L), dwnamebuflen.toInt())

public actual fun aDsGetObject(lpszpathname: Pcwstr, riid: COpaquePointer?, ppobject: COpaquePointer?): Hresult =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_aDsGetObject((lpszpathname?.value ?: 0L), (riid?.value ?: 0L), (ppobject?.value ?: 0L))

public actual fun aDsOpenObject(lpszpathname: Pcwstr, lpszusername: Pcwstr, lpszpassword: Pcwstr, dwreserved: AdsAuthenticationEnum, riid: COpaquePointer?, ppobject: COpaquePointer?): Hresult =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_aDsOpenObject((lpszpathname?.value ?: 0L), (lpszusername?.value ?: 0L), (lpszpassword?.value ?: 0L), dwreserved.toInt(), (riid?.value ?: 0L), (ppobject?.value ?: 0L))

public actual fun aDsPropCheckIfWritable(pwzattr: Pcwstr, pwritableattrs: COpaquePointer?): Bool =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_aDsPropCheckIfWritable((pwzattr?.value ?: 0L), (pwritableattrs?.value ?: 0L))

public actual fun aDsPropCreateNotifyObj(pappthddataobj: COpaquePointer?, pwzadsobjname: Pcwstr, phnotifyobj: COpaquePointer?): Hresult =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_aDsPropCreateNotifyObj((pappthddataobj?.value ?: 0L), (pwzadsobjname?.value ?: 0L), (phnotifyobj?.value ?: 0L))

public actual fun aDsPropGetInitInfo(hnotifyobj: Hwnd, pinitparams: COpaquePointer?): Bool =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_aDsPropGetInitInfo((hnotifyobj?.value ?: 0L), (pinitparams?.value ?: 0L))

public actual fun aDsPropSendErrorMessage(hnotifyobj: Hwnd, perror: COpaquePointer?): Bool =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_aDsPropSendErrorMessage((hnotifyobj?.value ?: 0L), (perror?.value ?: 0L))

public actual fun aDsPropSetHwnd(hnotifyobj: Hwnd, hpage: Hwnd): Bool =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_aDsPropSetHwnd((hnotifyobj?.value ?: 0L), (hpage?.value ?: 0L))

public actual fun aDsPropSetHwndWithTitle(hnotifyobj: Hwnd, hpage: Hwnd, ptztitle: COpaquePointer?): Bool =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_aDsPropSetHwndWithTitle((hnotifyobj?.value ?: 0L), (hpage?.value ?: 0L), (ptztitle?.value ?: 0L))

public actual fun aDsPropShowErrorDialog(hnotifyobj: Hwnd, hpage: Hwnd): Bool =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_aDsPropShowErrorDialog((hnotifyobj?.value ?: 0L), (hpage?.value ?: 0L))

public actual fun aDsSetLastError(dwerr: UInt, pszerror: Pcwstr, pszprovider: Pcwstr) {
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_aDsSetLastError(dwerr.toInt(), (pszerror?.value ?: 0L), (pszprovider?.value ?: 0L))
}

public actual fun adsFreeAdsValues(padsvalues: COpaquePointer?, dwnumvalues: UInt) {
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_adsFreeAdsValues((padsvalues?.value ?: 0L), dwnumvalues.toInt())
}

public actual fun adsTypeToPropVariant(padsvalues: COpaquePointer?, dwnumvalues: UInt, pvariant: COpaquePointer?): Hresult =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_adsTypeToPropVariant((padsvalues?.value ?: 0L), dwnumvalues.toInt(), (pvariant?.value ?: 0L))

public actual fun allocADsMem(cb: UInt): COpaquePointer? =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_allocADsMem(cb.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun allocADsStr(pstr: Pcwstr): Pwstr =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_allocADsStr((pstr?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun binarySDToSecurityDescriptor(psecuritydescriptor: PsecurityDescriptor, pvarsec: COpaquePointer?, pszservername: Pcwstr, username: Pcwstr, password: Pcwstr, dwflags: UInt): Hresult =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_binarySDToSecurityDescriptor((psecuritydescriptor?.value ?: 0L), (pvarsec?.value ?: 0L), (pszservername?.value ?: 0L), (username?.value ?: 0L), (password?.value ?: 0L), dwflags.toInt())

public actual fun dsAddSidHistoryA(hds: Handle, flags: UInt, srcdomain: Pcstr, srcprincipal: Pcstr, srcdomaincontroller: Pcstr, srcdomaincreds: COpaquePointer?, dstdomain: Pcstr, dstprincipal: Pcstr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsAddSidHistoryA((hds?.value ?: 0L), flags.toInt(), (srcdomain?.value ?: 0L), (srcprincipal?.value ?: 0L), (srcdomaincontroller?.value ?: 0L), (srcdomaincreds?.value ?: 0L), (dstdomain?.value ?: 0L), (dstprincipal?.value ?: 0L)).toUInt()

public actual fun dsAddSidHistoryW(hds: Handle, flags: UInt, srcdomain: Pcwstr, srcprincipal: Pcwstr, srcdomaincontroller: Pcwstr, srcdomaincreds: COpaquePointer?, dstdomain: Pcwstr, dstprincipal: Pcwstr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsAddSidHistoryW((hds?.value ?: 0L), flags.toInt(), (srcdomain?.value ?: 0L), (srcprincipal?.value ?: 0L), (srcdomaincontroller?.value ?: 0L), (srcdomaincreds?.value ?: 0L), (dstdomain?.value ?: 0L), (dstprincipal?.value ?: 0L)).toUInt()

public actual fun dsAddressToSiteNamesA(computername: Pcstr, entrycount: UInt, socketaddresses: COpaquePointer?, sitenames: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsAddressToSiteNamesA((computername?.value ?: 0L), entrycount.toInt(), (socketaddresses?.value ?: 0L), (sitenames?.value ?: 0L)).toUInt()

public actual fun dsAddressToSiteNamesExA(computername: Pcstr, entrycount: UInt, socketaddresses: COpaquePointer?, sitenames: COpaquePointer?, subnetnames: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsAddressToSiteNamesExA((computername?.value ?: 0L), entrycount.toInt(), (socketaddresses?.value ?: 0L), (sitenames?.value ?: 0L), (subnetnames?.value ?: 0L)).toUInt()

public actual fun dsAddressToSiteNamesExW(computername: Pcwstr, entrycount: UInt, socketaddresses: COpaquePointer?, sitenames: COpaquePointer?, subnetnames: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsAddressToSiteNamesExW((computername?.value ?: 0L), entrycount.toInt(), (socketaddresses?.value ?: 0L), (sitenames?.value ?: 0L), (subnetnames?.value ?: 0L)).toUInt()

public actual fun dsAddressToSiteNamesW(computername: Pcwstr, entrycount: UInt, socketaddresses: COpaquePointer?, sitenames: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsAddressToSiteNamesW((computername?.value ?: 0L), entrycount.toInt(), (socketaddresses?.value ?: 0L), (sitenames?.value ?: 0L)).toUInt()

public actual fun dsBindA(domaincontrollername: Pcstr, dnsdomainname: Pcstr, phds: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsBindA((domaincontrollername?.value ?: 0L), (dnsdomainname?.value ?: 0L), (phds?.value ?: 0L)).toUInt()

public actual fun dsBindByInstanceA(servername: Pcstr, annotation: Pcstr, instanceguid: COpaquePointer?, dnsdomainname: Pcstr, authidentity: COpaquePointer?, serviceprincipalname: Pcstr, bindflags: UInt, phds: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsBindByInstanceA((servername?.value ?: 0L), (annotation?.value ?: 0L), (instanceguid?.value ?: 0L), (dnsdomainname?.value ?: 0L), (authidentity?.value ?: 0L), (serviceprincipalname?.value ?: 0L), bindflags.toInt(), (phds?.value ?: 0L)).toUInt()

public actual fun dsBindByInstanceW(servername: Pcwstr, annotation: Pcwstr, instanceguid: COpaquePointer?, dnsdomainname: Pcwstr, authidentity: COpaquePointer?, serviceprincipalname: Pcwstr, bindflags: UInt, phds: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsBindByInstanceW((servername?.value ?: 0L), (annotation?.value ?: 0L), (instanceguid?.value ?: 0L), (dnsdomainname?.value ?: 0L), (authidentity?.value ?: 0L), (serviceprincipalname?.value ?: 0L), bindflags.toInt(), (phds?.value ?: 0L)).toUInt()

public actual fun dsBindToISTGA(sitename: Pcstr, phds: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsBindToISTGA((sitename?.value ?: 0L), (phds?.value ?: 0L)).toUInt()

public actual fun dsBindToISTGW(sitename: Pcwstr, phds: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsBindToISTGW((sitename?.value ?: 0L), (phds?.value ?: 0L)).toUInt()

public actual fun dsBindW(domaincontrollername: Pcwstr, dnsdomainname: Pcwstr, phds: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsBindW((domaincontrollername?.value ?: 0L), (dnsdomainname?.value ?: 0L), (phds?.value ?: 0L)).toUInt()

public actual fun dsBindWithCredA(domaincontrollername: Pcstr, dnsdomainname: Pcstr, authidentity: COpaquePointer?, phds: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsBindWithCredA((domaincontrollername?.value ?: 0L), (dnsdomainname?.value ?: 0L), (authidentity?.value ?: 0L), (phds?.value ?: 0L)).toUInt()

public actual fun dsBindWithCredW(domaincontrollername: Pcwstr, dnsdomainname: Pcwstr, authidentity: COpaquePointer?, phds: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsBindWithCredW((domaincontrollername?.value ?: 0L), (dnsdomainname?.value ?: 0L), (authidentity?.value ?: 0L), (phds?.value ?: 0L)).toUInt()

public actual fun dsBindWithSpnA(domaincontrollername: Pcstr, dnsdomainname: Pcstr, authidentity: COpaquePointer?, serviceprincipalname: Pcstr, phds: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsBindWithSpnA((domaincontrollername?.value ?: 0L), (dnsdomainname?.value ?: 0L), (authidentity?.value ?: 0L), (serviceprincipalname?.value ?: 0L), (phds?.value ?: 0L)).toUInt()

public actual fun dsBindWithSpnExA(domaincontrollername: Pcstr, dnsdomainname: Pcstr, authidentity: COpaquePointer?, serviceprincipalname: Pcstr, bindflags: UInt, phds: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsBindWithSpnExA((domaincontrollername?.value ?: 0L), (dnsdomainname?.value ?: 0L), (authidentity?.value ?: 0L), (serviceprincipalname?.value ?: 0L), bindflags.toInt(), (phds?.value ?: 0L)).toUInt()

public actual fun dsBindWithSpnExW(domaincontrollername: Pcwstr, dnsdomainname: Pcwstr, authidentity: COpaquePointer?, serviceprincipalname: Pcwstr, bindflags: UInt, phds: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsBindWithSpnExW((domaincontrollername?.value ?: 0L), (dnsdomainname?.value ?: 0L), (authidentity?.value ?: 0L), (serviceprincipalname?.value ?: 0L), bindflags.toInt(), (phds?.value ?: 0L)).toUInt()

public actual fun dsBindWithSpnW(domaincontrollername: Pcwstr, dnsdomainname: Pcwstr, authidentity: COpaquePointer?, serviceprincipalname: Pcwstr, phds: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsBindWithSpnW((domaincontrollername?.value ?: 0L), (dnsdomainname?.value ?: 0L), (authidentity?.value ?: 0L), (serviceprincipalname?.value ?: 0L), (phds?.value ?: 0L)).toUInt()

public actual fun dsBindingSetTimeout(hds: Handle, ctimeoutsecs: UInt): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsBindingSetTimeout((hds?.value ?: 0L), ctimeoutsecs.toInt()).toUInt()

public actual fun dsBrowseForContainerA(pinfo: COpaquePointer?): Int =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsBrowseForContainerA((pinfo?.value ?: 0L))

public actual fun dsBrowseForContainerW(pinfo: COpaquePointer?): Int =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsBrowseForContainerW((pinfo?.value ?: 0L))

public actual fun dsClientMakeSpnForTargetServerA(serviceclass: Pcstr, servicename: Pcstr, pcspnlength: COpaquePointer?, pszspn: Pstr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsClientMakeSpnForTargetServerA((serviceclass?.value ?: 0L), (servicename?.value ?: 0L), (pcspnlength?.value ?: 0L), (pszspn?.value ?: 0L)).toUInt()

public actual fun dsClientMakeSpnForTargetServerW(serviceclass: Pcwstr, servicename: Pcwstr, pcspnlength: COpaquePointer?, pszspn: Pwstr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsClientMakeSpnForTargetServerW((serviceclass?.value ?: 0L), (servicename?.value ?: 0L), (pcspnlength?.value ?: 0L), (pszspn?.value ?: 0L)).toUInt()

public actual fun dsCrackNamesA(hds: Handle, flags: DsNameFlags, formatoffered: DsNameFormat, formatdesired: DsNameFormat, cnames: UInt, rpnames: COpaquePointer?, ppresult: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsCrackNamesA((hds?.value ?: 0L), flags, formatoffered, formatdesired, cnames.toInt(), (rpnames?.value ?: 0L), (ppresult?.value ?: 0L)).toUInt()

public actual fun dsCrackNamesW(hds: Handle, flags: DsNameFlags, formatoffered: DsNameFormat, formatdesired: DsNameFormat, cnames: UInt, rpnames: COpaquePointer?, ppresult: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsCrackNamesW((hds?.value ?: 0L), flags, formatoffered, formatdesired, cnames.toInt(), (rpnames?.value ?: 0L), (ppresult?.value ?: 0L)).toUInt()

public actual fun dsCrackSpn2A(pszspn: Pcstr, cspn: UInt, pcserviceclass: COpaquePointer?, serviceclass: Pstr, pcservicename: COpaquePointer?, servicename: Pstr, pcinstancename: COpaquePointer?, instancename: Pstr, pinstanceport: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsCrackSpn2A((pszspn?.value ?: 0L), cspn.toInt(), (pcserviceclass?.value ?: 0L), (serviceclass?.value ?: 0L), (pcservicename?.value ?: 0L), (servicename?.value ?: 0L), (pcinstancename?.value ?: 0L), (instancename?.value ?: 0L), (pinstanceport?.value ?: 0L)).toUInt()

public actual fun dsCrackSpn2W(pszspn: Pcwstr, cspn: UInt, pcserviceclass: COpaquePointer?, serviceclass: Pwstr, pcservicename: COpaquePointer?, servicename: Pwstr, pcinstancename: COpaquePointer?, instancename: Pwstr, pinstanceport: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsCrackSpn2W((pszspn?.value ?: 0L), cspn.toInt(), (pcserviceclass?.value ?: 0L), (serviceclass?.value ?: 0L), (pcservicename?.value ?: 0L), (servicename?.value ?: 0L), (pcinstancename?.value ?: 0L), (instancename?.value ?: 0L), (pinstanceport?.value ?: 0L)).toUInt()

public actual fun dsCrackSpn3W(pszspn: Pcwstr, cspn: UInt, pchostname: COpaquePointer?, hostname: Pwstr, pcinstancename: COpaquePointer?, instancename: Pwstr, pportnumber: COpaquePointer?, pcdomainname: COpaquePointer?, domainname: Pwstr, pcrealmname: COpaquePointer?, realmname: Pwstr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsCrackSpn3W((pszspn?.value ?: 0L), cspn.toInt(), (pchostname?.value ?: 0L), (hostname?.value ?: 0L), (pcinstancename?.value ?: 0L), (instancename?.value ?: 0L), (pportnumber?.value ?: 0L), (pcdomainname?.value ?: 0L), (domainname?.value ?: 0L), (pcrealmname?.value ?: 0L), (realmname?.value ?: 0L)).toUInt()

public actual fun dsCrackSpn4W(pszspn: Pcwstr, cspn: UInt, pchostname: COpaquePointer?, hostname: Pwstr, pcinstancename: COpaquePointer?, instancename: Pwstr, pcportname: COpaquePointer?, portname: Pwstr, pcdomainname: COpaquePointer?, domainname: Pwstr, pcrealmname: COpaquePointer?, realmname: Pwstr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsCrackSpn4W((pszspn?.value ?: 0L), cspn.toInt(), (pchostname?.value ?: 0L), (hostname?.value ?: 0L), (pcinstancename?.value ?: 0L), (instancename?.value ?: 0L), (pcportname?.value ?: 0L), (portname?.value ?: 0L), (pcdomainname?.value ?: 0L), (domainname?.value ?: 0L), (pcrealmname?.value ?: 0L), (realmname?.value ?: 0L)).toUInt()

public actual fun dsCrackSpnA(pszspn: Pcstr, pcserviceclass: COpaquePointer?, serviceclass: Pstr, pcservicename: COpaquePointer?, servicename: Pstr, pcinstancename: COpaquePointer?, instancename: Pstr, pinstanceport: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsCrackSpnA((pszspn?.value ?: 0L), (pcserviceclass?.value ?: 0L), (serviceclass?.value ?: 0L), (pcservicename?.value ?: 0L), (servicename?.value ?: 0L), (pcinstancename?.value ?: 0L), (instancename?.value ?: 0L), (pinstanceport?.value ?: 0L)).toUInt()

public actual fun dsCrackSpnW(pszspn: Pcwstr, pcserviceclass: COpaquePointer?, serviceclass: Pwstr, pcservicename: COpaquePointer?, servicename: Pwstr, pcinstancename: COpaquePointer?, instancename: Pwstr, pinstanceport: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsCrackSpnW((pszspn?.value ?: 0L), (pcserviceclass?.value ?: 0L), (serviceclass?.value ?: 0L), (pcservicename?.value ?: 0L), (servicename?.value ?: 0L), (pcinstancename?.value ?: 0L), (instancename?.value ?: 0L), (pinstanceport?.value ?: 0L)).toUInt()

public actual fun dsCrackUnquotedMangledRdnA(pszrdn: Pcstr, cchrdn: UInt, pguid: COpaquePointer?, pedsmanglefor: COpaquePointer?): Bool =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsCrackUnquotedMangledRdnA((pszrdn?.value ?: 0L), cchrdn.toInt(), (pguid?.value ?: 0L), (pedsmanglefor?.value ?: 0L))

public actual fun dsCrackUnquotedMangledRdnW(pszrdn: Pcwstr, cchrdn: UInt, pguid: COpaquePointer?, pedsmanglefor: COpaquePointer?): Bool =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsCrackUnquotedMangledRdnW((pszrdn?.value ?: 0L), cchrdn.toInt(), (pguid?.value ?: 0L), (pedsmanglefor?.value ?: 0L))

public actual fun dsDeregisterDnsHostRecordsA(servername: Pcstr, dnsdomainname: Pcstr, domainguid: COpaquePointer?, dsaguid: COpaquePointer?, dnshostname: Pcstr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsDeregisterDnsHostRecordsA((servername?.value ?: 0L), (dnsdomainname?.value ?: 0L), (domainguid?.value ?: 0L), (dsaguid?.value ?: 0L), (dnshostname?.value ?: 0L)).toUInt()

public actual fun dsDeregisterDnsHostRecordsW(servername: Pcwstr, dnsdomainname: Pcwstr, domainguid: COpaquePointer?, dsaguid: COpaquePointer?, dnshostname: Pcwstr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsDeregisterDnsHostRecordsW((servername?.value ?: 0L), (dnsdomainname?.value ?: 0L), (domainguid?.value ?: 0L), (dsaguid?.value ?: 0L), (dnshostname?.value ?: 0L)).toUInt()

public actual fun dsEnumerateDomainTrustsA(servername: Pcstr, flags: UInt, domains: COpaquePointer?, domaincount: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsEnumerateDomainTrustsA((servername?.value ?: 0L), flags.toInt(), (domains?.value ?: 0L), (domaincount?.value ?: 0L)).toUInt()

public actual fun dsEnumerateDomainTrustsW(servername: Pcwstr, flags: UInt, domains: COpaquePointer?, domaincount: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsEnumerateDomainTrustsW((servername?.value ?: 0L), flags.toInt(), (domains?.value ?: 0L), (domaincount?.value ?: 0L)).toUInt()

public actual fun dsFreeDomainControllerInfoA(infolevel: UInt, cinfo: UInt, pinfo: COpaquePointer?) {
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsFreeDomainControllerInfoA(infolevel.toInt(), cinfo.toInt(), (pinfo?.value ?: 0L))
}

public actual fun dsFreeDomainControllerInfoW(infolevel: UInt, cinfo: UInt, pinfo: COpaquePointer?) {
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsFreeDomainControllerInfoW(infolevel.toInt(), cinfo.toInt(), (pinfo?.value ?: 0L))
}

public actual fun dsFreeNameResultA(presult: COpaquePointer?) {
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsFreeNameResultA((presult?.value ?: 0L))
}

public actual fun dsFreeNameResultW(presult: COpaquePointer?) {
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsFreeNameResultW((presult?.value ?: 0L))
}

public actual fun dsFreePasswordCredentials(authidentity: COpaquePointer?) {
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsFreePasswordCredentials((authidentity?.value ?: 0L))
}

public actual fun dsFreeSchemaGuidMapA(pguidmap: COpaquePointer?) {
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsFreeSchemaGuidMapA((pguidmap?.value ?: 0L))
}

public actual fun dsFreeSchemaGuidMapW(pguidmap: COpaquePointer?) {
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsFreeSchemaGuidMapW((pguidmap?.value ?: 0L))
}

public actual fun dsFreeSpnArrayA(cspn: UInt, rpszspn: COpaquePointer?) {
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsFreeSpnArrayA(cspn.toInt(), (rpszspn?.value ?: 0L))
}

public actual fun dsFreeSpnArrayW(cspn: UInt, rpszspn: COpaquePointer?) {
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsFreeSpnArrayW(cspn.toInt(), (rpszspn?.value ?: 0L))
}

public actual fun dsGetDcCloseW(getdccontexthandle: Handle) {
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsGetDcCloseW((getdccontexthandle?.value ?: 0L))
}

public actual fun dsGetDcNameA(computername: Pcstr, domainname: Pcstr, domainguid: COpaquePointer?, sitename: Pcstr, flags: UInt, domaincontrollerinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsGetDcNameA((computername?.value ?: 0L), (domainname?.value ?: 0L), (domainguid?.value ?: 0L), (sitename?.value ?: 0L), flags.toInt(), (domaincontrollerinfo?.value ?: 0L)).toUInt()

public actual fun dsGetDcNameW(computername: Pcwstr, domainname: Pcwstr, domainguid: COpaquePointer?, sitename: Pcwstr, flags: UInt, domaincontrollerinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsGetDcNameW((computername?.value ?: 0L), (domainname?.value ?: 0L), (domainguid?.value ?: 0L), (sitename?.value ?: 0L), flags.toInt(), (domaincontrollerinfo?.value ?: 0L)).toUInt()

public actual fun dsGetDcNextA(getdccontexthandle: Handle, sockaddresscount: COpaquePointer?, sockaddresses: COpaquePointer?, dnshostname: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsGetDcNextA((getdccontexthandle?.value ?: 0L), (sockaddresscount?.value ?: 0L), (sockaddresses?.value ?: 0L), (dnshostname?.value ?: 0L)).toUInt()

public actual fun dsGetDcNextW(getdccontexthandle: Handle, sockaddresscount: COpaquePointer?, sockaddresses: COpaquePointer?, dnshostname: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsGetDcNextW((getdccontexthandle?.value ?: 0L), (sockaddresscount?.value ?: 0L), (sockaddresses?.value ?: 0L), (dnshostname?.value ?: 0L)).toUInt()

public actual fun dsGetDcOpenA(dnsname: Pcstr, optionflags: UInt, sitename: Pcstr, domainguid: COpaquePointer?, dnsforestname: Pcstr, dcflags: UInt, retgetdccontext: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsGetDcOpenA((dnsname?.value ?: 0L), optionflags.toInt(), (sitename?.value ?: 0L), (domainguid?.value ?: 0L), (dnsforestname?.value ?: 0L), dcflags.toInt(), (retgetdccontext?.value ?: 0L)).toUInt()

public actual fun dsGetDcOpenW(dnsname: Pcwstr, optionflags: UInt, sitename: Pcwstr, domainguid: COpaquePointer?, dnsforestname: Pcwstr, dcflags: UInt, retgetdccontext: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsGetDcOpenW((dnsname?.value ?: 0L), optionflags.toInt(), (sitename?.value ?: 0L), (domainguid?.value ?: 0L), (dnsforestname?.value ?: 0L), dcflags.toInt(), (retgetdccontext?.value ?: 0L)).toUInt()

public actual fun dsGetDcSiteCoverageA(servername: Pcstr, entrycount: COpaquePointer?, sitenames: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsGetDcSiteCoverageA((servername?.value ?: 0L), (entrycount?.value ?: 0L), (sitenames?.value ?: 0L)).toUInt()

public actual fun dsGetDcSiteCoverageW(servername: Pcwstr, entrycount: COpaquePointer?, sitenames: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsGetDcSiteCoverageW((servername?.value ?: 0L), (entrycount?.value ?: 0L), (sitenames?.value ?: 0L)).toUInt()

public actual fun dsGetDomainControllerInfoA(hds: Handle, domainname: Pcstr, infolevel: UInt, pcout: COpaquePointer?, ppinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsGetDomainControllerInfoA((hds?.value ?: 0L), (domainname?.value ?: 0L), infolevel.toInt(), (pcout?.value ?: 0L), (ppinfo?.value ?: 0L)).toUInt()

public actual fun dsGetDomainControllerInfoW(hds: Handle, domainname: Pcwstr, infolevel: UInt, pcout: COpaquePointer?, ppinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsGetDomainControllerInfoW((hds?.value ?: 0L), (domainname?.value ?: 0L), infolevel.toInt(), (pcout?.value ?: 0L), (ppinfo?.value ?: 0L)).toUInt()

public actual fun dsGetForestTrustInformationW(servername: Pcwstr, trusteddomainname: Pcwstr, flags: UInt, foresttrustinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsGetForestTrustInformationW((servername?.value ?: 0L), (trusteddomainname?.value ?: 0L), flags.toInt(), (foresttrustinfo?.value ?: 0L)).toUInt()

public actual fun dsGetFriendlyClassName(pszobjectclass: Pcwstr, pszbuffer: Pwstr, cchbuffer: UInt): Hresult =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsGetFriendlyClassName((pszobjectclass?.value ?: 0L), (pszbuffer?.value ?: 0L), cchbuffer.toInt())

public actual fun dsGetIcon(dwflags: UInt, pszobjectclass: Pcwstr, cximage: Int, cyimage: Int): Hicon =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsGetIcon(dwflags.toInt(), (pszobjectclass?.value ?: 0L), cximage, cyimage).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dsGetRdnW(ppdn: COpaquePointer?, pcdn: COpaquePointer?, ppkey: COpaquePointer?, pckey: COpaquePointer?, ppval: COpaquePointer?, pcval: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsGetRdnW((ppdn?.value ?: 0L), (pcdn?.value ?: 0L), (ppkey?.value ?: 0L), (pckey?.value ?: 0L), (ppval?.value ?: 0L), (pcval?.value ?: 0L)).toUInt()

public actual fun dsGetSiteNameA(computername: Pcstr, sitename: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsGetSiteNameA((computername?.value ?: 0L), (sitename?.value ?: 0L)).toUInt()

public actual fun dsGetSiteNameW(computername: Pcwstr, sitename: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsGetSiteNameW((computername?.value ?: 0L), (sitename?.value ?: 0L)).toUInt()

public actual fun dsGetSpnA(servicetype: DsSpnNameType, serviceclass: Pcstr, servicename: Pcstr, instanceport: UShort, cinstancenames: UShort, pinstancenames: COpaquePointer?, pinstanceports: COpaquePointer?, pcspn: COpaquePointer?, prpszspn: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsGetSpnA(servicetype, (serviceclass?.value ?: 0L), (servicename?.value ?: 0L), instanceport.toShort(), cinstancenames.toShort(), (pinstancenames?.value ?: 0L), (pinstanceports?.value ?: 0L), (pcspn?.value ?: 0L), (prpszspn?.value ?: 0L)).toUInt()

public actual fun dsGetSpnW(servicetype: DsSpnNameType, serviceclass: Pcwstr, servicename: Pcwstr, instanceport: UShort, cinstancenames: UShort, pinstancenames: COpaquePointer?, pinstanceports: COpaquePointer?, pcspn: COpaquePointer?, prpszspn: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsGetSpnW(servicetype, (serviceclass?.value ?: 0L), (servicename?.value ?: 0L), instanceport.toShort(), cinstancenames.toShort(), (pinstancenames?.value ?: 0L), (pinstanceports?.value ?: 0L), (pcspn?.value ?: 0L), (prpszspn?.value ?: 0L)).toUInt()

public actual fun dsInheritSecurityIdentityA(hds: Handle, flags: UInt, srcprincipal: Pcstr, dstprincipal: Pcstr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsInheritSecurityIdentityA((hds?.value ?: 0L), flags.toInt(), (srcprincipal?.value ?: 0L), (dstprincipal?.value ?: 0L)).toUInt()

public actual fun dsInheritSecurityIdentityW(hds: Handle, flags: UInt, srcprincipal: Pcwstr, dstprincipal: Pcwstr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsInheritSecurityIdentityW((hds?.value ?: 0L), flags.toInt(), (srcprincipal?.value ?: 0L), (dstprincipal?.value ?: 0L)).toUInt()

public actual fun dsIsMangledDnA(pszdn: Pcstr, edsmanglefor: DsMangleFor): Bool =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsIsMangledDnA((pszdn?.value ?: 0L), edsmanglefor)

public actual fun dsIsMangledDnW(pszdn: Pcwstr, edsmanglefor: DsMangleFor): Bool =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsIsMangledDnW((pszdn?.value ?: 0L), edsmanglefor)

public actual fun dsIsMangledRdnValueA(pszrdn: Pcstr, crdn: UInt, edsmanglefordesired: DsMangleFor): Bool =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsIsMangledRdnValueA((pszrdn?.value ?: 0L), crdn.toInt(), edsmanglefordesired)

public actual fun dsIsMangledRdnValueW(pszrdn: Pcwstr, crdn: UInt, edsmanglefordesired: DsMangleFor): Bool =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsIsMangledRdnValueW((pszrdn?.value ?: 0L), crdn.toInt(), edsmanglefordesired)

public actual fun dsListDomainsInSiteA(hds: Handle, site: Pcstr, ppdomains: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsListDomainsInSiteA((hds?.value ?: 0L), (site?.value ?: 0L), (ppdomains?.value ?: 0L)).toUInt()

public actual fun dsListDomainsInSiteW(hds: Handle, site: Pcwstr, ppdomains: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsListDomainsInSiteW((hds?.value ?: 0L), (site?.value ?: 0L), (ppdomains?.value ?: 0L)).toUInt()

public actual fun dsListInfoForServerA(hds: Handle, server: Pcstr, ppinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsListInfoForServerA((hds?.value ?: 0L), (server?.value ?: 0L), (ppinfo?.value ?: 0L)).toUInt()

public actual fun dsListInfoForServerW(hds: Handle, server: Pcwstr, ppinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsListInfoForServerW((hds?.value ?: 0L), (server?.value ?: 0L), (ppinfo?.value ?: 0L)).toUInt()

public actual fun dsListRolesA(hds: Handle, pproles: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsListRolesA((hds?.value ?: 0L), (pproles?.value ?: 0L)).toUInt()

public actual fun dsListRolesW(hds: Handle, pproles: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsListRolesW((hds?.value ?: 0L), (pproles?.value ?: 0L)).toUInt()

public actual fun dsListServersForDomainInSiteA(hds: Handle, domain: Pcstr, site: Pcstr, ppservers: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsListServersForDomainInSiteA((hds?.value ?: 0L), (domain?.value ?: 0L), (site?.value ?: 0L), (ppservers?.value ?: 0L)).toUInt()

public actual fun dsListServersForDomainInSiteW(hds: Handle, domain: Pcwstr, site: Pcwstr, ppservers: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsListServersForDomainInSiteW((hds?.value ?: 0L), (domain?.value ?: 0L), (site?.value ?: 0L), (ppservers?.value ?: 0L)).toUInt()

public actual fun dsListServersInSiteA(hds: Handle, site: Pcstr, ppservers: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsListServersInSiteA((hds?.value ?: 0L), (site?.value ?: 0L), (ppservers?.value ?: 0L)).toUInt()

public actual fun dsListServersInSiteW(hds: Handle, site: Pcwstr, ppservers: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsListServersInSiteW((hds?.value ?: 0L), (site?.value ?: 0L), (ppservers?.value ?: 0L)).toUInt()

public actual fun dsListSitesA(hds: Handle, ppsites: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsListSitesA((hds?.value ?: 0L), (ppsites?.value ?: 0L)).toUInt()

public actual fun dsListSitesW(hds: Handle, ppsites: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsListSitesW((hds?.value ?: 0L), (ppsites?.value ?: 0L)).toUInt()

public actual fun dsMakePasswordCredentialsA(user: Pcstr, domain: Pcstr, password: Pcstr, pauthidentity: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsMakePasswordCredentialsA((user?.value ?: 0L), (domain?.value ?: 0L), (password?.value ?: 0L), (pauthidentity?.value ?: 0L)).toUInt()

public actual fun dsMakePasswordCredentialsW(user: Pcwstr, domain: Pcwstr, password: Pcwstr, pauthidentity: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsMakePasswordCredentialsW((user?.value ?: 0L), (domain?.value ?: 0L), (password?.value ?: 0L), (pauthidentity?.value ?: 0L)).toUInt()

public actual fun dsMakeSpnA(serviceclass: Pcstr, servicename: Pcstr, instancename: Pcstr, instanceport: UShort, referrer: Pcstr, pcspnlength: COpaquePointer?, pszspn: Pstr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsMakeSpnA((serviceclass?.value ?: 0L), (servicename?.value ?: 0L), (instancename?.value ?: 0L), instanceport.toShort(), (referrer?.value ?: 0L), (pcspnlength?.value ?: 0L), (pszspn?.value ?: 0L)).toUInt()

public actual fun dsMakeSpnW(serviceclass: Pcwstr, servicename: Pcwstr, instancename: Pcwstr, instanceport: UShort, referrer: Pcwstr, pcspnlength: COpaquePointer?, pszspn: Pwstr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsMakeSpnW((serviceclass?.value ?: 0L), (servicename?.value ?: 0L), (instancename?.value ?: 0L), instanceport.toShort(), (referrer?.value ?: 0L), (pcspnlength?.value ?: 0L), (pszspn?.value ?: 0L)).toUInt()

public actual fun dsMapSchemaGuidsA(hds: Handle, cguids: UInt, rguids: COpaquePointer?, ppguidmap: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsMapSchemaGuidsA((hds?.value ?: 0L), cguids.toInt(), (rguids?.value ?: 0L), (ppguidmap?.value ?: 0L)).toUInt()

public actual fun dsMapSchemaGuidsW(hds: Handle, cguids: UInt, rguids: COpaquePointer?, ppguidmap: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsMapSchemaGuidsW((hds?.value ?: 0L), cguids.toInt(), (rguids?.value ?: 0L), (ppguidmap?.value ?: 0L)).toUInt()

public actual fun dsMergeForestTrustInformationW(domainname: Pcwstr, newforesttrustinfo: COpaquePointer?, oldforesttrustinfo: COpaquePointer?, mergedforesttrustinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsMergeForestTrustInformationW((domainname?.value ?: 0L), (newforesttrustinfo?.value ?: 0L), (oldforesttrustinfo?.value ?: 0L), (mergedforesttrustinfo?.value ?: 0L)).toUInt()

public actual fun dsQuerySitesByCostA(hds: Handle, pszfromsite: Pcstr, rgsztosites: COpaquePointer?, ctosites: UInt, dwflags: UInt, prgsiteinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsQuerySitesByCostA((hds?.value ?: 0L), (pszfromsite?.value ?: 0L), (rgsztosites?.value ?: 0L), ctosites.toInt(), dwflags.toInt(), (prgsiteinfo?.value ?: 0L)).toUInt()

public actual fun dsQuerySitesByCostW(hds: Handle, pwszfromsite: Pcwstr, rgwsztosites: COpaquePointer?, ctosites: UInt, dwflags: UInt, prgsiteinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsQuerySitesByCostW((hds?.value ?: 0L), (pwszfromsite?.value ?: 0L), (rgwsztosites?.value ?: 0L), ctosites.toInt(), dwflags.toInt(), (prgsiteinfo?.value ?: 0L)).toUInt()

public actual fun dsQuerySitesFree(rgsiteinfo: COpaquePointer?) {
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsQuerySitesFree((rgsiteinfo?.value ?: 0L))
}

public actual fun dsQuoteRdnValueA(cunquotedrdnvaluelength: UInt, psunquotedrdnvalue: Pcstr, pcquotedrdnvaluelength: COpaquePointer?, psquotedrdnvalue: Pstr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsQuoteRdnValueA(cunquotedrdnvaluelength.toInt(), (psunquotedrdnvalue?.value ?: 0L), (pcquotedrdnvaluelength?.value ?: 0L), (psquotedrdnvalue?.value ?: 0L)).toUInt()

public actual fun dsQuoteRdnValueW(cunquotedrdnvaluelength: UInt, psunquotedrdnvalue: Pcwstr, pcquotedrdnvaluelength: COpaquePointer?, psquotedrdnvalue: Pwstr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsQuoteRdnValueW(cunquotedrdnvaluelength.toInt(), (psunquotedrdnvalue?.value ?: 0L), (pcquotedrdnvaluelength?.value ?: 0L), (psquotedrdnvalue?.value ?: 0L)).toUInt()

public actual fun dsRemoveDsDomainA(hds: Handle, domaindn: Pcstr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsRemoveDsDomainA((hds?.value ?: 0L), (domaindn?.value ?: 0L)).toUInt()

public actual fun dsRemoveDsDomainW(hds: Handle, domaindn: Pcwstr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsRemoveDsDomainW((hds?.value ?: 0L), (domaindn?.value ?: 0L)).toUInt()

public actual fun dsRemoveDsServerA(hds: Handle, serverdn: Pcstr, domaindn: Pcstr, flastdcindomain: COpaquePointer?, fcommit: Bool): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsRemoveDsServerA((hds?.value ?: 0L), (serverdn?.value ?: 0L), (domaindn?.value ?: 0L), (flastdcindomain?.value ?: 0L), fcommit).toUInt()

public actual fun dsRemoveDsServerW(hds: Handle, serverdn: Pcwstr, domaindn: Pcwstr, flastdcindomain: COpaquePointer?, fcommit: Bool): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsRemoveDsServerW((hds?.value ?: 0L), (serverdn?.value ?: 0L), (domaindn?.value ?: 0L), (flastdcindomain?.value ?: 0L), fcommit).toUInt()

public actual fun dsReplicaAddA(hds: Handle, namecontext: Pcstr, sourcedsadn: Pcstr, transportdn: Pcstr, sourcedsaaddress: Pcstr, pschedule: COpaquePointer?, options: UInt): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsReplicaAddA((hds?.value ?: 0L), (namecontext?.value ?: 0L), (sourcedsadn?.value ?: 0L), (transportdn?.value ?: 0L), (sourcedsaaddress?.value ?: 0L), (pschedule?.value ?: 0L), options.toInt()).toUInt()

public actual fun dsReplicaAddW(hds: Handle, namecontext: Pcwstr, sourcedsadn: Pcwstr, transportdn: Pcwstr, sourcedsaaddress: Pcwstr, pschedule: COpaquePointer?, options: UInt): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsReplicaAddW((hds?.value ?: 0L), (namecontext?.value ?: 0L), (sourcedsadn?.value ?: 0L), (transportdn?.value ?: 0L), (sourcedsaaddress?.value ?: 0L), (pschedule?.value ?: 0L), options.toInt()).toUInt()

public actual fun dsReplicaConsistencyCheck(hds: Handle, taskid: DsKccTaskid, dwflags: UInt): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsReplicaConsistencyCheck((hds?.value ?: 0L), taskid, dwflags.toInt()).toUInt()

public actual fun dsReplicaDelA(hds: Handle, namecontext: Pcstr, dsasrc: Pcstr, options: UInt): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsReplicaDelA((hds?.value ?: 0L), (namecontext?.value ?: 0L), (dsasrc?.value ?: 0L), options.toInt()).toUInt()

public actual fun dsReplicaDelW(hds: Handle, namecontext: Pcwstr, dsasrc: Pcwstr, options: UInt): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsReplicaDelW((hds?.value ?: 0L), (namecontext?.value ?: 0L), (dsasrc?.value ?: 0L), options.toInt()).toUInt()

public actual fun dsReplicaFreeInfo(infotype: DsReplInfoType, pinfo: COpaquePointer?) {
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsReplicaFreeInfo(infotype, (pinfo?.value ?: 0L))
}

public actual fun dsReplicaGetInfo2W(hds: Handle, infotype: DsReplInfoType, pszobject: Pcwstr, puuidforsourcedsaobjguid: COpaquePointer?, pszattributename: Pcwstr, pszvalue: Pcwstr, dwflags: UInt, dwenumerationcontext: UInt, ppinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsReplicaGetInfo2W((hds?.value ?: 0L), infotype, (pszobject?.value ?: 0L), (puuidforsourcedsaobjguid?.value ?: 0L), (pszattributename?.value ?: 0L), (pszvalue?.value ?: 0L), dwflags.toInt(), dwenumerationcontext.toInt(), (ppinfo?.value ?: 0L)).toUInt()

public actual fun dsReplicaGetInfoW(hds: Handle, infotype: DsReplInfoType, pszobject: Pcwstr, puuidforsourcedsaobjguid: COpaquePointer?, ppinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsReplicaGetInfoW((hds?.value ?: 0L), infotype, (pszobject?.value ?: 0L), (puuidforsourcedsaobjguid?.value ?: 0L), (ppinfo?.value ?: 0L)).toUInt()

public actual fun dsReplicaModifyA(hds: Handle, namecontext: Pcstr, puuidsourcedsa: COpaquePointer?, transportdn: Pcstr, sourcedsaaddress: Pcstr, pschedule: COpaquePointer?, replicaflags: UInt, modifyfields: UInt, options: UInt): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsReplicaModifyA((hds?.value ?: 0L), (namecontext?.value ?: 0L), (puuidsourcedsa?.value ?: 0L), (transportdn?.value ?: 0L), (sourcedsaaddress?.value ?: 0L), (pschedule?.value ?: 0L), replicaflags.toInt(), modifyfields.toInt(), options.toInt()).toUInt()

public actual fun dsReplicaModifyW(hds: Handle, namecontext: Pcwstr, puuidsourcedsa: COpaquePointer?, transportdn: Pcwstr, sourcedsaaddress: Pcwstr, pschedule: COpaquePointer?, replicaflags: UInt, modifyfields: UInt, options: UInt): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsReplicaModifyW((hds?.value ?: 0L), (namecontext?.value ?: 0L), (puuidsourcedsa?.value ?: 0L), (transportdn?.value ?: 0L), (sourcedsaaddress?.value ?: 0L), (pschedule?.value ?: 0L), replicaflags.toInt(), modifyfields.toInt(), options.toInt()).toUInt()

public actual fun dsReplicaSyncA(hds: Handle, namecontext: Pcstr, puuiddsasrc: COpaquePointer?, options: UInt): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsReplicaSyncA((hds?.value ?: 0L), (namecontext?.value ?: 0L), (puuiddsasrc?.value ?: 0L), options.toInt()).toUInt()

public actual fun dsReplicaSyncAllA(hds: Handle, psznamecontext: Pcstr, ulflags: UInt, pfncallback: Long, pcallbackdata: COpaquePointer?, perrors: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsReplicaSyncAllA((hds?.value ?: 0L), (psznamecontext?.value ?: 0L), ulflags.toInt(), pfncallback, (pcallbackdata?.value ?: 0L), (perrors?.value ?: 0L)).toUInt()

public actual fun dsReplicaSyncAllW(hds: Handle, psznamecontext: Pcwstr, ulflags: UInt, pfncallback: Long, pcallbackdata: COpaquePointer?, perrors: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsReplicaSyncAllW((hds?.value ?: 0L), (psznamecontext?.value ?: 0L), ulflags.toInt(), pfncallback, (pcallbackdata?.value ?: 0L), (perrors?.value ?: 0L)).toUInt()

public actual fun dsReplicaSyncW(hds: Handle, namecontext: Pcwstr, puuiddsasrc: COpaquePointer?, options: UInt): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsReplicaSyncW((hds?.value ?: 0L), (namecontext?.value ?: 0L), (puuiddsasrc?.value ?: 0L), options.toInt()).toUInt()

public actual fun dsReplicaUpdateRefsA(hds: Handle, namecontext: Pcstr, dsadest: Pcstr, puuiddsadest: COpaquePointer?, options: UInt): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsReplicaUpdateRefsA((hds?.value ?: 0L), (namecontext?.value ?: 0L), (dsadest?.value ?: 0L), (puuiddsadest?.value ?: 0L), options.toInt()).toUInt()

public actual fun dsReplicaUpdateRefsW(hds: Handle, namecontext: Pcwstr, dsadest: Pcwstr, puuiddsadest: COpaquePointer?, options: UInt): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsReplicaUpdateRefsW((hds?.value ?: 0L), (namecontext?.value ?: 0L), (dsadest?.value ?: 0L), (puuiddsadest?.value ?: 0L), options.toInt()).toUInt()

public actual fun dsReplicaVerifyObjectsA(hds: Handle, namecontext: Pcstr, puuiddsasrc: COpaquePointer?, uloptions: UInt): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsReplicaVerifyObjectsA((hds?.value ?: 0L), (namecontext?.value ?: 0L), (puuiddsasrc?.value ?: 0L), uloptions.toInt()).toUInt()

public actual fun dsReplicaVerifyObjectsW(hds: Handle, namecontext: Pcwstr, puuiddsasrc: COpaquePointer?, uloptions: UInt): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsReplicaVerifyObjectsW((hds?.value ?: 0L), (namecontext?.value ?: 0L), (puuiddsasrc?.value ?: 0L), uloptions.toInt()).toUInt()

public actual fun dsRoleFreeMemory(buffer: COpaquePointer?) {
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsRoleFreeMemory((buffer?.value ?: 0L))
}

public actual fun dsRoleGetPrimaryDomainInformation(lpserver: Pcwstr, infolevel: DsrolePrimaryDomainInfoLevel, buffer: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsRoleGetPrimaryDomainInformation((lpserver?.value ?: 0L), infolevel, (buffer?.value ?: 0L)).toUInt()

public actual fun dsServerRegisterSpnA(operation: DsSpnWriteOp, serviceclass: Pcstr, userobjectdn: Pcstr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsServerRegisterSpnA(operation, (serviceclass?.value ?: 0L), (userobjectdn?.value ?: 0L)).toUInt()

public actual fun dsServerRegisterSpnW(operation: DsSpnWriteOp, serviceclass: Pcwstr, userobjectdn: Pcwstr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsServerRegisterSpnW(operation, (serviceclass?.value ?: 0L), (userobjectdn?.value ?: 0L)).toUInt()

public actual fun dsUnBindA(phds: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsUnBindA((phds?.value ?: 0L)).toUInt()

public actual fun dsUnBindW(phds: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsUnBindW((phds?.value ?: 0L)).toUInt()

public actual fun dsUnquoteRdnValueA(cquotedrdnvaluelength: UInt, psquotedrdnvalue: Pcstr, pcunquotedrdnvaluelength: COpaquePointer?, psunquotedrdnvalue: Pstr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsUnquoteRdnValueA(cquotedrdnvaluelength.toInt(), (psquotedrdnvalue?.value ?: 0L), (pcunquotedrdnvaluelength?.value ?: 0L), (psunquotedrdnvalue?.value ?: 0L)).toUInt()

public actual fun dsUnquoteRdnValueW(cquotedrdnvaluelength: UInt, psquotedrdnvalue: Pcwstr, pcunquotedrdnvaluelength: COpaquePointer?, psunquotedrdnvalue: Pwstr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsUnquoteRdnValueW(cquotedrdnvaluelength.toInt(), (psquotedrdnvalue?.value ?: 0L), (pcunquotedrdnvaluelength?.value ?: 0L), (psunquotedrdnvalue?.value ?: 0L)).toUInt()

public actual fun dsValidateSubnetNameA(subnetname: Pcstr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsValidateSubnetNameA((subnetname?.value ?: 0L)).toUInt()

public actual fun dsValidateSubnetNameW(subnetname: Pcwstr): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsValidateSubnetNameW((subnetname?.value ?: 0L)).toUInt()

public actual fun dsWriteAccountSpnA(hds: Handle, operation: DsSpnWriteOp, pszaccount: Pcstr, cspn: UInt, rpszspn: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsWriteAccountSpnA((hds?.value ?: 0L), operation, (pszaccount?.value ?: 0L), cspn.toInt(), (rpszspn?.value ?: 0L)).toUInt()

public actual fun dsWriteAccountSpnW(hds: Handle, operation: DsSpnWriteOp, pszaccount: Pcwstr, cspn: UInt, rpszspn: COpaquePointer?): UInt =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_dsWriteAccountSpnW((hds?.value ?: 0L), operation, (pszaccount?.value ?: 0L), cspn.toInt(), (rpszspn?.value ?: 0L)).toUInt()

public actual fun freeADsMem(pmem: COpaquePointer?): Bool =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_freeADsMem((pmem?.value ?: 0L))

public actual fun freeADsStr(pstr: Pcwstr): Bool =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_freeADsStr((pstr?.value ?: 0L))

public actual fun propVariantToAdsType(pvariant: COpaquePointer?, dwnumvariant: UInt, ppadsvalues: COpaquePointer?, pdwnumvalues: COpaquePointer?): Hresult =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_propVariantToAdsType((pvariant?.value ?: 0L), dwnumvariant.toInt(), (ppadsvalues?.value ?: 0L), (pdwnumvalues?.value ?: 0L))

public actual fun reallocADsMem(poldmem: COpaquePointer?, cbold: UInt, cbnew: UInt): COpaquePointer? =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_reallocADsMem((poldmem?.value ?: 0L), cbold.toInt(), cbnew.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun reallocADsStr(ppstr: COpaquePointer?, pstr: Pcwstr): Bool =
    WindowsWin32NetworkingActivedirectoryJniBridge.windowssys_windows_win32_networking_activedirectory_reallocADsStr((ppstr?.value ?: 0L), (pstr?.value ?: 0L))

public actual fun securityDescriptorToBinarySD(vvarsecdes: Variant, ppsecuritydescriptor: COpaquePointer?, pdwsdlength: COpaquePointer?, pszservername: Pcwstr, username: Pcwstr, password: Pcwstr, dwflags: UInt): Hresult =
    0
