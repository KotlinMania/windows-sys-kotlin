@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wnet

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error

private val windowsWin32NetworkmanagementWnetNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun multinetGetConnectionPerformanceA(lpnetresource: ConstPtr<Netresourcea>, lpnetconnectinfostruct: MutPtr<Netconnectinfostruct>): UInt =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetMultinetGetConnectionPerformanceA(lpnetresource.rawAddress.toString(), lpnetconnectinfostruct.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun multinetGetConnectionPerformanceW(lpnetresource: ConstPtr<Netresourcew>, lpnetconnectinfostruct: MutPtr<Netconnectinfostruct>): UInt =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetMultinetGetConnectionPerformanceW(lpnetresource.rawAddress.toString(), lpnetconnectinfostruct.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPAddConnection(lpnetresource: ConstPtr<Netresourcew>, lppassword: Pcwstr, lpusername: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetNPAddConnection(lpnetresource.rawAddress.toString(), lppassword.rawAddress.toString(), lpusername.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPAddConnection3(hwndowner: Hwnd, lpnetresource: ConstPtr<Netresourcew>, lppassword: Pcwstr, lpusername: Pcwstr, dwflags: NetConnectFlags): UInt =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetNPAddConnection3(hwndowner.rawAddress.toString(), lpnetresource.rawAddress.toString(), lppassword.rawAddress.toString(), lpusername.rawAddress.toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPAddConnection4(hwndowner: Hwnd, lpnetresource: ConstPtr<Netresourcew>, lpauthbuffer: ConstPtr<CVoid>, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: ConstPtr<UByte>, cbuseoptions: UInt): UInt =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetNPAddConnection4(hwndowner.rawAddress.toString(), lpnetresource.rawAddress.toString(), lpauthbuffer.rawAddress.toString(), cbauthbuffer.toInt(), dwflags.toInt(), lpuseoptions.rawAddress.toString(), cbuseoptions.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPCancelConnection(lpname: Pcwstr, fforce: Bool): UInt =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetNPCancelConnection(lpname.rawAddress.toString(), fforce) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPCancelConnection2(lpname: Pcwstr, fforce: Bool, dwflags: UInt): UInt =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetNPCancelConnection2(lpname.rawAddress.toString(), fforce, dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPCloseEnum(henum: Handle): UInt =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetNPCloseEnum(henum.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPEnumResource(henum: Handle, lpccount: MutPtr<UInt>, lpbuffer: MutPtr<CVoid>, lpbuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetNPEnumResource(henum.rawAddress.toString(), lpccount.rawAddress.toString(), lpbuffer.rawAddress.toString(), lpbuffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPFormatNetworkName(lpremotename: Pcwstr, lpformattedname: Pwstr, lpnlength: MutPtr<UInt>, dwflags: NetworkNameFormatFlags, dwavecharperline: UInt): UInt =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetNPFormatNetworkName(lpremotename.rawAddress.toString(), lpformattedname.rawAddress.toString(), lpnlength.rawAddress.toString(), dwflags.toInt(), dwavecharperline.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPGetCaps(ndex: UInt): UInt =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetNPGetCaps(ndex.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPGetConnection(lplocalname: Pcwstr, lpremotename: Pwstr, lpnbufferlen: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetNPGetConnection(lplocalname.rawAddress.toString(), lpremotename.rawAddress.toString(), lpnbufferlen.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPGetConnection3(lplocalname: Pcwstr, dwlevel: UInt, lpbuffer: MutPtr<CVoid>, lpbuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetNPGetConnection3(lplocalname.rawAddress.toString(), dwlevel.toInt(), lpbuffer.rawAddress.toString(), lpbuffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPGetConnectionPerformance(lpremotename: Pcwstr, lpnetconnectinfo: MutPtr<Netconnectinfostruct>): UInt =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetNPGetConnectionPerformance(lpremotename.rawAddress.toString(), lpnetconnectinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPGetPersistentUseOptionsForConnection(lpremotepath: Pcwstr, lpreaduseoptions: ConstPtr<UByte>, cbreaduseoptions: UInt, lpwriteuseoptions: MutPtr<UByte>, lpsizewriteuseoptions: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetNPGetPersistentUseOptionsForConnection(lpremotepath.rawAddress.toString(), lpreaduseoptions.rawAddress.toString(), cbreaduseoptions.toInt(), lpwriteuseoptions.rawAddress.toString(), lpsizewriteuseoptions.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPGetResourceInformation(lpnetresource: ConstPtr<Netresourcew>, lpbuffer: MutPtr<CVoid>, lpbuffersize: MutPtr<UInt>, lplpsystem: MutPtr<Pwstr>): UInt =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetNPGetResourceInformation(lpnetresource.rawAddress.toString(), lpbuffer.rawAddress.toString(), lpbuffersize.rawAddress.toString(), lplpsystem.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPGetResourceParent(lpnetresource: ConstPtr<Netresourcew>, lpbuffer: MutPtr<CVoid>, lpbuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetNPGetResourceParent(lpnetresource.rawAddress.toString(), lpbuffer.rawAddress.toString(), lpbuffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPGetUniversalName(lplocalpath: Pcwstr, dwinfolevel: UncInfoLevel, lpbuffer: MutPtr<CVoid>, lpbuffersize: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetNPGetUniversalName(lplocalpath.rawAddress.toString(), dwinfolevel.toInt(), lpbuffer.rawAddress.toString(), lpbuffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPGetUser(lpname: Pcwstr, lpusername: Pwstr, lpnbufferlen: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetNPGetUser(lpname.rawAddress.toString(), lpusername.rawAddress.toString(), lpnbufferlen.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nPOpenEnum(dwscope: UInt, dwtype: UInt, dwusage: UInt, lpnetresource: ConstPtr<Netresourcew>, lphenum: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetNPOpenEnum(dwscope.toInt(), dwtype.toInt(), dwusage.toInt(), lpnetresource.rawAddress.toString(), lphenum.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetAddConnection2A(lpnetresource: ConstPtr<Netresourcea>, lppassword: Pcstr, lpusername: Pcstr, dwflags: NetConnectFlags): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection2A(lpnetresource.rawAddress.toString(), lppassword.rawAddress.toString(), lpusername.rawAddress.toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetAddConnection2W(lpnetresource: ConstPtr<Netresourcew>, lppassword: Pcwstr, lpusername: Pcwstr, dwflags: NetConnectFlags): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection2W(lpnetresource.rawAddress.toString(), lppassword.rawAddress.toString(), lpusername.rawAddress.toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetAddConnection3A(hwndowner: Hwnd, lpnetresource: ConstPtr<Netresourcea>, lppassword: Pcstr, lpusername: Pcstr, dwflags: NetConnectFlags): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection3A(hwndowner.rawAddress.toString(), lpnetresource.rawAddress.toString(), lppassword.rawAddress.toString(), lpusername.rawAddress.toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetAddConnection3W(hwndowner: Hwnd, lpnetresource: ConstPtr<Netresourcew>, lppassword: Pcwstr, lpusername: Pcwstr, dwflags: NetConnectFlags): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection3W(hwndowner.rawAddress.toString(), lpnetresource.rawAddress.toString(), lppassword.rawAddress.toString(), lpusername.rawAddress.toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetAddConnection4A(hwndowner: Hwnd, lpnetresource: ConstPtr<Netresourcea>, pauthbuffer: ConstPtr<CVoid>, cbauthbuffer: UInt, dwflags: NetConnectFlags, lpuseoptions: ConstPtr<UByte>, cbuseoptions: UInt): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection4A(hwndowner.rawAddress.toString(), lpnetresource.rawAddress.toString(), pauthbuffer.rawAddress.toString(), cbauthbuffer.toInt(), dwflags.toInt(), lpuseoptions.rawAddress.toString(), cbuseoptions.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetAddConnection4W(hwndowner: Hwnd, lpnetresource: ConstPtr<Netresourcew>, pauthbuffer: ConstPtr<CVoid>, cbauthbuffer: UInt, dwflags: NetConnectFlags, lpuseoptions: ConstPtr<UByte>, cbuseoptions: UInt): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetWNetAddConnection4W(hwndowner.rawAddress.toString(), lpnetresource.rawAddress.toString(), pauthbuffer.rawAddress.toString(), cbauthbuffer.toInt(), dwflags.toInt(), lpuseoptions.rawAddress.toString(), cbuseoptions.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetAddConnectionA(lpremotename: Pcstr, lppassword: Pcstr, lplocalname: Pcstr): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetWNetAddConnectionA(lpremotename.rawAddress.toString(), lppassword.rawAddress.toString(), lplocalname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetAddConnectionW(lpremotename: Pcwstr, lppassword: Pcwstr, lplocalname: Pcwstr): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetWNetAddConnectionW(lpremotename.rawAddress.toString(), lppassword.rawAddress.toString(), lplocalname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetCancelConnection2A(lpname: Pcstr, dwflags: NetConnectFlags, fforce: Bool): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetWNetCancelConnection2A(lpname.rawAddress.toString(), dwflags.toInt(), fforce) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetCancelConnection2W(lpname: Pcwstr, dwflags: NetConnectFlags, fforce: Bool): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetWNetCancelConnection2W(lpname.rawAddress.toString(), dwflags.toInt(), fforce) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetCancelConnectionA(lpname: Pcstr, fforce: Bool): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetWNetCancelConnectionA(lpname.rawAddress.toString(), fforce) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetCancelConnectionW(lpname: Pcwstr, fforce: Bool): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetWNetCancelConnectionW(lpname.rawAddress.toString(), fforce) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetCloseEnum(henum: Handle): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetWNetCloseEnum(henum.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetConnectionDialog(hwnd: Hwnd, dwtype: UInt): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetWNetConnectionDialog(hwnd.rawAddress.toString(), dwtype.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetConnectionDialog1A(lpconndlgstruct: MutPtr<Connectdlgstructa>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetWNetConnectionDialog1A(lpconndlgstruct.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetConnectionDialog1W(lpconndlgstruct: MutPtr<Connectdlgstructw>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetWNetConnectionDialog1W(lpconndlgstruct.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetDisconnectDialog(hwnd: Hwnd, dwtype: UInt): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetWNetDisconnectDialog(hwnd.rawAddress.toString(), dwtype.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetDisconnectDialog1A(lpconndlgstruct: ConstPtr<Discdlgstructa>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetWNetDisconnectDialog1A(lpconndlgstruct.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetDisconnectDialog1W(lpconndlgstruct: ConstPtr<Discdlgstructw>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetWNetDisconnectDialog1W(lpconndlgstruct.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetEnumResourceA(henum: Handle, lpccount: MutPtr<UInt>, lpbuffer: MutPtr<CVoid>, lpbuffersize: MutPtr<UInt>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetWNetEnumResourceA(henum.rawAddress.toString(), lpccount.rawAddress.toString(), lpbuffer.rawAddress.toString(), lpbuffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetEnumResourceW(henum: Handle, lpccount: MutPtr<UInt>, lpbuffer: MutPtr<CVoid>, lpbuffersize: MutPtr<UInt>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetWNetEnumResourceW(henum.rawAddress.toString(), lpccount.rawAddress.toString(), lpbuffer.rawAddress.toString(), lpbuffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetConnectionA(lplocalname: Pcstr, lpremotename: Pstr, lpnlength: MutPtr<UInt>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetWNetGetConnectionA(lplocalname.rawAddress.toString(), lpremotename.rawAddress.toString(), lpnlength.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetConnectionW(lplocalname: Pcwstr, lpremotename: Pwstr, lpnlength: MutPtr<UInt>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetWNetGetConnectionW(lplocalname.rawAddress.toString(), lpremotename.rawAddress.toString(), lpnlength.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetLastErrorA(lperror: MutPtr<UInt>, lperrorbuf: Pstr, nerrorbufsize: UInt, lpnamebuf: Pstr, nnamebufsize: UInt): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetWNetGetLastErrorA(lperror.rawAddress.toString(), lperrorbuf.rawAddress.toString(), nerrorbufsize.toInt(), lpnamebuf.rawAddress.toString(), nnamebufsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetLastErrorW(lperror: MutPtr<UInt>, lperrorbuf: Pwstr, nerrorbufsize: UInt, lpnamebuf: Pwstr, nnamebufsize: UInt): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetWNetGetLastErrorW(lperror.rawAddress.toString(), lperrorbuf.rawAddress.toString(), nerrorbufsize.toInt(), lpnamebuf.rawAddress.toString(), nnamebufsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetNetworkInformationA(lpprovider: Pcstr, lpnetinfostruct: MutPtr<Netinfostruct>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetWNetGetNetworkInformationA(lpprovider.rawAddress.toString(), lpnetinfostruct.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetNetworkInformationW(lpprovider: Pcwstr, lpnetinfostruct: MutPtr<Netinfostruct>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetWNetGetNetworkInformationW(lpprovider.rawAddress.toString(), lpnetinfostruct.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetProviderNameA(dwnettype: UInt, lpprovidername: Pstr, lpbuffersize: MutPtr<UInt>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetWNetGetProviderNameA(dwnettype.toInt(), lpprovidername.rawAddress.toString(), lpbuffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetProviderNameW(dwnettype: UInt, lpprovidername: Pwstr, lpbuffersize: MutPtr<UInt>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetWNetGetProviderNameW(dwnettype.toInt(), lpprovidername.rawAddress.toString(), lpbuffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetResourceInformationA(lpnetresource: ConstPtr<Netresourcea>, lpbuffer: MutPtr<CVoid>, lpcbbuffer: MutPtr<UInt>, lplpsystem: MutPtr<Pstr>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetWNetGetResourceInformationA(lpnetresource.rawAddress.toString(), lpbuffer.rawAddress.toString(), lpcbbuffer.rawAddress.toString(), lplpsystem.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetResourceInformationW(lpnetresource: ConstPtr<Netresourcew>, lpbuffer: MutPtr<CVoid>, lpcbbuffer: MutPtr<UInt>, lplpsystem: MutPtr<Pwstr>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetWNetGetResourceInformationW(lpnetresource.rawAddress.toString(), lpbuffer.rawAddress.toString(), lpcbbuffer.rawAddress.toString(), lplpsystem.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetResourceParentA(lpnetresource: ConstPtr<Netresourcea>, lpbuffer: MutPtr<CVoid>, lpcbbuffer: MutPtr<UInt>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetWNetGetResourceParentA(lpnetresource.rawAddress.toString(), lpbuffer.rawAddress.toString(), lpcbbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetResourceParentW(lpnetresource: ConstPtr<Netresourcew>, lpbuffer: MutPtr<CVoid>, lpcbbuffer: MutPtr<UInt>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetWNetGetResourceParentW(lpnetresource.rawAddress.toString(), lpbuffer.rawAddress.toString(), lpcbbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetUniversalNameA(lplocalpath: Pcstr, dwinfolevel: UncInfoLevel, lpbuffer: MutPtr<CVoid>, lpbuffersize: MutPtr<UInt>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetWNetGetUniversalNameA(lplocalpath.rawAddress.toString(), dwinfolevel.toInt(), lpbuffer.rawAddress.toString(), lpbuffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetUniversalNameW(lplocalpath: Pcwstr, dwinfolevel: UncInfoLevel, lpbuffer: MutPtr<CVoid>, lpbuffersize: MutPtr<UInt>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetWNetGetUniversalNameW(lplocalpath.rawAddress.toString(), dwinfolevel.toInt(), lpbuffer.rawAddress.toString(), lpbuffersize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetUserA(lpname: Pcstr, lpusername: Pstr, lpnlength: MutPtr<UInt>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetWNetGetUserA(lpname.rawAddress.toString(), lpusername.rawAddress.toString(), lpnlength.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetGetUserW(lpname: Pcwstr, lpusername: Pwstr, lpnlength: MutPtr<UInt>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetWNetGetUserW(lpname.rawAddress.toString(), lpusername.rawAddress.toString(), lpnlength.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetOpenEnumA(dwscope: NetResourceScope, dwtype: NetResourceType, dwusage: WnetOpenEnumUsage, lpnetresource: ConstPtr<Netresourcea>, lphenum: MutPtr<Handle>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetWNetOpenEnumA(dwscope.toInt(), dwtype.toInt(), dwusage.toInt(), lpnetresource.rawAddress.toString(), lphenum.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetOpenEnumW(dwscope: NetResourceScope, dwtype: NetResourceType, dwusage: WnetOpenEnumUsage, lpnetresource: ConstPtr<Netresourcew>, lphenum: MutPtr<Handle>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetWNetOpenEnumW(dwscope.toInt(), dwtype.toInt(), dwusage.toInt(), lpnetresource.rawAddress.toString(), lphenum.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetSetLastErrorA(err: UInt, lperror: Pcstr, lpproviders: Pcstr) {
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) {
        windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetWNetSetLastErrorA(err.toInt(), lperror.rawAddress.toString(), lpproviders.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wNetSetLastErrorW(err: UInt, lperror: Pcwstr, lpproviders: Pcwstr) {
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) {
        windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetWNetSetLastErrorW(err.toInt(), lperror.rawAddress.toString(), lpproviders.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wNetUseConnection4A(hwndowner: Hwnd, lpnetresource: ConstPtr<Netresourcea>, pauthbuffer: ConstPtr<CVoid>, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: ConstPtr<UByte>, cbuseoptions: UInt, lpaccessname: Pstr, lpbuffersize: MutPtr<UInt>, lpresult: MutPtr<UInt>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetWNetUseConnection4A(hwndowner.rawAddress.toString(), lpnetresource.rawAddress.toString(), pauthbuffer.rawAddress.toString(), cbauthbuffer.toInt(), dwflags.toInt(), lpuseoptions.rawAddress.toString(), cbuseoptions.toInt(), lpaccessname.rawAddress.toString(), lpbuffersize.rawAddress.toString(), lpresult.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetUseConnection4W(hwndowner: Hwnd, lpnetresource: ConstPtr<Netresourcew>, pauthbuffer: ConstPtr<CVoid>, cbauthbuffer: UInt, dwflags: UInt, lpuseoptions: ConstPtr<UByte>, cbuseoptions: UInt, lpaccessname: Pwstr, lpbuffersize: MutPtr<UInt>, lpresult: MutPtr<UInt>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetWNetUseConnection4W(hwndowner.rawAddress.toString(), lpnetresource.rawAddress.toString(), pauthbuffer.rawAddress.toString(), cbauthbuffer.toInt(), dwflags.toInt(), lpuseoptions.rawAddress.toString(), cbuseoptions.toInt(), lpaccessname.rawAddress.toString(), lpbuffersize.rawAddress.toString(), lpresult.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetUseConnectionA(hwndowner: Hwnd, lpnetresource: ConstPtr<Netresourcea>, lppassword: Pcstr, lpuserid: Pcstr, dwflags: NetConnectFlags, lpaccessname: Pstr, lpbuffersize: MutPtr<UInt>, lpresult: MutPtr<UInt>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetWNetUseConnectionA(hwndowner.rawAddress.toString(), lpnetresource.rawAddress.toString(), lppassword.rawAddress.toString(), lpuserid.rawAddress.toString(), dwflags.toInt(), lpaccessname.rawAddress.toString(), lpbuffersize.rawAddress.toString(), lpresult.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wNetUseConnectionW(hwndowner: Hwnd, lpnetresource: ConstPtr<Netresourcew>, lppassword: Pcwstr, lpuserid: Pcwstr, dwflags: NetConnectFlags, lpaccessname: Pwstr, lpbuffersize: MutPtr<UInt>, lpresult: MutPtr<UInt>): Win32Error =
    if (windowsWin32NetworkmanagementWnetNapiAddon != null) (windowsWin32NetworkmanagementWnetNapiAddon.windowssysWindowsWin32NetworkmanagementWnetWNetUseConnectionW(hwndowner.rawAddress.toString(), lpnetresource.rawAddress.toString(), lppassword.rawAddress.toString(), lpuserid.rawAddress.toString(), dwflags.toInt(), lpaccessname.rawAddress.toString(), lpbuffersize.rawAddress.toString(), lpresult.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
