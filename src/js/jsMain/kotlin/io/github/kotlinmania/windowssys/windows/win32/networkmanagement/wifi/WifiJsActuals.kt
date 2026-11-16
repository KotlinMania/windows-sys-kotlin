@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.wifi

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.EapMethodType

private val windowsWin32NetworkmanagementWifiNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun wFDCancelOpenSession(hsessionhandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWFDCancelOpenSession(hsessionhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wFDCloseHandle(hclienthandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWFDCloseHandle(hclienthandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wFDCloseSession(hsessionhandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWFDCloseSession(hsessionhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wFDOpenHandle(dwclientversion: UInt, pdwnegotiatedversion: MutPtr, phclienthandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWFDOpenHandle(dwclientversion.toInt(), pdwnegotiatedversion.rawAddress.toString(), phclienthandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wFDOpenLegacySession(hclienthandle: Handle, plegacymacaddress: ConstPtr, phsessionhandle: MutPtr, pguidsessioninterface: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWFDOpenLegacySession(hclienthandle.rawAddress.toString(), plegacymacaddress.rawAddress.toString(), phsessionhandle.rawAddress.toString(), pguidsessioninterface.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wFDStartOpenSession(hclienthandle: Handle, pdeviceaddress: ConstPtr, pvcontext: ConstPtr, pfncallback: WfdOpenSessionCompleteCallback, phsessionhandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWFDStartOpenSession(hclienthandle.rawAddress.toString(), pdeviceaddress.rawAddress.toString(), pvcontext.rawAddress.toString(), 0L.toString(), phsessionhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wFDUpdateDeviceVisibility(pdeviceaddress: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWFDUpdateDeviceVisibility(pdeviceaddress.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanAllocateMemory(dwmemorysize: UInt): MutPtr =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) MutPtr((windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanAllocateMemory(dwmemorysize.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanCloseHandle(hclienthandle: Handle, preserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanCloseHandle(hclienthandle.rawAddress.toString(), preserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanConnect(hclienthandle: Handle, pinterfaceguid: ConstPtr, pconnectionparameters: ConstPtr, preserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanConnect(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), pconnectionparameters.rawAddress.toString(), preserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanConnect2(hclienthandle: Handle, pinterfaceguid: ConstPtr, pconnectionparameters: ConstPtr, preserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanConnect2(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), pconnectionparameters.rawAddress.toString(), preserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanDeleteProfile(hclienthandle: Handle, pinterfaceguid: ConstPtr, strprofilename: Pcwstr, preserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanDeleteProfile(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), strprofilename.rawAddress.toString(), preserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanDeviceServiceCommand(hclienthandle: Handle, pinterfaceguid: ConstPtr, pdeviceserviceguid: ConstPtr, dwopcode: UInt, dwinbuffersize: UInt, pinbuffer: ConstPtr, dwoutbuffersize: UInt, poutbuffer: MutPtr, pdwbytesreturned: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanDeviceServiceCommand(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), pdeviceserviceguid.rawAddress.toString(), dwopcode.toInt(), dwinbuffersize.toInt(), pinbuffer.rawAddress.toString(), dwoutbuffersize.toInt(), poutbuffer.rawAddress.toString(), pdwbytesreturned.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanDisconnect(hclienthandle: Handle, pinterfaceguid: ConstPtr, preserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanDisconnect(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), preserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanEnumInterfaces(hclienthandle: Handle, preserved: ConstPtr, ppinterfacelist: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanEnumInterfaces(hclienthandle.rawAddress.toString(), preserved.rawAddress.toString(), ppinterfacelist.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanExtractPsdIEDataList(hclienthandle: Handle, dwiedatasize: UInt, prawiedata: ConstPtr, strformat: Pcwstr, preserved: ConstPtr, pppsdiedatalist: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanExtractPsdIEDataList(hclienthandle.rawAddress.toString(), dwiedatasize.toInt(), prawiedata.rawAddress.toString(), strformat.rawAddress.toString(), preserved.rawAddress.toString(), pppsdiedatalist.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanFreeMemory(pmemory: ConstPtr) {
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) {
        windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanFreeMemory(pmemory.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wlanGetAvailableNetworkList(hclienthandle: Handle, pinterfaceguid: ConstPtr, dwflags: UInt, preserved: ConstPtr, ppavailablenetworklist: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanGetAvailableNetworkList(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), dwflags.toInt(), preserved.rawAddress.toString(), ppavailablenetworklist.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanGetAvailableNetworkList2(hclienthandle: Handle, pinterfaceguid: ConstPtr, dwflags: UInt, preserved: ConstPtr, ppavailablenetworklist: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanGetAvailableNetworkList2(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), dwflags.toInt(), preserved.rawAddress.toString(), ppavailablenetworklist.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanGetFilterList(hclienthandle: Handle, wlanfilterlisttype: WlanFilterListType, preserved: ConstPtr, ppnetworklist: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanGetFilterList(hclienthandle.rawAddress.toString(), wlanfilterlisttype, preserved.rawAddress.toString(), ppnetworklist.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanGetInterfaceCapability(hclienthandle: Handle, pinterfaceguid: ConstPtr, preserved: ConstPtr, ppcapability: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanGetInterfaceCapability(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), preserved.rawAddress.toString(), ppcapability.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanGetNetworkBssList(hclienthandle: Handle, pinterfaceguid: ConstPtr, pdot11ssid: ConstPtr, dot11bsstype: Dot11BssType, bsecurityenabled: Bool, preserved: ConstPtr, ppwlanbsslist: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanGetNetworkBssList(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), pdot11ssid.rawAddress.toString(), dot11bsstype, bsecurityenabled, preserved.rawAddress.toString(), ppwlanbsslist.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanGetProfile(hclienthandle: Handle, pinterfaceguid: ConstPtr, strprofilename: Pcwstr, preserved: ConstPtr, pstrprofilexml: MutPtr, pdwflags: MutPtr, pdwgrantedaccess: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanGetProfile(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), strprofilename.rawAddress.toString(), preserved.rawAddress.toString(), pstrprofilexml.rawAddress.toString(), pdwflags.rawAddress.toString(), pdwgrantedaccess.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanGetProfileCustomUserData(hclienthandle: Handle, pinterfaceguid: ConstPtr, strprofilename: Pcwstr, preserved: ConstPtr, pdwdatasize: MutPtr, ppdata: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanGetProfileCustomUserData(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), strprofilename.rawAddress.toString(), preserved.rawAddress.toString(), pdwdatasize.rawAddress.toString(), ppdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanGetProfileList(hclienthandle: Handle, pinterfaceguid: ConstPtr, preserved: ConstPtr, ppprofilelist: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanGetProfileList(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), preserved.rawAddress.toString(), ppprofilelist.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanGetSecuritySettings(hclienthandle: Handle, securableobject: WlanSecurableObject, pvaluetype: MutPtr, pstrcurrentsddl: MutPtr, pdwgrantedaccess: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanGetSecuritySettings(hclienthandle.rawAddress.toString(), securableobject, pvaluetype.rawAddress.toString(), pstrcurrentsddl.rawAddress.toString(), pdwgrantedaccess.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanGetSupportedDeviceServices(hclienthandle: Handle, pinterfaceguid: ConstPtr, ppdevsvcguidlist: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanGetSupportedDeviceServices(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), ppdevsvcguidlist.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanHostedNetworkForceStart(hclienthandle: Handle, pfailreason: MutPtr, pvreserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkForceStart(hclienthandle.rawAddress.toString(), pfailreason.rawAddress.toString(), pvreserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanHostedNetworkForceStop(hclienthandle: Handle, pfailreason: MutPtr, pvreserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkForceStop(hclienthandle.rawAddress.toString(), pfailreason.rawAddress.toString(), pvreserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanHostedNetworkInitSettings(hclienthandle: Handle, pfailreason: MutPtr, pvreserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkInitSettings(hclienthandle.rawAddress.toString(), pfailreason.rawAddress.toString(), pvreserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanHostedNetworkQueryProperty(hclienthandle: Handle, opcode: WlanHostedNetworkOpcode, pdwdatasize: MutPtr, ppvdata: MutPtr, pwlanopcodevaluetype: MutPtr, pvreserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkQueryProperty(hclienthandle.rawAddress.toString(), opcode, pdwdatasize.rawAddress.toString(), ppvdata.rawAddress.toString(), pwlanopcodevaluetype.rawAddress.toString(), pvreserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanHostedNetworkQuerySecondaryKey(hclienthandle: Handle, pdwkeylength: MutPtr, ppuckeydata: MutPtr, pbispassphrase: MutPtr, pbpersistent: MutPtr, pfailreason: MutPtr, pvreserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkQuerySecondaryKey(hclienthandle.rawAddress.toString(), pdwkeylength.rawAddress.toString(), ppuckeydata.rawAddress.toString(), pbispassphrase.rawAddress.toString(), pbpersistent.rawAddress.toString(), pfailreason.rawAddress.toString(), pvreserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanHostedNetworkQueryStatus(hclienthandle: Handle, ppwlanhostednetworkstatus: MutPtr, pvreserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkQueryStatus(hclienthandle.rawAddress.toString(), ppwlanhostednetworkstatus.rawAddress.toString(), pvreserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanHostedNetworkRefreshSecuritySettings(hclienthandle: Handle, pfailreason: MutPtr, pvreserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkRefreshSecuritySettings(hclienthandle.rawAddress.toString(), pfailreason.rawAddress.toString(), pvreserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanHostedNetworkSetProperty(hclienthandle: Handle, opcode: WlanHostedNetworkOpcode, dwdatasize: UInt, pvdata: ConstPtr, pfailreason: MutPtr, pvreserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkSetProperty(hclienthandle.rawAddress.toString(), opcode, dwdatasize.toInt(), pvdata.rawAddress.toString(), pfailreason.rawAddress.toString(), pvreserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanHostedNetworkSetSecondaryKey(hclienthandle: Handle, dwkeylength: UInt, puckeydata: ConstPtr, bispassphrase: Bool, bpersistent: Bool, pfailreason: MutPtr, pvreserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkSetSecondaryKey(hclienthandle.rawAddress.toString(), dwkeylength.toInt(), puckeydata.rawAddress.toString(), bispassphrase, bpersistent, pfailreason.rawAddress.toString(), pvreserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanHostedNetworkStartUsing(hclienthandle: Handle, pfailreason: MutPtr, pvreserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkStartUsing(hclienthandle.rawAddress.toString(), pfailreason.rawAddress.toString(), pvreserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanHostedNetworkStopUsing(hclienthandle: Handle, pfailreason: MutPtr, pvreserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanHostedNetworkStopUsing(hclienthandle.rawAddress.toString(), pfailreason.rawAddress.toString(), pvreserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanIhvControl(hclienthandle: Handle, pinterfaceguid: ConstPtr, type: WlanIhvControlType, dwinbuffersize: UInt, pinbuffer: ConstPtr, dwoutbuffersize: UInt, poutbuffer: MutPtr, pdwbytesreturned: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanIhvControl(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), type, dwinbuffersize.toInt(), pinbuffer.rawAddress.toString(), dwoutbuffersize.toInt(), poutbuffer.rawAddress.toString(), pdwbytesreturned.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanOpenHandle(dwclientversion: UInt, preserved: ConstPtr, pdwnegotiatedversion: MutPtr, phclienthandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanOpenHandle(dwclientversion.toInt(), preserved.rawAddress.toString(), pdwnegotiatedversion.rawAddress.toString(), phclienthandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanQueryAutoConfigParameter(hclienthandle: Handle, opcode: WlanAutoconfOpcode, preserved: ConstPtr, pdwdatasize: MutPtr, ppdata: MutPtr, pwlanopcodevaluetype: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanQueryAutoConfigParameter(hclienthandle.rawAddress.toString(), opcode, preserved.rawAddress.toString(), pdwdatasize.rawAddress.toString(), ppdata.rawAddress.toString(), pwlanopcodevaluetype.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanQueryInterface(hclienthandle: Handle, pinterfaceguid: ConstPtr, opcode: WlanIntfOpcode, preserved: ConstPtr, pdwdatasize: MutPtr, ppdata: MutPtr, pwlanopcodevaluetype: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanQueryInterface(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), opcode, preserved.rawAddress.toString(), pdwdatasize.rawAddress.toString(), ppdata.rawAddress.toString(), pwlanopcodevaluetype.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanReasonCodeToString(dwreasoncode: UInt, dwbuffersize: UInt, pstringbuffer: Pcwstr, preserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanReasonCodeToString(dwreasoncode.toInt(), dwbuffersize.toInt(), pstringbuffer.rawAddress.toString(), preserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanRegisterDeviceServiceNotification(hclienthandle: Handle, pdevsvcguidlist: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanRegisterDeviceServiceNotification(hclienthandle.rawAddress.toString(), pdevsvcguidlist.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanRegisterNotification(hclienthandle: Handle, dwnotifsource: WlanNotificationSources, bignoreduplicate: Bool, funccallback: WlanNotificationCallback, pcallbackcontext: ConstPtr, preserved: ConstPtr, pdwprevnotifsource: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanRegisterNotification(hclienthandle.rawAddress.toString(), dwnotifsource.toInt(), bignoreduplicate, 0L.toString(), pcallbackcontext.rawAddress.toString(), preserved.rawAddress.toString(), pdwprevnotifsource.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanRegisterVirtualStationNotification(hclienthandle: Handle, bregister: Bool, preserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanRegisterVirtualStationNotification(hclienthandle.rawAddress.toString(), bregister, preserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanRenameProfile(hclienthandle: Handle, pinterfaceguid: ConstPtr, stroldprofilename: Pcwstr, strnewprofilename: Pcwstr, preserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanRenameProfile(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), stroldprofilename.rawAddress.toString(), strnewprofilename.rawAddress.toString(), preserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanSaveTemporaryProfile(hclienthandle: Handle, pinterfaceguid: ConstPtr, strprofilename: Pcwstr, stralluserprofilesecurity: Pcwstr, dwflags: UInt, boverwrite: Bool, preserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanSaveTemporaryProfile(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), strprofilename.rawAddress.toString(), stralluserprofilesecurity.rawAddress.toString(), dwflags.toInt(), boverwrite, preserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanScan(hclienthandle: Handle, pinterfaceguid: ConstPtr, pdot11ssid: ConstPtr, piedata: ConstPtr, preserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanScan(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), pdot11ssid.rawAddress.toString(), piedata.rawAddress.toString(), preserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanSetAutoConfigParameter(hclienthandle: Handle, opcode: WlanAutoconfOpcode, dwdatasize: UInt, pdata: ConstPtr, preserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanSetAutoConfigParameter(hclienthandle.rawAddress.toString(), opcode, dwdatasize.toInt(), pdata.rawAddress.toString(), preserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanSetFilterList(hclienthandle: Handle, wlanfilterlisttype: WlanFilterListType, pnetworklist: ConstPtr, preserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanSetFilterList(hclienthandle.rawAddress.toString(), wlanfilterlisttype, pnetworklist.rawAddress.toString(), preserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanSetInterface(hclienthandle: Handle, pinterfaceguid: ConstPtr, opcode: WlanIntfOpcode, dwdatasize: UInt, pdata: ConstPtr, preserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanSetInterface(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), opcode, dwdatasize.toInt(), pdata.rawAddress.toString(), preserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanSetProfile(hclienthandle: Handle, pinterfaceguid: ConstPtr, dwflags: UInt, strprofilexml: Pcwstr, stralluserprofilesecurity: Pcwstr, boverwrite: Bool, preserved: ConstPtr, pdwreasoncode: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanSetProfile(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), dwflags.toInt(), strprofilexml.rawAddress.toString(), stralluserprofilesecurity.rawAddress.toString(), boverwrite, preserved.rawAddress.toString(), pdwreasoncode.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanSetProfileCustomUserData(hclienthandle: Handle, pinterfaceguid: ConstPtr, strprofilename: Pcwstr, dwdatasize: UInt, pdata: ConstPtr, preserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanSetProfileCustomUserData(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), strprofilename.rawAddress.toString(), dwdatasize.toInt(), pdata.rawAddress.toString(), preserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanSetProfileEapUserData(hclienthandle: Handle, pinterfaceguid: ConstPtr, strprofilename: Pcwstr, eaptype: EapMethodType, dwflags: WlanSetEaphostFlags, dweapuserdatasize: UInt, pbeapuserdata: ConstPtr, preserved: ConstPtr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanSetProfileEapXmlUserData(hclienthandle: Handle, pinterfaceguid: ConstPtr, strprofilename: Pcwstr, dwflags: WlanSetEaphostFlags, streapxmluserdata: Pcwstr, preserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanSetProfileEapXmlUserData(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), strprofilename.rawAddress.toString(), dwflags.toInt(), streapxmluserdata.rawAddress.toString(), preserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanSetProfileList(hclienthandle: Handle, pinterfaceguid: ConstPtr, dwitems: UInt, strprofilenames: ConstPtr, preserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanSetProfileList(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), dwitems.toInt(), strprofilenames.rawAddress.toString(), preserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanSetProfilePosition(hclienthandle: Handle, pinterfaceguid: ConstPtr, strprofilename: Pcwstr, dwposition: UInt, preserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanSetProfilePosition(hclienthandle.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), strprofilename.rawAddress.toString(), dwposition.toInt(), preserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanSetPsdIEDataList(hclienthandle: Handle, strformat: Pcwstr, ppsdiedatalist: ConstPtr, preserved: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanSetPsdIEDataList(hclienthandle.rawAddress.toString(), strformat.rawAddress.toString(), ppsdiedatalist.rawAddress.toString(), preserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanSetSecuritySettings(hclienthandle: Handle, securableobject: WlanSecurableObject, strmodifiedsddl: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanSetSecuritySettings(hclienthandle.rawAddress.toString(), securableobject, strmodifiedsddl.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wlanUIEditProfile(dwclientversion: UInt, wstrprofilename: Pcwstr, pinterfaceguid: ConstPtr, hwnd: Hwnd, wlstartpage: WlDisplayPages, preserved: ConstPtr, pwlanreasoncode: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWifiNapiAddon != null) (windowsWin32NetworkmanagementWifiNapiAddon.windowssysWindowsWin32NetworkmanagementWifiWlanUIEditProfile(dwclientversion.toInt(), wstrprofilename.rawAddress.toString(), pinterfaceguid.rawAddress.toString(), hwnd.rawAddress.toString(), wlstartpage, preserved.rawAddress.toString(), pwlanreasoncode.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
