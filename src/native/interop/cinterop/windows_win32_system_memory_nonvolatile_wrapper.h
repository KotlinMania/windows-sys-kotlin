#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_MEMORY_NONVOLATILE_WINDOWS_WIN32_SYSTEM_MEMORY_NONVOLATILE_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_MEMORY_NONVOLATILE_WINDOWS_WIN32_SYSTEM_MEMORY_NONVOLATILE_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssysWindowsWin32SystemMemoryNonvolatileRtlDrainNonVolatileFlush(void* nvtoken);
uint32_t windowssysWindowsWin32SystemMemoryNonvolatileRtlFillNonVolatileMemory(void* nvtoken, void* nvdestination, uint64_t size, uint8_t value, uint32_t flags);
uint32_t windowssysWindowsWin32SystemMemoryNonvolatileRtlFlushNonVolatileMemory(void* nvtoken, void* nvbuffer, uint64_t size, uint32_t flags);
uint32_t windowssysWindowsWin32SystemMemoryNonvolatileRtlFlushNonVolatileMemoryRanges(void* nvtoken, void* nvranges, uint64_t numranges, uint32_t flags);
uint32_t windowssysWindowsWin32SystemMemoryNonvolatileRtlFreeNonVolatileToken(void* nvtoken);
uint32_t windowssysWindowsWin32SystemMemoryNonvolatileRtlGetNonVolatileToken(void* nvbuffer, uint64_t size, void* nvtoken);
uint32_t windowssysWindowsWin32SystemMemoryNonvolatileRtlWriteNonVolatileMemory(void* nvtoken, void* nvdestination, void* source, uint64_t size, uint32_t flags);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_MEMORY_NONVOLATILE_WINDOWS_WIN32_SYSTEM_MEMORY_NONVOLATILE_WRAPPER_H */
