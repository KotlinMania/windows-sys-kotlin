#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_MEMORY_NONVOLATILE_WINDOWS_WIN32_SYSTEM_MEMORY_NONVOLATILE_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_MEMORY_NONVOLATILE_WINDOWS_WIN32_SYSTEM_MEMORY_NONVOLATILE_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssys_windows_win32_system_memory_nonvolatile_rtlDrainNonVolatileFlush(void* nvtoken);
uint32_t windowssys_windows_win32_system_memory_nonvolatile_rtlFillNonVolatileMemory(void* nvtoken, void* nvdestination, uint64_t size, uint8_t value, uint32_t flags);
uint32_t windowssys_windows_win32_system_memory_nonvolatile_rtlFlushNonVolatileMemory(void* nvtoken, void* nvbuffer, uint64_t size, uint32_t flags);
uint32_t windowssys_windows_win32_system_memory_nonvolatile_rtlFlushNonVolatileMemoryRanges(void* nvtoken, void* nvranges, uint64_t numranges, uint32_t flags);
uint32_t windowssys_windows_win32_system_memory_nonvolatile_rtlFreeNonVolatileToken(void* nvtoken);
uint32_t windowssys_windows_win32_system_memory_nonvolatile_rtlGetNonVolatileToken(void* nvbuffer, uint64_t size, void* nvtoken);
uint32_t windowssys_windows_win32_system_memory_nonvolatile_rtlWriteNonVolatileMemory(void* nvtoken, void* nvdestination, void* source, uint64_t size, uint32_t flags);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_MEMORY_NONVOLATILE_WINDOWS_WIN32_SYSTEM_MEMORY_NONVOLATILE_WRAPPER_H */
