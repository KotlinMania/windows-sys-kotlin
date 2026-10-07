#include <napi.h>

#if defined(_WIN32) || defined(WIN32)
#define WIN32_LEAN_AND_MEAN
#include <windows.h>
#define IS_WINDOWS 1
#else
#define IS_WINDOWS 0
#endif

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

Napi::Value IsNativeAvailableBinding(const Napi::CallbackInfo& info) {
    Napi::Env env = info.Env();
    return Napi::Boolean::New(env, IS_WINDOWS);
}

Napi::Object Init(Napi::Env env, Napi::Object exports) {
    exports.Set("CloseHandle", Napi::Function::New(env, CloseHandleBinding));
    exports.Set("GetLastError", Napi::Function::New(env, GetLastErrorBinding));
    exports.Set("SetLastError", Napi::Function::New(env, SetLastErrorBinding));
    exports.Set("LocalFree", Napi::Function::New(env, LocalFreeBinding));
    exports.Set("SetHandleInformation", Napi::Function::New(env, SetHandleInformationBinding));
    exports.Set("DuplicateHandle", Napi::Function::New(env, DuplicateHandleBinding));
    exports.Set("isNativeAvailable", Napi::Function::New(env, IsNativeAvailableBinding));
    return exports;
}

NODE_API_MODULE(windows_sys_native, Init)
