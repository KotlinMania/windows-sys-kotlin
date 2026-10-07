#include <napi.h>

#if defined(_WIN32) || defined(WIN32)
#define WIN32_LEAN_AND_MEAN
#include <windows.h>
#include <oleauto.h>
#include <winternl.h>
#define IS_WINDOWS 1

#ifndef RtlNtStatusToDosError
extern "C" ULONG NTAPI RtlNtStatusToDosError(NTSTATUS Status);
#endif
#ifndef CompareObjectHandles
extern "C" BOOL WINAPI CompareObjectHandles(HANDLE hFirstObjectHandle, HANDLE hSecondObjectHandle);
#endif

#else
#define IS_WINDOWS 0
#endif

/* --- Foundation Bindings --- */

Napi::Value CloseHandleBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 1) {
        Napi::TypeError::New(env, "Handle argument required").ThrowAsJavaScriptException();
        return env.Null();
    }
    int64_t handleVal = info[0].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    BOOL result = CloseHandle(reinterpret_cast<HANDLE>(static_cast<intptr_t>(handleVal)));
    return Napi::Number::New(env, result);
#else
    (void)handleVal;
    return Napi::Number::New(env, 1);
#endif
}

Napi::Value GetLastErrorBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
#if IS_WINDOWS
    DWORD err = GetLastError();
    return Napi::Number::New(env, static_cast<uint32_t>(err));
#else
    return Napi::Number::New(env, 0);
#endif
}

Napi::Value SetLastErrorBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() >= 1) {
        uint32_t err = info[0].As<Napi::Number>().Uint32Value();
#if IS_WINDOWS
        SetLastError(err);
#else
        (void)err;
#endif
    }
    return env.Undefined();
}

Napi::Value SetLastErrorExBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() >= 2) {
        uint32_t err = info[0].As<Napi::Number>().Uint32Value();
        uint32_t type = info[1].As<Napi::Number>().Uint32Value();
#if IS_WINDOWS
        SetLastErrorEx(err, type);
#else
        (void)err; (void)type;
#endif
    }
    return env.Undefined();
}

Napi::Value LocalFreeBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 1) {
        return env.Null();
    }
    int64_t ptrVal = info[0].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    HLOCAL res = LocalFree(reinterpret_cast<HLOCAL>(static_cast<intptr_t>(ptrVal)));
    return Napi::Number::New(env, reinterpret_cast<intptr_t>(res));
#else
    (void)ptrVal;
    return Napi::Number::New(env, 0);
#endif
}

Napi::Value GlobalFreeBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 1) return Napi::Number::New(env, 0);
    int64_t ptrVal = info[0].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    HGLOBAL res = GlobalFree(reinterpret_cast<HGLOBAL>(static_cast<intptr_t>(ptrVal)));
    return Napi::Number::New(env, reinterpret_cast<intptr_t>(res));
#else
    (void)ptrVal;
    return Napi::Number::New(env, 0);
#endif
}

Napi::Value FreeLibraryBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 1) return Napi::Number::New(env, 0);
    int64_t h = info[0].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    BOOL result = FreeLibrary(reinterpret_cast<HMODULE>(static_cast<intptr_t>(h)));
    return Napi::Number::New(env, result);
#else
    (void)h;
    return Napi::Number::New(env, 1);
#endif
}

Napi::Value SetHandleInformationBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 3) {
        Napi::TypeError::New(env, "3 arguments required: handle, mask, flags").ThrowAsJavaScriptException();
        return env.Null();
    }
    int64_t handleVal = info[0].As<Napi::Number>().Int64Value();
    uint32_t mask = info[1].As<Napi::Number>().Uint32Value();
    uint32_t flags = info[2].As<Napi::Number>().Uint32Value();
#if IS_WINDOWS
    BOOL result = SetHandleInformation(
        reinterpret_cast<HANDLE>(static_cast<intptr_t>(handleVal)),
        static_cast<DWORD>(mask),
        static_cast<DWORD>(flags)
    );
    return Napi::Number::New(env, result);
#else
    (void)handleVal; (void)mask; (void)flags;
    return Napi::Number::New(env, 1);
#endif
}

Napi::Value GetHandleInformationBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 1) return env.Null();
    int64_t handleVal = info[0].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    DWORD flags = 0;
    BOOL result = GetHandleInformation(reinterpret_cast<HANDLE>(static_cast<intptr_t>(handleVal)), &flags);
    Napi::Object obj = Napi::Object::New(env);
    obj.Set("success", Napi::Number::New(env, result));
    obj.Set("flags", Napi::Number::New(env, flags));
    return obj;
#else
    (void)handleVal;
    Napi::Object obj = Napi::Object::New(env);
    obj.Set("success", Napi::Number::New(env, 1));
    obj.Set("flags", Napi::Number::New(env, 0));
    return obj;
#endif
}

Napi::Value CompareObjectHandlesBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 2) return Napi::Number::New(env, 0);
    int64_t h1 = info[0].As<Napi::Number>().Int64Value();
    int64_t h2 = info[1].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    BOOL result = CompareObjectHandles(
        reinterpret_cast<HANDLE>(static_cast<intptr_t>(h1)),
        reinterpret_cast<HANDLE>(static_cast<intptr_t>(h2))
    );
    return Napi::Number::New(env, result);
#else
    return Napi::Number::New(env, h1 == h2 ? 1 : 0);
#endif
}

Napi::Value DuplicateHandleBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 6) {
        Napi::TypeError::New(env, "Arguments required for DuplicateHandle").ThrowAsJavaScriptException();
        return env.Null();
    }
    int64_t hSourceProcess = info[0].As<Napi::Number>().Int64Value();
    int64_t hSource = info[1].As<Napi::Number>().Int64Value();
    int64_t hTargetProcess = info[2].As<Napi::Number>().Int64Value();
    uint32_t dwDesiredAccess = info[3].As<Napi::Number>().Uint32Value();
    bool bInheritHandle = info[4].As<Napi::Boolean>().Value();
    uint32_t dwOptions = info[5].As<Napi::Number>().Uint32Value();

#if IS_WINDOWS
    HANDLE targetHandle = NULL;
    BOOL result = DuplicateHandle(
        reinterpret_cast<HANDLE>(static_cast<intptr_t>(hSourceProcess)),
        reinterpret_cast<HANDLE>(static_cast<intptr_t>(hSource)),
        reinterpret_cast<HANDLE>(static_cast<intptr_t>(hTargetProcess)),
        &targetHandle,
        static_cast<DWORD>(dwDesiredAccess),
        bInheritHandle ? TRUE : FALSE,
        static_cast<DWORD>(dwOptions)
    );
    Napi::Object obj = Napi::Object::New(env);
    obj.Set("success", Napi::Number::New(env, result));
    obj.Set("targetHandle", Napi::Number::New(env, reinterpret_cast<intptr_t>(targetHandle)));
    return obj;
#else
    (void)hSourceProcess; (void)hSource; (void)hTargetProcess;
    (void)dwDesiredAccess; (void)bInheritHandle; (void)dwOptions;
    Napi::Object obj = Napi::Object::New(env);
    obj.Set("success", Napi::Number::New(env, 1));
    obj.Set("targetHandle", Napi::Number::New(env, 100));
    return obj;
#endif
}

Napi::Value RtlNtStatusToDosErrorBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 1) return Napi::Number::New(env, 0);
    int32_t status = info[0].As<Napi::Number>().Int32Value();
#if IS_WINDOWS
    ULONG err = RtlNtStatusToDosError(static_cast<NTSTATUS>(status));
    return Napi::Number::New(env, static_cast<uint32_t>(err));
#else
    (void)status;
    return Napi::Number::New(env, 0);
#endif
}

Napi::Value SysAllocStringBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 1) return Napi::Number::New(env, 0);
    int64_t psz = info[0].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    BSTR res = SysAllocString(reinterpret_cast<const OLECHAR*>(static_cast<intptr_t>(psz)));
    return Napi::Number::New(env, reinterpret_cast<intptr_t>(res));
#else
    (void)psz;
    return Napi::Number::New(env, 0);
#endif
}

Napi::Value SysAllocStringByteLenBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 2) return Napi::Number::New(env, 0);
    int64_t psz = info[0].As<Napi::Number>().Int64Value();
    uint32_t len = info[1].As<Napi::Number>().Uint32Value();
#if IS_WINDOWS
    BSTR res = SysAllocStringByteLen(reinterpret_cast<LPCSTR>(static_cast<intptr_t>(psz)), len);
    return Napi::Number::New(env, reinterpret_cast<intptr_t>(res));
#else
    (void)psz; (void)len;
    return Napi::Number::New(env, 0);
#endif
}

Napi::Value SysAllocStringLenBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 2) return Napi::Number::New(env, 0);
    int64_t strIn = info[0].As<Napi::Number>().Int64Value();
    uint32_t ui = info[1].As<Napi::Number>().Uint32Value();
#if IS_WINDOWS
    BSTR res = SysAllocStringLen(reinterpret_cast<const OLECHAR*>(static_cast<intptr_t>(strIn)), ui);
    return Napi::Number::New(env, reinterpret_cast<intptr_t>(res));
#else
    (void)strIn; (void)ui;
    return Napi::Number::New(env, 0);
#endif
}

Napi::Value SysFreeStringBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() >= 1) {
        int64_t bstr = info[0].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
        SysFreeString(reinterpret_cast<BSTR>(static_cast<intptr_t>(bstr)));
#else
        (void)bstr;
#endif
    }
    return env.Undefined();
}

Napi::Value SysAddRefStringBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 1) return Napi::Number::New(env, 0);
    int64_t bstr = info[0].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    HRESULT hr = SysAddRefString(reinterpret_cast<BSTR>(static_cast<intptr_t>(bstr)));
    return Napi::Number::New(env, hr);
#else
    (void)bstr;
    return Napi::Number::New(env, 0);
#endif
}

Napi::Value SysReleaseStringBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() >= 1) {
        int64_t bstr = info[0].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
        SysReleaseString(reinterpret_cast<BSTR>(static_cast<intptr_t>(bstr)));
#else
        (void)bstr;
#endif
    }
    return env.Undefined();
}

Napi::Value SysStringByteLenBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 1) return Napi::Number::New(env, 0);
    int64_t bstr = info[0].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    UINT len = SysStringByteLen(reinterpret_cast<BSTR>(static_cast<intptr_t>(bstr)));
    return Napi::Number::New(env, len);
#else
    (void)bstr;
    return Napi::Number::New(env, 0);
#endif
}

Napi::Value SysStringLenBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 1) return Napi::Number::New(env, 0);
    int64_t pbstr = info[0].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    UINT len = SysStringLen(reinterpret_cast<BSTR>(static_cast<intptr_t>(pbstr)));
    return Napi::Number::New(env, len);
#else
    (void)pbstr;
    return Napi::Number::New(env, 0);
#endif
}

/* --- Storage / FileSystem Bindings --- */

Napi::Value SetFileAttributesWBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 2) return Napi::Number::New(env, 0);
    int64_t path = info[0].As<Napi::Number>().Int64Value();
    uint32_t attr = info[1].As<Napi::Number>().Uint32Value();
#if IS_WINDOWS
    BOOL res = SetFileAttributesW(reinterpret_cast<LPCWSTR>(static_cast<intptr_t>(path)), attr);
    return Napi::Number::New(env, res);
#else
    (void)path; (void)attr;
    return Napi::Number::New(env, 1);
#endif
}

Napi::Value SetFileAttributesABinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 2) return Napi::Number::New(env, 0);
    int64_t path = info[0].As<Napi::Number>().Int64Value();
    uint32_t attr = info[1].As<Napi::Number>().Uint32Value();
#if IS_WINDOWS
    BOOL res = SetFileAttributesA(reinterpret_cast<LPCSTR>(static_cast<intptr_t>(path)), attr);
    return Napi::Number::New(env, res);
#else
    (void)path; (void)attr;
    return Napi::Number::New(env, 1);
#endif
}

Napi::Value GetFileAttributesWBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 1) return Napi::Number::New(env, -1);
    int64_t path = info[0].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    DWORD res = GetFileAttributesW(reinterpret_cast<LPCWSTR>(static_cast<intptr_t>(path)));
    return Napi::Number::New(env, static_cast<uint32_t>(res));
#else
    (void)path;
    return Napi::Number::New(env, -1);
#endif
}

Napi::Value GetFileAttributesABinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 1) return Napi::Number::New(env, -1);
    int64_t path = info[0].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    DWORD res = GetFileAttributesA(reinterpret_cast<LPCSTR>(static_cast<intptr_t>(path)));
    return Napi::Number::New(env, static_cast<uint32_t>(res));
#else
    (void)path;
    return Napi::Number::New(env, -1);
#endif
}

Napi::Value DeleteFileWBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 1) return Napi::Number::New(env, 0);
    int64_t path = info[0].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    BOOL res = DeleteFileW(reinterpret_cast<LPCWSTR>(static_cast<intptr_t>(path)));
    return Napi::Number::New(env, res);
#else
    (void)path;
    return Napi::Number::New(env, 1);
#endif
}

Napi::Value DeleteFileABinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 1) return Napi::Number::New(env, 0);
    int64_t path = info[0].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    BOOL res = DeleteFileA(reinterpret_cast<LPCSTR>(static_cast<intptr_t>(path)));
    return Napi::Number::New(env, res);
#else
    (void)path;
    return Napi::Number::New(env, 1);
#endif
}

Napi::Value FlushFileBuffersBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 1) return Napi::Number::New(env, 0);
    int64_t h = info[0].As<Napi::Number>().Int64Value();
#if IS_WINDOWS
    BOOL res = FlushFileBuffers(reinterpret_cast<HANDLE>(static_cast<intptr_t>(h)));
    return Napi::Number::New(env, res);
#else
    (void)h;
    return Napi::Number::New(env, 1);
#endif
}

Napi::Value AreFileApisANSIBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
#if IS_WINDOWS
    BOOL res = AreFileApisANSI();
    return Napi::Number::New(env, res);
#else
    return Napi::Number::New(env, 1);
#endif
}

/* --- System / Threading Bindings --- */

Napi::Value GetCurrentProcessBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
#if IS_WINDOWS
    HANDLE h = GetCurrentProcess();
    return Napi::Number::New(env, reinterpret_cast<intptr_t>(h));
#else
    return Napi::Number::New(env, -1);
#endif
}

Napi::Value GetCurrentProcessIdBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
#if IS_WINDOWS
    DWORD pid = GetCurrentProcessId();
    return Napi::Number::New(env, pid);
#else
    return Napi::Number::New(env, 0);
#endif
}

Napi::Value GetCurrentThreadBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
#if IS_WINDOWS
    HANDLE h = GetCurrentThread();
    return Napi::Number::New(env, reinterpret_cast<intptr_t>(h));
#else
    return Napi::Number::New(env, -2);
#endif
}

Napi::Value GetCurrentThreadIdBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
#if IS_WINDOWS
    DWORD tid = GetCurrentThreadId();
    return Napi::Number::New(env, tid);
#else
    return Napi::Number::New(env, 0);
#endif
}

Napi::Value TerminateProcessBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 2) return Napi::Number::New(env, 0);
    int64_t h = info[0].As<Napi::Number>().Int64Value();
    uint32_t code = info[1].As<Napi::Number>().Uint32Value();
#if IS_WINDOWS
    BOOL res = TerminateProcess(reinterpret_cast<HANDLE>(static_cast<intptr_t>(h)), code);
    return Napi::Number::New(env, res);
#else
    (void)h; (void)code;
    return Napi::Number::New(env, 1);
#endif
}

Napi::Value ExitProcessBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() >= 1) {
        uint32_t code = info[0].As<Napi::Number>().Uint32Value();
#if IS_WINDOWS
        ExitProcess(code);
#else
        (void)code;
#endif
    }
    return env.Undefined();
}

Napi::Value OpenProcessBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    if (info.Length() < 3) return Napi::Number::New(env, 0);
    uint32_t access = info[0].As<Napi::Number>().Uint32Value();
    bool inherit = info[1].As<Napi::Boolean>().Value();
    uint32_t pid = info[2].As<Napi::Number>().Uint32Value();
#if IS_WINDOWS
    HANDLE h = OpenProcess(access, inherit ? TRUE : FALSE, pid);
    return Napi::Number::New(env, reinterpret_cast<intptr_t>(h));
#else
    (void)access; (void)inherit; (void)pid;
    return Napi::Number::New(env, 0);
#endif
}

Napi::Value IsNativeAvailableBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    return Napi::Boolean::New(env, IS_WINDOWS);
}

Napi::Object Init(Napi::Env env, Napi::Object exports) {
    // Foundation
    exports.Set("CloseHandle", Napi::Function::New(env, CloseHandleBinding));
    exports.Set("GetLastError", Napi::Function::New(env, GetLastErrorBinding));
    exports.Set("SetLastError", Napi::Function::New(env, SetLastErrorBinding));
    exports.Set("SetLastErrorEx", Napi::Function::New(env, SetLastErrorExBinding));
    exports.Set("LocalFree", Napi::Function::New(env, LocalFreeBinding));
    exports.Set("GlobalFree", Napi::Function::New(env, GlobalFreeBinding));
    exports.Set("FreeLibrary", Napi::Function::New(env, FreeLibraryBinding));
    exports.Set("SetHandleInformation", Napi::Function::New(env, SetHandleInformationBinding));
    exports.Set("GetHandleInformation", Napi::Function::New(env, GetHandleInformationBinding));
    exports.Set("CompareObjectHandles", Napi::Function::New(env, CompareObjectHandlesBinding));
    exports.Set("DuplicateHandle", Napi::Function::New(env, DuplicateHandleBinding));
    exports.Set("RtlNtStatusToDosError", Napi::Function::New(env, RtlNtStatusToDosErrorBinding));
    exports.Set("SysAllocString", Napi::Function::New(env, SysAllocStringBinding));
    exports.Set("SysAllocStringByteLen", Napi::Function::New(env, SysAllocStringByteLenBinding));
    exports.Set("SysAllocStringLen", Napi::Function::New(env, SysAllocStringLenBinding));
    exports.Set("SysFreeString", Napi::Function::New(env, SysFreeStringBinding));
    exports.Set("SysAddRefString", Napi::Function::New(env, SysAddRefStringBinding));
    exports.Set("SysReleaseString", Napi::Function::New(env, SysReleaseStringBinding));
    exports.Set("SysStringByteLen", Napi::Function::New(env, SysStringByteLenBinding));
    exports.Set("SysStringLen", Napi::Function::New(env, SysStringLenBinding));

    // Storage / FileSystem
    exports.Set("SetFileAttributesW", Napi::Function::New(env, SetFileAttributesWBinding));
    exports.Set("SetFileAttributesA", Napi::Function::New(env, SetFileAttributesABinding));
    exports.Set("GetFileAttributesW", Napi::Function::New(env, GetFileAttributesWBinding));
    exports.Set("GetFileAttributesA", Napi::Function::New(env, GetFileAttributesABinding));
    exports.Set("DeleteFileW", Napi::Function::New(env, DeleteFileWBinding));
    exports.Set("DeleteFileA", Napi::Function::New(env, DeleteFileABinding));
    exports.Set("FlushFileBuffers", Napi::Function::New(env, FlushFileBuffersBinding));
    exports.Set("AreFileApisANSI", Napi::Function::New(env, AreFileApisANSIBinding));

    // System / Threading
    exports.Set("GetCurrentProcess", Napi::Function::New(env, GetCurrentProcessBinding));
    exports.Set("GetCurrentProcessId", Napi::Function::New(env, GetCurrentProcessIdBinding));
    exports.Set("GetCurrentThread", Napi::Function::New(env, GetCurrentThreadBinding));
    exports.Set("GetCurrentThreadId", Napi::Function::New(env, GetCurrentThreadIdBinding));
    exports.Set("TerminateProcess", Napi::Function::New(env, TerminateProcessBinding));
    exports.Set("ExitProcess", Napi::Function::New(env, ExitProcessBinding));
    exports.Set("OpenProcess", Napi::Function::New(env, OpenProcessBinding));

    exports.Set("isNativeAvailable", Napi::Function::New(env, IsNativeAvailableBinding));
    return exports;
}

NODE_API_MODULE(windows_sys_native, Init)
