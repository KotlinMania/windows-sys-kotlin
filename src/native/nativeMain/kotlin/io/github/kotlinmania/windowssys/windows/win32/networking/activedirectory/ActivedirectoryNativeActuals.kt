@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun aDsBuildEnumerator(padscontainer: COpaquePointer?, ppenumvariant: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_aDsBuildEnumerator(padscontainer?.value?.toCPointer<ByteVar>(), ppenumvariant?.value?.toCPointer<ByteVar>())

public actual fun aDsBuildVarArrayInt(lpdwobjecttypes: COpaquePointer?, dwobjecttypes: UInt, pvar: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_aDsBuildVarArrayInt(lpdwobjecttypes?.value?.toCPointer<ByteVar>(), dwobjecttypes, pvar?.value?.toCPointer<ByteVar>())

public actual fun aDsBuildVarArrayStr(lpppathnames: COpaquePointer?, dwpathnames: UInt, pvar: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_aDsBuildVarArrayStr(lpppathnames?.value?.toCPointer<ByteVar>(), dwpathnames, pvar?.value?.toCPointer<ByteVar>())

public actual fun aDsDecodeBinaryData(szsrcdata: Pcwstr, ppbdestdata: COpaquePointer?, pdwdestlen: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_aDsDecodeBinaryData(szsrcdata?.value?.toCPointer<ByteVar>(), ppbdestdata?.value?.toCPointer<ByteVar>(), pdwdestlen?.value?.toCPointer<ByteVar>())

public actual fun aDsEncodeBinaryData(pbsrcdata: COpaquePointer?, dwsrclen: UInt, ppszdestdata: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_aDsEncodeBinaryData(pbsrcdata?.value?.toCPointer<ByteVar>(), dwsrclen, ppszdestdata?.value?.toCPointer<ByteVar>())

public actual fun aDsEnumerateNext(penumvariant: COpaquePointer?, celements: UInt, pvar: COpaquePointer?, pcelementsfetched: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_aDsEnumerateNext(penumvariant?.value?.toCPointer<ByteVar>(), celements, pvar?.value?.toCPointer<ByteVar>(), pcelementsfetched?.value?.toCPointer<ByteVar>())

public actual fun aDsFreeEnumerator(penumvariant: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_aDsFreeEnumerator(penumvariant?.value?.toCPointer<ByteVar>())

public actual fun aDsGetLastError(lperror: COpaquePointer?, lperrorbuf: Pwstr, dwerrorbuflen: UInt, lpnamebuf: Pwstr, dwnamebuflen: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_aDsGetLastError(lperror?.value?.toCPointer<ByteVar>(), lperrorbuf?.value?.toCPointer<ByteVar>(), dwerrorbuflen, lpnamebuf?.value?.toCPointer<ByteVar>(), dwnamebuflen)

public actual fun aDsGetObject(lpszpathname: Pcwstr, riid: COpaquePointer?, ppobject: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_aDsGetObject(lpszpathname?.value?.toCPointer<ByteVar>(), riid?.value?.toCPointer<ByteVar>(), ppobject?.value?.toCPointer<ByteVar>())

public actual fun aDsOpenObject(lpszpathname: Pcwstr, lpszusername: Pcwstr, lpszpassword: Pcwstr, dwreserved: AdsAuthenticationEnum, riid: COpaquePointer?, ppobject: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_aDsOpenObject(lpszpathname?.value?.toCPointer<ByteVar>(), lpszusername?.value?.toCPointer<ByteVar>(), lpszpassword?.value?.toCPointer<ByteVar>(), dwreserved, riid?.value?.toCPointer<ByteVar>(), ppobject?.value?.toCPointer<ByteVar>())

public actual fun aDsPropCheckIfWritable(pwzattr: Pcwstr, pwritableattrs: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_aDsPropCheckIfWritable(pwzattr?.value?.toCPointer<ByteVar>(), pwritableattrs?.value?.toCPointer<ByteVar>())

public actual fun aDsPropCreateNotifyObj(pappthddataobj: COpaquePointer?, pwzadsobjname: Pcwstr, phnotifyobj: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_aDsPropCreateNotifyObj(pappthddataobj?.value?.toCPointer<ByteVar>(), pwzadsobjname?.value?.toCPointer<ByteVar>(), phnotifyobj?.value?.toCPointer<ByteVar>())

public actual fun aDsPropGetInitInfo(hnotifyobj: Hwnd, pinitparams: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_aDsPropGetInitInfo(hnotifyobj?.value?.toCPointer<ByteVar>(), pinitparams?.value?.toCPointer<ByteVar>())

public actual fun aDsPropSendErrorMessage(hnotifyobj: Hwnd, perror: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_aDsPropSendErrorMessage(hnotifyobj?.value?.toCPointer<ByteVar>(), perror?.value?.toCPointer<ByteVar>())

public actual fun aDsPropSetHwnd(hnotifyobj: Hwnd, hpage: Hwnd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_aDsPropSetHwnd(hnotifyobj?.value?.toCPointer<ByteVar>(), hpage?.value?.toCPointer<ByteVar>())

public actual fun aDsPropSetHwndWithTitle(hnotifyobj: Hwnd, hpage: Hwnd, ptztitle: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_aDsPropSetHwndWithTitle(hnotifyobj?.value?.toCPointer<ByteVar>(), hpage?.value?.toCPointer<ByteVar>(), ptztitle?.value?.toCPointer<ByteVar>())

public actual fun aDsPropShowErrorDialog(hnotifyobj: Hwnd, hpage: Hwnd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_aDsPropShowErrorDialog(hnotifyobj?.value?.toCPointer<ByteVar>(), hpage?.value?.toCPointer<ByteVar>())

public actual fun aDsSetLastError(dwerr: UInt, pszerror: Pcwstr, pszprovider: Pcwstr) {
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_aDsSetLastError(dwerr, pszerror?.value?.toCPointer<ByteVar>(), pszprovider?.value?.toCPointer<ByteVar>())
}

public actual fun adsFreeAdsValues(padsvalues: COpaquePointer?, dwnumvalues: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_adsFreeAdsValues(padsvalues?.value?.toCPointer<ByteVar>(), dwnumvalues)
}

public actual fun adsTypeToPropVariant(padsvalues: COpaquePointer?, dwnumvalues: UInt, pvariant: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_adsTypeToPropVariant(padsvalues?.value?.toCPointer<ByteVar>(), dwnumvalues, pvariant?.value?.toCPointer<ByteVar>())

public actual fun allocADsMem(cb: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_allocADsMem(cb)?.let { COpaquePointer(it.toLong()) }

public actual fun allocADsStr(pstr: Pcwstr): Pwstr =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_allocADsStr(pstr?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun binarySDToSecurityDescriptor(psecuritydescriptor: PsecurityDescriptor, pvarsec: COpaquePointer?, pszservername: Pcwstr, username: Pcwstr, password: Pcwstr, dwflags: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_binarySDToSecurityDescriptor(psecuritydescriptor?.value?.toCPointer<ByteVar>(), pvarsec?.value?.toCPointer<ByteVar>(), pszservername?.value?.toCPointer<ByteVar>(), username?.value?.toCPointer<ByteVar>(), password?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun dsAddSidHistoryA(hds: Handle, flags: UInt, srcdomain: Pcstr, srcprincipal: Pcstr, srcdomaincontroller: Pcstr, srcdomaincreds: COpaquePointer?, dstdomain: Pcstr, dstprincipal: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsAddSidHistoryA(hds?.value?.toCPointer<ByteVar>(), flags, srcdomain?.value?.toCPointer<ByteVar>(), srcprincipal?.value?.toCPointer<ByteVar>(), srcdomaincontroller?.value?.toCPointer<ByteVar>(), srcdomaincreds?.value?.toCPointer<ByteVar>(), dstdomain?.value?.toCPointer<ByteVar>(), dstprincipal?.value?.toCPointer<ByteVar>())

public actual fun dsAddSidHistoryW(hds: Handle, flags: UInt, srcdomain: Pcwstr, srcprincipal: Pcwstr, srcdomaincontroller: Pcwstr, srcdomaincreds: COpaquePointer?, dstdomain: Pcwstr, dstprincipal: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsAddSidHistoryW(hds?.value?.toCPointer<ByteVar>(), flags, srcdomain?.value?.toCPointer<ByteVar>(), srcprincipal?.value?.toCPointer<ByteVar>(), srcdomaincontroller?.value?.toCPointer<ByteVar>(), srcdomaincreds?.value?.toCPointer<ByteVar>(), dstdomain?.value?.toCPointer<ByteVar>(), dstprincipal?.value?.toCPointer<ByteVar>())

public actual fun dsAddressToSiteNamesA(computername: Pcstr, entrycount: UInt, socketaddresses: COpaquePointer?, sitenames: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsAddressToSiteNamesA(computername?.value?.toCPointer<ByteVar>(), entrycount, socketaddresses?.value?.toCPointer<ByteVar>(), sitenames?.value?.toCPointer<ByteVar>())

public actual fun dsAddressToSiteNamesExA(computername: Pcstr, entrycount: UInt, socketaddresses: COpaquePointer?, sitenames: COpaquePointer?, subnetnames: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsAddressToSiteNamesExA(computername?.value?.toCPointer<ByteVar>(), entrycount, socketaddresses?.value?.toCPointer<ByteVar>(), sitenames?.value?.toCPointer<ByteVar>(), subnetnames?.value?.toCPointer<ByteVar>())

public actual fun dsAddressToSiteNamesExW(computername: Pcwstr, entrycount: UInt, socketaddresses: COpaquePointer?, sitenames: COpaquePointer?, subnetnames: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsAddressToSiteNamesExW(computername?.value?.toCPointer<ByteVar>(), entrycount, socketaddresses?.value?.toCPointer<ByteVar>(), sitenames?.value?.toCPointer<ByteVar>(), subnetnames?.value?.toCPointer<ByteVar>())

public actual fun dsAddressToSiteNamesW(computername: Pcwstr, entrycount: UInt, socketaddresses: COpaquePointer?, sitenames: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsAddressToSiteNamesW(computername?.value?.toCPointer<ByteVar>(), entrycount, socketaddresses?.value?.toCPointer<ByteVar>(), sitenames?.value?.toCPointer<ByteVar>())

public actual fun dsBindA(domaincontrollername: Pcstr, dnsdomainname: Pcstr, phds: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsBindA(domaincontrollername?.value?.toCPointer<ByteVar>(), dnsdomainname?.value?.toCPointer<ByteVar>(), phds?.value?.toCPointer<ByteVar>())

public actual fun dsBindByInstanceA(servername: Pcstr, annotation: Pcstr, instanceguid: COpaquePointer?, dnsdomainname: Pcstr, authidentity: COpaquePointer?, serviceprincipalname: Pcstr, bindflags: UInt, phds: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsBindByInstanceA(servername?.value?.toCPointer<ByteVar>(), annotation?.value?.toCPointer<ByteVar>(), instanceguid?.value?.toCPointer<ByteVar>(), dnsdomainname?.value?.toCPointer<ByteVar>(), authidentity?.value?.toCPointer<ByteVar>(), serviceprincipalname?.value?.toCPointer<ByteVar>(), bindflags, phds?.value?.toCPointer<ByteVar>())

public actual fun dsBindByInstanceW(servername: Pcwstr, annotation: Pcwstr, instanceguid: COpaquePointer?, dnsdomainname: Pcwstr, authidentity: COpaquePointer?, serviceprincipalname: Pcwstr, bindflags: UInt, phds: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsBindByInstanceW(servername?.value?.toCPointer<ByteVar>(), annotation?.value?.toCPointer<ByteVar>(), instanceguid?.value?.toCPointer<ByteVar>(), dnsdomainname?.value?.toCPointer<ByteVar>(), authidentity?.value?.toCPointer<ByteVar>(), serviceprincipalname?.value?.toCPointer<ByteVar>(), bindflags, phds?.value?.toCPointer<ByteVar>())

public actual fun dsBindToISTGA(sitename: Pcstr, phds: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsBindToISTGA(sitename?.value?.toCPointer<ByteVar>(), phds?.value?.toCPointer<ByteVar>())

public actual fun dsBindToISTGW(sitename: Pcwstr, phds: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsBindToISTGW(sitename?.value?.toCPointer<ByteVar>(), phds?.value?.toCPointer<ByteVar>())

public actual fun dsBindW(domaincontrollername: Pcwstr, dnsdomainname: Pcwstr, phds: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsBindW(domaincontrollername?.value?.toCPointer<ByteVar>(), dnsdomainname?.value?.toCPointer<ByteVar>(), phds?.value?.toCPointer<ByteVar>())

public actual fun dsBindWithCredA(domaincontrollername: Pcstr, dnsdomainname: Pcstr, authidentity: COpaquePointer?, phds: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsBindWithCredA(domaincontrollername?.value?.toCPointer<ByteVar>(), dnsdomainname?.value?.toCPointer<ByteVar>(), authidentity?.value?.toCPointer<ByteVar>(), phds?.value?.toCPointer<ByteVar>())

public actual fun dsBindWithCredW(domaincontrollername: Pcwstr, dnsdomainname: Pcwstr, authidentity: COpaquePointer?, phds: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsBindWithCredW(domaincontrollername?.value?.toCPointer<ByteVar>(), dnsdomainname?.value?.toCPointer<ByteVar>(), authidentity?.value?.toCPointer<ByteVar>(), phds?.value?.toCPointer<ByteVar>())

public actual fun dsBindWithSpnA(domaincontrollername: Pcstr, dnsdomainname: Pcstr, authidentity: COpaquePointer?, serviceprincipalname: Pcstr, phds: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsBindWithSpnA(domaincontrollername?.value?.toCPointer<ByteVar>(), dnsdomainname?.value?.toCPointer<ByteVar>(), authidentity?.value?.toCPointer<ByteVar>(), serviceprincipalname?.value?.toCPointer<ByteVar>(), phds?.value?.toCPointer<ByteVar>())

public actual fun dsBindWithSpnExA(domaincontrollername: Pcstr, dnsdomainname: Pcstr, authidentity: COpaquePointer?, serviceprincipalname: Pcstr, bindflags: UInt, phds: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsBindWithSpnExA(domaincontrollername?.value?.toCPointer<ByteVar>(), dnsdomainname?.value?.toCPointer<ByteVar>(), authidentity?.value?.toCPointer<ByteVar>(), serviceprincipalname?.value?.toCPointer<ByteVar>(), bindflags, phds?.value?.toCPointer<ByteVar>())

public actual fun dsBindWithSpnExW(domaincontrollername: Pcwstr, dnsdomainname: Pcwstr, authidentity: COpaquePointer?, serviceprincipalname: Pcwstr, bindflags: UInt, phds: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsBindWithSpnExW(domaincontrollername?.value?.toCPointer<ByteVar>(), dnsdomainname?.value?.toCPointer<ByteVar>(), authidentity?.value?.toCPointer<ByteVar>(), serviceprincipalname?.value?.toCPointer<ByteVar>(), bindflags, phds?.value?.toCPointer<ByteVar>())

public actual fun dsBindWithSpnW(domaincontrollername: Pcwstr, dnsdomainname: Pcwstr, authidentity: COpaquePointer?, serviceprincipalname: Pcwstr, phds: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsBindWithSpnW(domaincontrollername?.value?.toCPointer<ByteVar>(), dnsdomainname?.value?.toCPointer<ByteVar>(), authidentity?.value?.toCPointer<ByteVar>(), serviceprincipalname?.value?.toCPointer<ByteVar>(), phds?.value?.toCPointer<ByteVar>())

public actual fun dsBindingSetTimeout(hds: Handle, ctimeoutsecs: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsBindingSetTimeout(hds?.value?.toCPointer<ByteVar>(), ctimeoutsecs)

public actual fun dsBrowseForContainerA(pinfo: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsBrowseForContainerA(pinfo?.value?.toCPointer<ByteVar>())

public actual fun dsBrowseForContainerW(pinfo: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsBrowseForContainerW(pinfo?.value?.toCPointer<ByteVar>())

public actual fun dsClientMakeSpnForTargetServerA(serviceclass: Pcstr, servicename: Pcstr, pcspnlength: COpaquePointer?, pszspn: Pstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsClientMakeSpnForTargetServerA(serviceclass?.value?.toCPointer<ByteVar>(), servicename?.value?.toCPointer<ByteVar>(), pcspnlength?.value?.toCPointer<ByteVar>(), pszspn?.value?.toCPointer<ByteVar>())

public actual fun dsClientMakeSpnForTargetServerW(serviceclass: Pcwstr, servicename: Pcwstr, pcspnlength: COpaquePointer?, pszspn: Pwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsClientMakeSpnForTargetServerW(serviceclass?.value?.toCPointer<ByteVar>(), servicename?.value?.toCPointer<ByteVar>(), pcspnlength?.value?.toCPointer<ByteVar>(), pszspn?.value?.toCPointer<ByteVar>())

public actual fun dsCrackNamesA(hds: Handle, flags: DsNameFlags, formatoffered: DsNameFormat, formatdesired: DsNameFormat, cnames: UInt, rpnames: COpaquePointer?, ppresult: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsCrackNamesA(hds?.value?.toCPointer<ByteVar>(), flags, formatoffered, formatdesired, cnames, rpnames?.value?.toCPointer<ByteVar>(), ppresult?.value?.toCPointer<ByteVar>())

public actual fun dsCrackNamesW(hds: Handle, flags: DsNameFlags, formatoffered: DsNameFormat, formatdesired: DsNameFormat, cnames: UInt, rpnames: COpaquePointer?, ppresult: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsCrackNamesW(hds?.value?.toCPointer<ByteVar>(), flags, formatoffered, formatdesired, cnames, rpnames?.value?.toCPointer<ByteVar>(), ppresult?.value?.toCPointer<ByteVar>())

public actual fun dsCrackSpn2A(pszspn: Pcstr, cspn: UInt, pcserviceclass: COpaquePointer?, serviceclass: Pstr, pcservicename: COpaquePointer?, servicename: Pstr, pcinstancename: COpaquePointer?, instancename: Pstr, pinstanceport: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsCrackSpn2A(pszspn?.value?.toCPointer<ByteVar>(), cspn, pcserviceclass?.value?.toCPointer<ByteVar>(), serviceclass?.value?.toCPointer<ByteVar>(), pcservicename?.value?.toCPointer<ByteVar>(), servicename?.value?.toCPointer<ByteVar>(), pcinstancename?.value?.toCPointer<ByteVar>(), instancename?.value?.toCPointer<ByteVar>(), pinstanceport?.value?.toCPointer<ByteVar>())

public actual fun dsCrackSpn2W(pszspn: Pcwstr, cspn: UInt, pcserviceclass: COpaquePointer?, serviceclass: Pwstr, pcservicename: COpaquePointer?, servicename: Pwstr, pcinstancename: COpaquePointer?, instancename: Pwstr, pinstanceport: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsCrackSpn2W(pszspn?.value?.toCPointer<ByteVar>(), cspn, pcserviceclass?.value?.toCPointer<ByteVar>(), serviceclass?.value?.toCPointer<ByteVar>(), pcservicename?.value?.toCPointer<ByteVar>(), servicename?.value?.toCPointer<ByteVar>(), pcinstancename?.value?.toCPointer<ByteVar>(), instancename?.value?.toCPointer<ByteVar>(), pinstanceport?.value?.toCPointer<ByteVar>())

public actual fun dsCrackSpn3W(pszspn: Pcwstr, cspn: UInt, pchostname: COpaquePointer?, hostname: Pwstr, pcinstancename: COpaquePointer?, instancename: Pwstr, pportnumber: COpaquePointer?, pcdomainname: COpaquePointer?, domainname: Pwstr, pcrealmname: COpaquePointer?, realmname: Pwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsCrackSpn3W(pszspn?.value?.toCPointer<ByteVar>(), cspn, pchostname?.value?.toCPointer<ByteVar>(), hostname?.value?.toCPointer<ByteVar>(), pcinstancename?.value?.toCPointer<ByteVar>(), instancename?.value?.toCPointer<ByteVar>(), pportnumber?.value?.toCPointer<ByteVar>(), pcdomainname?.value?.toCPointer<ByteVar>(), domainname?.value?.toCPointer<ByteVar>(), pcrealmname?.value?.toCPointer<ByteVar>(), realmname?.value?.toCPointer<ByteVar>())

public actual fun dsCrackSpn4W(pszspn: Pcwstr, cspn: UInt, pchostname: COpaquePointer?, hostname: Pwstr, pcinstancename: COpaquePointer?, instancename: Pwstr, pcportname: COpaquePointer?, portname: Pwstr, pcdomainname: COpaquePointer?, domainname: Pwstr, pcrealmname: COpaquePointer?, realmname: Pwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsCrackSpn4W(pszspn?.value?.toCPointer<ByteVar>(), cspn, pchostname?.value?.toCPointer<ByteVar>(), hostname?.value?.toCPointer<ByteVar>(), pcinstancename?.value?.toCPointer<ByteVar>(), instancename?.value?.toCPointer<ByteVar>(), pcportname?.value?.toCPointer<ByteVar>(), portname?.value?.toCPointer<ByteVar>(), pcdomainname?.value?.toCPointer<ByteVar>(), domainname?.value?.toCPointer<ByteVar>(), pcrealmname?.value?.toCPointer<ByteVar>(), realmname?.value?.toCPointer<ByteVar>())

public actual fun dsCrackSpnA(pszspn: Pcstr, pcserviceclass: COpaquePointer?, serviceclass: Pstr, pcservicename: COpaquePointer?, servicename: Pstr, pcinstancename: COpaquePointer?, instancename: Pstr, pinstanceport: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsCrackSpnA(pszspn?.value?.toCPointer<ByteVar>(), pcserviceclass?.value?.toCPointer<ByteVar>(), serviceclass?.value?.toCPointer<ByteVar>(), pcservicename?.value?.toCPointer<ByteVar>(), servicename?.value?.toCPointer<ByteVar>(), pcinstancename?.value?.toCPointer<ByteVar>(), instancename?.value?.toCPointer<ByteVar>(), pinstanceport?.value?.toCPointer<ByteVar>())

public actual fun dsCrackSpnW(pszspn: Pcwstr, pcserviceclass: COpaquePointer?, serviceclass: Pwstr, pcservicename: COpaquePointer?, servicename: Pwstr, pcinstancename: COpaquePointer?, instancename: Pwstr, pinstanceport: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsCrackSpnW(pszspn?.value?.toCPointer<ByteVar>(), pcserviceclass?.value?.toCPointer<ByteVar>(), serviceclass?.value?.toCPointer<ByteVar>(), pcservicename?.value?.toCPointer<ByteVar>(), servicename?.value?.toCPointer<ByteVar>(), pcinstancename?.value?.toCPointer<ByteVar>(), instancename?.value?.toCPointer<ByteVar>(), pinstanceport?.value?.toCPointer<ByteVar>())

public actual fun dsCrackUnquotedMangledRdnA(pszrdn: Pcstr, cchrdn: UInt, pguid: COpaquePointer?, pedsmanglefor: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsCrackUnquotedMangledRdnA(pszrdn?.value?.toCPointer<ByteVar>(), cchrdn, pguid?.value?.toCPointer<ByteVar>(), pedsmanglefor?.value?.toCPointer<ByteVar>())

public actual fun dsCrackUnquotedMangledRdnW(pszrdn: Pcwstr, cchrdn: UInt, pguid: COpaquePointer?, pedsmanglefor: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsCrackUnquotedMangledRdnW(pszrdn?.value?.toCPointer<ByteVar>(), cchrdn, pguid?.value?.toCPointer<ByteVar>(), pedsmanglefor?.value?.toCPointer<ByteVar>())

public actual fun dsDeregisterDnsHostRecordsA(servername: Pcstr, dnsdomainname: Pcstr, domainguid: COpaquePointer?, dsaguid: COpaquePointer?, dnshostname: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsDeregisterDnsHostRecordsA(servername?.value?.toCPointer<ByteVar>(), dnsdomainname?.value?.toCPointer<ByteVar>(), domainguid?.value?.toCPointer<ByteVar>(), dsaguid?.value?.toCPointer<ByteVar>(), dnshostname?.value?.toCPointer<ByteVar>())

public actual fun dsDeregisterDnsHostRecordsW(servername: Pcwstr, dnsdomainname: Pcwstr, domainguid: COpaquePointer?, dsaguid: COpaquePointer?, dnshostname: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsDeregisterDnsHostRecordsW(servername?.value?.toCPointer<ByteVar>(), dnsdomainname?.value?.toCPointer<ByteVar>(), domainguid?.value?.toCPointer<ByteVar>(), dsaguid?.value?.toCPointer<ByteVar>(), dnshostname?.value?.toCPointer<ByteVar>())

public actual fun dsEnumerateDomainTrustsA(servername: Pcstr, flags: UInt, domains: COpaquePointer?, domaincount: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsEnumerateDomainTrustsA(servername?.value?.toCPointer<ByteVar>(), flags, domains?.value?.toCPointer<ByteVar>(), domaincount?.value?.toCPointer<ByteVar>())

public actual fun dsEnumerateDomainTrustsW(servername: Pcwstr, flags: UInt, domains: COpaquePointer?, domaincount: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsEnumerateDomainTrustsW(servername?.value?.toCPointer<ByteVar>(), flags, domains?.value?.toCPointer<ByteVar>(), domaincount?.value?.toCPointer<ByteVar>())

public actual fun dsFreeDomainControllerInfoA(infolevel: UInt, cinfo: UInt, pinfo: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsFreeDomainControllerInfoA(infolevel, cinfo, pinfo?.value?.toCPointer<ByteVar>())
}

public actual fun dsFreeDomainControllerInfoW(infolevel: UInt, cinfo: UInt, pinfo: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsFreeDomainControllerInfoW(infolevel, cinfo, pinfo?.value?.toCPointer<ByteVar>())
}

public actual fun dsFreeNameResultA(presult: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsFreeNameResultA(presult?.value?.toCPointer<ByteVar>())
}

public actual fun dsFreeNameResultW(presult: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsFreeNameResultW(presult?.value?.toCPointer<ByteVar>())
}

public actual fun dsFreePasswordCredentials(authidentity: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsFreePasswordCredentials(authidentity?.value?.toCPointer<ByteVar>())
}

public actual fun dsFreeSchemaGuidMapA(pguidmap: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsFreeSchemaGuidMapA(pguidmap?.value?.toCPointer<ByteVar>())
}

public actual fun dsFreeSchemaGuidMapW(pguidmap: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsFreeSchemaGuidMapW(pguidmap?.value?.toCPointer<ByteVar>())
}

public actual fun dsFreeSpnArrayA(cspn: UInt, rpszspn: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsFreeSpnArrayA(cspn, rpszspn?.value?.toCPointer<ByteVar>())
}

public actual fun dsFreeSpnArrayW(cspn: UInt, rpszspn: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsFreeSpnArrayW(cspn, rpszspn?.value?.toCPointer<ByteVar>())
}

public actual fun dsGetDcCloseW(getdccontexthandle: Handle) {
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsGetDcCloseW(getdccontexthandle?.value?.toCPointer<ByteVar>())
}

public actual fun dsGetDcNameA(computername: Pcstr, domainname: Pcstr, domainguid: COpaquePointer?, sitename: Pcstr, flags: UInt, domaincontrollerinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsGetDcNameA(computername?.value?.toCPointer<ByteVar>(), domainname?.value?.toCPointer<ByteVar>(), domainguid?.value?.toCPointer<ByteVar>(), sitename?.value?.toCPointer<ByteVar>(), flags, domaincontrollerinfo?.value?.toCPointer<ByteVar>())

public actual fun dsGetDcNameW(computername: Pcwstr, domainname: Pcwstr, domainguid: COpaquePointer?, sitename: Pcwstr, flags: UInt, domaincontrollerinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsGetDcNameW(computername?.value?.toCPointer<ByteVar>(), domainname?.value?.toCPointer<ByteVar>(), domainguid?.value?.toCPointer<ByteVar>(), sitename?.value?.toCPointer<ByteVar>(), flags, domaincontrollerinfo?.value?.toCPointer<ByteVar>())

public actual fun dsGetDcNextA(getdccontexthandle: Handle, sockaddresscount: COpaquePointer?, sockaddresses: COpaquePointer?, dnshostname: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsGetDcNextA(getdccontexthandle?.value?.toCPointer<ByteVar>(), sockaddresscount?.value?.toCPointer<ByteVar>(), sockaddresses?.value?.toCPointer<ByteVar>(), dnshostname?.value?.toCPointer<ByteVar>())

public actual fun dsGetDcNextW(getdccontexthandle: Handle, sockaddresscount: COpaquePointer?, sockaddresses: COpaquePointer?, dnshostname: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsGetDcNextW(getdccontexthandle?.value?.toCPointer<ByteVar>(), sockaddresscount?.value?.toCPointer<ByteVar>(), sockaddresses?.value?.toCPointer<ByteVar>(), dnshostname?.value?.toCPointer<ByteVar>())

public actual fun dsGetDcOpenA(dnsname: Pcstr, optionflags: UInt, sitename: Pcstr, domainguid: COpaquePointer?, dnsforestname: Pcstr, dcflags: UInt, retgetdccontext: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsGetDcOpenA(dnsname?.value?.toCPointer<ByteVar>(), optionflags, sitename?.value?.toCPointer<ByteVar>(), domainguid?.value?.toCPointer<ByteVar>(), dnsforestname?.value?.toCPointer<ByteVar>(), dcflags, retgetdccontext?.value?.toCPointer<ByteVar>())

public actual fun dsGetDcOpenW(dnsname: Pcwstr, optionflags: UInt, sitename: Pcwstr, domainguid: COpaquePointer?, dnsforestname: Pcwstr, dcflags: UInt, retgetdccontext: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsGetDcOpenW(dnsname?.value?.toCPointer<ByteVar>(), optionflags, sitename?.value?.toCPointer<ByteVar>(), domainguid?.value?.toCPointer<ByteVar>(), dnsforestname?.value?.toCPointer<ByteVar>(), dcflags, retgetdccontext?.value?.toCPointer<ByteVar>())

public actual fun dsGetDcSiteCoverageA(servername: Pcstr, entrycount: COpaquePointer?, sitenames: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsGetDcSiteCoverageA(servername?.value?.toCPointer<ByteVar>(), entrycount?.value?.toCPointer<ByteVar>(), sitenames?.value?.toCPointer<ByteVar>())

public actual fun dsGetDcSiteCoverageW(servername: Pcwstr, entrycount: COpaquePointer?, sitenames: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsGetDcSiteCoverageW(servername?.value?.toCPointer<ByteVar>(), entrycount?.value?.toCPointer<ByteVar>(), sitenames?.value?.toCPointer<ByteVar>())

public actual fun dsGetDomainControllerInfoA(hds: Handle, domainname: Pcstr, infolevel: UInt, pcout: COpaquePointer?, ppinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsGetDomainControllerInfoA(hds?.value?.toCPointer<ByteVar>(), domainname?.value?.toCPointer<ByteVar>(), infolevel, pcout?.value?.toCPointer<ByteVar>(), ppinfo?.value?.toCPointer<ByteVar>())

public actual fun dsGetDomainControllerInfoW(hds: Handle, domainname: Pcwstr, infolevel: UInt, pcout: COpaquePointer?, ppinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsGetDomainControllerInfoW(hds?.value?.toCPointer<ByteVar>(), domainname?.value?.toCPointer<ByteVar>(), infolevel, pcout?.value?.toCPointer<ByteVar>(), ppinfo?.value?.toCPointer<ByteVar>())

public actual fun dsGetForestTrustInformationW(servername: Pcwstr, trusteddomainname: Pcwstr, flags: UInt, foresttrustinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsGetForestTrustInformationW(servername?.value?.toCPointer<ByteVar>(), trusteddomainname?.value?.toCPointer<ByteVar>(), flags, foresttrustinfo?.value?.toCPointer<ByteVar>())

public actual fun dsGetFriendlyClassName(pszobjectclass: Pcwstr, pszbuffer: Pwstr, cchbuffer: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsGetFriendlyClassName(pszobjectclass?.value?.toCPointer<ByteVar>(), pszbuffer?.value?.toCPointer<ByteVar>(), cchbuffer)

public actual fun dsGetIcon(dwflags: UInt, pszobjectclass: Pcwstr, cximage: Int, cyimage: Int): Hicon =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsGetIcon(dwflags, pszobjectclass?.value?.toCPointer<ByteVar>(), cximage, cyimage)?.let { COpaquePointer(it.toLong()) }

public actual fun dsGetRdnW(ppdn: COpaquePointer?, pcdn: COpaquePointer?, ppkey: COpaquePointer?, pckey: COpaquePointer?, ppval: COpaquePointer?, pcval: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsGetRdnW(ppdn?.value?.toCPointer<ByteVar>(), pcdn?.value?.toCPointer<ByteVar>(), ppkey?.value?.toCPointer<ByteVar>(), pckey?.value?.toCPointer<ByteVar>(), ppval?.value?.toCPointer<ByteVar>(), pcval?.value?.toCPointer<ByteVar>())

public actual fun dsGetSiteNameA(computername: Pcstr, sitename: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsGetSiteNameA(computername?.value?.toCPointer<ByteVar>(), sitename?.value?.toCPointer<ByteVar>())

public actual fun dsGetSiteNameW(computername: Pcwstr, sitename: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsGetSiteNameW(computername?.value?.toCPointer<ByteVar>(), sitename?.value?.toCPointer<ByteVar>())

public actual fun dsGetSpnA(servicetype: DsSpnNameType, serviceclass: Pcstr, servicename: Pcstr, instanceport: UShort, cinstancenames: UShort, pinstancenames: COpaquePointer?, pinstanceports: COpaquePointer?, pcspn: COpaquePointer?, prpszspn: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsGetSpnA(servicetype, serviceclass?.value?.toCPointer<ByteVar>(), servicename?.value?.toCPointer<ByteVar>(), instanceport, cinstancenames, pinstancenames?.value?.toCPointer<ByteVar>(), pinstanceports?.value?.toCPointer<ByteVar>(), pcspn?.value?.toCPointer<ByteVar>(), prpszspn?.value?.toCPointer<ByteVar>())

public actual fun dsGetSpnW(servicetype: DsSpnNameType, serviceclass: Pcwstr, servicename: Pcwstr, instanceport: UShort, cinstancenames: UShort, pinstancenames: COpaquePointer?, pinstanceports: COpaquePointer?, pcspn: COpaquePointer?, prpszspn: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsGetSpnW(servicetype, serviceclass?.value?.toCPointer<ByteVar>(), servicename?.value?.toCPointer<ByteVar>(), instanceport, cinstancenames, pinstancenames?.value?.toCPointer<ByteVar>(), pinstanceports?.value?.toCPointer<ByteVar>(), pcspn?.value?.toCPointer<ByteVar>(), prpszspn?.value?.toCPointer<ByteVar>())

public actual fun dsInheritSecurityIdentityA(hds: Handle, flags: UInt, srcprincipal: Pcstr, dstprincipal: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsInheritSecurityIdentityA(hds?.value?.toCPointer<ByteVar>(), flags, srcprincipal?.value?.toCPointer<ByteVar>(), dstprincipal?.value?.toCPointer<ByteVar>())

public actual fun dsInheritSecurityIdentityW(hds: Handle, flags: UInt, srcprincipal: Pcwstr, dstprincipal: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsInheritSecurityIdentityW(hds?.value?.toCPointer<ByteVar>(), flags, srcprincipal?.value?.toCPointer<ByteVar>(), dstprincipal?.value?.toCPointer<ByteVar>())

public actual fun dsIsMangledDnA(pszdn: Pcstr, edsmanglefor: DsMangleFor): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsIsMangledDnA(pszdn?.value?.toCPointer<ByteVar>(), edsmanglefor)

public actual fun dsIsMangledDnW(pszdn: Pcwstr, edsmanglefor: DsMangleFor): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsIsMangledDnW(pszdn?.value?.toCPointer<ByteVar>(), edsmanglefor)

public actual fun dsIsMangledRdnValueA(pszrdn: Pcstr, crdn: UInt, edsmanglefordesired: DsMangleFor): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsIsMangledRdnValueA(pszrdn?.value?.toCPointer<ByteVar>(), crdn, edsmanglefordesired)

public actual fun dsIsMangledRdnValueW(pszrdn: Pcwstr, crdn: UInt, edsmanglefordesired: DsMangleFor): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsIsMangledRdnValueW(pszrdn?.value?.toCPointer<ByteVar>(), crdn, edsmanglefordesired)

public actual fun dsListDomainsInSiteA(hds: Handle, site: Pcstr, ppdomains: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsListDomainsInSiteA(hds?.value?.toCPointer<ByteVar>(), site?.value?.toCPointer<ByteVar>(), ppdomains?.value?.toCPointer<ByteVar>())

public actual fun dsListDomainsInSiteW(hds: Handle, site: Pcwstr, ppdomains: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsListDomainsInSiteW(hds?.value?.toCPointer<ByteVar>(), site?.value?.toCPointer<ByteVar>(), ppdomains?.value?.toCPointer<ByteVar>())

public actual fun dsListInfoForServerA(hds: Handle, server: Pcstr, ppinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsListInfoForServerA(hds?.value?.toCPointer<ByteVar>(), server?.value?.toCPointer<ByteVar>(), ppinfo?.value?.toCPointer<ByteVar>())

public actual fun dsListInfoForServerW(hds: Handle, server: Pcwstr, ppinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsListInfoForServerW(hds?.value?.toCPointer<ByteVar>(), server?.value?.toCPointer<ByteVar>(), ppinfo?.value?.toCPointer<ByteVar>())

public actual fun dsListRolesA(hds: Handle, pproles: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsListRolesA(hds?.value?.toCPointer<ByteVar>(), pproles?.value?.toCPointer<ByteVar>())

public actual fun dsListRolesW(hds: Handle, pproles: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsListRolesW(hds?.value?.toCPointer<ByteVar>(), pproles?.value?.toCPointer<ByteVar>())

public actual fun dsListServersForDomainInSiteA(hds: Handle, domain: Pcstr, site: Pcstr, ppservers: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsListServersForDomainInSiteA(hds?.value?.toCPointer<ByteVar>(), domain?.value?.toCPointer<ByteVar>(), site?.value?.toCPointer<ByteVar>(), ppservers?.value?.toCPointer<ByteVar>())

public actual fun dsListServersForDomainInSiteW(hds: Handle, domain: Pcwstr, site: Pcwstr, ppservers: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsListServersForDomainInSiteW(hds?.value?.toCPointer<ByteVar>(), domain?.value?.toCPointer<ByteVar>(), site?.value?.toCPointer<ByteVar>(), ppservers?.value?.toCPointer<ByteVar>())

public actual fun dsListServersInSiteA(hds: Handle, site: Pcstr, ppservers: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsListServersInSiteA(hds?.value?.toCPointer<ByteVar>(), site?.value?.toCPointer<ByteVar>(), ppservers?.value?.toCPointer<ByteVar>())

public actual fun dsListServersInSiteW(hds: Handle, site: Pcwstr, ppservers: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsListServersInSiteW(hds?.value?.toCPointer<ByteVar>(), site?.value?.toCPointer<ByteVar>(), ppservers?.value?.toCPointer<ByteVar>())

public actual fun dsListSitesA(hds: Handle, ppsites: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsListSitesA(hds?.value?.toCPointer<ByteVar>(), ppsites?.value?.toCPointer<ByteVar>())

public actual fun dsListSitesW(hds: Handle, ppsites: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsListSitesW(hds?.value?.toCPointer<ByteVar>(), ppsites?.value?.toCPointer<ByteVar>())

public actual fun dsMakePasswordCredentialsA(user: Pcstr, domain: Pcstr, password: Pcstr, pauthidentity: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsMakePasswordCredentialsA(user?.value?.toCPointer<ByteVar>(), domain?.value?.toCPointer<ByteVar>(), password?.value?.toCPointer<ByteVar>(), pauthidentity?.value?.toCPointer<ByteVar>())

public actual fun dsMakePasswordCredentialsW(user: Pcwstr, domain: Pcwstr, password: Pcwstr, pauthidentity: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsMakePasswordCredentialsW(user?.value?.toCPointer<ByteVar>(), domain?.value?.toCPointer<ByteVar>(), password?.value?.toCPointer<ByteVar>(), pauthidentity?.value?.toCPointer<ByteVar>())

public actual fun dsMakeSpnA(serviceclass: Pcstr, servicename: Pcstr, instancename: Pcstr, instanceport: UShort, referrer: Pcstr, pcspnlength: COpaquePointer?, pszspn: Pstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsMakeSpnA(serviceclass?.value?.toCPointer<ByteVar>(), servicename?.value?.toCPointer<ByteVar>(), instancename?.value?.toCPointer<ByteVar>(), instanceport, referrer?.value?.toCPointer<ByteVar>(), pcspnlength?.value?.toCPointer<ByteVar>(), pszspn?.value?.toCPointer<ByteVar>())

public actual fun dsMakeSpnW(serviceclass: Pcwstr, servicename: Pcwstr, instancename: Pcwstr, instanceport: UShort, referrer: Pcwstr, pcspnlength: COpaquePointer?, pszspn: Pwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsMakeSpnW(serviceclass?.value?.toCPointer<ByteVar>(), servicename?.value?.toCPointer<ByteVar>(), instancename?.value?.toCPointer<ByteVar>(), instanceport, referrer?.value?.toCPointer<ByteVar>(), pcspnlength?.value?.toCPointer<ByteVar>(), pszspn?.value?.toCPointer<ByteVar>())

public actual fun dsMapSchemaGuidsA(hds: Handle, cguids: UInt, rguids: COpaquePointer?, ppguidmap: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsMapSchemaGuidsA(hds?.value?.toCPointer<ByteVar>(), cguids, rguids?.value?.toCPointer<ByteVar>(), ppguidmap?.value?.toCPointer<ByteVar>())

public actual fun dsMapSchemaGuidsW(hds: Handle, cguids: UInt, rguids: COpaquePointer?, ppguidmap: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsMapSchemaGuidsW(hds?.value?.toCPointer<ByteVar>(), cguids, rguids?.value?.toCPointer<ByteVar>(), ppguidmap?.value?.toCPointer<ByteVar>())

public actual fun dsMergeForestTrustInformationW(domainname: Pcwstr, newforesttrustinfo: COpaquePointer?, oldforesttrustinfo: COpaquePointer?, mergedforesttrustinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsMergeForestTrustInformationW(domainname?.value?.toCPointer<ByteVar>(), newforesttrustinfo?.value?.toCPointer<ByteVar>(), oldforesttrustinfo?.value?.toCPointer<ByteVar>(), mergedforesttrustinfo?.value?.toCPointer<ByteVar>())

public actual fun dsQuerySitesByCostA(hds: Handle, pszfromsite: Pcstr, rgsztosites: COpaquePointer?, ctosites: UInt, dwflags: UInt, prgsiteinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsQuerySitesByCostA(hds?.value?.toCPointer<ByteVar>(), pszfromsite?.value?.toCPointer<ByteVar>(), rgsztosites?.value?.toCPointer<ByteVar>(), ctosites, dwflags, prgsiteinfo?.value?.toCPointer<ByteVar>())

public actual fun dsQuerySitesByCostW(hds: Handle, pwszfromsite: Pcwstr, rgwsztosites: COpaquePointer?, ctosites: UInt, dwflags: UInt, prgsiteinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsQuerySitesByCostW(hds?.value?.toCPointer<ByteVar>(), pwszfromsite?.value?.toCPointer<ByteVar>(), rgwsztosites?.value?.toCPointer<ByteVar>(), ctosites, dwflags, prgsiteinfo?.value?.toCPointer<ByteVar>())

public actual fun dsQuerySitesFree(rgsiteinfo: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsQuerySitesFree(rgsiteinfo?.value?.toCPointer<ByteVar>())
}

public actual fun dsQuoteRdnValueA(cunquotedrdnvaluelength: UInt, psunquotedrdnvalue: Pcstr, pcquotedrdnvaluelength: COpaquePointer?, psquotedrdnvalue: Pstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsQuoteRdnValueA(cunquotedrdnvaluelength, psunquotedrdnvalue?.value?.toCPointer<ByteVar>(), pcquotedrdnvaluelength?.value?.toCPointer<ByteVar>(), psquotedrdnvalue?.value?.toCPointer<ByteVar>())

public actual fun dsQuoteRdnValueW(cunquotedrdnvaluelength: UInt, psunquotedrdnvalue: Pcwstr, pcquotedrdnvaluelength: COpaquePointer?, psquotedrdnvalue: Pwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsQuoteRdnValueW(cunquotedrdnvaluelength, psunquotedrdnvalue?.value?.toCPointer<ByteVar>(), pcquotedrdnvaluelength?.value?.toCPointer<ByteVar>(), psquotedrdnvalue?.value?.toCPointer<ByteVar>())

public actual fun dsRemoveDsDomainA(hds: Handle, domaindn: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsRemoveDsDomainA(hds?.value?.toCPointer<ByteVar>(), domaindn?.value?.toCPointer<ByteVar>())

public actual fun dsRemoveDsDomainW(hds: Handle, domaindn: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsRemoveDsDomainW(hds?.value?.toCPointer<ByteVar>(), domaindn?.value?.toCPointer<ByteVar>())

public actual fun dsRemoveDsServerA(hds: Handle, serverdn: Pcstr, domaindn: Pcstr, flastdcindomain: COpaquePointer?, fcommit: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsRemoveDsServerA(hds?.value?.toCPointer<ByteVar>(), serverdn?.value?.toCPointer<ByteVar>(), domaindn?.value?.toCPointer<ByteVar>(), flastdcindomain?.value?.toCPointer<ByteVar>(), fcommit)

public actual fun dsRemoveDsServerW(hds: Handle, serverdn: Pcwstr, domaindn: Pcwstr, flastdcindomain: COpaquePointer?, fcommit: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsRemoveDsServerW(hds?.value?.toCPointer<ByteVar>(), serverdn?.value?.toCPointer<ByteVar>(), domaindn?.value?.toCPointer<ByteVar>(), flastdcindomain?.value?.toCPointer<ByteVar>(), fcommit)

public actual fun dsReplicaAddA(hds: Handle, namecontext: Pcstr, sourcedsadn: Pcstr, transportdn: Pcstr, sourcedsaaddress: Pcstr, pschedule: COpaquePointer?, options: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsReplicaAddA(hds?.value?.toCPointer<ByteVar>(), namecontext?.value?.toCPointer<ByteVar>(), sourcedsadn?.value?.toCPointer<ByteVar>(), transportdn?.value?.toCPointer<ByteVar>(), sourcedsaaddress?.value?.toCPointer<ByteVar>(), pschedule?.value?.toCPointer<ByteVar>(), options)

public actual fun dsReplicaAddW(hds: Handle, namecontext: Pcwstr, sourcedsadn: Pcwstr, transportdn: Pcwstr, sourcedsaaddress: Pcwstr, pschedule: COpaquePointer?, options: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsReplicaAddW(hds?.value?.toCPointer<ByteVar>(), namecontext?.value?.toCPointer<ByteVar>(), sourcedsadn?.value?.toCPointer<ByteVar>(), transportdn?.value?.toCPointer<ByteVar>(), sourcedsaaddress?.value?.toCPointer<ByteVar>(), pschedule?.value?.toCPointer<ByteVar>(), options)

public actual fun dsReplicaConsistencyCheck(hds: Handle, taskid: DsKccTaskid, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsReplicaConsistencyCheck(hds?.value?.toCPointer<ByteVar>(), taskid, dwflags)

public actual fun dsReplicaDelA(hds: Handle, namecontext: Pcstr, dsasrc: Pcstr, options: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsReplicaDelA(hds?.value?.toCPointer<ByteVar>(), namecontext?.value?.toCPointer<ByteVar>(), dsasrc?.value?.toCPointer<ByteVar>(), options)

public actual fun dsReplicaDelW(hds: Handle, namecontext: Pcwstr, dsasrc: Pcwstr, options: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsReplicaDelW(hds?.value?.toCPointer<ByteVar>(), namecontext?.value?.toCPointer<ByteVar>(), dsasrc?.value?.toCPointer<ByteVar>(), options)

public actual fun dsReplicaFreeInfo(infotype: DsReplInfoType, pinfo: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsReplicaFreeInfo(infotype, pinfo?.value?.toCPointer<ByteVar>())
}

public actual fun dsReplicaGetInfo2W(hds: Handle, infotype: DsReplInfoType, pszobject: Pcwstr, puuidforsourcedsaobjguid: COpaquePointer?, pszattributename: Pcwstr, pszvalue: Pcwstr, dwflags: UInt, dwenumerationcontext: UInt, ppinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsReplicaGetInfo2W(hds?.value?.toCPointer<ByteVar>(), infotype, pszobject?.value?.toCPointer<ByteVar>(), puuidforsourcedsaobjguid?.value?.toCPointer<ByteVar>(), pszattributename?.value?.toCPointer<ByteVar>(), pszvalue?.value?.toCPointer<ByteVar>(), dwflags, dwenumerationcontext, ppinfo?.value?.toCPointer<ByteVar>())

public actual fun dsReplicaGetInfoW(hds: Handle, infotype: DsReplInfoType, pszobject: Pcwstr, puuidforsourcedsaobjguid: COpaquePointer?, ppinfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsReplicaGetInfoW(hds?.value?.toCPointer<ByteVar>(), infotype, pszobject?.value?.toCPointer<ByteVar>(), puuidforsourcedsaobjguid?.value?.toCPointer<ByteVar>(), ppinfo?.value?.toCPointer<ByteVar>())

public actual fun dsReplicaModifyA(hds: Handle, namecontext: Pcstr, puuidsourcedsa: COpaquePointer?, transportdn: Pcstr, sourcedsaaddress: Pcstr, pschedule: COpaquePointer?, replicaflags: UInt, modifyfields: UInt, options: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsReplicaModifyA(hds?.value?.toCPointer<ByteVar>(), namecontext?.value?.toCPointer<ByteVar>(), puuidsourcedsa?.value?.toCPointer<ByteVar>(), transportdn?.value?.toCPointer<ByteVar>(), sourcedsaaddress?.value?.toCPointer<ByteVar>(), pschedule?.value?.toCPointer<ByteVar>(), replicaflags, modifyfields, options)

public actual fun dsReplicaModifyW(hds: Handle, namecontext: Pcwstr, puuidsourcedsa: COpaquePointer?, transportdn: Pcwstr, sourcedsaaddress: Pcwstr, pschedule: COpaquePointer?, replicaflags: UInt, modifyfields: UInt, options: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsReplicaModifyW(hds?.value?.toCPointer<ByteVar>(), namecontext?.value?.toCPointer<ByteVar>(), puuidsourcedsa?.value?.toCPointer<ByteVar>(), transportdn?.value?.toCPointer<ByteVar>(), sourcedsaaddress?.value?.toCPointer<ByteVar>(), pschedule?.value?.toCPointer<ByteVar>(), replicaflags, modifyfields, options)

public actual fun dsReplicaSyncA(hds: Handle, namecontext: Pcstr, puuiddsasrc: COpaquePointer?, options: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsReplicaSyncA(hds?.value?.toCPointer<ByteVar>(), namecontext?.value?.toCPointer<ByteVar>(), puuiddsasrc?.value?.toCPointer<ByteVar>(), options)

public actual fun dsReplicaSyncAllA(hds: Handle, psznamecontext: Pcstr, ulflags: UInt, pfncallback: Long, pcallbackdata: COpaquePointer?, perrors: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsReplicaSyncAllA(hds?.value?.toCPointer<ByteVar>(), psznamecontext?.value?.toCPointer<ByteVar>(), ulflags, pfncallback, pcallbackdata?.value?.toCPointer<ByteVar>(), perrors?.value?.toCPointer<ByteVar>())

public actual fun dsReplicaSyncAllW(hds: Handle, psznamecontext: Pcwstr, ulflags: UInt, pfncallback: Long, pcallbackdata: COpaquePointer?, perrors: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsReplicaSyncAllW(hds?.value?.toCPointer<ByteVar>(), psznamecontext?.value?.toCPointer<ByteVar>(), ulflags, pfncallback, pcallbackdata?.value?.toCPointer<ByteVar>(), perrors?.value?.toCPointer<ByteVar>())

public actual fun dsReplicaSyncW(hds: Handle, namecontext: Pcwstr, puuiddsasrc: COpaquePointer?, options: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsReplicaSyncW(hds?.value?.toCPointer<ByteVar>(), namecontext?.value?.toCPointer<ByteVar>(), puuiddsasrc?.value?.toCPointer<ByteVar>(), options)

public actual fun dsReplicaUpdateRefsA(hds: Handle, namecontext: Pcstr, dsadest: Pcstr, puuiddsadest: COpaquePointer?, options: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsReplicaUpdateRefsA(hds?.value?.toCPointer<ByteVar>(), namecontext?.value?.toCPointer<ByteVar>(), dsadest?.value?.toCPointer<ByteVar>(), puuiddsadest?.value?.toCPointer<ByteVar>(), options)

public actual fun dsReplicaUpdateRefsW(hds: Handle, namecontext: Pcwstr, dsadest: Pcwstr, puuiddsadest: COpaquePointer?, options: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsReplicaUpdateRefsW(hds?.value?.toCPointer<ByteVar>(), namecontext?.value?.toCPointer<ByteVar>(), dsadest?.value?.toCPointer<ByteVar>(), puuiddsadest?.value?.toCPointer<ByteVar>(), options)

public actual fun dsReplicaVerifyObjectsA(hds: Handle, namecontext: Pcstr, puuiddsasrc: COpaquePointer?, uloptions: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsReplicaVerifyObjectsA(hds?.value?.toCPointer<ByteVar>(), namecontext?.value?.toCPointer<ByteVar>(), puuiddsasrc?.value?.toCPointer<ByteVar>(), uloptions)

public actual fun dsReplicaVerifyObjectsW(hds: Handle, namecontext: Pcwstr, puuiddsasrc: COpaquePointer?, uloptions: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsReplicaVerifyObjectsW(hds?.value?.toCPointer<ByteVar>(), namecontext?.value?.toCPointer<ByteVar>(), puuiddsasrc?.value?.toCPointer<ByteVar>(), uloptions)

public actual fun dsRoleFreeMemory(buffer: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsRoleFreeMemory(buffer?.value?.toCPointer<ByteVar>())
}

public actual fun dsRoleGetPrimaryDomainInformation(lpserver: Pcwstr, infolevel: DsrolePrimaryDomainInfoLevel, buffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsRoleGetPrimaryDomainInformation(lpserver?.value?.toCPointer<ByteVar>(), infolevel, buffer?.value?.toCPointer<ByteVar>())

public actual fun dsServerRegisterSpnA(operation: DsSpnWriteOp, serviceclass: Pcstr, userobjectdn: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsServerRegisterSpnA(operation, serviceclass?.value?.toCPointer<ByteVar>(), userobjectdn?.value?.toCPointer<ByteVar>())

public actual fun dsServerRegisterSpnW(operation: DsSpnWriteOp, serviceclass: Pcwstr, userobjectdn: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsServerRegisterSpnW(operation, serviceclass?.value?.toCPointer<ByteVar>(), userobjectdn?.value?.toCPointer<ByteVar>())

public actual fun dsUnBindA(phds: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsUnBindA(phds?.value?.toCPointer<ByteVar>())

public actual fun dsUnBindW(phds: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsUnBindW(phds?.value?.toCPointer<ByteVar>())

public actual fun dsUnquoteRdnValueA(cquotedrdnvaluelength: UInt, psquotedrdnvalue: Pcstr, pcunquotedrdnvaluelength: COpaquePointer?, psunquotedrdnvalue: Pstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsUnquoteRdnValueA(cquotedrdnvaluelength, psquotedrdnvalue?.value?.toCPointer<ByteVar>(), pcunquotedrdnvaluelength?.value?.toCPointer<ByteVar>(), psunquotedrdnvalue?.value?.toCPointer<ByteVar>())

public actual fun dsUnquoteRdnValueW(cquotedrdnvaluelength: UInt, psquotedrdnvalue: Pcwstr, pcunquotedrdnvaluelength: COpaquePointer?, psunquotedrdnvalue: Pwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsUnquoteRdnValueW(cquotedrdnvaluelength, psquotedrdnvalue?.value?.toCPointer<ByteVar>(), pcunquotedrdnvaluelength?.value?.toCPointer<ByteVar>(), psunquotedrdnvalue?.value?.toCPointer<ByteVar>())

public actual fun dsValidateSubnetNameA(subnetname: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsValidateSubnetNameA(subnetname?.value?.toCPointer<ByteVar>())

public actual fun dsValidateSubnetNameW(subnetname: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsValidateSubnetNameW(subnetname?.value?.toCPointer<ByteVar>())

public actual fun dsWriteAccountSpnA(hds: Handle, operation: DsSpnWriteOp, pszaccount: Pcstr, cspn: UInt, rpszspn: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsWriteAccountSpnA(hds?.value?.toCPointer<ByteVar>(), operation, pszaccount?.value?.toCPointer<ByteVar>(), cspn, rpszspn?.value?.toCPointer<ByteVar>())

public actual fun dsWriteAccountSpnW(hds: Handle, operation: DsSpnWriteOp, pszaccount: Pcwstr, cspn: UInt, rpszspn: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_dsWriteAccountSpnW(hds?.value?.toCPointer<ByteVar>(), operation, pszaccount?.value?.toCPointer<ByteVar>(), cspn, rpszspn?.value?.toCPointer<ByteVar>())

public actual fun freeADsMem(pmem: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_freeADsMem(pmem?.value?.toCPointer<ByteVar>())

public actual fun freeADsStr(pstr: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_freeADsStr(pstr?.value?.toCPointer<ByteVar>())

public actual fun propVariantToAdsType(pvariant: COpaquePointer?, dwnumvariant: UInt, ppadsvalues: COpaquePointer?, pdwnumvalues: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_propVariantToAdsType(pvariant?.value?.toCPointer<ByteVar>(), dwnumvariant, ppadsvalues?.value?.toCPointer<ByteVar>(), pdwnumvalues?.value?.toCPointer<ByteVar>())

public actual fun reallocADsMem(poldmem: COpaquePointer?, cbold: UInt, cbnew: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_reallocADsMem(poldmem?.value?.toCPointer<ByteVar>(), cbold, cbnew)?.let { COpaquePointer(it.toLong()) }

public actual fun reallocADsStr(ppstr: COpaquePointer?, pstr: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_reallocADsStr(ppstr?.value?.toCPointer<ByteVar>(), pstr?.value?.toCPointer<ByteVar>())

public actual fun securityDescriptorToBinarySD(vvarsecdes: Variant, ppsecuritydescriptor: COpaquePointer?, pdwsdlength: COpaquePointer?, pszservername: Pcwstr, username: Pcwstr, password: Pcwstr, dwflags: UInt): Hresult =
    0
