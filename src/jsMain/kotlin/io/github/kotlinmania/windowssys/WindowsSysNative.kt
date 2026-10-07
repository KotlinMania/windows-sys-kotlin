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
    // Foundation
    public fun CloseHandle(hObject: Double): Int

    public fun GetLastError(): Int

    public fun SetLastError(dwErrCode: Int)

    public fun SetLastErrorEx(dwErrCode: Int, dwType: Int)

    public fun LocalFree(hMem: Double): Double

    public fun GlobalFree(hMem: Double): Double

    public fun FreeLibrary(hLibModule: Double): Int

    public fun SetHandleInformation(hObject: Double, dwMask: Int, dwFlags: Int): Int

    public fun GetHandleInformation(hObject: Double): dynamic

    public fun CompareObjectHandles(hFirstObjectHandle: Double, hSecondObjectHandle: Double): Int

    public fun DuplicateHandle(
        hSourceProcessHandle: Double,
        hSourceHandle: Double,
        hTargetProcessHandle: Double,
        dwDesiredAccess: Int,
        bInheritHandle: Boolean,
        dwOptions: Int,
    ): dynamic

    public fun RtlNtStatusToDosError(status: Int): Int

    public fun SysAllocString(psz: Double): Double

    public fun SysAllocStringByteLen(psz: Double, len: Int): Double

    public fun SysAllocStringLen(strIn: Double, ui: Int): Double

    public fun SysFreeString(bstrString: Double)

    public fun SysAddRefString(bstrString: Double): Int

    public fun SysReleaseString(bstrString: Double)

    public fun SysStringByteLen(bstr: Double): Int

    public fun SysStringLen(pbstr: Double): Int

    // Storage / FileSystem
    public fun SetFileAttributesW(lpFileName: Double, dwFileAttributes: Int): Int

    public fun SetFileAttributesA(lpFileName: Double, dwFileAttributes: Int): Int

    public fun GetFileAttributesW(lpFileName: Double): Int

    public fun GetFileAttributesA(lpFileName: Double): Int

    public fun DeleteFileW(lpFileName: Double): Int

    public fun DeleteFileA(lpFileName: Double): Int

    public fun FlushFileBuffers(hFile: Double): Int

    public fun AreFileApisANSI(): Int

    // System / Threading
    public fun GetCurrentProcess(): Double

    public fun GetCurrentProcessId(): Int

    public fun GetCurrentThread(): Double

    public fun GetCurrentThreadId(): Int

    public fun TerminateProcess(hProcess: Double, uExitCode: Int): Int

    public fun ExitProcess(uExitCode: Int)

    public fun OpenProcess(dwDesiredAccess: Int, bInheritHandle: Boolean, dwProcessId: Int): Double

    public fun isNativeAvailable(): Boolean
}
