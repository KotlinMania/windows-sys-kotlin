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

    // System / ProcessStatus, Time, Shutdown, Pipes
    public fun K32EmptyWorkingSet(hProcess: Double): Int

    public fun GetTimeZoneInformation(lpTimeZoneInformation: Double): Int

    public fun GetTimeZoneInformationForYear(wYear: Int, pdtzi: Double, ptzi: Double): Int

    public fun SystemTimeToFileTime(lpSystemTime: Double, lpFileTime: Double): Int

    public fun SystemTimeToTzSpecificLocalTime(
        lpTimeZoneInformation: Double,
        lpUniversalTime: Double,
        lpLocalTime: Double,
    ): Int

    public fun TzSpecificLocalTimeToSystemTime(
        lpTimeZoneInformation: Double,
        lpLocalTime: Double,
        lpUniversalTime: Double,
    ): Int

    public fun LockWorkStation(): Int

    public fun DisconnectNamedPipe(hNamedPipe: Double): Int

    // UI / Shell & System / Com
    public fun SHGetKnownFolderPath(rfid: Double, dwFlags: Int, hToken: Double): dynamic

    public fun CoTaskMemFree(pv: Double)

    // Globalization
    public fun lstrlenW(lpString: Double): Int

    public fun GetUserPreferredUILanguages(
        dwFlags: Int,
        pulNumLanguages: Int,
        pwszLanguagesBuffer: Double,
        pcchLanguagesBuffer: Int,
    ): dynamic

    // System / Console
    public fun GetConsoleMode(hConsoleHandle: Double): dynamic

    public fun SetConsoleMode(hConsoleHandle: Double, dwMode: Int): Int

    public fun GetStdHandle(nStdHandle: Int): Double

    public fun GetConsoleScreenBufferInfo(hConsoleOutput: Double, lpConsoleScreenBufferInfo: Double): Int

    public fun SetConsoleTextAttribute(hConsoleOutput: Double, wAttributes: Int): Int

    public fun GetConsoleCursorInfo(hConsoleOutput: Double, lpConsoleCursorInfo: Double): Int

    public fun SetConsoleCursorInfo(hConsoleOutput: Double, lpConsoleCursorInfo: Double): Int

    public fun SetConsoleCursorPosition(hConsoleOutput: Double, x: Int, y: Int): Int

    public fun GetNumberOfConsoleInputEvents(hConsoleInput: Double): dynamic

    public fun ReadConsoleInputW(hConsoleInput: Double, lpBuffer: Double, nLength: Int): dynamic

    // System / LibraryLoader
    public fun LoadLibraryW(lpLibFileName: Double): Double

    public fun GetProcAddress(hModule: Double, lpProcName: Double): Double

    public fun GetModuleHandleW(lpModuleName: Double): Double

    // Storage / FileSystem additions
    public fun GetFullPathNameW(lpFileName: Double, nBufferLength: Int, lpBuffer: Double): dynamic

    public fun GetFileInformationByHandle(hFile: Double, lpFileInformation: Double): Int

    public fun GetFileType(hFile: Double): Int

    // System / SystemInformation
    public fun GetComputerNameExW(nameType: Int, lpBuffer: Double, nSize: Int): dynamic

    public fun isNativeAvailable(): Boolean
}
