#ifndef WINDOWSSYS_WRAPPER_H
#define WINDOWSSYS_WRAPPER_H

#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_is_windows_host(void);
int64_t windowssys_invoke(const char* dll, const char* symbol, int32_t argc, const int64_t* argv, int32_t* status_out);
double windowssys_invoke_fp(const char* dll, const char* symbol, int32_t fp_mask, int32_t ret_f32, int32_t argc, const int64_t* argv, int32_t* status_out);
int64_t windowssys_invoke_ptr(int64_t fn_ptr, int32_t argc, const int64_t* argv, int32_t* status_out);
int64_t windowssys_guid_slot(uint32_t d1, uint16_t d2, uint16_t d3, const uint8_t* d4);
int64_t windowssys_alloc_zeroed(int32_t size);
void windowssys_free_mem(int64_t addr);
void windowssys_read_bytes(int64_t addr, int32_t len, uint8_t* dst);
void windowssys_write_bytes(int64_t addr, int32_t len, const uint8_t* src);

#ifdef __cplusplus
}
#endif

#endif
