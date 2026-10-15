package io.github.kotlinmania.windowssys.internal

internal object Kernel32Jni {
    init {
        try {
            System.loadLibrary("windows_sys_jni")
        } catch (_: UnsatisfiedLinkError) {
            // Native library not in java.library.path
        }
    }

    // --- Foundation Functions ---

    @JvmStatic
    external fun CloseHandle(hObject: Long): Int

    @JvmStatic
    external fun GetLastError(): Int

    @JvmStatic
    external fun SetLastError(dwErrCode: Int)

    @JvmStatic
    external fun SetLastErrorEx(dwErrCode: Int, dwType: Int)

    @JvmStatic
    external fun LocalFree(hMem: Long): Long

    @JvmStatic
    external fun SetHandleInformation(hObject: Long, dwMask: Int, dwFlags: Int): Int

    @JvmStatic
    external fun GetHandleInformation(hObject: Long, lpdwFlags: IntArray): Int

    @JvmStatic
    external fun DuplicateHandle(
        hSourceProcessHandle: Long,
        hSourceHandle: Long,
        hTargetProcessHandle: Long,
        lpTargetHandle: LongArray,
        dwDesiredAccess: Int,
        bInheritHandle: Int,
        dwOptions: Int,
    ): Int

    @JvmStatic
    external fun CompareObjectHandles(hFirstObjectHandle: Long, hSecondObjectHandle: Long): Int

    @JvmStatic
    external fun FreeLibrary(hLibModule: Long): Int

    @JvmStatic
    external fun GlobalFree(hMem: Long): Long

    @JvmStatic
    external fun RtlNtStatusToDosError(status: Int): Int

    @JvmStatic
    external fun SysAllocString(psz: Long): Long

    @JvmStatic
    external fun SysAllocStringByteLen(psz: Long, len: Int): Long

    @JvmStatic
    external fun SysAllocStringLen(strIn: Long, ui: Int): Long

    @JvmStatic
    external fun SysFreeString(bstrString: Long)

    @JvmStatic
    external fun SysReAllocString(pbstr: LongArray, psz: Long): Int

    @JvmStatic
    external fun SysReAllocStringLen(pbstr: LongArray, psz: Long, len: Int): Int

    @JvmStatic
    external fun SysAddRefString(bstrString: Long): Int

    @JvmStatic
    external fun SysReleaseString(bstrString: Long)

    @JvmStatic
    external fun SysStringByteLen(bstr: Long): Int

    @JvmStatic
    external fun SysStringLen(pbstr: Long): Int

    // --- Storage / FileSystem Functions ---

    @JvmStatic
    external fun SetFileAttributesW(lpFileName: Long, dwFileAttributes: Int): Int

    @JvmStatic
    external fun SetFileAttributesA(lpFileName: Long, dwFileAttributes: Int): Int

    @JvmStatic
    external fun GetFileAttributesW(lpFileName: Long): Int

    @JvmStatic
    external fun GetFileAttributesA(lpFileName: Long): Int

    @JvmStatic
    external fun CreateFileW(
        lpFileName: Long,
        dwDesiredAccess: Int,
        dwShareMode: Int,
        lpSecurityAttributes: Long,
        dwCreationDisposition: Int,
        dwFlagsAndAttributes: Int,
        hTemplateFile: Long,
    ): Long

    @JvmStatic
    external fun CreateFileA(
        lpFileName: Long,
        dwDesiredAccess: Int,
        dwShareMode: Int,
        lpSecurityAttributes: Long,
        dwCreationDisposition: Int,
        dwFlagsAndAttributes: Int,
        hTemplateFile: Long,
    ): Long

    @JvmStatic
    external fun DeleteFileW(lpFileName: Long): Int

    @JvmStatic
    external fun DeleteFileA(lpFileName: Long): Int

    @JvmStatic
    external fun FlushFileBuffers(hFile: Long): Int

    @JvmStatic
    external fun AreFileApisANSI(): Int

    @JvmStatic
    external fun GetFileSize(hFile: Long, lpFileSizeHigh: IntArray?): Int

    @JvmStatic
    external fun SetFilePointer(
        hFile: Long,
        lDistanceToMove: Int,
        lpDistanceToMoveHigh: IntArray?,
        dwMoveMethod: Int,
    ): Int

    // --- System / Threading Functions ---

    @JvmStatic
    external fun GetCurrentProcess(): Long

    @JvmStatic
    external fun GetCurrentProcessId(): Int

    @JvmStatic
    external fun GetCurrentThread(): Long

    @JvmStatic
    external fun GetCurrentThreadId(): Int

    @JvmStatic
    external fun TerminateProcess(hProcess: Long, uExitCode: Int): Int

    @JvmStatic
    external fun ExitProcess(uExitCode: Int)

    @JvmStatic
    external fun OpenProcess(dwDesiredAccess: Int, bInheritHandle: Int, dwProcessId: Int): Long

    @JvmStatic
    external fun K32EmptyWorkingSet(hProcess: Long): Int

    @JvmStatic
    external fun GetTimeZoneInformation(lpTimeZoneInformation: Long): Int

    @JvmStatic
    external fun GetTimeZoneInformationStruct(
        outInts: IntArray,
        outStandardName: ShortArray,
        outDaylightName: ShortArray,
    ): Int

    @JvmStatic
    external fun GetTimeZoneInformationForYear(wYear: Int, pdtzi: Long, ptzi: Long): Int

    @JvmStatic
    external fun GetTimeZoneInformationForYearStruct(
        wYear: Int,
        outInts: IntArray,
        outStandardName: ShortArray,
        outDaylightName: ShortArray,
    ): Int

    @JvmStatic
    external fun SystemTimeToFileTime(lpSystemTime: Long, lpFileTime: Long): Int

    @JvmStatic
    external fun SystemTimeToFileTimeStruct(inSystemTime: ShortArray, outFileTime: IntArray): Int

    @JvmStatic
    external fun SystemTimeToTzSpecificLocalTime(
        lpTimeZoneInformation: Long,
        lpUniversalTime: Long,
        lpLocalTime: Long,
    ): Int

    @JvmStatic
    external fun SystemTimeToTzSpecificLocalTimeStruct(
        inUniversalTime: ShortArray,
        outLocalTime: ShortArray,
    ): Int

    @JvmStatic
    external fun TzSpecificLocalTimeToSystemTime(
        lpTimeZoneInformation: Long,
        lpLocalTime: Long,
        lpUniversalTime: Long,
    ): Int

    @JvmStatic
    external fun TzSpecificLocalTimeToSystemTimeStruct(
        inLocalTime: ShortArray,
        outUniversalTime: ShortArray,
    ): Int

    @JvmStatic
    external fun LockWorkStation(): Int

    @JvmStatic
    external fun DisconnectNamedPipe(hNamedPipe: Long): Int

    // --- UI / Shell & System / Com ---

    @JvmStatic
    external fun SHGetKnownFolderPath(
        rfid: Long,
        dwFlags: Int,
        hToken: Long,
        ppszPath: LongArray,
    ): Int

    @JvmStatic
    external fun SHGetKnownFolderPathGuid(
        data1: Int,
        data2: Short,
        data3: Short,
        data4: ByteArray,
        dwFlags: Int,
        hToken: Long,
        ppszPath: LongArray,
    ): Int

    @JvmStatic
    external fun CoTaskMemFree(pv: Long)

    // --- Globalization ---

    @JvmStatic
    external fun lstrlenW(lpString: Long): Int

    @JvmStatic
    external fun GetUserPreferredUILanguages(
        dwFlags: Int,
        pulNumLanguages: IntArray,
        pwszLanguagesBuffer: Long,
        pcchLanguagesBuffer: IntArray,
    ): Int

    @JvmStatic
    external fun GetUserPreferredUILanguagesBuffer(
        dwFlags: Int,
        pulNumLanguages: IntArray,
        pwszLanguagesBuffer: ShortArray?,
        pcchLanguagesBuffer: IntArray,
    ): Int

    // --- System / Console ---

    @JvmStatic
    external fun GetConsoleMode(hConsoleHandle: Long, lpMode: IntArray): Int

    @JvmStatic
    external fun GetConsoleModePtr(hConsoleHandle: Long, lpMode: Long): Int

    @JvmStatic
    external fun SetConsoleMode(hConsoleHandle: Long, dwMode: Int): Int

    @JvmStatic
    external fun GetStdHandle(nStdHandle: Int): Long

    @JvmStatic
    external fun GetConsoleScreenBufferInfo(hConsoleOutput: Long, lpConsoleScreenBufferInfo: Long): Int

    @JvmStatic
    external fun GetConsoleScreenBufferInfoStruct(hConsoleOutput: Long, outFields: IntArray): Int

    @JvmStatic
    external fun SetConsoleTextAttribute(hConsoleOutput: Long, wAttributes: Int): Int

    @JvmStatic
    external fun GetConsoleCursorInfo(hConsoleOutput: Long, lpConsoleCursorInfo: Long): Int

    @JvmStatic
    external fun GetConsoleCursorInfoStruct(hConsoleOutput: Long, outFields: IntArray): Int

    @JvmStatic
    external fun SetConsoleCursorInfo(hConsoleOutput: Long, lpConsoleCursorInfo: Long): Int

    @JvmStatic
    external fun SetConsoleCursorInfoStruct(hConsoleOutput: Long, dwSize: Int, bVisible: Int): Int

    @JvmStatic
    external fun SetConsoleCursorPosition(hConsoleOutput: Long, x: Short, y: Short): Int

    @JvmStatic
    external fun GetNumberOfConsoleInputEvents(hConsoleInput: Long, lpcNumberOfEvents: IntArray): Int

    @JvmStatic
    external fun GetNumberOfConsoleInputEventsPtr(hConsoleInput: Long, lpcNumberOfEvents: Long): Int

    @JvmStatic
    external fun ReadConsoleInputW(
        hConsoleInput: Long,
        lpBuffer: Long,
        nLength: Int,
        lpNumberOfEventsRead: IntArray,
    ): Int

    // --- System / LibraryLoader ---

    @JvmStatic
    external fun LoadLibraryW(lpLibFileName: Long): Long

    @JvmStatic
    external fun GetProcAddress(hModule: Long, lpProcName: Long): Long

    @JvmStatic
    external fun GetModuleHandleW(lpModuleName: Long): Long

    // --- Storage / FileSystem additions ---

    @JvmStatic
    external fun GetFullPathNameW(
        lpFileName: Long,
        nBufferLength: Int,
        lpBuffer: Long,
        lpFilePart: LongArray?,
    ): Int

    @JvmStatic
    external fun GetFullPathNameWBuffer(
        lpFileName: ShortArray,
        nBufferLength: Int,
        lpBuffer: ShortArray?,
        lpFilePart: LongArray?,
    ): Int

    @JvmStatic
    external fun GetFileInformationByHandle(hFile: Long, lpFileInformation: Long): Int

    @JvmStatic
    external fun GetFileInformationByHandleStruct(hFile: Long, outFields: IntArray): Int

    @JvmStatic
    external fun GetFileType(hFile: Long): Int

    // --- System / SystemInformation ---

    @JvmStatic
    external fun GetComputerNameExW(
        nameType: Int,
        lpBuffer: Long,
        nSize: IntArray,
    ): Int

    @JvmStatic
    external fun GetComputerNameExWBuffer(
        nameType: Int,
        lpBuffer: ShortArray?,
        nSize: IntArray,
    ): Int
}
