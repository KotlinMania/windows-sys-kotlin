#ifndef WINDOWSSYS_WINDOWS_WDK_FOUNDATION_WINDOWS_WDK_FOUNDATION_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WDK_FOUNDATION_WINDOWS_WDK_FOUNDATION_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_wdk_foundation_ntClose(void* handle);
int32_t windowssys_windows_wdk_foundation_ntQueryObject(void* handle, int32_t objectinformationclass, void* objectinformation, uint32_t objectinformationlength, void* returnlength);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WDK_FOUNDATION_WINDOWS_WDK_FOUNDATION_WRAPPER_H */
