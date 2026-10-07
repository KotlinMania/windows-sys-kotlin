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

            isNativeAvailable: function() { return false; }
        };
    }
}
