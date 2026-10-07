#include <jni.h>
#include <stdint.h>

#ifdef _WIN32
#include <windows.h>
#endif

#ifdef __cplusplus
extern "C" {
#endif

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_CloseHandle
  (JNIEnv *env, jclass cls, jlong hObject) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    return (jint)CloseHandle((HANDLE)(intptr_t)hObject);
#else
    (void)hObject;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_GetLastError
  (JNIEnv *env, jclass cls) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    return (jint)GetLastError();
#else
    return 0;
#endif
}

JNIEXPORT jlong JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_LocalFree
  (JNIEnv *env, jclass cls, jlong hMem) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    return (jlong)(intptr_t)LocalFree((HLOCAL)(intptr_t)hMem);
#else
    (void)hMem;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_SetHandleInformation
  (JNIEnv *env, jclass cls, jlong hObject, jint dwMask, jint dwFlags) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    return (jint)SetHandleInformation((HANDLE)(intptr_t)hObject, (DWORD)dwMask, (DWORD)dwFlags);
#else
    (void)hObject;
    (void)dwMask;
    (void)dwFlags;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_DuplicateHandle
  (JNIEnv *env, jclass cls, jlong hSourceProcessHandle, jlong hSourceHandle, jlong hTargetProcessHandle,
   jlongArray lpTargetHandle, jint dwDesiredAccess, jint bInheritHandle, jint dwOptions) {
    (void)cls;
#ifdef _WIN32
    HANDLE targetHandle = NULL;
    BOOL res = DuplicateHandle(
        (HANDLE)(intptr_t)hSourceProcessHandle,
        (HANDLE)(intptr_t)hSourceHandle,
        (HANDLE)(intptr_t)hTargetProcessHandle,
        &targetHandle,
        (DWORD)dwDesiredAccess,
        (BOOL)bInheritHandle,
        (DWORD)dwOptions
    );
    if (res && lpTargetHandle != NULL) {
        jlong val = (jlong)(intptr_t)targetHandle;
        (*env)->SetLongArrayRegion(env, lpTargetHandle, 0, 1, &val);
    }
    return (jint)res;
#else
    (void)env;
    (void)hSourceProcessHandle;
    (void)hSourceHandle;
    (void)hTargetProcessHandle;
    (void)lpTargetHandle;
    (void)dwDesiredAccess;
    (void)bInheritHandle;
    (void)dwOptions;
    return 0;
#endif
}

JNIEXPORT jint JNICALL Java_io_github_kotlinmania_windowssys_internal_Kernel32Jni_SetFileAttributesW
  (JNIEnv *env, jclass cls, jlong lpFileName, jint dwFileAttributes) {
    (void)env;
    (void)cls;
#ifdef _WIN32
    return (jint)SetFileAttributesW((LPCWSTR)(intptr_t)lpFileName, (DWORD)dwFileAttributes);
#else
    (void)lpFileName;
    (void)dwFileAttributes;
    return 0;
#endif
}

#ifdef __cplusplus
}
#endif
