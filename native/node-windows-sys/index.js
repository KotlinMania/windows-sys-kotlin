// Entry point for windows-sys N-API native module
// Shared between Kotlin/JS (nodeMain) and Kotlin/WASM (wasmJsMain via Node.js)
//
// This addon wraps Win32 C/C++ library calls.
// Both JS and WASM targets load the compiled .node binary.

try {
    module.exports = require('./build/Release/windows_sys_native.node');
} catch (err) {
    try {
        module.exports = require('./build/Debug/windows_sys_native.node');
    } catch (err2) {
        // Fallback for non-Windows platforms or mock test environments
        module.exports = {
            // Foundation
            CloseHandle: function(_h) { return 1; },
            GetLastError: function() { return 0; },
            SetLastError: function(_err) {},
            SetLastErrorEx: function(_err, _type) {},
            LocalFree: function(_ptr) { return 0; },
            GlobalFree: function(_ptr) { return 0; },
            FreeLibrary: function(_h) { return 1; },
            SetHandleInformation: function(_h, _mask, _flags) { return 1; },
            GetHandleInformation: function(_h) { return { success: 1, flags: 0 }; },
            CompareObjectHandles: function(h1, h2) { return h1 === h2 ? 1 : 0; },
            DuplicateHandle: function(_srcProc, _src, _tgtProc, _access, _inherit, _options) {
                return { success: 1, targetHandle: 100 };
            },
            RtlNtStatusToDosError: function(_status) { return 0; },
            SysAllocString: function(_psz) { return 0; },
            SysAllocStringByteLen: function(_psz, _len) { return 0; },
            SysAllocStringLen: function(_strIn, _ui) { return 0; },
            SysFreeString: function(_bstr) {},
            SysAddRefString: function(_bstr) { return 0; },
            SysReleaseString: function(_bstr) {},
            SysStringByteLen: function(_bstr) { return 0; },
            SysStringLen: function(_pbstr) { return 0; },

            // Storage / FileSystem
            SetFileAttributesW: function(_path, _attr) { return 1; },
            SetFileAttributesA: function(_path, _attr) { return 1; },
            GetFileAttributesW: function(_path) { return 0; },
            GetFileAttributesA: function(_path) { return 0; },
            DeleteFileW: function(_path) { return 1; },
            DeleteFileA: function(_path) { return 1; },
            FlushFileBuffers: function(_h) { return 1; },
            AreFileApisANSI: function() { return 1; },

            // System / Threading
            GetCurrentProcess: function() { return -1; },
            GetCurrentProcessId: function() { return 0; },
            GetCurrentThread: function() { return -2; },
            GetCurrentThreadId: function() { return 0; },
            TerminateProcess: function(_h, _code) { return 1; },
            ExitProcess: function(_code) {},
            OpenProcess: function(_access, _inherit, _pid) { return 0; },

            // System / ProcessStatus
            K32EmptyWorkingSet: function(_h) { return 1; },

            // System / Time
            GetTimeZoneInformation: function(_tz) { return 0xFFFFFFFF; },
            GetTimeZoneInformationForYear: function(_year, _pdtzi, _ptzi) { return 0; },
            SystemTimeToFileTime: function(_st, _ft) { return 0; },
            SystemTimeToTzSpecificLocalTime: function(_tz, _utc, _local) { return 0; },
            TzSpecificLocalTimeToSystemTime: function(_tz, _local, _utc) { return 0; },

            // System / Shutdown
            LockWorkStation: function() { return 1; },

            // System / Pipes
            DisconnectNamedPipe: function(_h) { return 1; },

            // UI / Shell & System / Com
            SHGetKnownFolderPath: function(_rfid, _flags, _token) { return { hr: -2147467263, path: 0 }; },
            CoTaskMemFree: function(_pv) {},

            // Globalization
            lstrlenW: function(_str) { return 0; },
            GetUserPreferredUILanguages: function(_flags, _num, _buf, _cch) {
                return { success: 0, numLanguages: 0, cchLanguagesBuffer: 0 };
            },

            // System / Console
            GetConsoleMode: function(_h) { return { success: 0, mode: 0 }; },
            SetConsoleMode: function(_h, _mode) { return 0; },
            GetStdHandle: function(_std) { return -1; },
            GetConsoleScreenBufferInfo: function(_h, _info) { return 0; },
            SetConsoleTextAttribute: function(_h, _attr) { return 0; },
            GetConsoleCursorInfo: function(_h, _info) { return 0; },
            SetConsoleCursorInfo: function(_h, _info) { return 0; },
            SetConsoleCursorPosition: function(_h, _x, _y) { return 0; },
            GetNumberOfConsoleInputEvents: function(_h) { return { success: 0, events: 0 }; },
            ReadConsoleInputW: function(_h, _buf, _len) { return { success: 0, eventsRead: 0 }; },

            // System / LibraryLoader
            LoadLibraryW: function(_name) { return 0; },
            GetProcAddress: function(_h, _name) { return 0; },
            GetModuleHandleW: function(_name) { return 0; },

            // Storage / FileSystem additions
            GetFullPathNameW: function(_name, _len, _buf) { return { length: 0, filePart: 0 }; },
            GetFileInformationByHandle: function(_h, _info) { return 0; },
            GetFileType: function(_h) { return 0; },

            // System / SystemInformation
            GetComputerNameExW: function(_type, _buf, _size) { return { success: 0, size: 0 }; },

            // System / Environment
            SetEnvironmentVariableA: function(_name, _val) { return 1; },
            SetEnvironmentVariableW: function(_name, _val) { return 1; },
            GetEnvironmentVariableA: function(_name, _buf, _size) { return 0; },
            GetEnvironmentVariableW: function(_name, _buf, _size) { return 0; },
            ExpandEnvironmentStringsA: function(_src, _dst, _size) { return 0; },
            ExpandEnvironmentStringsW: function(_src, _dst, _size) { return 0; },
            GetEnvironmentStrings: function() { return 0; },
            GetEnvironmentStringsW: function() { return 0; },
            FreeEnvironmentStringsA: function(_ptr) { return 1; },
            FreeEnvironmentStringsW: function(_ptr) { return 1; },
            SetEnvironmentStringsW: function(_ptr) { return 1; },
            GetCurrentDirectoryA: function(_len, _buf) { return 0; },
            GetCurrentDirectoryW: function(_len, _buf) { return 0; },
            SetCurrentDirectoryA: function(_path) { return 1; },
            SetCurrentDirectoryW: function(_path) { return 1; },
            GetCommandLineA: function() { return 0; },
            GetCommandLineW: function() { return 0; },
            NeedCurrentDirectoryForExePathA: function(_exe) { return 0; },
            NeedCurrentDirectoryForExePathW: function(_exe) { return 0; },

            isNativeAvailable: function() { return false; }
        };
    }
}
