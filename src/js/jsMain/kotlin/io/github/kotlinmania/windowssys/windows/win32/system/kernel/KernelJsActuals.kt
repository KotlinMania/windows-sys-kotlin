@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.kernel

private val _windowsWin32SystemKernelNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun RtlFirstEntrySList(listhead: Long): Long =
    if (_windowsWin32SystemKernelNapiAddon != null) (_windowsWin32SystemKernelNapiAddon.windowssys_windows_win32_system_kernel_RtlFirstEntrySList(listhead.toString()) as String).toLong() else 0L

public actual fun RtlInitializeSListHead(listhead: Long) {
    if (_windowsWin32SystemKernelNapiAddon != null) {
        _windowsWin32SystemKernelNapiAddon.windowssys_windows_win32_system_kernel_RtlInitializeSListHead(listhead.toString())
    }
}

public actual fun RtlInterlockedFlushSList(listhead: Long): Long =
    if (_windowsWin32SystemKernelNapiAddon != null) (_windowsWin32SystemKernelNapiAddon.windowssys_windows_win32_system_kernel_RtlInterlockedFlushSList(listhead.toString()) as String).toLong() else 0L

public actual fun RtlInterlockedPopEntrySList(listhead: Long): Long =
    if (_windowsWin32SystemKernelNapiAddon != null) (_windowsWin32SystemKernelNapiAddon.windowssys_windows_win32_system_kernel_RtlInterlockedPopEntrySList(listhead.toString()) as String).toLong() else 0L

public actual fun RtlInterlockedPushEntrySList(listhead: Long, listentry: Long): Long =
    if (_windowsWin32SystemKernelNapiAddon != null) (_windowsWin32SystemKernelNapiAddon.windowssys_windows_win32_system_kernel_RtlInterlockedPushEntrySList(listhead.toString(), listentry.toString()) as String).toLong() else 0L

public actual fun RtlInterlockedPushListSListEx(listhead: Long, list: Long, listend: Long, count: UInt): Long =
    if (_windowsWin32SystemKernelNapiAddon != null) (_windowsWin32SystemKernelNapiAddon.windowssys_windows_win32_system_kernel_RtlInterlockedPushListSListEx(listhead.toString(), list.toString(), listend.toString(), count.toInt()) as String).toLong() else 0L

public actual fun RtlQueryDepthSList(listhead: Long): UShort =
    if (_windowsWin32SystemKernelNapiAddon != null) (_windowsWin32SystemKernelNapiAddon.windowssys_windows_win32_system_kernel_RtlQueryDepthSList(listhead.toString()) as Int).toUShort() else 0u
