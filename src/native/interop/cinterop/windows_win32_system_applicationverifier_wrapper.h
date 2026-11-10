#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_APPLICATIONVERIFIER_WINDOWS_WIN32_SYSTEM_APPLICATIONVERIFIER_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_APPLICATIONVERIFIER_WINDOWS_WIN32_SYSTEM_APPLICATIONVERIFIER_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssys_windows_win32_system_applicationverifier_verifierEnumerateResource(void* process, uint32_t flags, uint32_t resourcetype, void* resourcecallback, void* enumerationcontext);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_APPLICATIONVERIFIER_WINDOWS_WIN32_SYSTEM_APPLICATIONVERIFIER_WRAPPER_H */
