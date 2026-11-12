@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.iphelper

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.AddressFamily
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.ndis.NetIfCompartmentId
import io.github.kotlinmania.windowssys.windows.win32.system.io.PioApcRoutine

private val windowsWin32NetworkmanagementIphelperNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun addIPAddress(address: UInt, ipmask: UInt, ifindex: UInt, ntecontext: MutPtr, nteinstance: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperAddIPAddress(address.toInt(), ipmask.toInt(), ifindex.toInt(), ntecontext.rawAddress.toString(), nteinstance.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cancelIPChangeNotify(notifyoverlapped: ConstPtr): Bool =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperCancelIPChangeNotify(notifyoverlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cancelIfTimestampConfigChange(notificationhandle: Hiftimestampchange) {
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) {
        windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperCancelIfTimestampConfigChange(notificationhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun cancelMibChangeNotify2(notificationhandle: Handle): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperCancelMibChangeNotify2(notificationhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun captureInterfaceHardwareCrossTimestamp(interfaceluid: ConstPtr, crosstimestamp: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperCaptureInterfaceHardwareCrossTimestamp(interfaceluid.rawAddress.toString(), crosstimestamp.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertCompartmentGuidToId(compartmentguid: ConstPtr, compartmentid: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperConvertCompartmentGuidToId(compartmentguid.rawAddress.toString(), compartmentid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertCompartmentIdToGuid(compartmentid: NetIfCompartmentId, compartmentguid: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperConvertCompartmentIdToGuid(compartmentid.toInt(), compartmentguid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertInterfaceAliasToLuid(interfacealias: Pcwstr, interfaceluid: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceAliasToLuid(interfacealias.rawAddress.toString(), interfaceluid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertInterfaceGuidToLuid(interfaceguid: ConstPtr, interfaceluid: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceGuidToLuid(interfaceguid.rawAddress.toString(), interfaceluid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertInterfaceIndexToLuid(interfaceindex: UInt, interfaceluid: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceIndexToLuid(interfaceindex.toInt(), interfaceluid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertInterfaceLuidToAlias(interfaceluid: ConstPtr, interfacealias: Pwstr, length: ULong): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceLuidToAlias(interfaceluid.rawAddress.toString(), interfacealias.rawAddress.toString(), length.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertInterfaceLuidToGuid(interfaceluid: ConstPtr, interfaceguid: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceLuidToGuid(interfaceluid.rawAddress.toString(), interfaceguid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertInterfaceLuidToIndex(interfaceluid: ConstPtr, interfaceindex: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceLuidToIndex(interfaceluid.rawAddress.toString(), interfaceindex.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertInterfaceLuidToNameA(interfaceluid: ConstPtr, interfacename: Pstr, length: ULong): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceLuidToNameA(interfaceluid.rawAddress.toString(), interfacename.rawAddress.toString(), length.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertInterfaceLuidToNameW(interfaceluid: ConstPtr, interfacename: Pwstr, length: ULong): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceLuidToNameW(interfaceluid.rawAddress.toString(), interfacename.rawAddress.toString(), length.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertInterfaceNameToLuidA(interfacename: Pcstr, interfaceluid: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceNameToLuidA(interfacename.rawAddress.toString(), interfaceluid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertInterfaceNameToLuidW(interfacename: Pcwstr, interfaceluid: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperConvertInterfaceNameToLuidW(interfacename.rawAddress.toString(), interfaceluid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertIpv4MaskToLength(mask: UInt, masklength: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperConvertIpv4MaskToLength(mask.toInt(), masklength.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun convertLengthToIpv4Mask(masklength: UInt, mask: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperConvertLengthToIpv4Mask(masklength.toInt(), mask.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createAnycastIpAddressEntry(row: ConstPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperCreateAnycastIpAddressEntry(row.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createIpForwardEntry(proute: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperCreateIpForwardEntry(proute.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createIpForwardEntry2(row: ConstPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperCreateIpForwardEntry2(row.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createIpNetEntry(parpentry: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperCreateIpNetEntry(parpentry.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createIpNetEntry2(row: ConstPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperCreateIpNetEntry2(row.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPersistentTcpPortReservation(startport: UShort, numberofports: UShort, token: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperCreatePersistentTcpPortReservation(startport.toInt(), numberofports.toInt(), token.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPersistentUdpPortReservation(startport: UShort, numberofports: UShort, token: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperCreatePersistentUdpPortReservation(startport.toInt(), numberofports.toInt(), token.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createProxyArpEntry(dwaddress: UInt, dwmask: UInt, dwifindex: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperCreateProxyArpEntry(dwaddress.toInt(), dwmask.toInt(), dwifindex.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createSortedAddressPairs(sourceaddresslist: ConstPtr, sourceaddresscount: UInt, destinationaddresslist: ConstPtr, destinationaddresscount: UInt, addresssortoptions: UInt, sortedaddresspairlist: MutPtr, sortedaddresspaircount: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperCreateSortedAddressPairs(sourceaddresslist.rawAddress.toString(), sourceaddresscount.toInt(), destinationaddresslist.rawAddress.toString(), destinationaddresscount.toInt(), addresssortoptions.toInt(), sortedaddresspairlist.rawAddress.toString(), sortedaddresspaircount.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createUnicastIpAddressEntry(row: ConstPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperCreateUnicastIpAddressEntry(row.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteAnycastIpAddressEntry(row: ConstPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperDeleteAnycastIpAddressEntry(row.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteIPAddress(ntecontext: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperDeleteIPAddress(ntecontext.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteIpForwardEntry(proute: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperDeleteIpForwardEntry(proute.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteIpForwardEntry2(row: ConstPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperDeleteIpForwardEntry2(row.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteIpNetEntry(parpentry: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperDeleteIpNetEntry(parpentry.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteIpNetEntry2(row: ConstPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperDeleteIpNetEntry2(row.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePersistentTcpPortReservation(startport: UShort, numberofports: UShort): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperDeletePersistentTcpPortReservation(startport.toInt(), numberofports.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deletePersistentUdpPortReservation(startport: UShort, numberofports: UShort): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperDeletePersistentUdpPortReservation(startport.toInt(), numberofports.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteProxyArpEntry(dwaddress: UInt, dwmask: UInt, dwifindex: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperDeleteProxyArpEntry(dwaddress.toInt(), dwmask.toInt(), dwifindex.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteUnicastIpAddressEntry(row: ConstPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperDeleteUnicastIpAddressEntry(row.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun disableMediaSense(phandle: MutPtr, poverlapped: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperDisableMediaSense(phandle.rawAddress.toString(), poverlapped.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enableRouter(phandle: MutPtr, poverlapped: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperEnableRouter(phandle.rawAddress.toString(), poverlapped.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flushIpNetTable(dwifindex: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperFlushIpNetTable(dwifindex.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flushIpNetTable2(family: AddressFamily, interfaceindex: UInt): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperFlushIpNetTable2(family.toInt(), interfaceindex.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flushIpPathTable(family: AddressFamily): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperFlushIpPathTable(family.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeDnsSettings(settings: MutPtr) {
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) {
        windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperFreeDnsSettings(settings.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun freeInterfaceDnsSettings(settings: MutPtr) {
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) {
        windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperFreeInterfaceDnsSettings(settings.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun freeMibTable(memory: ConstPtr) {
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) {
        windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperFreeMibTable(memory.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getAdapterIndex(adaptername: Pcwstr, ifindex: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetAdapterIndex(adaptername.rawAddress.toString(), ifindex.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAdapterOrderMap(): MutPtr =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) MutPtr((windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetAdapterOrderMap() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAdaptersAddresses(family: UInt, flags: GetAdaptersAddressesFlags, reserved: ConstPtr, adapteraddresses: MutPtr, sizepointer: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetAdaptersAddresses(family.toInt(), flags.toInt(), reserved.rawAddress.toString(), adapteraddresses.rawAddress.toString(), sizepointer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAdaptersInfo(adapterinfo: MutPtr, sizepointer: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetAdaptersInfo(adapterinfo.rawAddress.toString(), sizepointer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAnycastIpAddressEntry(row: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetAnycastIpAddressEntry(row.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAnycastIpAddressTable(family: AddressFamily, table: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetAnycastIpAddressTable(family.toInt(), table.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBestInterface(dwdestaddr: UInt, pdwbestifindex: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetBestInterface(dwdestaddr.toInt(), pdwbestifindex.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBestInterfaceEx(pdestaddr: ConstPtr, pdwbestifindex: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetBestInterfaceEx(pdestaddr.rawAddress.toString(), pdwbestifindex.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBestRoute(dwdestaddr: UInt, dwsourceaddr: UInt, pbestroute: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetBestRoute(dwdestaddr.toInt(), dwsourceaddr.toInt(), pbestroute.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBestRoute2(interfaceluid: ConstPtr, interfaceindex: UInt, sourceaddress: ConstPtr, destinationaddress: ConstPtr, addresssortoptions: UInt, bestroute: MutPtr, bestsourceaddress: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetBestRoute2(interfaceluid.rawAddress.toString(), interfaceindex.toInt(), sourceaddress.rawAddress.toString(), destinationaddress.rawAddress.toString(), addresssortoptions.toInt(), bestroute.rawAddress.toString(), bestsourceaddress.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentThreadCompartmentId(): NetIfCompartmentId =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetCurrentThreadCompartmentId() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentThreadCompartmentScope(compartmentscope: MutPtr, compartmentid: MutPtr) {
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) {
        windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetCurrentThreadCompartmentScope(compartmentscope.rawAddress.toString(), compartmentid.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getDefaultCompartmentId(): NetIfCompartmentId =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetDefaultCompartmentId() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDnsSettings(settings: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetDnsSettings(settings.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getExtendedTcpTable(ptcptable: MutPtr, pdwsize: MutPtr, border: Bool, ulaf: UInt, tableclass: TcpTableClass, reserved: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetExtendedTcpTable(ptcptable.rawAddress.toString(), pdwsize.rawAddress.toString(), border, ulaf.toInt(), tableclass, reserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getExtendedUdpTable(pudptable: MutPtr, pdwsize: MutPtr, border: Bool, ulaf: UInt, tableclass: UdpTableClass, reserved: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetExtendedUdpTable(pudptable.rawAddress.toString(), pdwsize.rawAddress.toString(), border, ulaf.toInt(), tableclass, reserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFriendlyIfIndex(ifindex: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetFriendlyIfIndex(ifindex.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIcmpStatistics(statistics: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetIcmpStatistics(statistics.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIcmpStatisticsEx(statistics: MutPtr, family: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetIcmpStatisticsEx(statistics.rawAddress.toString(), family.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIfEntry(pifrow: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetIfEntry(pifrow.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIfEntry2(row: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetIfEntry2(row.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIfEntry2Ex(level: MibIfEntryLevel, row: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetIfEntry2Ex(level, row.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIfStackTable(table: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetIfStackTable(table.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIfTable(piftable: MutPtr, pdwsize: MutPtr, border: Bool): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetIfTable(piftable.rawAddress.toString(), pdwsize.rawAddress.toString(), border) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIfTable2(table: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetIfTable2(table.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIfTable2Ex(level: MibIfTableLevel, table: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetIfTable2Ex(level, table.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getInterfaceActiveTimestampCapabilities(interfaceluid: ConstPtr, timestampcapabilites: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetInterfaceActiveTimestampCapabilities(interfaceluid.rawAddress.toString(), timestampcapabilites.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getInterfaceCurrentTimestampCapabilities(interfaceluid: ConstPtr, timestampcapabilites: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetInterfaceCurrentTimestampCapabilities(interfaceluid.rawAddress.toString(), timestampcapabilites.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getInterfaceDnsSettings(iface: Guid, settings: MutPtr): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getInterfaceHardwareTimestampCapabilities(interfaceluid: ConstPtr, timestampcapabilites: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetInterfaceHardwareTimestampCapabilities(interfaceluid.rawAddress.toString(), timestampcapabilites.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getInterfaceInfo(piftable: MutPtr, dwoutbuflen: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetInterfaceInfo(piftable.rawAddress.toString(), dwoutbuflen.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getInterfaceSupportedTimestampCapabilities(interfaceluid: ConstPtr, timestampcapabilites: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetInterfaceSupportedTimestampCapabilities(interfaceluid.rawAddress.toString(), timestampcapabilites.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getInvertedIfStackTable(table: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetInvertedIfStackTable(table.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIpAddrTable(pipaddrtable: MutPtr, pdwsize: MutPtr, border: Bool): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetIpAddrTable(pipaddrtable.rawAddress.toString(), pdwsize.rawAddress.toString(), border) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIpErrorString(errorcode: UInt, buffer: Pwstr, size: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetIpErrorString(errorcode.toInt(), buffer.rawAddress.toString(), size.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIpForwardEntry2(row: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetIpForwardEntry2(row.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIpForwardTable(pipforwardtable: MutPtr, pdwsize: MutPtr, border: Bool): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetIpForwardTable(pipforwardtable.rawAddress.toString(), pdwsize.rawAddress.toString(), border) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIpForwardTable2(family: AddressFamily, table: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetIpForwardTable2(family.toInt(), table.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIpInterfaceEntry(row: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetIpInterfaceEntry(row.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIpInterfaceTable(family: AddressFamily, table: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetIpInterfaceTable(family.toInt(), table.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIpNetEntry2(row: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetIpNetEntry2(row.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIpNetTable(ipnettable: MutPtr, sizepointer: MutPtr, order: Bool): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetIpNetTable(ipnettable.rawAddress.toString(), sizepointer.rawAddress.toString(), order) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIpNetTable2(family: AddressFamily, table: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetIpNetTable2(family.toInt(), table.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIpNetworkConnectionBandwidthEstimates(interfaceindex: UInt, addressfamily: AddressFamily, bandwidthestimates: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetIpNetworkConnectionBandwidthEstimates(interfaceindex.toInt(), addressfamily.toInt(), bandwidthestimates.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIpPathEntry(row: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetIpPathEntry(row.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIpPathTable(family: AddressFamily, table: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetIpPathTable(family.toInt(), table.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIpStatistics(statistics: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetIpStatistics(statistics.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIpStatisticsEx(statistics: MutPtr, family: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetIpStatisticsEx(statistics.rawAddress.toString(), family.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getJobCompartmentId(jobhandle: Handle): NetIfCompartmentId =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetJobCompartmentId(jobhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMulticastIpAddressEntry(row: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetMulticastIpAddressEntry(row.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMulticastIpAddressTable(family: AddressFamily, table: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetMulticastIpAddressTable(family.toInt(), table.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNetworkConnectivityHint(connectivityhint: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetNetworkConnectivityHint(connectivityhint.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNetworkConnectivityHintForInterface(interfaceindex: UInt, connectivityhint: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetNetworkConnectivityHintForInterface(interfaceindex.toInt(), connectivityhint.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNetworkInformation(networkguid: ConstPtr, compartmentid: MutPtr, siteid: MutPtr, networkname: Pwstr, length: UInt): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetNetworkInformation(networkguid.rawAddress.toString(), compartmentid.rawAddress.toString(), siteid.rawAddress.toString(), networkname.rawAddress.toString(), length.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNetworkParams(pfixedinfo: MutPtr, poutbuflen: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetNetworkParams(pfixedinfo.rawAddress.toString(), poutbuflen.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumberOfInterfaces(pdwnumif: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetNumberOfInterfaces(pdwnumif.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOwnerModuleFromPidAndInfo(ulpid: UInt, pinfo: ConstPtr, cls: TcpipOwnerModuleInfoClass, pbuffer: MutPtr, pdwsize: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetOwnerModuleFromPidAndInfo(ulpid.toInt(), pinfo.rawAddress.toString(), cls, pbuffer.rawAddress.toString(), pdwsize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOwnerModuleFromTcp6Entry(ptcpentry: ConstPtr, cls: TcpipOwnerModuleInfoClass, pbuffer: MutPtr, pdwsize: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetOwnerModuleFromTcp6Entry(ptcpentry.rawAddress.toString(), cls, pbuffer.rawAddress.toString(), pdwsize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOwnerModuleFromTcpEntry(ptcpentry: ConstPtr, cls: TcpipOwnerModuleInfoClass, pbuffer: MutPtr, pdwsize: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetOwnerModuleFromTcpEntry(ptcpentry.rawAddress.toString(), cls, pbuffer.rawAddress.toString(), pdwsize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOwnerModuleFromUdp6Entry(pudpentry: ConstPtr, cls: TcpipOwnerModuleInfoClass, pbuffer: MutPtr, pdwsize: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetOwnerModuleFromUdp6Entry(pudpentry.rawAddress.toString(), cls, pbuffer.rawAddress.toString(), pdwsize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOwnerModuleFromUdpEntry(pudpentry: ConstPtr, cls: TcpipOwnerModuleInfoClass, pbuffer: MutPtr, pdwsize: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetOwnerModuleFromUdpEntry(pudpentry.rawAddress.toString(), cls, pbuffer.rawAddress.toString(), pdwsize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPerAdapterInfo(ifindex: UInt, pperadapterinfo: MutPtr, poutbuflen: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetPerAdapterInfo(ifindex.toInt(), pperadapterinfo.rawAddress.toString(), poutbuflen.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPerTcp6ConnectionEStats(row: ConstPtr, estatstype: TcpEstatsType, rw: MutPtr, rwversion: UInt, rwsize: UInt, ros: MutPtr, rosversion: UInt, rossize: UInt, rod: MutPtr, rodversion: UInt, rodsize: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetPerTcp6ConnectionEStats(row.rawAddress.toString(), estatstype, rw.rawAddress.toString(), rwversion.toInt(), rwsize.toInt(), ros.rawAddress.toString(), rosversion.toInt(), rossize.toInt(), rod.rawAddress.toString(), rodversion.toInt(), rodsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPerTcpConnectionEStats(row: ConstPtr, estatstype: TcpEstatsType, rw: MutPtr, rwversion: UInt, rwsize: UInt, ros: MutPtr, rosversion: UInt, rossize: UInt, rod: MutPtr, rodversion: UInt, rodsize: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetPerTcpConnectionEStats(row.rawAddress.toString(), estatstype, rw.rawAddress.toString(), rwversion.toInt(), rwsize.toInt(), ros.rawAddress.toString(), rosversion.toInt(), rossize.toInt(), rod.rawAddress.toString(), rodversion.toInt(), rodsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRTTAndHopCount(destipaddress: UInt, hopcount: MutPtr, maxhops: UInt, rtt: MutPtr): Bool =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetRTTAndHopCount(destipaddress.toInt(), hopcount.rawAddress.toString(), maxhops.toInt(), rtt.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSessionCompartmentId(sessionid: UInt): NetIfCompartmentId =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetSessionCompartmentId(sessionid.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTcp6Table(tcptable: MutPtr, sizepointer: MutPtr, order: Bool): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetTcp6Table(tcptable.rawAddress.toString(), sizepointer.rawAddress.toString(), order) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTcp6Table2(tcptable: MutPtr, sizepointer: MutPtr, order: Bool): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetTcp6Table2(tcptable.rawAddress.toString(), sizepointer.rawAddress.toString(), order) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTcpStatistics(statistics: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetTcpStatistics(statistics.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTcpStatisticsEx(statistics: MutPtr, family: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetTcpStatisticsEx(statistics.rawAddress.toString(), family.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTcpStatisticsEx2(statistics: MutPtr, family: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetTcpStatisticsEx2(statistics.rawAddress.toString(), family.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTcpTable(tcptable: MutPtr, sizepointer: MutPtr, order: Bool): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetTcpTable(tcptable.rawAddress.toString(), sizepointer.rawAddress.toString(), order) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTcpTable2(tcptable: MutPtr, sizepointer: MutPtr, order: Bool): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetTcpTable2(tcptable.rawAddress.toString(), sizepointer.rawAddress.toString(), order) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTeredoPort(port: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetTeredoPort(port.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUdp6Table(udp6table: MutPtr, sizepointer: MutPtr, order: Bool): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetUdp6Table(udp6table.rawAddress.toString(), sizepointer.rawAddress.toString(), order) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUdpStatistics(stats: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetUdpStatistics(stats.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUdpStatisticsEx(statistics: MutPtr, family: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetUdpStatisticsEx(statistics.rawAddress.toString(), family.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUdpStatisticsEx2(statistics: MutPtr, family: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetUdpStatisticsEx2(statistics.rawAddress.toString(), family.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUdpTable(udptable: MutPtr, sizepointer: MutPtr, order: Bool): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetUdpTable(udptable.rawAddress.toString(), sizepointer.rawAddress.toString(), order) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUniDirectionalAdapterInfo(pipifinfo: MutPtr, dwoutbuflen: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetUniDirectionalAdapterInfo(pipifinfo.rawAddress.toString(), dwoutbuflen.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUnicastIpAddressEntry(row: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetUnicastIpAddressEntry(row.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUnicastIpAddressTable(family: AddressFamily, table: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperGetUnicastIpAddressTable(family.toInt(), table.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun icmp6CreateFile(): Handle =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) MutPtr((windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperIcmp6CreateFile() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun icmp6ParseReplies(replybuffer: MutPtr, replysize: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperIcmp6ParseReplies(replybuffer.rawAddress.toString(), replysize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun icmp6SendEcho2(icmphandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, sourceaddress: ConstPtr, destinationaddress: ConstPtr, requestdata: ConstPtr, requestsize: UShort, requestoptions: ConstPtr, replybuffer: MutPtr, replysize: UInt, timeout: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperIcmp6SendEcho2(icmphandle.rawAddress.toString(), event.rawAddress.toString(), 0L.toString(), apccontext.rawAddress.toString(), sourceaddress.rawAddress.toString(), destinationaddress.rawAddress.toString(), requestdata.rawAddress.toString(), requestsize.toInt(), requestoptions.rawAddress.toString(), replybuffer.rawAddress.toString(), replysize.toInt(), timeout.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun icmpCloseHandle(icmphandle: Handle): Bool =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperIcmpCloseHandle(icmphandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun icmpCreateFile(): Handle =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) MutPtr((windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperIcmpCreateFile() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun icmpParseReplies(replybuffer: MutPtr, replysize: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperIcmpParseReplies(replybuffer.rawAddress.toString(), replysize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun icmpSendEcho(icmphandle: Handle, destinationaddress: UInt, requestdata: ConstPtr, requestsize: UShort, requestoptions: ConstPtr, replybuffer: MutPtr, replysize: UInt, timeout: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperIcmpSendEcho(icmphandle.rawAddress.toString(), destinationaddress.toInt(), requestdata.rawAddress.toString(), requestsize.toInt(), requestoptions.rawAddress.toString(), replybuffer.rawAddress.toString(), replysize.toInt(), timeout.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun icmpSendEcho2(icmphandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, destinationaddress: UInt, requestdata: ConstPtr, requestsize: UShort, requestoptions: ConstPtr, replybuffer: MutPtr, replysize: UInt, timeout: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperIcmpSendEcho2(icmphandle.rawAddress.toString(), event.rawAddress.toString(), 0L.toString(), apccontext.rawAddress.toString(), destinationaddress.toInt(), requestdata.rawAddress.toString(), requestsize.toInt(), requestoptions.rawAddress.toString(), replybuffer.rawAddress.toString(), replysize.toInt(), timeout.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun icmpSendEcho2Ex(icmphandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, sourceaddress: UInt, destinationaddress: UInt, requestdata: ConstPtr, requestsize: UShort, requestoptions: ConstPtr, replybuffer: MutPtr, replysize: UInt, timeout: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperIcmpSendEcho2Ex(icmphandle.rawAddress.toString(), event.rawAddress.toString(), 0L.toString(), apccontext.rawAddress.toString(), sourceaddress.toInt(), destinationaddress.toInt(), requestdata.rawAddress.toString(), requestsize.toInt(), requestoptions.rawAddress.toString(), replybuffer.rawAddress.toString(), replysize.toInt(), timeout.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeIpForwardEntry(row: MutPtr) {
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) {
        windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperInitializeIpForwardEntry(row.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun initializeIpInterfaceEntry(row: MutPtr) {
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) {
        windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperInitializeIpInterfaceEntry(row.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun initializeUnicastIpAddressEntry(row: MutPtr) {
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) {
        windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperInitializeUnicastIpAddressEntry(row.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ipReleaseAddress(adapterinfo: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperIpReleaseAddress(adapterinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ipRenewAddress(adapterinfo: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperIpRenewAddress(adapterinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupPersistentTcpPortReservation(startport: UShort, numberofports: UShort, token: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperLookupPersistentTcpPortReservation(startport.toInt(), numberofports.toInt(), token.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lookupPersistentUdpPortReservation(startport: UShort, numberofports: UShort, token: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperLookupPersistentUdpPortReservation(startport.toInt(), numberofports.toInt(), token.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nhpAllocateAndGetInterfaceInfoFromStack(pptable: MutPtr, pdwcount: MutPtr, border: Bool, hheap: Handle, dwflags: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperNhpAllocateAndGetInterfaceInfoFromStack(pptable.rawAddress.toString(), pdwcount.rawAddress.toString(), border, hheap.rawAddress.toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyAddrChange(handle: MutPtr, overlapped: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperNotifyAddrChange(handle.rawAddress.toString(), overlapped.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyIfTimestampConfigChange(callercontext: ConstPtr, callback: PinterfaceTimestampConfigChangeCallback, notificationhandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperNotifyIfTimestampConfigChange(callercontext.rawAddress.toString(), 0L.toString(), notificationhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyIpInterfaceChange(family: AddressFamily, callback: PipinterfaceChangeCallback, callercontext: ConstPtr, initialnotification: Boolean, notificationhandle: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperNotifyIpInterfaceChange(family.toInt(), 0L.toString(), callercontext.rawAddress.toString(), initialnotification, notificationhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyNetworkConnectivityHintChange(callback: PnetworkConnectivityHintChangeCallback, callercontext: ConstPtr, initialnotification: Boolean, notificationhandle: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperNotifyNetworkConnectivityHintChange(0L.toString(), callercontext.rawAddress.toString(), initialnotification, notificationhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyRouteChange(handle: MutPtr, overlapped: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperNotifyRouteChange(handle.rawAddress.toString(), overlapped.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyRouteChange2(addressfamily: AddressFamily, callback: PipforwardChangeCallback, callercontext: ConstPtr, initialnotification: Boolean, notificationhandle: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperNotifyRouteChange2(addressfamily.toInt(), 0L.toString(), callercontext.rawAddress.toString(), initialnotification, notificationhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyStableUnicastIpAddressTable(family: AddressFamily, table: MutPtr, callercallback: PstableUnicastIpaddressTableCallback, callercontext: ConstPtr, notificationhandle: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperNotifyStableUnicastIpAddressTable(family.toInt(), table.rawAddress.toString(), 0L.toString(), callercontext.rawAddress.toString(), notificationhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyTeredoPortChange(callback: PteredoPortChangeCallback, callercontext: ConstPtr, initialnotification: Boolean, notificationhandle: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperNotifyTeredoPortChange(0L.toString(), callercontext.rawAddress.toString(), initialnotification, notificationhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyUnicastIpAddressChange(family: AddressFamily, callback: PunicastIpaddressChangeCallback, callercontext: ConstPtr, initialnotification: Boolean, notificationhandle: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperNotifyUnicastIpAddressChange(family.toInt(), 0L.toString(), callercontext.rawAddress.toString(), initialnotification, notificationhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun parseNetworkString(networkstring: Pcwstr, types: UInt, addressinfo: MutPtr, portnumber: MutPtr, prefixlength: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperParseNetworkString(networkstring.rawAddress.toString(), types.toInt(), addressinfo.rawAddress.toString(), portnumber.rawAddress.toString(), prefixlength.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfAddFiltersToInterface(ih: MutPtr, cinfilters: UInt, pfiltin: MutPtr, coutfilters: UInt, pfiltout: MutPtr, pfhandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperPfAddFiltersToInterface(ih.rawAddress.toString(), cinfilters.toInt(), pfiltin.rawAddress.toString(), coutfilters.toInt(), pfiltout.rawAddress.toString(), pfhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfAddGlobalFilterToInterface(pinterface: MutPtr, gffilter: GlobalFilter): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperPfAddGlobalFilterToInterface(pinterface.rawAddress.toString(), gffilter) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfBindInterfaceToIPAddress(pinterface: MutPtr, pfattype: Pfaddresstype, ipaddress: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperPfBindInterfaceToIPAddress(pinterface.rawAddress.toString(), pfattype, ipaddress.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfBindInterfaceToIndex(pinterface: MutPtr, dwindex: UInt, pfatlinktype: Pfaddresstype, linkipaddress: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperPfBindInterfaceToIndex(pinterface.rawAddress.toString(), dwindex.toInt(), pfatlinktype, linkipaddress.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfCreateInterface(dwname: UInt, inaction: PfforwardAction, outaction: PfforwardAction, buselog: Bool, bmustbeunique: Bool, ppinterface: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperPfCreateInterface(dwname.toInt(), inaction, outaction, buselog, bmustbeunique, ppinterface.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfDeleteInterface(pinterface: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperPfDeleteInterface(pinterface.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfDeleteLog(): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperPfDeleteLog() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfGetInterfaceStatistics(pinterface: MutPtr, ppfstats: MutPtr, pdwbuffersize: MutPtr, fresetcounters: Bool): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperPfGetInterfaceStatistics(pinterface.rawAddress.toString(), ppfstats.rawAddress.toString(), pdwbuffersize.rawAddress.toString(), fresetcounters) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfMakeLog(hevent: Handle): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperPfMakeLog(hevent.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfRebindFilters(pinterface: MutPtr, platebindinfo: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperPfRebindFilters(pinterface.rawAddress.toString(), platebindinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfRemoveFilterHandles(pinterface: MutPtr, cfilters: UInt, pvhandles: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperPfRemoveFilterHandles(pinterface.rawAddress.toString(), cfilters.toInt(), pvhandles.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfRemoveFiltersFromInterface(ih: MutPtr, cinfilters: UInt, pfiltin: MutPtr, coutfilters: UInt, pfiltout: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperPfRemoveFiltersFromInterface(ih.rawAddress.toString(), cinfilters.toInt(), pfiltin.rawAddress.toString(), coutfilters.toInt(), pfiltout.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfRemoveGlobalFilterFromInterface(pinterface: MutPtr, gffilter: GlobalFilter): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperPfRemoveGlobalFilterFromInterface(pinterface.rawAddress.toString(), gffilter) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfSetLogBuffer(pbbuffer: MutPtr, dwsize: UInt, dwthreshold: UInt, dwentries: UInt, pdwloggedentries: MutPtr, pdwlostentries: MutPtr, pdwsizeused: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperPfSetLogBuffer(pbbuffer.rawAddress.toString(), dwsize.toInt(), dwthreshold.toInt(), dwentries.toInt(), pdwloggedentries.rawAddress.toString(), pdwlostentries.rawAddress.toString(), pdwsizeused.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfTestPacket(pininterface: MutPtr, poutinterface: MutPtr, cbytes: UInt, pbpacket: MutPtr, ppaction: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperPfTestPacket(pininterface.rawAddress.toString(), poutinterface.rawAddress.toString(), cbytes.toInt(), pbpacket.rawAddress.toString(), ppaction.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pfUnBindInterface(pinterface: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperPfUnBindInterface(pinterface.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerInterfaceTimestampConfigChange(callback: PinterfaceTimestampConfigChangeCallback, callercontext: ConstPtr, notificationhandle: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperRegisterInterfaceTimestampConfigChange(0L.toString(), callercontext.rawAddress.toString(), notificationhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resolveIpNetEntry2(row: MutPtr, sourceaddress: ConstPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperResolveIpNetEntry2(row.rawAddress.toString(), sourceaddress.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resolveNeighbor(networkaddress: ConstPtr, physicaladdress: MutPtr, physicaladdresslength: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperResolveNeighbor(networkaddress.rawAddress.toString(), physicaladdress.rawAddress.toString(), physicaladdresslength.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun restoreMediaSense(poverlapped: ConstPtr, lpdwenablecount: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperRestoreMediaSense(poverlapped.rawAddress.toString(), lpdwenablecount.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendARP(destip: UInt, srcip: UInt, pmacaddr: MutPtr, phyaddrlen: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperSendARP(destip.toInt(), srcip.toInt(), pmacaddr.rawAddress.toString(), phyaddrlen.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCurrentThreadCompartmentId(compartmentid: NetIfCompartmentId): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperSetCurrentThreadCompartmentId(compartmentid.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCurrentThreadCompartmentScope(compartmentscope: UInt): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperSetCurrentThreadCompartmentScope(compartmentscope.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDnsSettings(settings: ConstPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperSetDnsSettings(settings.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIfEntry(pifrow: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperSetIfEntry(pifrow.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setInterfaceDnsSettings(iface: Guid, settings: ConstPtr): Win32Error =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIpForwardEntry(proute: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperSetIpForwardEntry(proute.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIpForwardEntry2(route: ConstPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperSetIpForwardEntry2(route.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIpInterfaceEntry(row: MutPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperSetIpInterfaceEntry(row.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIpNetEntry(parpentry: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperSetIpNetEntry(parpentry.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIpNetEntry2(row: ConstPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperSetIpNetEntry2(row.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIpStatistics(pipstats: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperSetIpStatistics(pipstats.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIpStatisticsEx(statistics: ConstPtr, family: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperSetIpStatisticsEx(statistics.rawAddress.toString(), family.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIpTTL(nttl: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperSetIpTTL(nttl.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setJobCompartmentId(jobhandle: Handle, compartmentid: NetIfCompartmentId): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperSetJobCompartmentId(jobhandle.rawAddress.toString(), compartmentid.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setNetworkInformation(networkguid: ConstPtr, compartmentid: NetIfCompartmentId, networkname: Pcwstr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperSetNetworkInformation(networkguid.rawAddress.toString(), compartmentid.toInt(), networkname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPerTcp6ConnectionEStats(row: ConstPtr, estatstype: TcpEstatsType, rw: ConstPtr, rwversion: UInt, rwsize: UInt, offset: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperSetPerTcp6ConnectionEStats(row.rawAddress.toString(), estatstype, rw.rawAddress.toString(), rwversion.toInt(), rwsize.toInt(), offset.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPerTcpConnectionEStats(row: ConstPtr, estatstype: TcpEstatsType, rw: ConstPtr, rwversion: UInt, rwsize: UInt, offset: UInt): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperSetPerTcpConnectionEStats(row.rawAddress.toString(), estatstype, rw.rawAddress.toString(), rwversion.toInt(), rwsize.toInt(), offset.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSessionCompartmentId(sessionid: UInt, compartmentid: NetIfCompartmentId): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperSetSessionCompartmentId(sessionid.toInt(), compartmentid.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTcpEntry(ptcprow: ConstPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperSetTcpEntry(ptcprow.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUnicastIpAddressEntry(row: ConstPtr): Win32Error =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperSetUnicastIpAddressEntry(row.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unenableRouter(poverlapped: ConstPtr, lpdwenablecount: MutPtr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperUnenableRouter(poverlapped.rawAddress.toString(), lpdwenablecount.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterInterfaceTimestampConfigChange(notificationhandle: Hiftimestampchange) {
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) {
        windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperUnregisterInterfaceTimestampConfigChange(notificationhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ifIndextoname(interfaceindex: UInt, interfacename: Pstr): Pstr =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) MutPtr((windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperIfIndextoname(interfaceindex.toInt(), interfacename.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ifNametoindex(interfacename: Pcstr): UInt =
    if (windowsWin32NetworkmanagementIphelperNapiAddon != null) (windowsWin32NetworkmanagementIphelperNapiAddon.windowssysWindowsWin32NetworkmanagementIphelperIfNametoindex(interfacename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
