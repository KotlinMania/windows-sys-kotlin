include!("factories.rs");

trait Factory { fn construct()->Self; }
mod provider {
    use std::sync::atomic::{AtomicU32,Ordering};
    pub static CALLS:AtomicU32=AtomicU32::new(0);
    pub fn next()->super::Product {
        super::Product { value:42+CALLS.fetch_add(1,Ordering::SeqCst) }
    }
}
fn main() {
    println!("first|{}",Product::construct().value);
    println!("second|{}",Product::alternate().value);
    println!("calls|{}",provider::CALLS.load(std::sync::atomic::Ordering::SeqCst));
}
