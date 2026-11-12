#ifndef WINDOWSSYS_WINDOWS_WIN32_STORAGE_COMPRESSION_WINDOWS_WIN32_STORAGE_COMPRESSION_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_STORAGE_COMPRESSION_WINDOWS_WIN32_STORAGE_COMPRESSION_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32StorageCompressionCloseCompressor(void* compressorhandle);
int32_t windowssysWindowsWin32StorageCompressionCloseDecompressor(void* decompressorhandle);
int32_t windowssysWindowsWin32StorageCompressionCompress(void* compressorhandle, void* uncompresseddata, uint64_t uncompresseddatasize, void* compressedbuffer, uint64_t compressedbuffersize, void* compresseddatasize);
int32_t windowssysWindowsWin32StorageCompressionCreateCompressor(uint32_t algorithm, void* allocationroutines, void* compressorhandle);
int32_t windowssysWindowsWin32StorageCompressionCreateDecompressor(uint32_t algorithm, void* allocationroutines, void* decompressorhandle);
int32_t windowssysWindowsWin32StorageCompressionDecompress(void* decompressorhandle, void* compresseddata, uint64_t compresseddatasize, void* uncompressedbuffer, uint64_t uncompressedbuffersize, void* uncompresseddatasize);
int32_t windowssysWindowsWin32StorageCompressionQueryCompressorInformation(void* compressorhandle, int32_t compressinformationclass, void* compressinformation, uint64_t compressinformationsize);
int32_t windowssysWindowsWin32StorageCompressionQueryDecompressorInformation(void* decompressorhandle, int32_t compressinformationclass, void* compressinformation, uint64_t compressinformationsize);
int32_t windowssysWindowsWin32StorageCompressionResetCompressor(void* compressorhandle);
int32_t windowssysWindowsWin32StorageCompressionResetDecompressor(void* decompressorhandle);
int32_t windowssysWindowsWin32StorageCompressionSetCompressorInformation(void* compressorhandle, int32_t compressinformationclass, void* compressinformation, uint64_t compressinformationsize);
int32_t windowssysWindowsWin32StorageCompressionSetDecompressorInformation(void* decompressorhandle, int32_t compressinformationclass, void* compressinformation, uint64_t compressinformationsize);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_STORAGE_COMPRESSION_WINDOWS_WIN32_STORAGE_COMPRESSION_WRAPPER_H */
