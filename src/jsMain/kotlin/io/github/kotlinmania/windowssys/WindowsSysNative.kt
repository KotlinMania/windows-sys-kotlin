// port-lint: source N/A
package io.github.kotlinmania.windowssys

/**
 * N-API native bindings for Windows Sys functions on JS targets.
 *
 * Loads the shared C++ N-API addon (`native/node-windows-sys/`) which wraps
 * Win32 API calls via `node-addon-api`.
 */
@JsModule("@kotlinmania/windows-sys-native-bindings")
@JsNonModule
public external object WindowsSysNative {
    public fun CloseHandle(hObject: Double): Int

    public fun GetLastError(): Int

    public fun SetLastError(dwErrCode: Int)

    public fun LocalFree(hMem: Double): Double

    public fun SetHandleInformation(hObject: Double, dwMask: Int, dwFlags: Int): Int

    public fun DuplicateHandle(
        hSourceProcessHandle: Double,
        hSourceHandle: Double,
        hTargetProcessHandle: Double,
        dwDesiredAccess: Int,
        bInheritHandle: Boolean,
        dwOptions: Int,
    ): dynamic

    public fun isNativeAvailable(): Boolean
}
