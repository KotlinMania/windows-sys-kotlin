@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun ADsBuildEnumerator(padscontainer: Long, ppenumvariant: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_ADsBuildEnumerator(padscontainer.toCPointer<ByteVar>(), ppenumvariant.toCPointer<ByteVar>())

public actual fun ADsBuildVarArrayInt(lpdwobjecttypes: Long, dwobjecttypes: UInt, pvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_ADsBuildVarArrayInt(lpdwobjecttypes.toCPointer<ByteVar>(), dwobjecttypes, pvar.toCPointer<ByteVar>())

public actual fun ADsBuildVarArrayStr(lpppathnames: Long, dwpathnames: UInt, pvar: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_ADsBuildVarArrayStr(lpppathnames.toCPointer<ByteVar>(), dwpathnames, pvar.toCPointer<ByteVar>())

public actual fun ADsDecodeBinaryData(szsrcdata: PCWSTR, ppbdestdata: Long, pdwdestlen: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_ADsDecodeBinaryData(szsrcdata.toCPointer<ByteVar>(), ppbdestdata.toCPointer<ByteVar>(), pdwdestlen.toCPointer<ByteVar>())

public actual fun ADsEncodeBinaryData(pbsrcdata: Long, dwsrclen: UInt, ppszdestdata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_ADsEncodeBinaryData(pbsrcdata.toCPointer<ByteVar>(), dwsrclen, ppszdestdata.toCPointer<ByteVar>())

public actual fun ADsEnumerateNext(penumvariant: Long, celements: UInt, pvar: Long, pcelementsfetched: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_ADsEnumerateNext(penumvariant.toCPointer<ByteVar>(), celements, pvar.toCPointer<ByteVar>(), pcelementsfetched.toCPointer<ByteVar>())

public actual fun ADsFreeEnumerator(penumvariant: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_ADsFreeEnumerator(penumvariant.toCPointer<ByteVar>())

public actual fun ADsGetLastError(lperror: Long, lperrorbuf: PWSTR, dwerrorbuflen: UInt, lpnamebuf: PWSTR, dwnamebuflen: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_ADsGetLastError(lperror.toCPointer<ByteVar>(), lperrorbuf.toCPointer<ByteVar>(), dwerrorbuflen, lpnamebuf.toCPointer<ByteVar>(), dwnamebuflen)

public actual fun ADsGetObject(lpszpathname: PCWSTR, riid: Long, ppobject: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_ADsGetObject(lpszpathname.toCPointer<ByteVar>(), riid.toCPointer<ByteVar>(), ppobject.toCPointer<ByteVar>())

public actual fun ADsOpenObject(lpszpathname: PCWSTR, lpszusername: PCWSTR, lpszpassword: PCWSTR, dwreserved: ADS_AUTHENTICATION_ENUM, riid: Long, ppobject: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_ADsOpenObject(lpszpathname.toCPointer<ByteVar>(), lpszusername.toCPointer<ByteVar>(), lpszpassword.toCPointer<ByteVar>(), dwreserved, riid.toCPointer<ByteVar>(), ppobject.toCPointer<ByteVar>())

public actual fun ADsPropCheckIfWritable(pwzattr: PCWSTR, pwritableattrs: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_ADsPropCheckIfWritable(pwzattr.toCPointer<ByteVar>(), pwritableattrs.toCPointer<ByteVar>())

public actual fun ADsPropCreateNotifyObj(pappthddataobj: Long, pwzadsobjname: PCWSTR, phnotifyobj: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_ADsPropCreateNotifyObj(pappthddataobj.toCPointer<ByteVar>(), pwzadsobjname.toCPointer<ByteVar>(), phnotifyobj.toCPointer<ByteVar>())

public actual fun ADsPropGetInitInfo(hnotifyobj: HWND, pinitparams: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_ADsPropGetInitInfo(hnotifyobj.toCPointer<ByteVar>(), pinitparams.toCPointer<ByteVar>())

public actual fun ADsPropSendErrorMessage(hnotifyobj: HWND, perror: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_ADsPropSendErrorMessage(hnotifyobj.toCPointer<ByteVar>(), perror.toCPointer<ByteVar>())

public actual fun ADsPropSetHwnd(hnotifyobj: HWND, hpage: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_ADsPropSetHwnd(hnotifyobj.toCPointer<ByteVar>(), hpage.toCPointer<ByteVar>())

public actual fun ADsPropSetHwndWithTitle(hnotifyobj: HWND, hpage: HWND, ptztitle: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_ADsPropSetHwndWithTitle(hnotifyobj.toCPointer<ByteVar>(), hpage.toCPointer<ByteVar>(), ptztitle.toCPointer<ByteVar>())

public actual fun ADsPropShowErrorDialog(hnotifyobj: HWND, hpage: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_ADsPropShowErrorDialog(hnotifyobj.toCPointer<ByteVar>(), hpage.toCPointer<ByteVar>())

public actual fun ADsSetLastError(dwerr: UInt, pszerror: PCWSTR, pszprovider: PCWSTR) {
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_ADsSetLastError(dwerr, pszerror.toCPointer<ByteVar>(), pszprovider.toCPointer<ByteVar>())
}

public actual fun AdsFreeAdsValues(padsvalues: Long, dwnumvalues: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_AdsFreeAdsValues(padsvalues.toCPointer<ByteVar>(), dwnumvalues)
}

public actual fun AdsTypeToPropVariant(padsvalues: Long, dwnumvalues: UInt, pvariant: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_AdsTypeToPropVariant(padsvalues.toCPointer<ByteVar>(), dwnumvalues, pvariant.toCPointer<ByteVar>())

public actual fun AllocADsMem(cb: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_AllocADsMem(cb)?.toLong() ?: 0L

public actual fun AllocADsStr(pstr: PCWSTR): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_AllocADsStr(pstr.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun BinarySDToSecurityDescriptor(psecuritydescriptor: PSECURITY_DESCRIPTOR, pvarsec: Long, pszservername: PCWSTR, username: PCWSTR, password: PCWSTR, dwflags: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_BinarySDToSecurityDescriptor(psecuritydescriptor.toCPointer<ByteVar>(), pvarsec.toCPointer<ByteVar>(), pszservername.toCPointer<ByteVar>(), username.toCPointer<ByteVar>(), password.toCPointer<ByteVar>(), dwflags)

public actual fun DsAddSidHistoryA(hds: HANDLE, flags: UInt, srcdomain: PCSTR, srcprincipal: PCSTR, srcdomaincontroller: PCSTR, srcdomaincreds: Long, dstdomain: PCSTR, dstprincipal: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsAddSidHistoryA(hds.toCPointer<ByteVar>(), flags, srcdomain.toCPointer<ByteVar>(), srcprincipal.toCPointer<ByteVar>(), srcdomaincontroller.toCPointer<ByteVar>(), srcdomaincreds.toCPointer<ByteVar>(), dstdomain.toCPointer<ByteVar>(), dstprincipal.toCPointer<ByteVar>())

public actual fun DsAddSidHistoryW(hds: HANDLE, flags: UInt, srcdomain: PCWSTR, srcprincipal: PCWSTR, srcdomaincontroller: PCWSTR, srcdomaincreds: Long, dstdomain: PCWSTR, dstprincipal: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsAddSidHistoryW(hds.toCPointer<ByteVar>(), flags, srcdomain.toCPointer<ByteVar>(), srcprincipal.toCPointer<ByteVar>(), srcdomaincontroller.toCPointer<ByteVar>(), srcdomaincreds.toCPointer<ByteVar>(), dstdomain.toCPointer<ByteVar>(), dstprincipal.toCPointer<ByteVar>())

public actual fun DsAddressToSiteNamesA(computername: PCSTR, entrycount: UInt, socketaddresses: Long, sitenames: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsAddressToSiteNamesA(computername.toCPointer<ByteVar>(), entrycount, socketaddresses.toCPointer<ByteVar>(), sitenames.toCPointer<ByteVar>())

public actual fun DsAddressToSiteNamesExA(computername: PCSTR, entrycount: UInt, socketaddresses: Long, sitenames: Long, subnetnames: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsAddressToSiteNamesExA(computername.toCPointer<ByteVar>(), entrycount, socketaddresses.toCPointer<ByteVar>(), sitenames.toCPointer<ByteVar>(), subnetnames.toCPointer<ByteVar>())

public actual fun DsAddressToSiteNamesExW(computername: PCWSTR, entrycount: UInt, socketaddresses: Long, sitenames: Long, subnetnames: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsAddressToSiteNamesExW(computername.toCPointer<ByteVar>(), entrycount, socketaddresses.toCPointer<ByteVar>(), sitenames.toCPointer<ByteVar>(), subnetnames.toCPointer<ByteVar>())

public actual fun DsAddressToSiteNamesW(computername: PCWSTR, entrycount: UInt, socketaddresses: Long, sitenames: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsAddressToSiteNamesW(computername.toCPointer<ByteVar>(), entrycount, socketaddresses.toCPointer<ByteVar>(), sitenames.toCPointer<ByteVar>())

public actual fun DsBindA(domaincontrollername: PCSTR, dnsdomainname: PCSTR, phds: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsBindA(domaincontrollername.toCPointer<ByteVar>(), dnsdomainname.toCPointer<ByteVar>(), phds.toCPointer<ByteVar>())

public actual fun DsBindByInstanceA(servername: PCSTR, annotation: PCSTR, instanceguid: Long, dnsdomainname: PCSTR, authidentity: Long, serviceprincipalname: PCSTR, bindflags: UInt, phds: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsBindByInstanceA(servername.toCPointer<ByteVar>(), annotation.toCPointer<ByteVar>(), instanceguid.toCPointer<ByteVar>(), dnsdomainname.toCPointer<ByteVar>(), authidentity.toCPointer<ByteVar>(), serviceprincipalname.toCPointer<ByteVar>(), bindflags, phds.toCPointer<ByteVar>())

public actual fun DsBindByInstanceW(servername: PCWSTR, annotation: PCWSTR, instanceguid: Long, dnsdomainname: PCWSTR, authidentity: Long, serviceprincipalname: PCWSTR, bindflags: UInt, phds: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsBindByInstanceW(servername.toCPointer<ByteVar>(), annotation.toCPointer<ByteVar>(), instanceguid.toCPointer<ByteVar>(), dnsdomainname.toCPointer<ByteVar>(), authidentity.toCPointer<ByteVar>(), serviceprincipalname.toCPointer<ByteVar>(), bindflags, phds.toCPointer<ByteVar>())

public actual fun DsBindToISTGA(sitename: PCSTR, phds: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsBindToISTGA(sitename.toCPointer<ByteVar>(), phds.toCPointer<ByteVar>())

public actual fun DsBindToISTGW(sitename: PCWSTR, phds: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsBindToISTGW(sitename.toCPointer<ByteVar>(), phds.toCPointer<ByteVar>())

public actual fun DsBindW(domaincontrollername: PCWSTR, dnsdomainname: PCWSTR, phds: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsBindW(domaincontrollername.toCPointer<ByteVar>(), dnsdomainname.toCPointer<ByteVar>(), phds.toCPointer<ByteVar>())

public actual fun DsBindWithCredA(domaincontrollername: PCSTR, dnsdomainname: PCSTR, authidentity: Long, phds: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsBindWithCredA(domaincontrollername.toCPointer<ByteVar>(), dnsdomainname.toCPointer<ByteVar>(), authidentity.toCPointer<ByteVar>(), phds.toCPointer<ByteVar>())

public actual fun DsBindWithCredW(domaincontrollername: PCWSTR, dnsdomainname: PCWSTR, authidentity: Long, phds: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsBindWithCredW(domaincontrollername.toCPointer<ByteVar>(), dnsdomainname.toCPointer<ByteVar>(), authidentity.toCPointer<ByteVar>(), phds.toCPointer<ByteVar>())

public actual fun DsBindWithSpnA(domaincontrollername: PCSTR, dnsdomainname: PCSTR, authidentity: Long, serviceprincipalname: PCSTR, phds: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsBindWithSpnA(domaincontrollername.toCPointer<ByteVar>(), dnsdomainname.toCPointer<ByteVar>(), authidentity.toCPointer<ByteVar>(), serviceprincipalname.toCPointer<ByteVar>(), phds.toCPointer<ByteVar>())

public actual fun DsBindWithSpnExA(domaincontrollername: PCSTR, dnsdomainname: PCSTR, authidentity: Long, serviceprincipalname: PCSTR, bindflags: UInt, phds: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsBindWithSpnExA(domaincontrollername.toCPointer<ByteVar>(), dnsdomainname.toCPointer<ByteVar>(), authidentity.toCPointer<ByteVar>(), serviceprincipalname.toCPointer<ByteVar>(), bindflags, phds.toCPointer<ByteVar>())

public actual fun DsBindWithSpnExW(domaincontrollername: PCWSTR, dnsdomainname: PCWSTR, authidentity: Long, serviceprincipalname: PCWSTR, bindflags: UInt, phds: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsBindWithSpnExW(domaincontrollername.toCPointer<ByteVar>(), dnsdomainname.toCPointer<ByteVar>(), authidentity.toCPointer<ByteVar>(), serviceprincipalname.toCPointer<ByteVar>(), bindflags, phds.toCPointer<ByteVar>())

public actual fun DsBindWithSpnW(domaincontrollername: PCWSTR, dnsdomainname: PCWSTR, authidentity: Long, serviceprincipalname: PCWSTR, phds: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsBindWithSpnW(domaincontrollername.toCPointer<ByteVar>(), dnsdomainname.toCPointer<ByteVar>(), authidentity.toCPointer<ByteVar>(), serviceprincipalname.toCPointer<ByteVar>(), phds.toCPointer<ByteVar>())

public actual fun DsBindingSetTimeout(hds: HANDLE, ctimeoutsecs: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsBindingSetTimeout(hds.toCPointer<ByteVar>(), ctimeoutsecs)

public actual fun DsBrowseForContainerA(pinfo: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsBrowseForContainerA(pinfo.toCPointer<ByteVar>())

public actual fun DsBrowseForContainerW(pinfo: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsBrowseForContainerW(pinfo.toCPointer<ByteVar>())

public actual fun DsClientMakeSpnForTargetServerA(serviceclass: PCSTR, servicename: PCSTR, pcspnlength: Long, pszspn: PSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsClientMakeSpnForTargetServerA(serviceclass.toCPointer<ByteVar>(), servicename.toCPointer<ByteVar>(), pcspnlength.toCPointer<ByteVar>(), pszspn.toCPointer<ByteVar>())

public actual fun DsClientMakeSpnForTargetServerW(serviceclass: PCWSTR, servicename: PCWSTR, pcspnlength: Long, pszspn: PWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsClientMakeSpnForTargetServerW(serviceclass.toCPointer<ByteVar>(), servicename.toCPointer<ByteVar>(), pcspnlength.toCPointer<ByteVar>(), pszspn.toCPointer<ByteVar>())

public actual fun DsCrackNamesA(hds: HANDLE, flags: DS_NAME_FLAGS, formatoffered: DS_NAME_FORMAT, formatdesired: DS_NAME_FORMAT, cnames: UInt, rpnames: Long, ppresult: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsCrackNamesA(hds.toCPointer<ByteVar>(), flags, formatoffered, formatdesired, cnames, rpnames.toCPointer<ByteVar>(), ppresult.toCPointer<ByteVar>())

public actual fun DsCrackNamesW(hds: HANDLE, flags: DS_NAME_FLAGS, formatoffered: DS_NAME_FORMAT, formatdesired: DS_NAME_FORMAT, cnames: UInt, rpnames: Long, ppresult: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsCrackNamesW(hds.toCPointer<ByteVar>(), flags, formatoffered, formatdesired, cnames, rpnames.toCPointer<ByteVar>(), ppresult.toCPointer<ByteVar>())

public actual fun DsCrackSpn2A(pszspn: PCSTR, cspn: UInt, pcserviceclass: Long, serviceclass: PSTR, pcservicename: Long, servicename: PSTR, pcinstancename: Long, instancename: PSTR, pinstanceport: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsCrackSpn2A(pszspn.toCPointer<ByteVar>(), cspn, pcserviceclass.toCPointer<ByteVar>(), serviceclass.toCPointer<ByteVar>(), pcservicename.toCPointer<ByteVar>(), servicename.toCPointer<ByteVar>(), pcinstancename.toCPointer<ByteVar>(), instancename.toCPointer<ByteVar>(), pinstanceport.toCPointer<ByteVar>())

public actual fun DsCrackSpn2W(pszspn: PCWSTR, cspn: UInt, pcserviceclass: Long, serviceclass: PWSTR, pcservicename: Long, servicename: PWSTR, pcinstancename: Long, instancename: PWSTR, pinstanceport: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsCrackSpn2W(pszspn.toCPointer<ByteVar>(), cspn, pcserviceclass.toCPointer<ByteVar>(), serviceclass.toCPointer<ByteVar>(), pcservicename.toCPointer<ByteVar>(), servicename.toCPointer<ByteVar>(), pcinstancename.toCPointer<ByteVar>(), instancename.toCPointer<ByteVar>(), pinstanceport.toCPointer<ByteVar>())

public actual fun DsCrackSpn3W(pszspn: PCWSTR, cspn: UInt, pchostname: Long, hostname: PWSTR, pcinstancename: Long, instancename: PWSTR, pportnumber: Long, pcdomainname: Long, domainname: PWSTR, pcrealmname: Long, realmname: PWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsCrackSpn3W(pszspn.toCPointer<ByteVar>(), cspn, pchostname.toCPointer<ByteVar>(), hostname.toCPointer<ByteVar>(), pcinstancename.toCPointer<ByteVar>(), instancename.toCPointer<ByteVar>(), pportnumber.toCPointer<ByteVar>(), pcdomainname.toCPointer<ByteVar>(), domainname.toCPointer<ByteVar>(), pcrealmname.toCPointer<ByteVar>(), realmname.toCPointer<ByteVar>())

public actual fun DsCrackSpn4W(pszspn: PCWSTR, cspn: UInt, pchostname: Long, hostname: PWSTR, pcinstancename: Long, instancename: PWSTR, pcportname: Long, portname: PWSTR, pcdomainname: Long, domainname: PWSTR, pcrealmname: Long, realmname: PWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsCrackSpn4W(pszspn.toCPointer<ByteVar>(), cspn, pchostname.toCPointer<ByteVar>(), hostname.toCPointer<ByteVar>(), pcinstancename.toCPointer<ByteVar>(), instancename.toCPointer<ByteVar>(), pcportname.toCPointer<ByteVar>(), portname.toCPointer<ByteVar>(), pcdomainname.toCPointer<ByteVar>(), domainname.toCPointer<ByteVar>(), pcrealmname.toCPointer<ByteVar>(), realmname.toCPointer<ByteVar>())

public actual fun DsCrackSpnA(pszspn: PCSTR, pcserviceclass: Long, serviceclass: PSTR, pcservicename: Long, servicename: PSTR, pcinstancename: Long, instancename: PSTR, pinstanceport: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsCrackSpnA(pszspn.toCPointer<ByteVar>(), pcserviceclass.toCPointer<ByteVar>(), serviceclass.toCPointer<ByteVar>(), pcservicename.toCPointer<ByteVar>(), servicename.toCPointer<ByteVar>(), pcinstancename.toCPointer<ByteVar>(), instancename.toCPointer<ByteVar>(), pinstanceport.toCPointer<ByteVar>())

public actual fun DsCrackSpnW(pszspn: PCWSTR, pcserviceclass: Long, serviceclass: PWSTR, pcservicename: Long, servicename: PWSTR, pcinstancename: Long, instancename: PWSTR, pinstanceport: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsCrackSpnW(pszspn.toCPointer<ByteVar>(), pcserviceclass.toCPointer<ByteVar>(), serviceclass.toCPointer<ByteVar>(), pcservicename.toCPointer<ByteVar>(), servicename.toCPointer<ByteVar>(), pcinstancename.toCPointer<ByteVar>(), instancename.toCPointer<ByteVar>(), pinstanceport.toCPointer<ByteVar>())

public actual fun DsCrackUnquotedMangledRdnA(pszrdn: PCSTR, cchrdn: UInt, pguid: Long, pedsmanglefor: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsCrackUnquotedMangledRdnA(pszrdn.toCPointer<ByteVar>(), cchrdn, pguid.toCPointer<ByteVar>(), pedsmanglefor.toCPointer<ByteVar>())

public actual fun DsCrackUnquotedMangledRdnW(pszrdn: PCWSTR, cchrdn: UInt, pguid: Long, pedsmanglefor: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsCrackUnquotedMangledRdnW(pszrdn.toCPointer<ByteVar>(), cchrdn, pguid.toCPointer<ByteVar>(), pedsmanglefor.toCPointer<ByteVar>())

public actual fun DsDeregisterDnsHostRecordsA(servername: PCSTR, dnsdomainname: PCSTR, domainguid: Long, dsaguid: Long, dnshostname: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsDeregisterDnsHostRecordsA(servername.toCPointer<ByteVar>(), dnsdomainname.toCPointer<ByteVar>(), domainguid.toCPointer<ByteVar>(), dsaguid.toCPointer<ByteVar>(), dnshostname.toCPointer<ByteVar>())

public actual fun DsDeregisterDnsHostRecordsW(servername: PCWSTR, dnsdomainname: PCWSTR, domainguid: Long, dsaguid: Long, dnshostname: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsDeregisterDnsHostRecordsW(servername.toCPointer<ByteVar>(), dnsdomainname.toCPointer<ByteVar>(), domainguid.toCPointer<ByteVar>(), dsaguid.toCPointer<ByteVar>(), dnshostname.toCPointer<ByteVar>())

public actual fun DsEnumerateDomainTrustsA(servername: PCSTR, flags: UInt, domains: Long, domaincount: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsEnumerateDomainTrustsA(servername.toCPointer<ByteVar>(), flags, domains.toCPointer<ByteVar>(), domaincount.toCPointer<ByteVar>())

public actual fun DsEnumerateDomainTrustsW(servername: PCWSTR, flags: UInt, domains: Long, domaincount: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsEnumerateDomainTrustsW(servername.toCPointer<ByteVar>(), flags, domains.toCPointer<ByteVar>(), domaincount.toCPointer<ByteVar>())

public actual fun DsFreeDomainControllerInfoA(infolevel: UInt, cinfo: UInt, pinfo: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsFreeDomainControllerInfoA(infolevel, cinfo, pinfo.toCPointer<ByteVar>())
}

public actual fun DsFreeDomainControllerInfoW(infolevel: UInt, cinfo: UInt, pinfo: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsFreeDomainControllerInfoW(infolevel, cinfo, pinfo.toCPointer<ByteVar>())
}

public actual fun DsFreeNameResultA(presult: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsFreeNameResultA(presult.toCPointer<ByteVar>())
}

public actual fun DsFreeNameResultW(presult: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsFreeNameResultW(presult.toCPointer<ByteVar>())
}

public actual fun DsFreePasswordCredentials(authidentity: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsFreePasswordCredentials(authidentity.toCPointer<ByteVar>())
}

public actual fun DsFreeSchemaGuidMapA(pguidmap: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsFreeSchemaGuidMapA(pguidmap.toCPointer<ByteVar>())
}

public actual fun DsFreeSchemaGuidMapW(pguidmap: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsFreeSchemaGuidMapW(pguidmap.toCPointer<ByteVar>())
}

public actual fun DsFreeSpnArrayA(cspn: UInt, rpszspn: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsFreeSpnArrayA(cspn, rpszspn.toCPointer<ByteVar>())
}

public actual fun DsFreeSpnArrayW(cspn: UInt, rpszspn: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsFreeSpnArrayW(cspn, rpszspn.toCPointer<ByteVar>())
}

public actual fun DsGetDcCloseW(getdccontexthandle: HANDLE) {
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsGetDcCloseW(getdccontexthandle.toCPointer<ByteVar>())
}

public actual fun DsGetDcNameA(computername: PCSTR, domainname: PCSTR, domainguid: Long, sitename: PCSTR, flags: UInt, domaincontrollerinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsGetDcNameA(computername.toCPointer<ByteVar>(), domainname.toCPointer<ByteVar>(), domainguid.toCPointer<ByteVar>(), sitename.toCPointer<ByteVar>(), flags, domaincontrollerinfo.toCPointer<ByteVar>())

public actual fun DsGetDcNameW(computername: PCWSTR, domainname: PCWSTR, domainguid: Long, sitename: PCWSTR, flags: UInt, domaincontrollerinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsGetDcNameW(computername.toCPointer<ByteVar>(), domainname.toCPointer<ByteVar>(), domainguid.toCPointer<ByteVar>(), sitename.toCPointer<ByteVar>(), flags, domaincontrollerinfo.toCPointer<ByteVar>())

public actual fun DsGetDcNextA(getdccontexthandle: HANDLE, sockaddresscount: Long, sockaddresses: Long, dnshostname: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsGetDcNextA(getdccontexthandle.toCPointer<ByteVar>(), sockaddresscount.toCPointer<ByteVar>(), sockaddresses.toCPointer<ByteVar>(), dnshostname.toCPointer<ByteVar>())

public actual fun DsGetDcNextW(getdccontexthandle: HANDLE, sockaddresscount: Long, sockaddresses: Long, dnshostname: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsGetDcNextW(getdccontexthandle.toCPointer<ByteVar>(), sockaddresscount.toCPointer<ByteVar>(), sockaddresses.toCPointer<ByteVar>(), dnshostname.toCPointer<ByteVar>())

public actual fun DsGetDcOpenA(dnsname: PCSTR, optionflags: UInt, sitename: PCSTR, domainguid: Long, dnsforestname: PCSTR, dcflags: UInt, retgetdccontext: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsGetDcOpenA(dnsname.toCPointer<ByteVar>(), optionflags, sitename.toCPointer<ByteVar>(), domainguid.toCPointer<ByteVar>(), dnsforestname.toCPointer<ByteVar>(), dcflags, retgetdccontext.toCPointer<ByteVar>())

public actual fun DsGetDcOpenW(dnsname: PCWSTR, optionflags: UInt, sitename: PCWSTR, domainguid: Long, dnsforestname: PCWSTR, dcflags: UInt, retgetdccontext: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsGetDcOpenW(dnsname.toCPointer<ByteVar>(), optionflags, sitename.toCPointer<ByteVar>(), domainguid.toCPointer<ByteVar>(), dnsforestname.toCPointer<ByteVar>(), dcflags, retgetdccontext.toCPointer<ByteVar>())

public actual fun DsGetDcSiteCoverageA(servername: PCSTR, entrycount: Long, sitenames: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsGetDcSiteCoverageA(servername.toCPointer<ByteVar>(), entrycount.toCPointer<ByteVar>(), sitenames.toCPointer<ByteVar>())

public actual fun DsGetDcSiteCoverageW(servername: PCWSTR, entrycount: Long, sitenames: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsGetDcSiteCoverageW(servername.toCPointer<ByteVar>(), entrycount.toCPointer<ByteVar>(), sitenames.toCPointer<ByteVar>())

public actual fun DsGetDomainControllerInfoA(hds: HANDLE, domainname: PCSTR, infolevel: UInt, pcout: Long, ppinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsGetDomainControllerInfoA(hds.toCPointer<ByteVar>(), domainname.toCPointer<ByteVar>(), infolevel, pcout.toCPointer<ByteVar>(), ppinfo.toCPointer<ByteVar>())

public actual fun DsGetDomainControllerInfoW(hds: HANDLE, domainname: PCWSTR, infolevel: UInt, pcout: Long, ppinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsGetDomainControllerInfoW(hds.toCPointer<ByteVar>(), domainname.toCPointer<ByteVar>(), infolevel, pcout.toCPointer<ByteVar>(), ppinfo.toCPointer<ByteVar>())

public actual fun DsGetForestTrustInformationW(servername: PCWSTR, trusteddomainname: PCWSTR, flags: UInt, foresttrustinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsGetForestTrustInformationW(servername.toCPointer<ByteVar>(), trusteddomainname.toCPointer<ByteVar>(), flags, foresttrustinfo.toCPointer<ByteVar>())

public actual fun DsGetFriendlyClassName(pszobjectclass: PCWSTR, pszbuffer: PWSTR, cchbuffer: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsGetFriendlyClassName(pszobjectclass.toCPointer<ByteVar>(), pszbuffer.toCPointer<ByteVar>(), cchbuffer)

public actual fun DsGetIcon(dwflags: UInt, pszobjectclass: PCWSTR, cximage: Int, cyimage: Int): HICON =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsGetIcon(dwflags, pszobjectclass.toCPointer<ByteVar>(), cximage, cyimage)?.toLong() ?: 0L

public actual fun DsGetRdnW(ppdn: Long, pcdn: Long, ppkey: Long, pckey: Long, ppval: Long, pcval: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsGetRdnW(ppdn.toCPointer<ByteVar>(), pcdn.toCPointer<ByteVar>(), ppkey.toCPointer<ByteVar>(), pckey.toCPointer<ByteVar>(), ppval.toCPointer<ByteVar>(), pcval.toCPointer<ByteVar>())

public actual fun DsGetSiteNameA(computername: PCSTR, sitename: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsGetSiteNameA(computername.toCPointer<ByteVar>(), sitename.toCPointer<ByteVar>())

public actual fun DsGetSiteNameW(computername: PCWSTR, sitename: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsGetSiteNameW(computername.toCPointer<ByteVar>(), sitename.toCPointer<ByteVar>())

public actual fun DsGetSpnA(servicetype: DS_SPN_NAME_TYPE, serviceclass: PCSTR, servicename: PCSTR, instanceport: UShort, cinstancenames: UShort, pinstancenames: Long, pinstanceports: Long, pcspn: Long, prpszspn: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsGetSpnA(servicetype, serviceclass.toCPointer<ByteVar>(), servicename.toCPointer<ByteVar>(), instanceport, cinstancenames, pinstancenames.toCPointer<ByteVar>(), pinstanceports.toCPointer<ByteVar>(), pcspn.toCPointer<ByteVar>(), prpszspn.toCPointer<ByteVar>())

public actual fun DsGetSpnW(servicetype: DS_SPN_NAME_TYPE, serviceclass: PCWSTR, servicename: PCWSTR, instanceport: UShort, cinstancenames: UShort, pinstancenames: Long, pinstanceports: Long, pcspn: Long, prpszspn: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsGetSpnW(servicetype, serviceclass.toCPointer<ByteVar>(), servicename.toCPointer<ByteVar>(), instanceport, cinstancenames, pinstancenames.toCPointer<ByteVar>(), pinstanceports.toCPointer<ByteVar>(), pcspn.toCPointer<ByteVar>(), prpszspn.toCPointer<ByteVar>())

public actual fun DsInheritSecurityIdentityA(hds: HANDLE, flags: UInt, srcprincipal: PCSTR, dstprincipal: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsInheritSecurityIdentityA(hds.toCPointer<ByteVar>(), flags, srcprincipal.toCPointer<ByteVar>(), dstprincipal.toCPointer<ByteVar>())

public actual fun DsInheritSecurityIdentityW(hds: HANDLE, flags: UInt, srcprincipal: PCWSTR, dstprincipal: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsInheritSecurityIdentityW(hds.toCPointer<ByteVar>(), flags, srcprincipal.toCPointer<ByteVar>(), dstprincipal.toCPointer<ByteVar>())

public actual fun DsIsMangledDnA(pszdn: PCSTR, edsmanglefor: DS_MANGLE_FOR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsIsMangledDnA(pszdn.toCPointer<ByteVar>(), edsmanglefor)

public actual fun DsIsMangledDnW(pszdn: PCWSTR, edsmanglefor: DS_MANGLE_FOR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsIsMangledDnW(pszdn.toCPointer<ByteVar>(), edsmanglefor)

public actual fun DsIsMangledRdnValueA(pszrdn: PCSTR, crdn: UInt, edsmanglefordesired: DS_MANGLE_FOR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsIsMangledRdnValueA(pszrdn.toCPointer<ByteVar>(), crdn, edsmanglefordesired)

public actual fun DsIsMangledRdnValueW(pszrdn: PCWSTR, crdn: UInt, edsmanglefordesired: DS_MANGLE_FOR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsIsMangledRdnValueW(pszrdn.toCPointer<ByteVar>(), crdn, edsmanglefordesired)

public actual fun DsListDomainsInSiteA(hds: HANDLE, site: PCSTR, ppdomains: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsListDomainsInSiteA(hds.toCPointer<ByteVar>(), site.toCPointer<ByteVar>(), ppdomains.toCPointer<ByteVar>())

public actual fun DsListDomainsInSiteW(hds: HANDLE, site: PCWSTR, ppdomains: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsListDomainsInSiteW(hds.toCPointer<ByteVar>(), site.toCPointer<ByteVar>(), ppdomains.toCPointer<ByteVar>())

public actual fun DsListInfoForServerA(hds: HANDLE, server: PCSTR, ppinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsListInfoForServerA(hds.toCPointer<ByteVar>(), server.toCPointer<ByteVar>(), ppinfo.toCPointer<ByteVar>())

public actual fun DsListInfoForServerW(hds: HANDLE, server: PCWSTR, ppinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsListInfoForServerW(hds.toCPointer<ByteVar>(), server.toCPointer<ByteVar>(), ppinfo.toCPointer<ByteVar>())

public actual fun DsListRolesA(hds: HANDLE, pproles: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsListRolesA(hds.toCPointer<ByteVar>(), pproles.toCPointer<ByteVar>())

public actual fun DsListRolesW(hds: HANDLE, pproles: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsListRolesW(hds.toCPointer<ByteVar>(), pproles.toCPointer<ByteVar>())

public actual fun DsListServersForDomainInSiteA(hds: HANDLE, domain: PCSTR, site: PCSTR, ppservers: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsListServersForDomainInSiteA(hds.toCPointer<ByteVar>(), domain.toCPointer<ByteVar>(), site.toCPointer<ByteVar>(), ppservers.toCPointer<ByteVar>())

public actual fun DsListServersForDomainInSiteW(hds: HANDLE, domain: PCWSTR, site: PCWSTR, ppservers: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsListServersForDomainInSiteW(hds.toCPointer<ByteVar>(), domain.toCPointer<ByteVar>(), site.toCPointer<ByteVar>(), ppservers.toCPointer<ByteVar>())

public actual fun DsListServersInSiteA(hds: HANDLE, site: PCSTR, ppservers: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsListServersInSiteA(hds.toCPointer<ByteVar>(), site.toCPointer<ByteVar>(), ppservers.toCPointer<ByteVar>())

public actual fun DsListServersInSiteW(hds: HANDLE, site: PCWSTR, ppservers: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsListServersInSiteW(hds.toCPointer<ByteVar>(), site.toCPointer<ByteVar>(), ppservers.toCPointer<ByteVar>())

public actual fun DsListSitesA(hds: HANDLE, ppsites: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsListSitesA(hds.toCPointer<ByteVar>(), ppsites.toCPointer<ByteVar>())

public actual fun DsListSitesW(hds: HANDLE, ppsites: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsListSitesW(hds.toCPointer<ByteVar>(), ppsites.toCPointer<ByteVar>())

public actual fun DsMakePasswordCredentialsA(user: PCSTR, domain: PCSTR, password: PCSTR, pauthidentity: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsMakePasswordCredentialsA(user.toCPointer<ByteVar>(), domain.toCPointer<ByteVar>(), password.toCPointer<ByteVar>(), pauthidentity.toCPointer<ByteVar>())

public actual fun DsMakePasswordCredentialsW(user: PCWSTR, domain: PCWSTR, password: PCWSTR, pauthidentity: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsMakePasswordCredentialsW(user.toCPointer<ByteVar>(), domain.toCPointer<ByteVar>(), password.toCPointer<ByteVar>(), pauthidentity.toCPointer<ByteVar>())

public actual fun DsMakeSpnA(serviceclass: PCSTR, servicename: PCSTR, instancename: PCSTR, instanceport: UShort, referrer: PCSTR, pcspnlength: Long, pszspn: PSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsMakeSpnA(serviceclass.toCPointer<ByteVar>(), servicename.toCPointer<ByteVar>(), instancename.toCPointer<ByteVar>(), instanceport, referrer.toCPointer<ByteVar>(), pcspnlength.toCPointer<ByteVar>(), pszspn.toCPointer<ByteVar>())

public actual fun DsMakeSpnW(serviceclass: PCWSTR, servicename: PCWSTR, instancename: PCWSTR, instanceport: UShort, referrer: PCWSTR, pcspnlength: Long, pszspn: PWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsMakeSpnW(serviceclass.toCPointer<ByteVar>(), servicename.toCPointer<ByteVar>(), instancename.toCPointer<ByteVar>(), instanceport, referrer.toCPointer<ByteVar>(), pcspnlength.toCPointer<ByteVar>(), pszspn.toCPointer<ByteVar>())

public actual fun DsMapSchemaGuidsA(hds: HANDLE, cguids: UInt, rguids: Long, ppguidmap: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsMapSchemaGuidsA(hds.toCPointer<ByteVar>(), cguids, rguids.toCPointer<ByteVar>(), ppguidmap.toCPointer<ByteVar>())

public actual fun DsMapSchemaGuidsW(hds: HANDLE, cguids: UInt, rguids: Long, ppguidmap: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsMapSchemaGuidsW(hds.toCPointer<ByteVar>(), cguids, rguids.toCPointer<ByteVar>(), ppguidmap.toCPointer<ByteVar>())

public actual fun DsMergeForestTrustInformationW(domainname: PCWSTR, newforesttrustinfo: Long, oldforesttrustinfo: Long, mergedforesttrustinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsMergeForestTrustInformationW(domainname.toCPointer<ByteVar>(), newforesttrustinfo.toCPointer<ByteVar>(), oldforesttrustinfo.toCPointer<ByteVar>(), mergedforesttrustinfo.toCPointer<ByteVar>())

public actual fun DsQuerySitesByCostA(hds: HANDLE, pszfromsite: PCSTR, rgsztosites: Long, ctosites: UInt, dwflags: UInt, prgsiteinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsQuerySitesByCostA(hds.toCPointer<ByteVar>(), pszfromsite.toCPointer<ByteVar>(), rgsztosites.toCPointer<ByteVar>(), ctosites, dwflags, prgsiteinfo.toCPointer<ByteVar>())

public actual fun DsQuerySitesByCostW(hds: HANDLE, pwszfromsite: PCWSTR, rgwsztosites: Long, ctosites: UInt, dwflags: UInt, prgsiteinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsQuerySitesByCostW(hds.toCPointer<ByteVar>(), pwszfromsite.toCPointer<ByteVar>(), rgwsztosites.toCPointer<ByteVar>(), ctosites, dwflags, prgsiteinfo.toCPointer<ByteVar>())

public actual fun DsQuerySitesFree(rgsiteinfo: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsQuerySitesFree(rgsiteinfo.toCPointer<ByteVar>())
}

public actual fun DsQuoteRdnValueA(cunquotedrdnvaluelength: UInt, psunquotedrdnvalue: PCSTR, pcquotedrdnvaluelength: Long, psquotedrdnvalue: PSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsQuoteRdnValueA(cunquotedrdnvaluelength, psunquotedrdnvalue.toCPointer<ByteVar>(), pcquotedrdnvaluelength.toCPointer<ByteVar>(), psquotedrdnvalue.toCPointer<ByteVar>())

public actual fun DsQuoteRdnValueW(cunquotedrdnvaluelength: UInt, psunquotedrdnvalue: PCWSTR, pcquotedrdnvaluelength: Long, psquotedrdnvalue: PWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsQuoteRdnValueW(cunquotedrdnvaluelength, psunquotedrdnvalue.toCPointer<ByteVar>(), pcquotedrdnvaluelength.toCPointer<ByteVar>(), psquotedrdnvalue.toCPointer<ByteVar>())

public actual fun DsRemoveDsDomainA(hds: HANDLE, domaindn: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsRemoveDsDomainA(hds.toCPointer<ByteVar>(), domaindn.toCPointer<ByteVar>())

public actual fun DsRemoveDsDomainW(hds: HANDLE, domaindn: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsRemoveDsDomainW(hds.toCPointer<ByteVar>(), domaindn.toCPointer<ByteVar>())

public actual fun DsRemoveDsServerA(hds: HANDLE, serverdn: PCSTR, domaindn: PCSTR, flastdcindomain: Long, fcommit: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsRemoveDsServerA(hds.toCPointer<ByteVar>(), serverdn.toCPointer<ByteVar>(), domaindn.toCPointer<ByteVar>(), flastdcindomain.toCPointer<ByteVar>(), fcommit)

public actual fun DsRemoveDsServerW(hds: HANDLE, serverdn: PCWSTR, domaindn: PCWSTR, flastdcindomain: Long, fcommit: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsRemoveDsServerW(hds.toCPointer<ByteVar>(), serverdn.toCPointer<ByteVar>(), domaindn.toCPointer<ByteVar>(), flastdcindomain.toCPointer<ByteVar>(), fcommit)

public actual fun DsReplicaAddA(hds: HANDLE, namecontext: PCSTR, sourcedsadn: PCSTR, transportdn: PCSTR, sourcedsaaddress: PCSTR, pschedule: Long, options: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsReplicaAddA(hds.toCPointer<ByteVar>(), namecontext.toCPointer<ByteVar>(), sourcedsadn.toCPointer<ByteVar>(), transportdn.toCPointer<ByteVar>(), sourcedsaaddress.toCPointer<ByteVar>(), pschedule.toCPointer<ByteVar>(), options)

public actual fun DsReplicaAddW(hds: HANDLE, namecontext: PCWSTR, sourcedsadn: PCWSTR, transportdn: PCWSTR, sourcedsaaddress: PCWSTR, pschedule: Long, options: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsReplicaAddW(hds.toCPointer<ByteVar>(), namecontext.toCPointer<ByteVar>(), sourcedsadn.toCPointer<ByteVar>(), transportdn.toCPointer<ByteVar>(), sourcedsaaddress.toCPointer<ByteVar>(), pschedule.toCPointer<ByteVar>(), options)

public actual fun DsReplicaConsistencyCheck(hds: HANDLE, taskid: DS_KCC_TASKID, dwflags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsReplicaConsistencyCheck(hds.toCPointer<ByteVar>(), taskid, dwflags)

public actual fun DsReplicaDelA(hds: HANDLE, namecontext: PCSTR, dsasrc: PCSTR, options: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsReplicaDelA(hds.toCPointer<ByteVar>(), namecontext.toCPointer<ByteVar>(), dsasrc.toCPointer<ByteVar>(), options)

public actual fun DsReplicaDelW(hds: HANDLE, namecontext: PCWSTR, dsasrc: PCWSTR, options: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsReplicaDelW(hds.toCPointer<ByteVar>(), namecontext.toCPointer<ByteVar>(), dsasrc.toCPointer<ByteVar>(), options)

public actual fun DsReplicaFreeInfo(infotype: DS_REPL_INFO_TYPE, pinfo: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsReplicaFreeInfo(infotype, pinfo.toCPointer<ByteVar>())
}

public actual fun DsReplicaGetInfo2W(hds: HANDLE, infotype: DS_REPL_INFO_TYPE, pszobject: PCWSTR, puuidforsourcedsaobjguid: Long, pszattributename: PCWSTR, pszvalue: PCWSTR, dwflags: UInt, dwenumerationcontext: UInt, ppinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsReplicaGetInfo2W(hds.toCPointer<ByteVar>(), infotype, pszobject.toCPointer<ByteVar>(), puuidforsourcedsaobjguid.toCPointer<ByteVar>(), pszattributename.toCPointer<ByteVar>(), pszvalue.toCPointer<ByteVar>(), dwflags, dwenumerationcontext, ppinfo.toCPointer<ByteVar>())

public actual fun DsReplicaGetInfoW(hds: HANDLE, infotype: DS_REPL_INFO_TYPE, pszobject: PCWSTR, puuidforsourcedsaobjguid: Long, ppinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsReplicaGetInfoW(hds.toCPointer<ByteVar>(), infotype, pszobject.toCPointer<ByteVar>(), puuidforsourcedsaobjguid.toCPointer<ByteVar>(), ppinfo.toCPointer<ByteVar>())

public actual fun DsReplicaModifyA(hds: HANDLE, namecontext: PCSTR, puuidsourcedsa: Long, transportdn: PCSTR, sourcedsaaddress: PCSTR, pschedule: Long, replicaflags: UInt, modifyfields: UInt, options: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsReplicaModifyA(hds.toCPointer<ByteVar>(), namecontext.toCPointer<ByteVar>(), puuidsourcedsa.toCPointer<ByteVar>(), transportdn.toCPointer<ByteVar>(), sourcedsaaddress.toCPointer<ByteVar>(), pschedule.toCPointer<ByteVar>(), replicaflags, modifyfields, options)

public actual fun DsReplicaModifyW(hds: HANDLE, namecontext: PCWSTR, puuidsourcedsa: Long, transportdn: PCWSTR, sourcedsaaddress: PCWSTR, pschedule: Long, replicaflags: UInt, modifyfields: UInt, options: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsReplicaModifyW(hds.toCPointer<ByteVar>(), namecontext.toCPointer<ByteVar>(), puuidsourcedsa.toCPointer<ByteVar>(), transportdn.toCPointer<ByteVar>(), sourcedsaaddress.toCPointer<ByteVar>(), pschedule.toCPointer<ByteVar>(), replicaflags, modifyfields, options)

public actual fun DsReplicaSyncA(hds: HANDLE, namecontext: PCSTR, puuiddsasrc: Long, options: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsReplicaSyncA(hds.toCPointer<ByteVar>(), namecontext.toCPointer<ByteVar>(), puuiddsasrc.toCPointer<ByteVar>(), options)

public actual fun DsReplicaSyncAllA(hds: HANDLE, psznamecontext: PCSTR, ulflags: UInt, pfncallback: Long, pcallbackdata: Long, perrors: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsReplicaSyncAllA(hds.toCPointer<ByteVar>(), psznamecontext.toCPointer<ByteVar>(), ulflags, pfncallback, pcallbackdata.toCPointer<ByteVar>(), perrors.toCPointer<ByteVar>())

public actual fun DsReplicaSyncAllW(hds: HANDLE, psznamecontext: PCWSTR, ulflags: UInt, pfncallback: Long, pcallbackdata: Long, perrors: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsReplicaSyncAllW(hds.toCPointer<ByteVar>(), psznamecontext.toCPointer<ByteVar>(), ulflags, pfncallback, pcallbackdata.toCPointer<ByteVar>(), perrors.toCPointer<ByteVar>())

public actual fun DsReplicaSyncW(hds: HANDLE, namecontext: PCWSTR, puuiddsasrc: Long, options: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsReplicaSyncW(hds.toCPointer<ByteVar>(), namecontext.toCPointer<ByteVar>(), puuiddsasrc.toCPointer<ByteVar>(), options)

public actual fun DsReplicaUpdateRefsA(hds: HANDLE, namecontext: PCSTR, dsadest: PCSTR, puuiddsadest: Long, options: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsReplicaUpdateRefsA(hds.toCPointer<ByteVar>(), namecontext.toCPointer<ByteVar>(), dsadest.toCPointer<ByteVar>(), puuiddsadest.toCPointer<ByteVar>(), options)

public actual fun DsReplicaUpdateRefsW(hds: HANDLE, namecontext: PCWSTR, dsadest: PCWSTR, puuiddsadest: Long, options: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsReplicaUpdateRefsW(hds.toCPointer<ByteVar>(), namecontext.toCPointer<ByteVar>(), dsadest.toCPointer<ByteVar>(), puuiddsadest.toCPointer<ByteVar>(), options)

public actual fun DsReplicaVerifyObjectsA(hds: HANDLE, namecontext: PCSTR, puuiddsasrc: Long, uloptions: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsReplicaVerifyObjectsA(hds.toCPointer<ByteVar>(), namecontext.toCPointer<ByteVar>(), puuiddsasrc.toCPointer<ByteVar>(), uloptions)

public actual fun DsReplicaVerifyObjectsW(hds: HANDLE, namecontext: PCWSTR, puuiddsasrc: Long, uloptions: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsReplicaVerifyObjectsW(hds.toCPointer<ByteVar>(), namecontext.toCPointer<ByteVar>(), puuiddsasrc.toCPointer<ByteVar>(), uloptions)

public actual fun DsRoleFreeMemory(buffer: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsRoleFreeMemory(buffer.toCPointer<ByteVar>())
}

public actual fun DsRoleGetPrimaryDomainInformation(lpserver: PCWSTR, infolevel: DSROLE_PRIMARY_DOMAIN_INFO_LEVEL, buffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsRoleGetPrimaryDomainInformation(lpserver.toCPointer<ByteVar>(), infolevel, buffer.toCPointer<ByteVar>())

public actual fun DsServerRegisterSpnA(operation: DS_SPN_WRITE_OP, serviceclass: PCSTR, userobjectdn: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsServerRegisterSpnA(operation, serviceclass.toCPointer<ByteVar>(), userobjectdn.toCPointer<ByteVar>())

public actual fun DsServerRegisterSpnW(operation: DS_SPN_WRITE_OP, serviceclass: PCWSTR, userobjectdn: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsServerRegisterSpnW(operation, serviceclass.toCPointer<ByteVar>(), userobjectdn.toCPointer<ByteVar>())

public actual fun DsUnBindA(phds: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsUnBindA(phds.toCPointer<ByteVar>())

public actual fun DsUnBindW(phds: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsUnBindW(phds.toCPointer<ByteVar>())

public actual fun DsUnquoteRdnValueA(cquotedrdnvaluelength: UInt, psquotedrdnvalue: PCSTR, pcunquotedrdnvaluelength: Long, psunquotedrdnvalue: PSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsUnquoteRdnValueA(cquotedrdnvaluelength, psquotedrdnvalue.toCPointer<ByteVar>(), pcunquotedrdnvaluelength.toCPointer<ByteVar>(), psunquotedrdnvalue.toCPointer<ByteVar>())

public actual fun DsUnquoteRdnValueW(cquotedrdnvaluelength: UInt, psquotedrdnvalue: PCWSTR, pcunquotedrdnvaluelength: Long, psunquotedrdnvalue: PWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsUnquoteRdnValueW(cquotedrdnvaluelength, psquotedrdnvalue.toCPointer<ByteVar>(), pcunquotedrdnvaluelength.toCPointer<ByteVar>(), psunquotedrdnvalue.toCPointer<ByteVar>())

public actual fun DsValidateSubnetNameA(subnetname: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsValidateSubnetNameA(subnetname.toCPointer<ByteVar>())

public actual fun DsValidateSubnetNameW(subnetname: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsValidateSubnetNameW(subnetname.toCPointer<ByteVar>())

public actual fun DsWriteAccountSpnA(hds: HANDLE, operation: DS_SPN_WRITE_OP, pszaccount: PCSTR, cspn: UInt, rpszspn: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsWriteAccountSpnA(hds.toCPointer<ByteVar>(), operation, pszaccount.toCPointer<ByteVar>(), cspn, rpszspn.toCPointer<ByteVar>())

public actual fun DsWriteAccountSpnW(hds: HANDLE, operation: DS_SPN_WRITE_OP, pszaccount: PCWSTR, cspn: UInt, rpszspn: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_DsWriteAccountSpnW(hds.toCPointer<ByteVar>(), operation, pszaccount.toCPointer<ByteVar>(), cspn, rpszspn.toCPointer<ByteVar>())

public actual fun FreeADsMem(pmem: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_FreeADsMem(pmem.toCPointer<ByteVar>())

public actual fun FreeADsStr(pstr: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_FreeADsStr(pstr.toCPointer<ByteVar>())

public actual fun PropVariantToAdsType(pvariant: Long, dwnumvariant: UInt, ppadsvalues: Long, pdwnumvalues: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_PropVariantToAdsType(pvariant.toCPointer<ByteVar>(), dwnumvariant, ppadsvalues.toCPointer<ByteVar>(), pdwnumvalues.toCPointer<ByteVar>())

public actual fun ReallocADsMem(poldmem: Long, cbold: UInt, cbnew: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_ReallocADsMem(poldmem.toCPointer<ByteVar>(), cbold, cbnew)?.toLong() ?: 0L

public actual fun ReallocADsStr(ppstr: Long, pstr: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory.cinterop.windowssys_windows_win32_networking_activedirectory_ReallocADsStr(ppstr.toCPointer<ByteVar>(), pstr.toCPointer<ByteVar>())

public actual fun SecurityDescriptorToBinarySD(vvarsecdes: VARIANT, ppsecuritydescriptor: Long, pdwsdlength: Long, pszservername: PCWSTR, username: PCWSTR, password: PCWSTR, dwflags: UInt): HRESULT =
    0
