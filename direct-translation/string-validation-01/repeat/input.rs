// UTF-8 literal 0
pub const S0: windows_sys::core::PCSTR = windows_sys::core::s!("");
// UTF-16 literal 0
pub const W0: windows_sys::core::PCWSTR = windows_sys::core::w!("");
// UTF-8 literal 1
pub const S1: windows_sys::core::PCSTR = windows_sys::core::s!(r"\Device\Beep");
// UTF-16 literal 1
pub const W1: windows_sys::core::PCWSTR = windows_sys::core::w!(r"\Device\Beep");
// UTF-8 literal 2
pub const S2: windows_sys::core::PCSTR = windows_sys::core::s!("a\0b");
// UTF-16 literal 2
pub const W2: windows_sys::core::PCWSTR = windows_sys::core::w!("a\0b");
// UTF-8 literal 3
pub const S3: windows_sys::core::PCSTR = windows_sys::core::s!("é\u{1f600}");
// UTF-16 literal 3
pub const W3: windows_sys::core::PCWSTR = windows_sys::core::w!("é\u{1f600}");
// UTF-8 literal 4
pub const S4: windows_sys::core::PCSTR = windows_sys::core::s!(r##"dollar $ and "quotes" { } /* */"##);
// UTF-16 literal 4
pub const W4: windows_sys::core::PCWSTR = windows_sys::core::w!(r##"dollar $ and "quotes" { } /* */"##);
// UTF-8 literal 5
pub const S5: windows_sys::core::PCSTR = windows_sys::core::s!("line\nnext\r\tend");
// UTF-16 literal 5
pub const W5: windows_sys::core::PCWSTR = windows_sys::core::w!("line\nnext\r\tend");
