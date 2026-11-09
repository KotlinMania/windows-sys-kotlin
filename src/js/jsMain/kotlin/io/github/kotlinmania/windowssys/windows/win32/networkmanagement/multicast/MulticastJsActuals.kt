@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.multicast

import io.github.kotlinmania.windowssys.core.BOOL

private val _windowsWin32NetworkmanagementMulticastNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun McastApiCleanup() {
    if (_windowsWin32NetworkmanagementMulticastNapiAddon != null) {
        _windowsWin32NetworkmanagementMulticastNapiAddon.windowssys_windows_win32_networkmanagement_multicast_McastApiCleanup()
    }
}

public actual fun McastApiStartup(version: Long): UInt =
    if (_windowsWin32NetworkmanagementMulticastNapiAddon != null) (_windowsWin32NetworkmanagementMulticastNapiAddon.windowssys_windows_win32_networkmanagement_multicast_McastApiStartup(version.toString()) as Int).toUInt() else 0u

public actual fun McastEnumerateScopes(addrfamily: UShort, requery: BOOL, pscopelist: Long, pscopelen: Long, pscopecount: Long): UInt =
    if (_windowsWin32NetworkmanagementMulticastNapiAddon != null) (_windowsWin32NetworkmanagementMulticastNapiAddon.windowssys_windows_win32_networkmanagement_multicast_McastEnumerateScopes(addrfamily.toInt(), requery, pscopelist.toString(), pscopelen.toString(), pscopecount.toString()) as Int).toUInt() else 0u

public actual fun McastGenUID(prequestid: Long): UInt =
    if (_windowsWin32NetworkmanagementMulticastNapiAddon != null) (_windowsWin32NetworkmanagementMulticastNapiAddon.windowssys_windows_win32_networkmanagement_multicast_McastGenUID(prequestid.toString()) as Int).toUInt() else 0u

public actual fun McastReleaseAddress(addrfamily: UShort, prequestid: Long, preleaserequest: Long): UInt =
    if (_windowsWin32NetworkmanagementMulticastNapiAddon != null) (_windowsWin32NetworkmanagementMulticastNapiAddon.windowssys_windows_win32_networkmanagement_multicast_McastReleaseAddress(addrfamily.toInt(), prequestid.toString(), preleaserequest.toString()) as Int).toUInt() else 0u

public actual fun McastRenewAddress(addrfamily: UShort, prequestid: Long, prenewrequest: Long, prenewresponse: Long): UInt =
    if (_windowsWin32NetworkmanagementMulticastNapiAddon != null) (_windowsWin32NetworkmanagementMulticastNapiAddon.windowssys_windows_win32_networkmanagement_multicast_McastRenewAddress(addrfamily.toInt(), prequestid.toString(), prenewrequest.toString(), prenewresponse.toString()) as Int).toUInt() else 0u

public actual fun McastRequestAddress(addrfamily: UShort, prequestid: Long, pscopectx: Long, paddrrequest: Long, paddrresponse: Long): UInt =
    if (_windowsWin32NetworkmanagementMulticastNapiAddon != null) (_windowsWin32NetworkmanagementMulticastNapiAddon.windowssys_windows_win32_networkmanagement_multicast_McastRequestAddress(addrfamily.toInt(), prequestid.toString(), pscopectx.toString(), paddrrequest.toString(), paddrresponse.toString()) as Int).toUInt() else 0u
