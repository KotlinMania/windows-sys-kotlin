@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.activedirectory

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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

private val windowsWin32NetworkingActivedirectoryNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun aDsBuildEnumerator(padscontainer: MutPtr, ppenumvariant: MutPtr): Hresult =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryADsBuildEnumerator(padscontainer.rawAddress.toString(), ppenumvariant.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsBuildVarArrayInt(lpdwobjecttypes: MutPtr, dwobjecttypes: UInt, pvar: MutPtr): Hresult =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryADsBuildVarArrayInt(lpdwobjecttypes.rawAddress.toString(), dwobjecttypes.toInt(), pvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsBuildVarArrayStr(lpppathnames: ConstPtr, dwpathnames: UInt, pvar: MutPtr): Hresult =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryADsBuildVarArrayStr(lpppathnames.rawAddress.toString(), dwpathnames.toInt(), pvar.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsDecodeBinaryData(szsrcdata: Pcwstr, ppbdestdata: MutPtr, pdwdestlen: MutPtr): Hresult =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryADsDecodeBinaryData(szsrcdata.rawAddress.toString(), ppbdestdata.rawAddress.toString(), pdwdestlen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsEncodeBinaryData(pbsrcdata: MutPtr, dwsrclen: UInt, ppszdestdata: MutPtr): Hresult =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryADsEncodeBinaryData(pbsrcdata.rawAddress.toString(), dwsrclen.toInt(), ppszdestdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsEnumerateNext(penumvariant: MutPtr, celements: UInt, pvar: MutPtr, pcelementsfetched: MutPtr): Hresult =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryADsEnumerateNext(penumvariant.rawAddress.toString(), celements.toInt(), pvar.rawAddress.toString(), pcelementsfetched.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsFreeEnumerator(penumvariant: MutPtr): Hresult =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryADsFreeEnumerator(penumvariant.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsGetLastError(lperror: MutPtr, lperrorbuf: Pwstr, dwerrorbuflen: UInt, lpnamebuf: Pwstr, dwnamebuflen: UInt): Hresult =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryADsGetLastError(lperror.rawAddress.toString(), lperrorbuf.rawAddress.toString(), dwerrorbuflen.toInt(), lpnamebuf.rawAddress.toString(), dwnamebuflen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsGetObject(lpszpathname: Pcwstr, riid: ConstPtr, ppobject: MutPtr): Hresult =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryADsGetObject(lpszpathname.rawAddress.toString(), riid.rawAddress.toString(), ppobject.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsOpenObject(lpszpathname: Pcwstr, lpszusername: Pcwstr, lpszpassword: Pcwstr, dwreserved: AdsAuthenticationEnum, riid: ConstPtr, ppobject: MutPtr): Hresult =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryADsOpenObject(lpszpathname.rawAddress.toString(), lpszusername.rawAddress.toString(), lpszpassword.rawAddress.toString(), dwreserved.toInt(), riid.rawAddress.toString(), ppobject.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsPropCheckIfWritable(pwzattr: Pcwstr, pwritableattrs: ConstPtr): Bool =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryADsPropCheckIfWritable(pwzattr.rawAddress.toString(), pwritableattrs.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsPropCreateNotifyObj(pappthddataobj: MutPtr, pwzadsobjname: Pcwstr, phnotifyobj: MutPtr): Hresult =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryADsPropCreateNotifyObj(pappthddataobj.rawAddress.toString(), pwzadsobjname.rawAddress.toString(), phnotifyobj.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsPropGetInitInfo(hnotifyobj: Hwnd, pinitparams: MutPtr): Bool =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryADsPropGetInitInfo(hnotifyobj.rawAddress.toString(), pinitparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsPropSendErrorMessage(hnotifyobj: Hwnd, perror: MutPtr): Bool =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryADsPropSendErrorMessage(hnotifyobj.rawAddress.toString(), perror.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsPropSetHwnd(hnotifyobj: Hwnd, hpage: Hwnd): Bool =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryADsPropSetHwnd(hnotifyobj.rawAddress.toString(), hpage.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsPropSetHwndWithTitle(hnotifyobj: Hwnd, hpage: Hwnd, ptztitle: ConstPtr): Bool =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryADsPropSetHwndWithTitle(hnotifyobj.rawAddress.toString(), hpage.rawAddress.toString(), ptztitle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsPropShowErrorDialog(hnotifyobj: Hwnd, hpage: Hwnd): Bool =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryADsPropShowErrorDialog(hnotifyobj.rawAddress.toString(), hpage.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun aDsSetLastError(dwerr: UInt, pszerror: Pcwstr, pszprovider: Pcwstr) {
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) {
        windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryADsSetLastError(dwerr.toInt(), pszerror.rawAddress.toString(), pszprovider.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun adsFreeAdsValues(padsvalues: MutPtr, dwnumvalues: UInt) {
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) {
        windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryAdsFreeAdsValues(padsvalues.rawAddress.toString(), dwnumvalues.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun adsTypeToPropVariant(padsvalues: MutPtr, dwnumvalues: UInt, pvariant: MutPtr): Hresult =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryAdsTypeToPropVariant(padsvalues.rawAddress.toString(), dwnumvalues.toInt(), pvariant.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allocADsMem(cb: UInt): MutPtr =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) MutPtr((windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryAllocADsMem(cb.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allocADsStr(pstr: Pcwstr): Pwstr =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) MutPtr((windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryAllocADsStr(pstr.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun binarySDToSecurityDescriptor(psecuritydescriptor: PsecurityDescriptor, pvarsec: MutPtr, pszservername: Pcwstr, username: Pcwstr, password: Pcwstr, dwflags: UInt): Hresult =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryBinarySDToSecurityDescriptor(psecuritydescriptor.rawAddress.toString(), pvarsec.rawAddress.toString(), pszservername.rawAddress.toString(), username.rawAddress.toString(), password.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsAddSidHistoryA(hds: Handle, flags: UInt, srcdomain: Pcstr, srcprincipal: Pcstr, srcdomaincontroller: Pcstr, srcdomaincreds: ConstPtr, dstdomain: Pcstr, dstprincipal: Pcstr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsAddSidHistoryA(hds.rawAddress.toString(), flags.toInt(), srcdomain.rawAddress.toString(), srcprincipal.rawAddress.toString(), srcdomaincontroller.rawAddress.toString(), srcdomaincreds.rawAddress.toString(), dstdomain.rawAddress.toString(), dstprincipal.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsAddSidHistoryW(hds: Handle, flags: UInt, srcdomain: Pcwstr, srcprincipal: Pcwstr, srcdomaincontroller: Pcwstr, srcdomaincreds: ConstPtr, dstdomain: Pcwstr, dstprincipal: Pcwstr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsAddSidHistoryW(hds.rawAddress.toString(), flags.toInt(), srcdomain.rawAddress.toString(), srcprincipal.rawAddress.toString(), srcdomaincontroller.rawAddress.toString(), srcdomaincreds.rawAddress.toString(), dstdomain.rawAddress.toString(), dstprincipal.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsAddressToSiteNamesA(computername: Pcstr, entrycount: UInt, socketaddresses: ConstPtr, sitenames: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsAddressToSiteNamesA(computername.rawAddress.toString(), entrycount.toInt(), socketaddresses.rawAddress.toString(), sitenames.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsAddressToSiteNamesExA(computername: Pcstr, entrycount: UInt, socketaddresses: ConstPtr, sitenames: MutPtr, subnetnames: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsAddressToSiteNamesExA(computername.rawAddress.toString(), entrycount.toInt(), socketaddresses.rawAddress.toString(), sitenames.rawAddress.toString(), subnetnames.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsAddressToSiteNamesExW(computername: Pcwstr, entrycount: UInt, socketaddresses: ConstPtr, sitenames: MutPtr, subnetnames: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsAddressToSiteNamesExW(computername.rawAddress.toString(), entrycount.toInt(), socketaddresses.rawAddress.toString(), sitenames.rawAddress.toString(), subnetnames.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsAddressToSiteNamesW(computername: Pcwstr, entrycount: UInt, socketaddresses: ConstPtr, sitenames: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsAddressToSiteNamesW(computername.rawAddress.toString(), entrycount.toInt(), socketaddresses.rawAddress.toString(), sitenames.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsBindA(domaincontrollername: Pcstr, dnsdomainname: Pcstr, phds: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsBindA(domaincontrollername.rawAddress.toString(), dnsdomainname.rawAddress.toString(), phds.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsBindByInstanceA(servername: Pcstr, annotation: Pcstr, instanceguid: ConstPtr, dnsdomainname: Pcstr, authidentity: ConstPtr, serviceprincipalname: Pcstr, bindflags: UInt, phds: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsBindByInstanceA(servername.rawAddress.toString(), annotation.rawAddress.toString(), instanceguid.rawAddress.toString(), dnsdomainname.rawAddress.toString(), authidentity.rawAddress.toString(), serviceprincipalname.rawAddress.toString(), bindflags.toInt(), phds.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsBindByInstanceW(servername: Pcwstr, annotation: Pcwstr, instanceguid: ConstPtr, dnsdomainname: Pcwstr, authidentity: ConstPtr, serviceprincipalname: Pcwstr, bindflags: UInt, phds: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsBindByInstanceW(servername.rawAddress.toString(), annotation.rawAddress.toString(), instanceguid.rawAddress.toString(), dnsdomainname.rawAddress.toString(), authidentity.rawAddress.toString(), serviceprincipalname.rawAddress.toString(), bindflags.toInt(), phds.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsBindToISTGA(sitename: Pcstr, phds: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsBindToISTGA(sitename.rawAddress.toString(), phds.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsBindToISTGW(sitename: Pcwstr, phds: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsBindToISTGW(sitename.rawAddress.toString(), phds.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsBindW(domaincontrollername: Pcwstr, dnsdomainname: Pcwstr, phds: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsBindW(domaincontrollername.rawAddress.toString(), dnsdomainname.rawAddress.toString(), phds.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsBindWithCredA(domaincontrollername: Pcstr, dnsdomainname: Pcstr, authidentity: ConstPtr, phds: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsBindWithCredA(domaincontrollername.rawAddress.toString(), dnsdomainname.rawAddress.toString(), authidentity.rawAddress.toString(), phds.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsBindWithCredW(domaincontrollername: Pcwstr, dnsdomainname: Pcwstr, authidentity: ConstPtr, phds: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsBindWithCredW(domaincontrollername.rawAddress.toString(), dnsdomainname.rawAddress.toString(), authidentity.rawAddress.toString(), phds.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsBindWithSpnA(domaincontrollername: Pcstr, dnsdomainname: Pcstr, authidentity: ConstPtr, serviceprincipalname: Pcstr, phds: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsBindWithSpnA(domaincontrollername.rawAddress.toString(), dnsdomainname.rawAddress.toString(), authidentity.rawAddress.toString(), serviceprincipalname.rawAddress.toString(), phds.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsBindWithSpnExA(domaincontrollername: Pcstr, dnsdomainname: Pcstr, authidentity: ConstPtr, serviceprincipalname: Pcstr, bindflags: UInt, phds: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsBindWithSpnExA(domaincontrollername.rawAddress.toString(), dnsdomainname.rawAddress.toString(), authidentity.rawAddress.toString(), serviceprincipalname.rawAddress.toString(), bindflags.toInt(), phds.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsBindWithSpnExW(domaincontrollername: Pcwstr, dnsdomainname: Pcwstr, authidentity: ConstPtr, serviceprincipalname: Pcwstr, bindflags: UInt, phds: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsBindWithSpnExW(domaincontrollername.rawAddress.toString(), dnsdomainname.rawAddress.toString(), authidentity.rawAddress.toString(), serviceprincipalname.rawAddress.toString(), bindflags.toInt(), phds.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsBindWithSpnW(domaincontrollername: Pcwstr, dnsdomainname: Pcwstr, authidentity: ConstPtr, serviceprincipalname: Pcwstr, phds: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsBindWithSpnW(domaincontrollername.rawAddress.toString(), dnsdomainname.rawAddress.toString(), authidentity.rawAddress.toString(), serviceprincipalname.rawAddress.toString(), phds.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsBindingSetTimeout(hds: Handle, ctimeoutsecs: UInt): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsBindingSetTimeout(hds.rawAddress.toString(), ctimeoutsecs.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsBrowseForContainerA(pinfo: MutPtr): Int =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsBrowseForContainerA(pinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsBrowseForContainerW(pinfo: MutPtr): Int =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsBrowseForContainerW(pinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsClientMakeSpnForTargetServerA(serviceclass: Pcstr, servicename: Pcstr, pcspnlength: MutPtr, pszspn: Pstr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsClientMakeSpnForTargetServerA(serviceclass.rawAddress.toString(), servicename.rawAddress.toString(), pcspnlength.rawAddress.toString(), pszspn.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsClientMakeSpnForTargetServerW(serviceclass: Pcwstr, servicename: Pcwstr, pcspnlength: MutPtr, pszspn: Pwstr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsClientMakeSpnForTargetServerW(serviceclass.rawAddress.toString(), servicename.rawAddress.toString(), pcspnlength.rawAddress.toString(), pszspn.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsCrackNamesA(hds: Handle, flags: DsNameFlags, formatoffered: DsNameFormat, formatdesired: DsNameFormat, cnames: UInt, rpnames: ConstPtr, ppresult: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsCrackNamesA(hds.rawAddress.toString(), flags, formatoffered, formatdesired, cnames.toInt(), rpnames.rawAddress.toString(), ppresult.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsCrackNamesW(hds: Handle, flags: DsNameFlags, formatoffered: DsNameFormat, formatdesired: DsNameFormat, cnames: UInt, rpnames: ConstPtr, ppresult: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsCrackNamesW(hds.rawAddress.toString(), flags, formatoffered, formatdesired, cnames.toInt(), rpnames.rawAddress.toString(), ppresult.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsCrackSpn2A(pszspn: Pcstr, cspn: UInt, pcserviceclass: MutPtr, serviceclass: Pstr, pcservicename: MutPtr, servicename: Pstr, pcinstancename: MutPtr, instancename: Pstr, pinstanceport: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpn2A(pszspn.rawAddress.toString(), cspn.toInt(), pcserviceclass.rawAddress.toString(), serviceclass.rawAddress.toString(), pcservicename.rawAddress.toString(), servicename.rawAddress.toString(), pcinstancename.rawAddress.toString(), instancename.rawAddress.toString(), pinstanceport.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsCrackSpn2W(pszspn: Pcwstr, cspn: UInt, pcserviceclass: MutPtr, serviceclass: Pwstr, pcservicename: MutPtr, servicename: Pwstr, pcinstancename: MutPtr, instancename: Pwstr, pinstanceport: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpn2W(pszspn.rawAddress.toString(), cspn.toInt(), pcserviceclass.rawAddress.toString(), serviceclass.rawAddress.toString(), pcservicename.rawAddress.toString(), servicename.rawAddress.toString(), pcinstancename.rawAddress.toString(), instancename.rawAddress.toString(), pinstanceport.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsCrackSpn3W(pszspn: Pcwstr, cspn: UInt, pchostname: MutPtr, hostname: Pwstr, pcinstancename: MutPtr, instancename: Pwstr, pportnumber: MutPtr, pcdomainname: MutPtr, domainname: Pwstr, pcrealmname: MutPtr, realmname: Pwstr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpn3W(pszspn.rawAddress.toString(), cspn.toInt(), pchostname.rawAddress.toString(), hostname.rawAddress.toString(), pcinstancename.rawAddress.toString(), instancename.rawAddress.toString(), pportnumber.rawAddress.toString(), pcdomainname.rawAddress.toString(), domainname.rawAddress.toString(), pcrealmname.rawAddress.toString(), realmname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsCrackSpn4W(pszspn: Pcwstr, cspn: UInt, pchostname: MutPtr, hostname: Pwstr, pcinstancename: MutPtr, instancename: Pwstr, pcportname: MutPtr, portname: Pwstr, pcdomainname: MutPtr, domainname: Pwstr, pcrealmname: MutPtr, realmname: Pwstr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpn4W(pszspn.rawAddress.toString(), cspn.toInt(), pchostname.rawAddress.toString(), hostname.rawAddress.toString(), pcinstancename.rawAddress.toString(), instancename.rawAddress.toString(), pcportname.rawAddress.toString(), portname.rawAddress.toString(), pcdomainname.rawAddress.toString(), domainname.rawAddress.toString(), pcrealmname.rawAddress.toString(), realmname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsCrackSpnA(pszspn: Pcstr, pcserviceclass: MutPtr, serviceclass: Pstr, pcservicename: MutPtr, servicename: Pstr, pcinstancename: MutPtr, instancename: Pstr, pinstanceport: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpnA(pszspn.rawAddress.toString(), pcserviceclass.rawAddress.toString(), serviceclass.rawAddress.toString(), pcservicename.rawAddress.toString(), servicename.rawAddress.toString(), pcinstancename.rawAddress.toString(), instancename.rawAddress.toString(), pinstanceport.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsCrackSpnW(pszspn: Pcwstr, pcserviceclass: MutPtr, serviceclass: Pwstr, pcservicename: MutPtr, servicename: Pwstr, pcinstancename: MutPtr, instancename: Pwstr, pinstanceport: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsCrackSpnW(pszspn.rawAddress.toString(), pcserviceclass.rawAddress.toString(), serviceclass.rawAddress.toString(), pcservicename.rawAddress.toString(), servicename.rawAddress.toString(), pcinstancename.rawAddress.toString(), instancename.rawAddress.toString(), pinstanceport.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsCrackUnquotedMangledRdnA(pszrdn: Pcstr, cchrdn: UInt, pguid: MutPtr, pedsmanglefor: MutPtr): Bool =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsCrackUnquotedMangledRdnA(pszrdn.rawAddress.toString(), cchrdn.toInt(), pguid.rawAddress.toString(), pedsmanglefor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsCrackUnquotedMangledRdnW(pszrdn: Pcwstr, cchrdn: UInt, pguid: MutPtr, pedsmanglefor: MutPtr): Bool =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsCrackUnquotedMangledRdnW(pszrdn.rawAddress.toString(), cchrdn.toInt(), pguid.rawAddress.toString(), pedsmanglefor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsDeregisterDnsHostRecordsA(servername: Pcstr, dnsdomainname: Pcstr, domainguid: ConstPtr, dsaguid: ConstPtr, dnshostname: Pcstr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsDeregisterDnsHostRecordsA(servername.rawAddress.toString(), dnsdomainname.rawAddress.toString(), domainguid.rawAddress.toString(), dsaguid.rawAddress.toString(), dnshostname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsDeregisterDnsHostRecordsW(servername: Pcwstr, dnsdomainname: Pcwstr, domainguid: ConstPtr, dsaguid: ConstPtr, dnshostname: Pcwstr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsDeregisterDnsHostRecordsW(servername.rawAddress.toString(), dnsdomainname.rawAddress.toString(), domainguid.rawAddress.toString(), dsaguid.rawAddress.toString(), dnshostname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsEnumerateDomainTrustsA(servername: Pcstr, flags: UInt, domains: MutPtr, domaincount: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsEnumerateDomainTrustsA(servername.rawAddress.toString(), flags.toInt(), domains.rawAddress.toString(), domaincount.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsEnumerateDomainTrustsW(servername: Pcwstr, flags: UInt, domains: MutPtr, domaincount: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsEnumerateDomainTrustsW(servername.rawAddress.toString(), flags.toInt(), domains.rawAddress.toString(), domaincount.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsFreeDomainControllerInfoA(infolevel: UInt, cinfo: UInt, pinfo: ConstPtr) {
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) {
        windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsFreeDomainControllerInfoA(infolevel.toInt(), cinfo.toInt(), pinfo.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dsFreeDomainControllerInfoW(infolevel: UInt, cinfo: UInt, pinfo: ConstPtr) {
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) {
        windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsFreeDomainControllerInfoW(infolevel.toInt(), cinfo.toInt(), pinfo.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dsFreeNameResultA(presult: ConstPtr) {
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) {
        windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsFreeNameResultA(presult.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dsFreeNameResultW(presult: ConstPtr) {
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) {
        windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsFreeNameResultW(presult.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dsFreePasswordCredentials(authidentity: ConstPtr) {
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) {
        windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsFreePasswordCredentials(authidentity.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dsFreeSchemaGuidMapA(pguidmap: ConstPtr) {
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) {
        windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsFreeSchemaGuidMapA(pguidmap.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dsFreeSchemaGuidMapW(pguidmap: ConstPtr) {
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) {
        windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsFreeSchemaGuidMapW(pguidmap.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dsFreeSpnArrayA(cspn: UInt, rpszspn: MutPtr) {
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) {
        windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsFreeSpnArrayA(cspn.toInt(), rpszspn.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dsFreeSpnArrayW(cspn: UInt, rpszspn: MutPtr) {
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) {
        windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsFreeSpnArrayW(cspn.toInt(), rpszspn.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dsGetDcCloseW(getdccontexthandle: Handle) {
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) {
        windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsGetDcCloseW(getdccontexthandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dsGetDcNameA(computername: Pcstr, domainname: Pcstr, domainguid: ConstPtr, sitename: Pcstr, flags: UInt, domaincontrollerinfo: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsGetDcNameA(computername.rawAddress.toString(), domainname.rawAddress.toString(), domainguid.rawAddress.toString(), sitename.rawAddress.toString(), flags.toInt(), domaincontrollerinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetDcNameW(computername: Pcwstr, domainname: Pcwstr, domainguid: ConstPtr, sitename: Pcwstr, flags: UInt, domaincontrollerinfo: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsGetDcNameW(computername.rawAddress.toString(), domainname.rawAddress.toString(), domainguid.rawAddress.toString(), sitename.rawAddress.toString(), flags.toInt(), domaincontrollerinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetDcNextA(getdccontexthandle: Handle, sockaddresscount: MutPtr, sockaddresses: MutPtr, dnshostname: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsGetDcNextA(getdccontexthandle.rawAddress.toString(), sockaddresscount.rawAddress.toString(), sockaddresses.rawAddress.toString(), dnshostname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetDcNextW(getdccontexthandle: Handle, sockaddresscount: MutPtr, sockaddresses: MutPtr, dnshostname: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsGetDcNextW(getdccontexthandle.rawAddress.toString(), sockaddresscount.rawAddress.toString(), sockaddresses.rawAddress.toString(), dnshostname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetDcOpenA(dnsname: Pcstr, optionflags: UInt, sitename: Pcstr, domainguid: ConstPtr, dnsforestname: Pcstr, dcflags: UInt, retgetdccontext: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsGetDcOpenA(dnsname.rawAddress.toString(), optionflags.toInt(), sitename.rawAddress.toString(), domainguid.rawAddress.toString(), dnsforestname.rawAddress.toString(), dcflags.toInt(), retgetdccontext.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetDcOpenW(dnsname: Pcwstr, optionflags: UInt, sitename: Pcwstr, domainguid: ConstPtr, dnsforestname: Pcwstr, dcflags: UInt, retgetdccontext: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsGetDcOpenW(dnsname.rawAddress.toString(), optionflags.toInt(), sitename.rawAddress.toString(), domainguid.rawAddress.toString(), dnsforestname.rawAddress.toString(), dcflags.toInt(), retgetdccontext.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetDcSiteCoverageA(servername: Pcstr, entrycount: MutPtr, sitenames: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsGetDcSiteCoverageA(servername.rawAddress.toString(), entrycount.rawAddress.toString(), sitenames.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetDcSiteCoverageW(servername: Pcwstr, entrycount: MutPtr, sitenames: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsGetDcSiteCoverageW(servername.rawAddress.toString(), entrycount.rawAddress.toString(), sitenames.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetDomainControllerInfoA(hds: Handle, domainname: Pcstr, infolevel: UInt, pcout: MutPtr, ppinfo: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsGetDomainControllerInfoA(hds.rawAddress.toString(), domainname.rawAddress.toString(), infolevel.toInt(), pcout.rawAddress.toString(), ppinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetDomainControllerInfoW(hds: Handle, domainname: Pcwstr, infolevel: UInt, pcout: MutPtr, ppinfo: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsGetDomainControllerInfoW(hds.rawAddress.toString(), domainname.rawAddress.toString(), infolevel.toInt(), pcout.rawAddress.toString(), ppinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetForestTrustInformationW(servername: Pcwstr, trusteddomainname: Pcwstr, flags: UInt, foresttrustinfo: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsGetForestTrustInformationW(servername.rawAddress.toString(), trusteddomainname.rawAddress.toString(), flags.toInt(), foresttrustinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetFriendlyClassName(pszobjectclass: Pcwstr, pszbuffer: Pwstr, cchbuffer: UInt): Hresult =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsGetFriendlyClassName(pszobjectclass.rawAddress.toString(), pszbuffer.rawAddress.toString(), cchbuffer.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetIcon(dwflags: UInt, pszobjectclass: Pcwstr, cximage: Int, cyimage: Int): Hicon =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) MutPtr((windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsGetIcon(dwflags.toInt(), pszobjectclass.rawAddress.toString(), cximage, cyimage) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetRdnW(ppdn: MutPtr, pcdn: MutPtr, ppkey: MutPtr, pckey: MutPtr, ppval: MutPtr, pcval: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsGetRdnW(ppdn.rawAddress.toString(), pcdn.rawAddress.toString(), ppkey.rawAddress.toString(), pckey.rawAddress.toString(), ppval.rawAddress.toString(), pcval.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetSiteNameA(computername: Pcstr, sitename: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsGetSiteNameA(computername.rawAddress.toString(), sitename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetSiteNameW(computername: Pcwstr, sitename: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsGetSiteNameW(computername.rawAddress.toString(), sitename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetSpnA(servicetype: DsSpnNameType, serviceclass: Pcstr, servicename: Pcstr, instanceport: UShort, cinstancenames: UShort, pinstancenames: ConstPtr, pinstanceports: ConstPtr, pcspn: MutPtr, prpszspn: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsGetSpnA(servicetype, serviceclass.rawAddress.toString(), servicename.rawAddress.toString(), instanceport.toInt(), cinstancenames.toInt(), pinstancenames.rawAddress.toString(), pinstanceports.rawAddress.toString(), pcspn.rawAddress.toString(), prpszspn.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsGetSpnW(servicetype: DsSpnNameType, serviceclass: Pcwstr, servicename: Pcwstr, instanceport: UShort, cinstancenames: UShort, pinstancenames: ConstPtr, pinstanceports: ConstPtr, pcspn: MutPtr, prpszspn: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsGetSpnW(servicetype, serviceclass.rawAddress.toString(), servicename.rawAddress.toString(), instanceport.toInt(), cinstancenames.toInt(), pinstancenames.rawAddress.toString(), pinstanceports.rawAddress.toString(), pcspn.rawAddress.toString(), prpszspn.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsInheritSecurityIdentityA(hds: Handle, flags: UInt, srcprincipal: Pcstr, dstprincipal: Pcstr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsInheritSecurityIdentityA(hds.rawAddress.toString(), flags.toInt(), srcprincipal.rawAddress.toString(), dstprincipal.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsInheritSecurityIdentityW(hds: Handle, flags: UInt, srcprincipal: Pcwstr, dstprincipal: Pcwstr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsInheritSecurityIdentityW(hds.rawAddress.toString(), flags.toInt(), srcprincipal.rawAddress.toString(), dstprincipal.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsIsMangledDnA(pszdn: Pcstr, edsmanglefor: DsMangleFor): Bool =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsIsMangledDnA(pszdn.rawAddress.toString(), edsmanglefor) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsIsMangledDnW(pszdn: Pcwstr, edsmanglefor: DsMangleFor): Bool =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsIsMangledDnW(pszdn.rawAddress.toString(), edsmanglefor) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsIsMangledRdnValueA(pszrdn: Pcstr, crdn: UInt, edsmanglefordesired: DsMangleFor): Bool =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsIsMangledRdnValueA(pszrdn.rawAddress.toString(), crdn.toInt(), edsmanglefordesired) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsIsMangledRdnValueW(pszrdn: Pcwstr, crdn: UInt, edsmanglefordesired: DsMangleFor): Bool =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsIsMangledRdnValueW(pszrdn.rawAddress.toString(), crdn.toInt(), edsmanglefordesired) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsListDomainsInSiteA(hds: Handle, site: Pcstr, ppdomains: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsListDomainsInSiteA(hds.rawAddress.toString(), site.rawAddress.toString(), ppdomains.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsListDomainsInSiteW(hds: Handle, site: Pcwstr, ppdomains: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsListDomainsInSiteW(hds.rawAddress.toString(), site.rawAddress.toString(), ppdomains.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsListInfoForServerA(hds: Handle, server: Pcstr, ppinfo: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsListInfoForServerA(hds.rawAddress.toString(), server.rawAddress.toString(), ppinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsListInfoForServerW(hds: Handle, server: Pcwstr, ppinfo: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsListInfoForServerW(hds.rawAddress.toString(), server.rawAddress.toString(), ppinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsListRolesA(hds: Handle, pproles: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsListRolesA(hds.rawAddress.toString(), pproles.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsListRolesW(hds: Handle, pproles: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsListRolesW(hds.rawAddress.toString(), pproles.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsListServersForDomainInSiteA(hds: Handle, domain: Pcstr, site: Pcstr, ppservers: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsListServersForDomainInSiteA(hds.rawAddress.toString(), domain.rawAddress.toString(), site.rawAddress.toString(), ppservers.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsListServersForDomainInSiteW(hds: Handle, domain: Pcwstr, site: Pcwstr, ppservers: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsListServersForDomainInSiteW(hds.rawAddress.toString(), domain.rawAddress.toString(), site.rawAddress.toString(), ppservers.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsListServersInSiteA(hds: Handle, site: Pcstr, ppservers: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsListServersInSiteA(hds.rawAddress.toString(), site.rawAddress.toString(), ppservers.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsListServersInSiteW(hds: Handle, site: Pcwstr, ppservers: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsListServersInSiteW(hds.rawAddress.toString(), site.rawAddress.toString(), ppservers.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsListSitesA(hds: Handle, ppsites: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsListSitesA(hds.rawAddress.toString(), ppsites.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsListSitesW(hds: Handle, ppsites: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsListSitesW(hds.rawAddress.toString(), ppsites.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsMakePasswordCredentialsA(user: Pcstr, domain: Pcstr, password: Pcstr, pauthidentity: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsMakePasswordCredentialsA(user.rawAddress.toString(), domain.rawAddress.toString(), password.rawAddress.toString(), pauthidentity.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsMakePasswordCredentialsW(user: Pcwstr, domain: Pcwstr, password: Pcwstr, pauthidentity: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsMakePasswordCredentialsW(user.rawAddress.toString(), domain.rawAddress.toString(), password.rawAddress.toString(), pauthidentity.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsMakeSpnA(serviceclass: Pcstr, servicename: Pcstr, instancename: Pcstr, instanceport: UShort, referrer: Pcstr, pcspnlength: MutPtr, pszspn: Pstr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsMakeSpnA(serviceclass.rawAddress.toString(), servicename.rawAddress.toString(), instancename.rawAddress.toString(), instanceport.toInt(), referrer.rawAddress.toString(), pcspnlength.rawAddress.toString(), pszspn.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsMakeSpnW(serviceclass: Pcwstr, servicename: Pcwstr, instancename: Pcwstr, instanceport: UShort, referrer: Pcwstr, pcspnlength: MutPtr, pszspn: Pwstr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsMakeSpnW(serviceclass.rawAddress.toString(), servicename.rawAddress.toString(), instancename.rawAddress.toString(), instanceport.toInt(), referrer.rawAddress.toString(), pcspnlength.rawAddress.toString(), pszspn.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsMapSchemaGuidsA(hds: Handle, cguids: UInt, rguids: ConstPtr, ppguidmap: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsMapSchemaGuidsA(hds.rawAddress.toString(), cguids.toInt(), rguids.rawAddress.toString(), ppguidmap.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsMapSchemaGuidsW(hds: Handle, cguids: UInt, rguids: ConstPtr, ppguidmap: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsMapSchemaGuidsW(hds.rawAddress.toString(), cguids.toInt(), rguids.rawAddress.toString(), ppguidmap.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsMergeForestTrustInformationW(domainname: Pcwstr, newforesttrustinfo: ConstPtr, oldforesttrustinfo: ConstPtr, mergedforesttrustinfo: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsMergeForestTrustInformationW(domainname.rawAddress.toString(), newforesttrustinfo.rawAddress.toString(), oldforesttrustinfo.rawAddress.toString(), mergedforesttrustinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsQuerySitesByCostA(hds: Handle, pszfromsite: Pcstr, rgsztosites: ConstPtr, ctosites: UInt, dwflags: UInt, prgsiteinfo: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsQuerySitesByCostA(hds.rawAddress.toString(), pszfromsite.rawAddress.toString(), rgsztosites.rawAddress.toString(), ctosites.toInt(), dwflags.toInt(), prgsiteinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsQuerySitesByCostW(hds: Handle, pwszfromsite: Pcwstr, rgwsztosites: ConstPtr, ctosites: UInt, dwflags: UInt, prgsiteinfo: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsQuerySitesByCostW(hds.rawAddress.toString(), pwszfromsite.rawAddress.toString(), rgwsztosites.rawAddress.toString(), ctosites.toInt(), dwflags.toInt(), prgsiteinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsQuerySitesFree(rgsiteinfo: ConstPtr) {
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) {
        windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsQuerySitesFree(rgsiteinfo.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dsQuoteRdnValueA(cunquotedrdnvaluelength: UInt, psunquotedrdnvalue: Pcstr, pcquotedrdnvaluelength: MutPtr, psquotedrdnvalue: Pstr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsQuoteRdnValueA(cunquotedrdnvaluelength.toInt(), psunquotedrdnvalue.rawAddress.toString(), pcquotedrdnvaluelength.rawAddress.toString(), psquotedrdnvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsQuoteRdnValueW(cunquotedrdnvaluelength: UInt, psunquotedrdnvalue: Pcwstr, pcquotedrdnvaluelength: MutPtr, psquotedrdnvalue: Pwstr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsQuoteRdnValueW(cunquotedrdnvaluelength.toInt(), psunquotedrdnvalue.rawAddress.toString(), pcquotedrdnvaluelength.rawAddress.toString(), psquotedrdnvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsRemoveDsDomainA(hds: Handle, domaindn: Pcstr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsRemoveDsDomainA(hds.rawAddress.toString(), domaindn.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsRemoveDsDomainW(hds: Handle, domaindn: Pcwstr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsRemoveDsDomainW(hds.rawAddress.toString(), domaindn.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsRemoveDsServerA(hds: Handle, serverdn: Pcstr, domaindn: Pcstr, flastdcindomain: MutPtr, fcommit: Bool): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsRemoveDsServerA(hds.rawAddress.toString(), serverdn.rawAddress.toString(), domaindn.rawAddress.toString(), flastdcindomain.rawAddress.toString(), fcommit) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsRemoveDsServerW(hds: Handle, serverdn: Pcwstr, domaindn: Pcwstr, flastdcindomain: MutPtr, fcommit: Bool): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsRemoveDsServerW(hds.rawAddress.toString(), serverdn.rawAddress.toString(), domaindn.rawAddress.toString(), flastdcindomain.rawAddress.toString(), fcommit) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaAddA(hds: Handle, namecontext: Pcstr, sourcedsadn: Pcstr, transportdn: Pcstr, sourcedsaaddress: Pcstr, pschedule: ConstPtr, options: UInt): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaAddA(hds.rawAddress.toString(), namecontext.rawAddress.toString(), sourcedsadn.rawAddress.toString(), transportdn.rawAddress.toString(), sourcedsaaddress.rawAddress.toString(), pschedule.rawAddress.toString(), options.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaAddW(hds: Handle, namecontext: Pcwstr, sourcedsadn: Pcwstr, transportdn: Pcwstr, sourcedsaaddress: Pcwstr, pschedule: ConstPtr, options: UInt): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaAddW(hds.rawAddress.toString(), namecontext.rawAddress.toString(), sourcedsadn.rawAddress.toString(), transportdn.rawAddress.toString(), sourcedsaaddress.rawAddress.toString(), pschedule.rawAddress.toString(), options.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaConsistencyCheck(hds: Handle, taskid: DsKccTaskid, dwflags: UInt): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaConsistencyCheck(hds.rawAddress.toString(), taskid, dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaDelA(hds: Handle, namecontext: Pcstr, dsasrc: Pcstr, options: UInt): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaDelA(hds.rawAddress.toString(), namecontext.rawAddress.toString(), dsasrc.rawAddress.toString(), options.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaDelW(hds: Handle, namecontext: Pcwstr, dsasrc: Pcwstr, options: UInt): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaDelW(hds.rawAddress.toString(), namecontext.rawAddress.toString(), dsasrc.rawAddress.toString(), options.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaFreeInfo(infotype: DsReplInfoType, pinfo: ConstPtr) {
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) {
        windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaFreeInfo(infotype, pinfo.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dsReplicaGetInfo2W(hds: Handle, infotype: DsReplInfoType, pszobject: Pcwstr, puuidforsourcedsaobjguid: ConstPtr, pszattributename: Pcwstr, pszvalue: Pcwstr, dwflags: UInt, dwenumerationcontext: UInt, ppinfo: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaGetInfo2W(hds.rawAddress.toString(), infotype, pszobject.rawAddress.toString(), puuidforsourcedsaobjguid.rawAddress.toString(), pszattributename.rawAddress.toString(), pszvalue.rawAddress.toString(), dwflags.toInt(), dwenumerationcontext.toInt(), ppinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaGetInfoW(hds: Handle, infotype: DsReplInfoType, pszobject: Pcwstr, puuidforsourcedsaobjguid: ConstPtr, ppinfo: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaGetInfoW(hds.rawAddress.toString(), infotype, pszobject.rawAddress.toString(), puuidforsourcedsaobjguid.rawAddress.toString(), ppinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaModifyA(hds: Handle, namecontext: Pcstr, puuidsourcedsa: ConstPtr, transportdn: Pcstr, sourcedsaaddress: Pcstr, pschedule: ConstPtr, replicaflags: UInt, modifyfields: UInt, options: UInt): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaModifyA(hds.rawAddress.toString(), namecontext.rawAddress.toString(), puuidsourcedsa.rawAddress.toString(), transportdn.rawAddress.toString(), sourcedsaaddress.rawAddress.toString(), pschedule.rawAddress.toString(), replicaflags.toInt(), modifyfields.toInt(), options.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaModifyW(hds: Handle, namecontext: Pcwstr, puuidsourcedsa: ConstPtr, transportdn: Pcwstr, sourcedsaaddress: Pcwstr, pschedule: ConstPtr, replicaflags: UInt, modifyfields: UInt, options: UInt): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaModifyW(hds.rawAddress.toString(), namecontext.rawAddress.toString(), puuidsourcedsa.rawAddress.toString(), transportdn.rawAddress.toString(), sourcedsaaddress.rawAddress.toString(), pschedule.rawAddress.toString(), replicaflags.toInt(), modifyfields.toInt(), options.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaSyncA(hds: Handle, namecontext: Pcstr, puuiddsasrc: ConstPtr, options: UInt): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaSyncA(hds.rawAddress.toString(), namecontext.rawAddress.toString(), puuiddsasrc.rawAddress.toString(), options.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaSyncAllA(hds: Handle, psznamecontext: Pcstr, ulflags: UInt, pfncallback: Long, pcallbackdata: ConstPtr, perrors: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaSyncAllA(hds.rawAddress.toString(), psznamecontext.rawAddress.toString(), ulflags.toInt(), pfncallback.toString(), pcallbackdata.rawAddress.toString(), perrors.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaSyncAllW(hds: Handle, psznamecontext: Pcwstr, ulflags: UInt, pfncallback: Long, pcallbackdata: ConstPtr, perrors: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaSyncAllW(hds.rawAddress.toString(), psznamecontext.rawAddress.toString(), ulflags.toInt(), pfncallback.toString(), pcallbackdata.rawAddress.toString(), perrors.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaSyncW(hds: Handle, namecontext: Pcwstr, puuiddsasrc: ConstPtr, options: UInt): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaSyncW(hds.rawAddress.toString(), namecontext.rawAddress.toString(), puuiddsasrc.rawAddress.toString(), options.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaUpdateRefsA(hds: Handle, namecontext: Pcstr, dsadest: Pcstr, puuiddsadest: ConstPtr, options: UInt): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaUpdateRefsA(hds.rawAddress.toString(), namecontext.rawAddress.toString(), dsadest.rawAddress.toString(), puuiddsadest.rawAddress.toString(), options.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaUpdateRefsW(hds: Handle, namecontext: Pcwstr, dsadest: Pcwstr, puuiddsadest: ConstPtr, options: UInt): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaUpdateRefsW(hds.rawAddress.toString(), namecontext.rawAddress.toString(), dsadest.rawAddress.toString(), puuiddsadest.rawAddress.toString(), options.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaVerifyObjectsA(hds: Handle, namecontext: Pcstr, puuiddsasrc: ConstPtr, uloptions: UInt): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaVerifyObjectsA(hds.rawAddress.toString(), namecontext.rawAddress.toString(), puuiddsasrc.rawAddress.toString(), uloptions.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsReplicaVerifyObjectsW(hds: Handle, namecontext: Pcwstr, puuiddsasrc: ConstPtr, uloptions: UInt): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsReplicaVerifyObjectsW(hds.rawAddress.toString(), namecontext.rawAddress.toString(), puuiddsasrc.rawAddress.toString(), uloptions.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsRoleFreeMemory(buffer: MutPtr) {
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) {
        windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsRoleFreeMemory(buffer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dsRoleGetPrimaryDomainInformation(lpserver: Pcwstr, infolevel: DsrolePrimaryDomainInfoLevel, buffer: MutPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsRoleGetPrimaryDomainInformation(lpserver.rawAddress.toString(), infolevel, buffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsServerRegisterSpnA(operation: DsSpnWriteOp, serviceclass: Pcstr, userobjectdn: Pcstr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsServerRegisterSpnA(operation, serviceclass.rawAddress.toString(), userobjectdn.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsServerRegisterSpnW(operation: DsSpnWriteOp, serviceclass: Pcwstr, userobjectdn: Pcwstr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsServerRegisterSpnW(operation, serviceclass.rawAddress.toString(), userobjectdn.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsUnBindA(phds: ConstPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsUnBindA(phds.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsUnBindW(phds: ConstPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsUnBindW(phds.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsUnquoteRdnValueA(cquotedrdnvaluelength: UInt, psquotedrdnvalue: Pcstr, pcunquotedrdnvaluelength: MutPtr, psunquotedrdnvalue: Pstr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsUnquoteRdnValueA(cquotedrdnvaluelength.toInt(), psquotedrdnvalue.rawAddress.toString(), pcunquotedrdnvaluelength.rawAddress.toString(), psunquotedrdnvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsUnquoteRdnValueW(cquotedrdnvaluelength: UInt, psquotedrdnvalue: Pcwstr, pcunquotedrdnvaluelength: MutPtr, psunquotedrdnvalue: Pwstr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsUnquoteRdnValueW(cquotedrdnvaluelength.toInt(), psquotedrdnvalue.rawAddress.toString(), pcunquotedrdnvaluelength.rawAddress.toString(), psunquotedrdnvalue.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsValidateSubnetNameA(subnetname: Pcstr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsValidateSubnetNameA(subnetname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsValidateSubnetNameW(subnetname: Pcwstr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsValidateSubnetNameW(subnetname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsWriteAccountSpnA(hds: Handle, operation: DsSpnWriteOp, pszaccount: Pcstr, cspn: UInt, rpszspn: ConstPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsWriteAccountSpnA(hds.rawAddress.toString(), operation, pszaccount.rawAddress.toString(), cspn.toInt(), rpszspn.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dsWriteAccountSpnW(hds: Handle, operation: DsSpnWriteOp, pszaccount: Pcwstr, cspn: UInt, rpszspn: ConstPtr): UInt =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryDsWriteAccountSpnW(hds.rawAddress.toString(), operation, pszaccount.rawAddress.toString(), cspn.toInt(), rpszspn.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeADsMem(pmem: MutPtr): Bool =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryFreeADsMem(pmem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeADsStr(pstr: Pcwstr): Bool =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryFreeADsStr(pstr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToAdsType(pvariant: MutPtr, dwnumvariant: UInt, ppadsvalues: MutPtr, pdwnumvalues: MutPtr): Hresult =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryPropVariantToAdsType(pvariant.rawAddress.toString(), dwnumvariant.toInt(), ppadsvalues.rawAddress.toString(), pdwnumvalues.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reallocADsMem(poldmem: MutPtr, cbold: UInt, cbnew: UInt): MutPtr =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) MutPtr((windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryReallocADsMem(poldmem.rawAddress.toString(), cbold.toInt(), cbnew.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reallocADsStr(ppstr: MutPtr, pstr: Pcwstr): Bool =
    if (windowsWin32NetworkingActivedirectoryNapiAddon != null) (windowsWin32NetworkingActivedirectoryNapiAddon.windowssysWindowsWin32NetworkingActivedirectoryReallocADsStr(ppstr.rawAddress.toString(), pstr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun securityDescriptorToBinarySD(vvarsecdes: Variant, ppsecuritydescriptor: MutPtr, pdwsdlength: MutPtr, pszservername: Pcwstr, username: Pcwstr, password: Pcwstr, dwflags: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")
