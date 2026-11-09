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

private val _windowsWin32NetworkingActivedirectoryNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun ADsBuildEnumerator(padscontainer: Long, ppenumvariant: Long): HRESULT =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_ADsBuildEnumerator(padscontainer.toString(), ppenumvariant.toString()) as Int) else 0

public actual fun ADsBuildVarArrayInt(lpdwobjecttypes: Long, dwobjecttypes: UInt, pvar: Long): HRESULT =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_ADsBuildVarArrayInt(lpdwobjecttypes.toString(), dwobjecttypes.toInt(), pvar.toString()) as Int) else 0

public actual fun ADsBuildVarArrayStr(lpppathnames: Long, dwpathnames: UInt, pvar: Long): HRESULT =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_ADsBuildVarArrayStr(lpppathnames.toString(), dwpathnames.toInt(), pvar.toString()) as Int) else 0

public actual fun ADsDecodeBinaryData(szsrcdata: PCWSTR, ppbdestdata: Long, pdwdestlen: Long): HRESULT =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_ADsDecodeBinaryData(szsrcdata.toString(), ppbdestdata.toString(), pdwdestlen.toString()) as Int) else 0

public actual fun ADsEncodeBinaryData(pbsrcdata: Long, dwsrclen: UInt, ppszdestdata: Long): HRESULT =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_ADsEncodeBinaryData(pbsrcdata.toString(), dwsrclen.toInt(), ppszdestdata.toString()) as Int) else 0

public actual fun ADsEnumerateNext(penumvariant: Long, celements: UInt, pvar: Long, pcelementsfetched: Long): HRESULT =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_ADsEnumerateNext(penumvariant.toString(), celements.toInt(), pvar.toString(), pcelementsfetched.toString()) as Int) else 0

public actual fun ADsFreeEnumerator(penumvariant: Long): HRESULT =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_ADsFreeEnumerator(penumvariant.toString()) as Int) else 0

public actual fun ADsGetLastError(lperror: Long, lperrorbuf: PWSTR, dwerrorbuflen: UInt, lpnamebuf: PWSTR, dwnamebuflen: UInt): HRESULT =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_ADsGetLastError(lperror.toString(), lperrorbuf.toString(), dwerrorbuflen.toInt(), lpnamebuf.toString(), dwnamebuflen.toInt()) as Int) else 0

public actual fun ADsGetObject(lpszpathname: PCWSTR, riid: Long, ppobject: Long): HRESULT =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_ADsGetObject(lpszpathname.toString(), riid.toString(), ppobject.toString()) as Int) else 0

public actual fun ADsOpenObject(lpszpathname: PCWSTR, lpszusername: PCWSTR, lpszpassword: PCWSTR, dwreserved: ADS_AUTHENTICATION_ENUM, riid: Long, ppobject: Long): HRESULT =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_ADsOpenObject(lpszpathname.toString(), lpszusername.toString(), lpszpassword.toString(), dwreserved.toInt(), riid.toString(), ppobject.toString()) as Int) else 0

public actual fun ADsPropCheckIfWritable(pwzattr: PCWSTR, pwritableattrs: Long): BOOL =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_ADsPropCheckIfWritable(pwzattr.toString(), pwritableattrs.toString()) as Int) else 0

public actual fun ADsPropCreateNotifyObj(pappthddataobj: Long, pwzadsobjname: PCWSTR, phnotifyobj: Long): HRESULT =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_ADsPropCreateNotifyObj(pappthddataobj.toString(), pwzadsobjname.toString(), phnotifyobj.toString()) as Int) else 0

public actual fun ADsPropGetInitInfo(hnotifyobj: HWND, pinitparams: Long): BOOL =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_ADsPropGetInitInfo(hnotifyobj.toString(), pinitparams.toString()) as Int) else 0

public actual fun ADsPropSendErrorMessage(hnotifyobj: HWND, perror: Long): BOOL =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_ADsPropSendErrorMessage(hnotifyobj.toString(), perror.toString()) as Int) else 0

public actual fun ADsPropSetHwnd(hnotifyobj: HWND, hpage: HWND): BOOL =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_ADsPropSetHwnd(hnotifyobj.toString(), hpage.toString()) as Int) else 0

public actual fun ADsPropSetHwndWithTitle(hnotifyobj: HWND, hpage: HWND, ptztitle: Long): BOOL =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_ADsPropSetHwndWithTitle(hnotifyobj.toString(), hpage.toString(), ptztitle.toString()) as Int) else 0

public actual fun ADsPropShowErrorDialog(hnotifyobj: HWND, hpage: HWND): BOOL =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_ADsPropShowErrorDialog(hnotifyobj.toString(), hpage.toString()) as Int) else 0

public actual fun ADsSetLastError(dwerr: UInt, pszerror: PCWSTR, pszprovider: PCWSTR) {
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) {
        _windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_ADsSetLastError(dwerr.toInt(), pszerror.toString(), pszprovider.toString())
    }
}

public actual fun AdsFreeAdsValues(padsvalues: Long, dwnumvalues: UInt) {
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) {
        _windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_AdsFreeAdsValues(padsvalues.toString(), dwnumvalues.toInt())
    }
}

public actual fun AdsTypeToPropVariant(padsvalues: Long, dwnumvalues: UInt, pvariant: Long): HRESULT =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_AdsTypeToPropVariant(padsvalues.toString(), dwnumvalues.toInt(), pvariant.toString()) as Int) else 0

public actual fun AllocADsMem(cb: UInt): Long =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_AllocADsMem(cb.toInt()) as String).toLong() else 0L

public actual fun AllocADsStr(pstr: PCWSTR): PWSTR =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_AllocADsStr(pstr.toString()) as String).toLong() else 0L

public actual fun BinarySDToSecurityDescriptor(psecuritydescriptor: PSECURITY_DESCRIPTOR, pvarsec: Long, pszservername: PCWSTR, username: PCWSTR, password: PCWSTR, dwflags: UInt): HRESULT =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_BinarySDToSecurityDescriptor(psecuritydescriptor.toString(), pvarsec.toString(), pszservername.toString(), username.toString(), password.toString(), dwflags.toInt()) as Int) else 0

public actual fun DsAddSidHistoryA(hds: HANDLE, flags: UInt, srcdomain: PCSTR, srcprincipal: PCSTR, srcdomaincontroller: PCSTR, srcdomaincreds: Long, dstdomain: PCSTR, dstprincipal: PCSTR): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsAddSidHistoryA(hds.toString(), flags.toInt(), srcdomain.toString(), srcprincipal.toString(), srcdomaincontroller.toString(), srcdomaincreds.toString(), dstdomain.toString(), dstprincipal.toString()) as Int).toUInt() else 0u

public actual fun DsAddSidHistoryW(hds: HANDLE, flags: UInt, srcdomain: PCWSTR, srcprincipal: PCWSTR, srcdomaincontroller: PCWSTR, srcdomaincreds: Long, dstdomain: PCWSTR, dstprincipal: PCWSTR): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsAddSidHistoryW(hds.toString(), flags.toInt(), srcdomain.toString(), srcprincipal.toString(), srcdomaincontroller.toString(), srcdomaincreds.toString(), dstdomain.toString(), dstprincipal.toString()) as Int).toUInt() else 0u

public actual fun DsAddressToSiteNamesA(computername: PCSTR, entrycount: UInt, socketaddresses: Long, sitenames: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsAddressToSiteNamesA(computername.toString(), entrycount.toInt(), socketaddresses.toString(), sitenames.toString()) as Int).toUInt() else 0u

public actual fun DsAddressToSiteNamesExA(computername: PCSTR, entrycount: UInt, socketaddresses: Long, sitenames: Long, subnetnames: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsAddressToSiteNamesExA(computername.toString(), entrycount.toInt(), socketaddresses.toString(), sitenames.toString(), subnetnames.toString()) as Int).toUInt() else 0u

public actual fun DsAddressToSiteNamesExW(computername: PCWSTR, entrycount: UInt, socketaddresses: Long, sitenames: Long, subnetnames: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsAddressToSiteNamesExW(computername.toString(), entrycount.toInt(), socketaddresses.toString(), sitenames.toString(), subnetnames.toString()) as Int).toUInt() else 0u

public actual fun DsAddressToSiteNamesW(computername: PCWSTR, entrycount: UInt, socketaddresses: Long, sitenames: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsAddressToSiteNamesW(computername.toString(), entrycount.toInt(), socketaddresses.toString(), sitenames.toString()) as Int).toUInt() else 0u

public actual fun DsBindA(domaincontrollername: PCSTR, dnsdomainname: PCSTR, phds: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsBindA(domaincontrollername.toString(), dnsdomainname.toString(), phds.toString()) as Int).toUInt() else 0u

public actual fun DsBindByInstanceA(servername: PCSTR, annotation: PCSTR, instanceguid: Long, dnsdomainname: PCSTR, authidentity: Long, serviceprincipalname: PCSTR, bindflags: UInt, phds: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsBindByInstanceA(servername.toString(), annotation.toString(), instanceguid.toString(), dnsdomainname.toString(), authidentity.toString(), serviceprincipalname.toString(), bindflags.toInt(), phds.toString()) as Int).toUInt() else 0u

public actual fun DsBindByInstanceW(servername: PCWSTR, annotation: PCWSTR, instanceguid: Long, dnsdomainname: PCWSTR, authidentity: Long, serviceprincipalname: PCWSTR, bindflags: UInt, phds: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsBindByInstanceW(servername.toString(), annotation.toString(), instanceguid.toString(), dnsdomainname.toString(), authidentity.toString(), serviceprincipalname.toString(), bindflags.toInt(), phds.toString()) as Int).toUInt() else 0u

public actual fun DsBindToISTGA(sitename: PCSTR, phds: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsBindToISTGA(sitename.toString(), phds.toString()) as Int).toUInt() else 0u

public actual fun DsBindToISTGW(sitename: PCWSTR, phds: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsBindToISTGW(sitename.toString(), phds.toString()) as Int).toUInt() else 0u

public actual fun DsBindW(domaincontrollername: PCWSTR, dnsdomainname: PCWSTR, phds: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsBindW(domaincontrollername.toString(), dnsdomainname.toString(), phds.toString()) as Int).toUInt() else 0u

public actual fun DsBindWithCredA(domaincontrollername: PCSTR, dnsdomainname: PCSTR, authidentity: Long, phds: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsBindWithCredA(domaincontrollername.toString(), dnsdomainname.toString(), authidentity.toString(), phds.toString()) as Int).toUInt() else 0u

public actual fun DsBindWithCredW(domaincontrollername: PCWSTR, dnsdomainname: PCWSTR, authidentity: Long, phds: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsBindWithCredW(domaincontrollername.toString(), dnsdomainname.toString(), authidentity.toString(), phds.toString()) as Int).toUInt() else 0u

public actual fun DsBindWithSpnA(domaincontrollername: PCSTR, dnsdomainname: PCSTR, authidentity: Long, serviceprincipalname: PCSTR, phds: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsBindWithSpnA(domaincontrollername.toString(), dnsdomainname.toString(), authidentity.toString(), serviceprincipalname.toString(), phds.toString()) as Int).toUInt() else 0u

public actual fun DsBindWithSpnExA(domaincontrollername: PCSTR, dnsdomainname: PCSTR, authidentity: Long, serviceprincipalname: PCSTR, bindflags: UInt, phds: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsBindWithSpnExA(domaincontrollername.toString(), dnsdomainname.toString(), authidentity.toString(), serviceprincipalname.toString(), bindflags.toInt(), phds.toString()) as Int).toUInt() else 0u

public actual fun DsBindWithSpnExW(domaincontrollername: PCWSTR, dnsdomainname: PCWSTR, authidentity: Long, serviceprincipalname: PCWSTR, bindflags: UInt, phds: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsBindWithSpnExW(domaincontrollername.toString(), dnsdomainname.toString(), authidentity.toString(), serviceprincipalname.toString(), bindflags.toInt(), phds.toString()) as Int).toUInt() else 0u

public actual fun DsBindWithSpnW(domaincontrollername: PCWSTR, dnsdomainname: PCWSTR, authidentity: Long, serviceprincipalname: PCWSTR, phds: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsBindWithSpnW(domaincontrollername.toString(), dnsdomainname.toString(), authidentity.toString(), serviceprincipalname.toString(), phds.toString()) as Int).toUInt() else 0u

public actual fun DsBindingSetTimeout(hds: HANDLE, ctimeoutsecs: UInt): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsBindingSetTimeout(hds.toString(), ctimeoutsecs.toInt()) as Int).toUInt() else 0u

public actual fun DsBrowseForContainerA(pinfo: Long): Int =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsBrowseForContainerA(pinfo.toString()) as Int) else 0

public actual fun DsBrowseForContainerW(pinfo: Long): Int =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsBrowseForContainerW(pinfo.toString()) as Int) else 0

public actual fun DsClientMakeSpnForTargetServerA(serviceclass: PCSTR, servicename: PCSTR, pcspnlength: Long, pszspn: PSTR): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsClientMakeSpnForTargetServerA(serviceclass.toString(), servicename.toString(), pcspnlength.toString(), pszspn.toString()) as Int).toUInt() else 0u

public actual fun DsClientMakeSpnForTargetServerW(serviceclass: PCWSTR, servicename: PCWSTR, pcspnlength: Long, pszspn: PWSTR): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsClientMakeSpnForTargetServerW(serviceclass.toString(), servicename.toString(), pcspnlength.toString(), pszspn.toString()) as Int).toUInt() else 0u

public actual fun DsCrackNamesA(hds: HANDLE, flags: DS_NAME_FLAGS, formatoffered: DS_NAME_FORMAT, formatdesired: DS_NAME_FORMAT, cnames: UInt, rpnames: Long, ppresult: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsCrackNamesA(hds.toString(), flags, formatoffered, formatdesired, cnames.toInt(), rpnames.toString(), ppresult.toString()) as Int).toUInt() else 0u

public actual fun DsCrackNamesW(hds: HANDLE, flags: DS_NAME_FLAGS, formatoffered: DS_NAME_FORMAT, formatdesired: DS_NAME_FORMAT, cnames: UInt, rpnames: Long, ppresult: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsCrackNamesW(hds.toString(), flags, formatoffered, formatdesired, cnames.toInt(), rpnames.toString(), ppresult.toString()) as Int).toUInt() else 0u

public actual fun DsCrackSpn2A(pszspn: PCSTR, cspn: UInt, pcserviceclass: Long, serviceclass: PSTR, pcservicename: Long, servicename: PSTR, pcinstancename: Long, instancename: PSTR, pinstanceport: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsCrackSpn2A(pszspn.toString(), cspn.toInt(), pcserviceclass.toString(), serviceclass.toString(), pcservicename.toString(), servicename.toString(), pcinstancename.toString(), instancename.toString(), pinstanceport.toString()) as Int).toUInt() else 0u

public actual fun DsCrackSpn2W(pszspn: PCWSTR, cspn: UInt, pcserviceclass: Long, serviceclass: PWSTR, pcservicename: Long, servicename: PWSTR, pcinstancename: Long, instancename: PWSTR, pinstanceport: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsCrackSpn2W(pszspn.toString(), cspn.toInt(), pcserviceclass.toString(), serviceclass.toString(), pcservicename.toString(), servicename.toString(), pcinstancename.toString(), instancename.toString(), pinstanceport.toString()) as Int).toUInt() else 0u

public actual fun DsCrackSpn3W(pszspn: PCWSTR, cspn: UInt, pchostname: Long, hostname: PWSTR, pcinstancename: Long, instancename: PWSTR, pportnumber: Long, pcdomainname: Long, domainname: PWSTR, pcrealmname: Long, realmname: PWSTR): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsCrackSpn3W(pszspn.toString(), cspn.toInt(), pchostname.toString(), hostname.toString(), pcinstancename.toString(), instancename.toString(), pportnumber.toString(), pcdomainname.toString(), domainname.toString(), pcrealmname.toString(), realmname.toString()) as Int).toUInt() else 0u

public actual fun DsCrackSpn4W(pszspn: PCWSTR, cspn: UInt, pchostname: Long, hostname: PWSTR, pcinstancename: Long, instancename: PWSTR, pcportname: Long, portname: PWSTR, pcdomainname: Long, domainname: PWSTR, pcrealmname: Long, realmname: PWSTR): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsCrackSpn4W(pszspn.toString(), cspn.toInt(), pchostname.toString(), hostname.toString(), pcinstancename.toString(), instancename.toString(), pcportname.toString(), portname.toString(), pcdomainname.toString(), domainname.toString(), pcrealmname.toString(), realmname.toString()) as Int).toUInt() else 0u

public actual fun DsCrackSpnA(pszspn: PCSTR, pcserviceclass: Long, serviceclass: PSTR, pcservicename: Long, servicename: PSTR, pcinstancename: Long, instancename: PSTR, pinstanceport: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsCrackSpnA(pszspn.toString(), pcserviceclass.toString(), serviceclass.toString(), pcservicename.toString(), servicename.toString(), pcinstancename.toString(), instancename.toString(), pinstanceport.toString()) as Int).toUInt() else 0u

public actual fun DsCrackSpnW(pszspn: PCWSTR, pcserviceclass: Long, serviceclass: PWSTR, pcservicename: Long, servicename: PWSTR, pcinstancename: Long, instancename: PWSTR, pinstanceport: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsCrackSpnW(pszspn.toString(), pcserviceclass.toString(), serviceclass.toString(), pcservicename.toString(), servicename.toString(), pcinstancename.toString(), instancename.toString(), pinstanceport.toString()) as Int).toUInt() else 0u

public actual fun DsCrackUnquotedMangledRdnA(pszrdn: PCSTR, cchrdn: UInt, pguid: Long, pedsmanglefor: Long): BOOL =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsCrackUnquotedMangledRdnA(pszrdn.toString(), cchrdn.toInt(), pguid.toString(), pedsmanglefor.toString()) as Int) else 0

public actual fun DsCrackUnquotedMangledRdnW(pszrdn: PCWSTR, cchrdn: UInt, pguid: Long, pedsmanglefor: Long): BOOL =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsCrackUnquotedMangledRdnW(pszrdn.toString(), cchrdn.toInt(), pguid.toString(), pedsmanglefor.toString()) as Int) else 0

public actual fun DsDeregisterDnsHostRecordsA(servername: PCSTR, dnsdomainname: PCSTR, domainguid: Long, dsaguid: Long, dnshostname: PCSTR): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsDeregisterDnsHostRecordsA(servername.toString(), dnsdomainname.toString(), domainguid.toString(), dsaguid.toString(), dnshostname.toString()) as Int).toUInt() else 0u

public actual fun DsDeregisterDnsHostRecordsW(servername: PCWSTR, dnsdomainname: PCWSTR, domainguid: Long, dsaguid: Long, dnshostname: PCWSTR): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsDeregisterDnsHostRecordsW(servername.toString(), dnsdomainname.toString(), domainguid.toString(), dsaguid.toString(), dnshostname.toString()) as Int).toUInt() else 0u

public actual fun DsEnumerateDomainTrustsA(servername: PCSTR, flags: UInt, domains: Long, domaincount: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsEnumerateDomainTrustsA(servername.toString(), flags.toInt(), domains.toString(), domaincount.toString()) as Int).toUInt() else 0u

public actual fun DsEnumerateDomainTrustsW(servername: PCWSTR, flags: UInt, domains: Long, domaincount: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsEnumerateDomainTrustsW(servername.toString(), flags.toInt(), domains.toString(), domaincount.toString()) as Int).toUInt() else 0u

public actual fun DsFreeDomainControllerInfoA(infolevel: UInt, cinfo: UInt, pinfo: Long) {
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) {
        _windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsFreeDomainControllerInfoA(infolevel.toInt(), cinfo.toInt(), pinfo.toString())
    }
}

public actual fun DsFreeDomainControllerInfoW(infolevel: UInt, cinfo: UInt, pinfo: Long) {
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) {
        _windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsFreeDomainControllerInfoW(infolevel.toInt(), cinfo.toInt(), pinfo.toString())
    }
}

public actual fun DsFreeNameResultA(presult: Long) {
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) {
        _windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsFreeNameResultA(presult.toString())
    }
}

public actual fun DsFreeNameResultW(presult: Long) {
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) {
        _windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsFreeNameResultW(presult.toString())
    }
}

public actual fun DsFreePasswordCredentials(authidentity: Long) {
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) {
        _windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsFreePasswordCredentials(authidentity.toString())
    }
}

public actual fun DsFreeSchemaGuidMapA(pguidmap: Long) {
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) {
        _windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsFreeSchemaGuidMapA(pguidmap.toString())
    }
}

public actual fun DsFreeSchemaGuidMapW(pguidmap: Long) {
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) {
        _windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsFreeSchemaGuidMapW(pguidmap.toString())
    }
}

public actual fun DsFreeSpnArrayA(cspn: UInt, rpszspn: Long) {
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) {
        _windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsFreeSpnArrayA(cspn.toInt(), rpszspn.toString())
    }
}

public actual fun DsFreeSpnArrayW(cspn: UInt, rpszspn: Long) {
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) {
        _windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsFreeSpnArrayW(cspn.toInt(), rpszspn.toString())
    }
}

public actual fun DsGetDcCloseW(getdccontexthandle: HANDLE) {
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) {
        _windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsGetDcCloseW(getdccontexthandle.toString())
    }
}

public actual fun DsGetDcNameA(computername: PCSTR, domainname: PCSTR, domainguid: Long, sitename: PCSTR, flags: UInt, domaincontrollerinfo: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsGetDcNameA(computername.toString(), domainname.toString(), domainguid.toString(), sitename.toString(), flags.toInt(), domaincontrollerinfo.toString()) as Int).toUInt() else 0u

public actual fun DsGetDcNameW(computername: PCWSTR, domainname: PCWSTR, domainguid: Long, sitename: PCWSTR, flags: UInt, domaincontrollerinfo: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsGetDcNameW(computername.toString(), domainname.toString(), domainguid.toString(), sitename.toString(), flags.toInt(), domaincontrollerinfo.toString()) as Int).toUInt() else 0u

public actual fun DsGetDcNextA(getdccontexthandle: HANDLE, sockaddresscount: Long, sockaddresses: Long, dnshostname: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsGetDcNextA(getdccontexthandle.toString(), sockaddresscount.toString(), sockaddresses.toString(), dnshostname.toString()) as Int).toUInt() else 0u

public actual fun DsGetDcNextW(getdccontexthandle: HANDLE, sockaddresscount: Long, sockaddresses: Long, dnshostname: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsGetDcNextW(getdccontexthandle.toString(), sockaddresscount.toString(), sockaddresses.toString(), dnshostname.toString()) as Int).toUInt() else 0u

public actual fun DsGetDcOpenA(dnsname: PCSTR, optionflags: UInt, sitename: PCSTR, domainguid: Long, dnsforestname: PCSTR, dcflags: UInt, retgetdccontext: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsGetDcOpenA(dnsname.toString(), optionflags.toInt(), sitename.toString(), domainguid.toString(), dnsforestname.toString(), dcflags.toInt(), retgetdccontext.toString()) as Int).toUInt() else 0u

public actual fun DsGetDcOpenW(dnsname: PCWSTR, optionflags: UInt, sitename: PCWSTR, domainguid: Long, dnsforestname: PCWSTR, dcflags: UInt, retgetdccontext: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsGetDcOpenW(dnsname.toString(), optionflags.toInt(), sitename.toString(), domainguid.toString(), dnsforestname.toString(), dcflags.toInt(), retgetdccontext.toString()) as Int).toUInt() else 0u

public actual fun DsGetDcSiteCoverageA(servername: PCSTR, entrycount: Long, sitenames: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsGetDcSiteCoverageA(servername.toString(), entrycount.toString(), sitenames.toString()) as Int).toUInt() else 0u

public actual fun DsGetDcSiteCoverageW(servername: PCWSTR, entrycount: Long, sitenames: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsGetDcSiteCoverageW(servername.toString(), entrycount.toString(), sitenames.toString()) as Int).toUInt() else 0u

public actual fun DsGetDomainControllerInfoA(hds: HANDLE, domainname: PCSTR, infolevel: UInt, pcout: Long, ppinfo: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsGetDomainControllerInfoA(hds.toString(), domainname.toString(), infolevel.toInt(), pcout.toString(), ppinfo.toString()) as Int).toUInt() else 0u

public actual fun DsGetDomainControllerInfoW(hds: HANDLE, domainname: PCWSTR, infolevel: UInt, pcout: Long, ppinfo: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsGetDomainControllerInfoW(hds.toString(), domainname.toString(), infolevel.toInt(), pcout.toString(), ppinfo.toString()) as Int).toUInt() else 0u

public actual fun DsGetForestTrustInformationW(servername: PCWSTR, trusteddomainname: PCWSTR, flags: UInt, foresttrustinfo: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsGetForestTrustInformationW(servername.toString(), trusteddomainname.toString(), flags.toInt(), foresttrustinfo.toString()) as Int).toUInt() else 0u

public actual fun DsGetFriendlyClassName(pszobjectclass: PCWSTR, pszbuffer: PWSTR, cchbuffer: UInt): HRESULT =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsGetFriendlyClassName(pszobjectclass.toString(), pszbuffer.toString(), cchbuffer.toInt()) as Int) else 0

public actual fun DsGetIcon(dwflags: UInt, pszobjectclass: PCWSTR, cximage: Int, cyimage: Int): HICON =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsGetIcon(dwflags.toInt(), pszobjectclass.toString(), cximage, cyimage) as String).toLong() else 0L

public actual fun DsGetRdnW(ppdn: Long, pcdn: Long, ppkey: Long, pckey: Long, ppval: Long, pcval: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsGetRdnW(ppdn.toString(), pcdn.toString(), ppkey.toString(), pckey.toString(), ppval.toString(), pcval.toString()) as Int).toUInt() else 0u

public actual fun DsGetSiteNameA(computername: PCSTR, sitename: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsGetSiteNameA(computername.toString(), sitename.toString()) as Int).toUInt() else 0u

public actual fun DsGetSiteNameW(computername: PCWSTR, sitename: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsGetSiteNameW(computername.toString(), sitename.toString()) as Int).toUInt() else 0u

public actual fun DsGetSpnA(servicetype: DS_SPN_NAME_TYPE, serviceclass: PCSTR, servicename: PCSTR, instanceport: UShort, cinstancenames: UShort, pinstancenames: Long, pinstanceports: Long, pcspn: Long, prpszspn: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsGetSpnA(servicetype, serviceclass.toString(), servicename.toString(), instanceport.toInt(), cinstancenames.toInt(), pinstancenames.toString(), pinstanceports.toString(), pcspn.toString(), prpszspn.toString()) as Int).toUInt() else 0u

public actual fun DsGetSpnW(servicetype: DS_SPN_NAME_TYPE, serviceclass: PCWSTR, servicename: PCWSTR, instanceport: UShort, cinstancenames: UShort, pinstancenames: Long, pinstanceports: Long, pcspn: Long, prpszspn: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsGetSpnW(servicetype, serviceclass.toString(), servicename.toString(), instanceport.toInt(), cinstancenames.toInt(), pinstancenames.toString(), pinstanceports.toString(), pcspn.toString(), prpszspn.toString()) as Int).toUInt() else 0u

public actual fun DsInheritSecurityIdentityA(hds: HANDLE, flags: UInt, srcprincipal: PCSTR, dstprincipal: PCSTR): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsInheritSecurityIdentityA(hds.toString(), flags.toInt(), srcprincipal.toString(), dstprincipal.toString()) as Int).toUInt() else 0u

public actual fun DsInheritSecurityIdentityW(hds: HANDLE, flags: UInt, srcprincipal: PCWSTR, dstprincipal: PCWSTR): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsInheritSecurityIdentityW(hds.toString(), flags.toInt(), srcprincipal.toString(), dstprincipal.toString()) as Int).toUInt() else 0u

public actual fun DsIsMangledDnA(pszdn: PCSTR, edsmanglefor: DS_MANGLE_FOR): BOOL =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsIsMangledDnA(pszdn.toString(), edsmanglefor) as Int) else 0

public actual fun DsIsMangledDnW(pszdn: PCWSTR, edsmanglefor: DS_MANGLE_FOR): BOOL =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsIsMangledDnW(pszdn.toString(), edsmanglefor) as Int) else 0

public actual fun DsIsMangledRdnValueA(pszrdn: PCSTR, crdn: UInt, edsmanglefordesired: DS_MANGLE_FOR): BOOL =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsIsMangledRdnValueA(pszrdn.toString(), crdn.toInt(), edsmanglefordesired) as Int) else 0

public actual fun DsIsMangledRdnValueW(pszrdn: PCWSTR, crdn: UInt, edsmanglefordesired: DS_MANGLE_FOR): BOOL =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsIsMangledRdnValueW(pszrdn.toString(), crdn.toInt(), edsmanglefordesired) as Int) else 0

public actual fun DsListDomainsInSiteA(hds: HANDLE, site: PCSTR, ppdomains: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsListDomainsInSiteA(hds.toString(), site.toString(), ppdomains.toString()) as Int).toUInt() else 0u

public actual fun DsListDomainsInSiteW(hds: HANDLE, site: PCWSTR, ppdomains: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsListDomainsInSiteW(hds.toString(), site.toString(), ppdomains.toString()) as Int).toUInt() else 0u

public actual fun DsListInfoForServerA(hds: HANDLE, server: PCSTR, ppinfo: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsListInfoForServerA(hds.toString(), server.toString(), ppinfo.toString()) as Int).toUInt() else 0u

public actual fun DsListInfoForServerW(hds: HANDLE, server: PCWSTR, ppinfo: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsListInfoForServerW(hds.toString(), server.toString(), ppinfo.toString()) as Int).toUInt() else 0u

public actual fun DsListRolesA(hds: HANDLE, pproles: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsListRolesA(hds.toString(), pproles.toString()) as Int).toUInt() else 0u

public actual fun DsListRolesW(hds: HANDLE, pproles: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsListRolesW(hds.toString(), pproles.toString()) as Int).toUInt() else 0u

public actual fun DsListServersForDomainInSiteA(hds: HANDLE, domain: PCSTR, site: PCSTR, ppservers: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsListServersForDomainInSiteA(hds.toString(), domain.toString(), site.toString(), ppservers.toString()) as Int).toUInt() else 0u

public actual fun DsListServersForDomainInSiteW(hds: HANDLE, domain: PCWSTR, site: PCWSTR, ppservers: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsListServersForDomainInSiteW(hds.toString(), domain.toString(), site.toString(), ppservers.toString()) as Int).toUInt() else 0u

public actual fun DsListServersInSiteA(hds: HANDLE, site: PCSTR, ppservers: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsListServersInSiteA(hds.toString(), site.toString(), ppservers.toString()) as Int).toUInt() else 0u

public actual fun DsListServersInSiteW(hds: HANDLE, site: PCWSTR, ppservers: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsListServersInSiteW(hds.toString(), site.toString(), ppservers.toString()) as Int).toUInt() else 0u

public actual fun DsListSitesA(hds: HANDLE, ppsites: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsListSitesA(hds.toString(), ppsites.toString()) as Int).toUInt() else 0u

public actual fun DsListSitesW(hds: HANDLE, ppsites: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsListSitesW(hds.toString(), ppsites.toString()) as Int).toUInt() else 0u

public actual fun DsMakePasswordCredentialsA(user: PCSTR, domain: PCSTR, password: PCSTR, pauthidentity: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsMakePasswordCredentialsA(user.toString(), domain.toString(), password.toString(), pauthidentity.toString()) as Int).toUInt() else 0u

public actual fun DsMakePasswordCredentialsW(user: PCWSTR, domain: PCWSTR, password: PCWSTR, pauthidentity: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsMakePasswordCredentialsW(user.toString(), domain.toString(), password.toString(), pauthidentity.toString()) as Int).toUInt() else 0u

public actual fun DsMakeSpnA(serviceclass: PCSTR, servicename: PCSTR, instancename: PCSTR, instanceport: UShort, referrer: PCSTR, pcspnlength: Long, pszspn: PSTR): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsMakeSpnA(serviceclass.toString(), servicename.toString(), instancename.toString(), instanceport.toInt(), referrer.toString(), pcspnlength.toString(), pszspn.toString()) as Int).toUInt() else 0u

public actual fun DsMakeSpnW(serviceclass: PCWSTR, servicename: PCWSTR, instancename: PCWSTR, instanceport: UShort, referrer: PCWSTR, pcspnlength: Long, pszspn: PWSTR): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsMakeSpnW(serviceclass.toString(), servicename.toString(), instancename.toString(), instanceport.toInt(), referrer.toString(), pcspnlength.toString(), pszspn.toString()) as Int).toUInt() else 0u

public actual fun DsMapSchemaGuidsA(hds: HANDLE, cguids: UInt, rguids: Long, ppguidmap: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsMapSchemaGuidsA(hds.toString(), cguids.toInt(), rguids.toString(), ppguidmap.toString()) as Int).toUInt() else 0u

public actual fun DsMapSchemaGuidsW(hds: HANDLE, cguids: UInt, rguids: Long, ppguidmap: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsMapSchemaGuidsW(hds.toString(), cguids.toInt(), rguids.toString(), ppguidmap.toString()) as Int).toUInt() else 0u

public actual fun DsMergeForestTrustInformationW(domainname: PCWSTR, newforesttrustinfo: Long, oldforesttrustinfo: Long, mergedforesttrustinfo: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsMergeForestTrustInformationW(domainname.toString(), newforesttrustinfo.toString(), oldforesttrustinfo.toString(), mergedforesttrustinfo.toString()) as Int).toUInt() else 0u

public actual fun DsQuerySitesByCostA(hds: HANDLE, pszfromsite: PCSTR, rgsztosites: Long, ctosites: UInt, dwflags: UInt, prgsiteinfo: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsQuerySitesByCostA(hds.toString(), pszfromsite.toString(), rgsztosites.toString(), ctosites.toInt(), dwflags.toInt(), prgsiteinfo.toString()) as Int).toUInt() else 0u

public actual fun DsQuerySitesByCostW(hds: HANDLE, pwszfromsite: PCWSTR, rgwsztosites: Long, ctosites: UInt, dwflags: UInt, prgsiteinfo: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsQuerySitesByCostW(hds.toString(), pwszfromsite.toString(), rgwsztosites.toString(), ctosites.toInt(), dwflags.toInt(), prgsiteinfo.toString()) as Int).toUInt() else 0u

public actual fun DsQuerySitesFree(rgsiteinfo: Long) {
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) {
        _windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsQuerySitesFree(rgsiteinfo.toString())
    }
}

public actual fun DsQuoteRdnValueA(cunquotedrdnvaluelength: UInt, psunquotedrdnvalue: PCSTR, pcquotedrdnvaluelength: Long, psquotedrdnvalue: PSTR): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsQuoteRdnValueA(cunquotedrdnvaluelength.toInt(), psunquotedrdnvalue.toString(), pcquotedrdnvaluelength.toString(), psquotedrdnvalue.toString()) as Int).toUInt() else 0u

public actual fun DsQuoteRdnValueW(cunquotedrdnvaluelength: UInt, psunquotedrdnvalue: PCWSTR, pcquotedrdnvaluelength: Long, psquotedrdnvalue: PWSTR): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsQuoteRdnValueW(cunquotedrdnvaluelength.toInt(), psunquotedrdnvalue.toString(), pcquotedrdnvaluelength.toString(), psquotedrdnvalue.toString()) as Int).toUInt() else 0u

public actual fun DsRemoveDsDomainA(hds: HANDLE, domaindn: PCSTR): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsRemoveDsDomainA(hds.toString(), domaindn.toString()) as Int).toUInt() else 0u

public actual fun DsRemoveDsDomainW(hds: HANDLE, domaindn: PCWSTR): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsRemoveDsDomainW(hds.toString(), domaindn.toString()) as Int).toUInt() else 0u

public actual fun DsRemoveDsServerA(hds: HANDLE, serverdn: PCSTR, domaindn: PCSTR, flastdcindomain: Long, fcommit: BOOL): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsRemoveDsServerA(hds.toString(), serverdn.toString(), domaindn.toString(), flastdcindomain.toString(), fcommit) as Int).toUInt() else 0u

public actual fun DsRemoveDsServerW(hds: HANDLE, serverdn: PCWSTR, domaindn: PCWSTR, flastdcindomain: Long, fcommit: BOOL): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsRemoveDsServerW(hds.toString(), serverdn.toString(), domaindn.toString(), flastdcindomain.toString(), fcommit) as Int).toUInt() else 0u

public actual fun DsReplicaAddA(hds: HANDLE, namecontext: PCSTR, sourcedsadn: PCSTR, transportdn: PCSTR, sourcedsaaddress: PCSTR, pschedule: Long, options: UInt): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsReplicaAddA(hds.toString(), namecontext.toString(), sourcedsadn.toString(), transportdn.toString(), sourcedsaaddress.toString(), pschedule.toString(), options.toInt()) as Int).toUInt() else 0u

public actual fun DsReplicaAddW(hds: HANDLE, namecontext: PCWSTR, sourcedsadn: PCWSTR, transportdn: PCWSTR, sourcedsaaddress: PCWSTR, pschedule: Long, options: UInt): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsReplicaAddW(hds.toString(), namecontext.toString(), sourcedsadn.toString(), transportdn.toString(), sourcedsaaddress.toString(), pschedule.toString(), options.toInt()) as Int).toUInt() else 0u

public actual fun DsReplicaConsistencyCheck(hds: HANDLE, taskid: DS_KCC_TASKID, dwflags: UInt): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsReplicaConsistencyCheck(hds.toString(), taskid, dwflags.toInt()) as Int).toUInt() else 0u

public actual fun DsReplicaDelA(hds: HANDLE, namecontext: PCSTR, dsasrc: PCSTR, options: UInt): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsReplicaDelA(hds.toString(), namecontext.toString(), dsasrc.toString(), options.toInt()) as Int).toUInt() else 0u

public actual fun DsReplicaDelW(hds: HANDLE, namecontext: PCWSTR, dsasrc: PCWSTR, options: UInt): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsReplicaDelW(hds.toString(), namecontext.toString(), dsasrc.toString(), options.toInt()) as Int).toUInt() else 0u

public actual fun DsReplicaFreeInfo(infotype: DS_REPL_INFO_TYPE, pinfo: Long) {
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) {
        _windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsReplicaFreeInfo(infotype, pinfo.toString())
    }
}

public actual fun DsReplicaGetInfo2W(hds: HANDLE, infotype: DS_REPL_INFO_TYPE, pszobject: PCWSTR, puuidforsourcedsaobjguid: Long, pszattributename: PCWSTR, pszvalue: PCWSTR, dwflags: UInt, dwenumerationcontext: UInt, ppinfo: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsReplicaGetInfo2W(hds.toString(), infotype, pszobject.toString(), puuidforsourcedsaobjguid.toString(), pszattributename.toString(), pszvalue.toString(), dwflags.toInt(), dwenumerationcontext.toInt(), ppinfo.toString()) as Int).toUInt() else 0u

public actual fun DsReplicaGetInfoW(hds: HANDLE, infotype: DS_REPL_INFO_TYPE, pszobject: PCWSTR, puuidforsourcedsaobjguid: Long, ppinfo: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsReplicaGetInfoW(hds.toString(), infotype, pszobject.toString(), puuidforsourcedsaobjguid.toString(), ppinfo.toString()) as Int).toUInt() else 0u

public actual fun DsReplicaModifyA(hds: HANDLE, namecontext: PCSTR, puuidsourcedsa: Long, transportdn: PCSTR, sourcedsaaddress: PCSTR, pschedule: Long, replicaflags: UInt, modifyfields: UInt, options: UInt): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsReplicaModifyA(hds.toString(), namecontext.toString(), puuidsourcedsa.toString(), transportdn.toString(), sourcedsaaddress.toString(), pschedule.toString(), replicaflags.toInt(), modifyfields.toInt(), options.toInt()) as Int).toUInt() else 0u

public actual fun DsReplicaModifyW(hds: HANDLE, namecontext: PCWSTR, puuidsourcedsa: Long, transportdn: PCWSTR, sourcedsaaddress: PCWSTR, pschedule: Long, replicaflags: UInt, modifyfields: UInt, options: UInt): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsReplicaModifyW(hds.toString(), namecontext.toString(), puuidsourcedsa.toString(), transportdn.toString(), sourcedsaaddress.toString(), pschedule.toString(), replicaflags.toInt(), modifyfields.toInt(), options.toInt()) as Int).toUInt() else 0u

public actual fun DsReplicaSyncA(hds: HANDLE, namecontext: PCSTR, puuiddsasrc: Long, options: UInt): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsReplicaSyncA(hds.toString(), namecontext.toString(), puuiddsasrc.toString(), options.toInt()) as Int).toUInt() else 0u

public actual fun DsReplicaSyncAllA(hds: HANDLE, psznamecontext: PCSTR, ulflags: UInt, pfncallback: Long, pcallbackdata: Long, perrors: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsReplicaSyncAllA(hds.toString(), psznamecontext.toString(), ulflags.toInt(), pfncallback.toString(), pcallbackdata.toString(), perrors.toString()) as Int).toUInt() else 0u

public actual fun DsReplicaSyncAllW(hds: HANDLE, psznamecontext: PCWSTR, ulflags: UInt, pfncallback: Long, pcallbackdata: Long, perrors: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsReplicaSyncAllW(hds.toString(), psznamecontext.toString(), ulflags.toInt(), pfncallback.toString(), pcallbackdata.toString(), perrors.toString()) as Int).toUInt() else 0u

public actual fun DsReplicaSyncW(hds: HANDLE, namecontext: PCWSTR, puuiddsasrc: Long, options: UInt): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsReplicaSyncW(hds.toString(), namecontext.toString(), puuiddsasrc.toString(), options.toInt()) as Int).toUInt() else 0u

public actual fun DsReplicaUpdateRefsA(hds: HANDLE, namecontext: PCSTR, dsadest: PCSTR, puuiddsadest: Long, options: UInt): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsReplicaUpdateRefsA(hds.toString(), namecontext.toString(), dsadest.toString(), puuiddsadest.toString(), options.toInt()) as Int).toUInt() else 0u

public actual fun DsReplicaUpdateRefsW(hds: HANDLE, namecontext: PCWSTR, dsadest: PCWSTR, puuiddsadest: Long, options: UInt): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsReplicaUpdateRefsW(hds.toString(), namecontext.toString(), dsadest.toString(), puuiddsadest.toString(), options.toInt()) as Int).toUInt() else 0u

public actual fun DsReplicaVerifyObjectsA(hds: HANDLE, namecontext: PCSTR, puuiddsasrc: Long, uloptions: UInt): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsReplicaVerifyObjectsA(hds.toString(), namecontext.toString(), puuiddsasrc.toString(), uloptions.toInt()) as Int).toUInt() else 0u

public actual fun DsReplicaVerifyObjectsW(hds: HANDLE, namecontext: PCWSTR, puuiddsasrc: Long, uloptions: UInt): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsReplicaVerifyObjectsW(hds.toString(), namecontext.toString(), puuiddsasrc.toString(), uloptions.toInt()) as Int).toUInt() else 0u

public actual fun DsRoleFreeMemory(buffer: Long) {
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) {
        _windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsRoleFreeMemory(buffer.toString())
    }
}

public actual fun DsRoleGetPrimaryDomainInformation(lpserver: PCWSTR, infolevel: DSROLE_PRIMARY_DOMAIN_INFO_LEVEL, buffer: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsRoleGetPrimaryDomainInformation(lpserver.toString(), infolevel, buffer.toString()) as Int).toUInt() else 0u

public actual fun DsServerRegisterSpnA(operation: DS_SPN_WRITE_OP, serviceclass: PCSTR, userobjectdn: PCSTR): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsServerRegisterSpnA(operation, serviceclass.toString(), userobjectdn.toString()) as Int).toUInt() else 0u

public actual fun DsServerRegisterSpnW(operation: DS_SPN_WRITE_OP, serviceclass: PCWSTR, userobjectdn: PCWSTR): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsServerRegisterSpnW(operation, serviceclass.toString(), userobjectdn.toString()) as Int).toUInt() else 0u

public actual fun DsUnBindA(phds: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsUnBindA(phds.toString()) as Int).toUInt() else 0u

public actual fun DsUnBindW(phds: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsUnBindW(phds.toString()) as Int).toUInt() else 0u

public actual fun DsUnquoteRdnValueA(cquotedrdnvaluelength: UInt, psquotedrdnvalue: PCSTR, pcunquotedrdnvaluelength: Long, psunquotedrdnvalue: PSTR): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsUnquoteRdnValueA(cquotedrdnvaluelength.toInt(), psquotedrdnvalue.toString(), pcunquotedrdnvaluelength.toString(), psunquotedrdnvalue.toString()) as Int).toUInt() else 0u

public actual fun DsUnquoteRdnValueW(cquotedrdnvaluelength: UInt, psquotedrdnvalue: PCWSTR, pcunquotedrdnvaluelength: Long, psunquotedrdnvalue: PWSTR): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsUnquoteRdnValueW(cquotedrdnvaluelength.toInt(), psquotedrdnvalue.toString(), pcunquotedrdnvaluelength.toString(), psunquotedrdnvalue.toString()) as Int).toUInt() else 0u

public actual fun DsValidateSubnetNameA(subnetname: PCSTR): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsValidateSubnetNameA(subnetname.toString()) as Int).toUInt() else 0u

public actual fun DsValidateSubnetNameW(subnetname: PCWSTR): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsValidateSubnetNameW(subnetname.toString()) as Int).toUInt() else 0u

public actual fun DsWriteAccountSpnA(hds: HANDLE, operation: DS_SPN_WRITE_OP, pszaccount: PCSTR, cspn: UInt, rpszspn: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsWriteAccountSpnA(hds.toString(), operation, pszaccount.toString(), cspn.toInt(), rpszspn.toString()) as Int).toUInt() else 0u

public actual fun DsWriteAccountSpnW(hds: HANDLE, operation: DS_SPN_WRITE_OP, pszaccount: PCWSTR, cspn: UInt, rpszspn: Long): UInt =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_DsWriteAccountSpnW(hds.toString(), operation, pszaccount.toString(), cspn.toInt(), rpszspn.toString()) as Int).toUInt() else 0u

public actual fun FreeADsMem(pmem: Long): BOOL =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_FreeADsMem(pmem.toString()) as Int) else 0

public actual fun FreeADsStr(pstr: PCWSTR): BOOL =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_FreeADsStr(pstr.toString()) as Int) else 0

public actual fun PropVariantToAdsType(pvariant: Long, dwnumvariant: UInt, ppadsvalues: Long, pdwnumvalues: Long): HRESULT =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_PropVariantToAdsType(pvariant.toString(), dwnumvariant.toInt(), ppadsvalues.toString(), pdwnumvalues.toString()) as Int) else 0

public actual fun ReallocADsMem(poldmem: Long, cbold: UInt, cbnew: UInt): Long =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_ReallocADsMem(poldmem.toString(), cbold.toInt(), cbnew.toInt()) as String).toLong() else 0L

public actual fun ReallocADsStr(ppstr: Long, pstr: PCWSTR): BOOL =
    if (_windowsWin32NetworkingActivedirectoryNapiAddon != null) (_windowsWin32NetworkingActivedirectoryNapiAddon.windowssys_windows_win32_networking_activedirectory_ReallocADsStr(ppstr.toString(), pstr.toString()) as Int) else 0

public actual fun SecurityDescriptorToBinarySD(vvarsecdes: VARIANT, ppsecuritydescriptor: Long, pdwsdlength: Long, pszservername: PCWSTR, username: PCWSTR, password: PCWSTR, dwflags: UInt): HRESULT =
    0
