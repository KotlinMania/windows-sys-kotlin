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
            CloseHandle: function(_h) { return 1; },
            DuplicateHandle: function(_srcProc, _src, _tgtProc, _tgt, _access, _inherit, _options) { return 1; },
            GetLastError: function() { return 0; },
            SetLastError: function(_err) {},
            LocalFree: function(_ptr) { return 0; },
            SetHandleInformation: function(_h, _mask, _flags) { return 1; },
            GetHandleInformation: function(_h) { return 0; },
            CompareObjectHandles: function(_h1, _h2) { return _h1 === _h2 ? 1 : 0; },
            SetFileAttributesW: function(_path, _attr) { return 1; },
            GetFileAttributesW: function(_path) { return 0; },
            isNativeAvailable: function() { return false; }
        };
    }
}
