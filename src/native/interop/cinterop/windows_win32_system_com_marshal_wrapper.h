#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_COM_MARSHAL_WINDOWS_WIN32_SYSTEM_COM_MARSHAL_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_COM_MARSHAL_WINDOWS_WIN32_SYSTEM_COM_MARSHAL_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void windowssys_windows_win32_system_com_marshal_BSTR_UserFree(void* param0, void* param1);
void windowssys_windows_win32_system_com_marshal_BSTR_UserFree64(void* param0, void* param1);
void* windowssys_windows_win32_system_com_marshal_BSTR_UserMarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_BSTR_UserMarshal64(void* param0, void* param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_BSTR_UserSize(void* param0, uint32_t param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_BSTR_UserSize64(void* param0, uint32_t param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_BSTR_UserUnmarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_BSTR_UserUnmarshal64(void* param0, void* param1, void* param2);
void windowssys_windows_win32_system_com_marshal_CLIPFORMAT_UserFree(void* param0, void* param1);
void windowssys_windows_win32_system_com_marshal_CLIPFORMAT_UserFree64(void* param0, void* param1);
void* windowssys_windows_win32_system_com_marshal_CLIPFORMAT_UserMarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_CLIPFORMAT_UserMarshal64(void* param0, void* param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_CLIPFORMAT_UserSize(void* param0, uint32_t param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_CLIPFORMAT_UserSize64(void* param0, uint32_t param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_CLIPFORMAT_UserUnmarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_CLIPFORMAT_UserUnmarshal64(void* param0, void* param1, void* param2);
int32_t windowssys_windows_win32_system_com_marshal_CoGetMarshalSizeMax(void* pulsize, void* riid, void* punk, uint32_t dwdestcontext, void* pvdestcontext, uint32_t mshlflags);
int32_t windowssys_windows_win32_system_com_marshal_CoGetStandardMarshal(void* riid, void* punk, uint32_t dwdestcontext, void* pvdestcontext, uint32_t mshlflags, void* ppmarshal);
int32_t windowssys_windows_win32_system_com_marshal_CoGetStdMarshalEx(void* punkouter, uint32_t smexflags, void* ppunkinner);
int32_t windowssys_windows_win32_system_com_marshal_CoMarshalHresult(void* pstm, int32_t hresult);
int32_t windowssys_windows_win32_system_com_marshal_CoMarshalInterThreadInterfaceInStream(void* riid, void* punk, void* ppstm);
int32_t windowssys_windows_win32_system_com_marshal_CoMarshalInterface(void* pstm, void* riid, void* punk, uint32_t dwdestcontext, void* pvdestcontext, uint32_t mshlflags);
int32_t windowssys_windows_win32_system_com_marshal_CoReleaseMarshalData(void* pstm);
int32_t windowssys_windows_win32_system_com_marshal_CoUnmarshalHresult(void* pstm, void* phresult);
int32_t windowssys_windows_win32_system_com_marshal_CoUnmarshalInterface(void* pstm, void* riid, void* ppv);
void windowssys_windows_win32_system_com_marshal_HACCEL_UserFree(void* param0, void* param1);
void windowssys_windows_win32_system_com_marshal_HACCEL_UserFree64(void* param0, void* param1);
void* windowssys_windows_win32_system_com_marshal_HACCEL_UserMarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_HACCEL_UserMarshal64(void* param0, void* param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_HACCEL_UserSize(void* param0, uint32_t param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_HACCEL_UserSize64(void* param0, uint32_t param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_HACCEL_UserUnmarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_HACCEL_UserUnmarshal64(void* param0, void* param1, void* param2);
void windowssys_windows_win32_system_com_marshal_HBITMAP_UserFree(void* param0, void* param1);
void windowssys_windows_win32_system_com_marshal_HBITMAP_UserFree64(void* param0, void* param1);
void* windowssys_windows_win32_system_com_marshal_HBITMAP_UserMarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_HBITMAP_UserMarshal64(void* param0, void* param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_HBITMAP_UserSize(void* param0, uint32_t param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_HBITMAP_UserSize64(void* param0, uint32_t param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_HBITMAP_UserUnmarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_HBITMAP_UserUnmarshal64(void* param0, void* param1, void* param2);
void windowssys_windows_win32_system_com_marshal_HDC_UserFree(void* param0, void* param1);
void windowssys_windows_win32_system_com_marshal_HDC_UserFree64(void* param0, void* param1);
void* windowssys_windows_win32_system_com_marshal_HDC_UserMarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_HDC_UserMarshal64(void* param0, void* param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_HDC_UserSize(void* param0, uint32_t param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_HDC_UserSize64(void* param0, uint32_t param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_HDC_UserUnmarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_HDC_UserUnmarshal64(void* param0, void* param1, void* param2);
void windowssys_windows_win32_system_com_marshal_HGLOBAL_UserFree(void* param0, void* param1);
void windowssys_windows_win32_system_com_marshal_HGLOBAL_UserFree64(void* param0, void* param1);
void* windowssys_windows_win32_system_com_marshal_HGLOBAL_UserMarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_HGLOBAL_UserMarshal64(void* param0, void* param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_HGLOBAL_UserSize(void* param0, uint32_t param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_HGLOBAL_UserSize64(void* param0, uint32_t param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_HGLOBAL_UserUnmarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_HGLOBAL_UserUnmarshal64(void* param0, void* param1, void* param2);
void windowssys_windows_win32_system_com_marshal_HICON_UserFree(void* param0, void* param1);
void windowssys_windows_win32_system_com_marshal_HICON_UserFree64(void* param0, void* param1);
void* windowssys_windows_win32_system_com_marshal_HICON_UserMarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_HICON_UserMarshal64(void* param0, void* param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_HICON_UserSize(void* param0, uint32_t param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_HICON_UserSize64(void* param0, uint32_t param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_HICON_UserUnmarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_HICON_UserUnmarshal64(void* param0, void* param1, void* param2);
void windowssys_windows_win32_system_com_marshal_HMENU_UserFree(void* param0, void* param1);
void windowssys_windows_win32_system_com_marshal_HMENU_UserFree64(void* param0, void* param1);
void* windowssys_windows_win32_system_com_marshal_HMENU_UserMarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_HMENU_UserMarshal64(void* param0, void* param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_HMENU_UserSize(void* param0, uint32_t param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_HMENU_UserSize64(void* param0, uint32_t param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_HMENU_UserUnmarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_HMENU_UserUnmarshal64(void* param0, void* param1, void* param2);
void windowssys_windows_win32_system_com_marshal_HPALETTE_UserFree(void* param0, void* param1);
void windowssys_windows_win32_system_com_marshal_HPALETTE_UserFree64(void* param0, void* param1);
void* windowssys_windows_win32_system_com_marshal_HPALETTE_UserMarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_HPALETTE_UserMarshal64(void* param0, void* param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_HPALETTE_UserSize(void* param0, uint32_t param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_HPALETTE_UserSize64(void* param0, uint32_t param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_HPALETTE_UserUnmarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_HPALETTE_UserUnmarshal64(void* param0, void* param1, void* param2);
void windowssys_windows_win32_system_com_marshal_HWND_UserFree(void* param0, void* param1);
void windowssys_windows_win32_system_com_marshal_HWND_UserFree64(void* param0, void* param1);
void* windowssys_windows_win32_system_com_marshal_HWND_UserMarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_HWND_UserMarshal64(void* param0, void* param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_HWND_UserSize(void* param0, uint32_t param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_HWND_UserSize64(void* param0, uint32_t param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_HWND_UserUnmarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_HWND_UserUnmarshal64(void* param0, void* param1, void* param2);
void windowssys_windows_win32_system_com_marshal_LPSAFEARRAY_UserFree(void* param0, void* param1);
void windowssys_windows_win32_system_com_marshal_LPSAFEARRAY_UserFree64(void* param0, void* param1);
void* windowssys_windows_win32_system_com_marshal_LPSAFEARRAY_UserMarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_LPSAFEARRAY_UserMarshal64(void* param0, void* param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_LPSAFEARRAY_UserSize(void* param0, uint32_t param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_LPSAFEARRAY_UserSize64(void* param0, uint32_t param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_LPSAFEARRAY_UserUnmarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_LPSAFEARRAY_UserUnmarshal64(void* param0, void* param1, void* param2);
void windowssys_windows_win32_system_com_marshal_SNB_UserFree(void* param0, void* param1);
void windowssys_windows_win32_system_com_marshal_SNB_UserFree64(void* param0, void* param1);
void* windowssys_windows_win32_system_com_marshal_SNB_UserMarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_SNB_UserMarshal64(void* param0, void* param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_SNB_UserSize(void* param0, uint32_t param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_SNB_UserSize64(void* param0, uint32_t param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_SNB_UserUnmarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_SNB_UserUnmarshal64(void* param0, void* param1, void* param2);
void windowssys_windows_win32_system_com_marshal_STGMEDIUM_UserFree(void* param0, void* param1);
void windowssys_windows_win32_system_com_marshal_STGMEDIUM_UserFree64(void* param0, void* param1);
void* windowssys_windows_win32_system_com_marshal_STGMEDIUM_UserMarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_STGMEDIUM_UserMarshal64(void* param0, void* param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_STGMEDIUM_UserSize(void* param0, uint32_t param1, void* param2);
uint32_t windowssys_windows_win32_system_com_marshal_STGMEDIUM_UserSize64(void* param0, uint32_t param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_STGMEDIUM_UserUnmarshal(void* param0, void* param1, void* param2);
void* windowssys_windows_win32_system_com_marshal_STGMEDIUM_UserUnmarshal64(void* param0, void* param1, void* param2);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_COM_MARSHAL_WINDOWS_WIN32_SYSTEM_COM_MARSHAL_WRAPPER_H */
