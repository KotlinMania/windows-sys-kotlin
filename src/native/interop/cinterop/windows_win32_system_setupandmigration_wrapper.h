#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_SETUPANDMIGRATION_WINDOWS_WIN32_SYSTEM_SETUPANDMIGRATION_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_SETUPANDMIGRATION_WINDOWS_WIN32_SYSTEM_SETUPANDMIGRATION_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32SystemSetupandmigrationOOBEComplete(void* isoobecomplete);
int32_t windowssysWindowsWin32SystemSetupandmigrationRegisterWaitUntilOOBECompleted(void* oobecompletedcallback, void* callbackcontext, void* waithandle);
int32_t windowssysWindowsWin32SystemSetupandmigrationUnregisterWaitUntilOOBECompleted(void* waithandle);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_SETUPANDMIGRATION_WINDOWS_WIN32_SYSTEM_SETUPANDMIGRATION_WRAPPER_H */
