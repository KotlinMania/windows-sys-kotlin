#ifndef WINDOWSSYS_WINDOWS_WIN32_STORAGE_OPERATIONRECORDER_WINDOWS_WIN32_STORAGE_OPERATIONRECORDER_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_STORAGE_OPERATIONRECORDER_WINDOWS_WIN32_STORAGE_OPERATIONRECORDER_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_storage_operationrecorder_OperationEnd(void* operationendparams);
int32_t windowssys_windows_win32_storage_operationrecorder_OperationStart(void* operationstartparams);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_STORAGE_OPERATIONRECORDER_WINDOWS_WIN32_STORAGE_OPERATIONRECORDER_WRAPPER_H */
