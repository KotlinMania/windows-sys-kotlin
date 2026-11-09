@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.passwordmanagement

import io.github.kotlinmania.windowssys.core.PCWSTR

private val _windowsWin32SystemPasswordmanagementNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun MSChapSrvChangePassword(servername: PCWSTR, username: PCWSTR, lmoldpresent: Boolean, lmoldowfpassword: Long, lmnewowfpassword: Long, ntoldowfpassword: Long, ntnewowfpassword: Long): UInt =
    if (_windowsWin32SystemPasswordmanagementNapiAddon != null) (_windowsWin32SystemPasswordmanagementNapiAddon.windowssys_windows_win32_system_passwordmanagement_MSChapSrvChangePassword(servername.toString(), username.toString(), lmoldpresent, lmoldowfpassword.toString(), lmnewowfpassword.toString(), ntoldowfpassword.toString(), ntnewowfpassword.toString()) as Int).toUInt() else 0u

public actual fun MSChapSrvChangePassword2(servername: PCWSTR, username: PCWSTR, newpasswordencryptedwitholdnt: Long, oldntowfpasswordencryptedwithnewnt: Long, lmpresent: Boolean, newpasswordencryptedwitholdlm: Long, oldlmowfpasswordencryptedwithnewlmornt: Long): UInt =
    if (_windowsWin32SystemPasswordmanagementNapiAddon != null) (_windowsWin32SystemPasswordmanagementNapiAddon.windowssys_windows_win32_system_passwordmanagement_MSChapSrvChangePassword2(servername.toString(), username.toString(), newpasswordencryptedwitholdnt.toString(), oldntowfpasswordencryptedwithnewnt.toString(), lmpresent, newpasswordencryptedwitholdlm.toString(), oldlmowfpasswordencryptedwithnewlmornt.toString()) as Int).toUInt() else 0u
