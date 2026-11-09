#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_SETUPANDMIGRATION_WINDOWS_WIN32_SYSTEM_SETUPANDMIGRATION_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_SETUPANDMIGRATION_WINDOWS_WIN32_SYSTEM_SETUPANDMIGRATION_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_setupandmigration_OOBEComplete(void* isoobecomplete);
int32_t windowssys_windows_win32_system_setupandmigration_RegisterWaitUntilOOBECompleted(void* oobecompletedcallback, void* callbackcontext, void* waithandle);
int32_t windowssys_windows_win32_system_setupandmigration_UnregisterWaitUntilOOBECompleted(void* waithandle);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_SETUPANDMIGRATION_WINDOWS_WIN32_SYSTEM_SETUPANDMIGRATION_WRAPPER_H */
